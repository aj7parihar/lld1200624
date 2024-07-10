package in.aj7parihar.lldoops2200624.lld1class7.callables.mergesortwiththreads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

        List<Integer> list = List.of(11,2,31,14,151,16,7,9,88,10,33,98,45,67);

        // newFixedThreadPool - will create a fixed number of threads in a pool
        // here we will use cachedThreadPool, so it will create threads as requirement.
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list, executorService);

        // Synchronous - That happens with time, that means we make a fn call and get the result.
        // Asynchronous - That takes time, that means we make a fn call and after some time
        // we get the result.
        // Hence, here we are using Future so that it will do the work, we won't wait for the result,
        // and during that time we will do other stuff and once the result is ready give it in
        // Future
        Future<List<Integer>> sortedList = executorService.submit(mergeSorter);

        System.out.println(sortedList); // This will print the result synchronously but since we
        // are getting it in future hence this will not work, instead we will use:
        System.out.println(sortedList.get());
        // .get() - Waits if necessary for the computation to complete, and then retrieves its result.

        // executorService.shutdown(); - Once the task is complete shut down the service and
        // terminate all the threads in the pool.
    }
}
