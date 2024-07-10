package in.aj7parihar.lldoops2200624.lld1class7.callables.simplemergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {
        demoMergeSortWithoutExecutors();
    }
    public static void demoMergeSortWithoutExecutors() throws Exception {
        /* ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(2);
        list.add(31);
        list.add(14);
        list.add(151);
        list.add(16);
        list.add(7);
        list.add(9);
        list.add(88);
        list.add(10); */

        List<Integer> list = List.of(11,2,31,14,151,16,7,9,88,10,33,98);

        MergeSorter mergeSorter = new MergeSorter(list);
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> sortedList = mergeSorter.call();

        System.out.println(sortedList);
    }
}
