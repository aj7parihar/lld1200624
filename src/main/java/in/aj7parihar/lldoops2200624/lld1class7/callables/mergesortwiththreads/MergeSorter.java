package in.aj7parihar.lldoops2200624.lld1class7.callables.mergesortwiththreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Base case --> s>=e
        if (arrayToSort.size() == 1) {
            return arrayToSort;
        }

        // finding mid --> s+e/2
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid; i<arrayToSort.size(); i++){
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

//        List<Integer> leftSortedArray = leftMergeSorter.call();
//        List<Integer> rightSortedArray = rightMergeSorter.call();

        // Till now our merge sort was not multithreaded, although we used executors in client
        // Now it's multithreaded

        // As a HW1, don't pass the executor service in Constructor instead create one here to see
        // multiple thread pools.
        // HW2 - Implement Quick Sort using mutli threads


        Future<List<Integer>> futureLeftSortedArray = executorService.submit(leftMergeSorter);
        Future<List<Integer>> futureRightSortedArray = executorService.submit(rightMergeSorter);


        List<Integer> sortedMergedArray = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        // List<Integer> sortedMergedArray = getIntegers(leftSortedArray, rightSortedArray);

        // Now before merging we need the values from future
        List<Integer> leftSortedArray = futureLeftSortedArray.get();
        List<Integer> rightSortedArray = futureRightSortedArray.get();

        while(p1<leftSortedArray.size() && p2<rightSortedArray.size()){
            if(leftSortedArray.get(p1) <= rightSortedArray.get(p2)){
                sortedMergedArray.add(leftSortedArray.get(p1));
                p1++;
            }else{
                sortedMergedArray.add(rightSortedArray.get(p2));
                p2++;
            }
        }

        // Add remaining elements
        while(p1<leftSortedArray.size()){
            sortedMergedArray.add(leftSortedArray.get(p1));
            p1++;
        }
        while(p2<rightSortedArray.size()){
            sortedMergedArray.add(rightSortedArray.get(p2));
            p2++;
        }

        return sortedMergedArray;
    }
}
