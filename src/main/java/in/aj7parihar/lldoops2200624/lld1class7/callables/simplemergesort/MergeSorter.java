package in.aj7parihar.lldoops2200624.lld1class7.callables.simplemergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
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

        MergeSorter leftMergeSorter = new MergeSorter(leftArray);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray);

        List<Integer> leftSortedArray = leftMergeSorter.call();
        List<Integer> rightSortedArray = rightMergeSorter.call();

        List<Integer> sortedMergedArray = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        // List<Integer> sortedMergedArray = getIntegers(leftSortedArray, rightSortedArray);

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
