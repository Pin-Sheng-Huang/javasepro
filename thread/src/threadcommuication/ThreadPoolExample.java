package threadcommuication;

import java.util.concurrent.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-08 21:46
 * @LastEditTime: 2023-06-08 21:46
 */

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建线程池，使用固定大小的线程池，最多同时执行3个任务
        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            // 提交任务到线程池
            executor.submit(() -> {
                System.out.println("任务1执行...");
                // 执行具体的任务逻辑
            });

            executor.submit(() -> {
                System.out.println("任务2执行...");
                // 执行具体的任务逻辑
            });

            executor.submit(() -> {
                System.out.println("任务3执行...");
                // 执行具体的任务逻辑
            });

            // 关闭线程池，不再接受新任务
            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 *在这个例子中，我们使用ThreadPoolExecutor来创建一个具有自定义参数的线程池。其中常见的参数设置如下：
 *
 * corePoolSize：核心线程数，指定线程池中的常驻线程数量。
 * maximumPoolSize：最大线程数，指定线程池中允许创建的最大线程数量。
 * keepAliveTime：线程空闲时间，当线程池中的线程数大于核心线程数时，空闲线程的存活时间。
 * unit：时间单位，指定keepAliveTime的时间单位，如秒、毫秒等。
 * workQueue：任务队列，用于存储等待执行的任务。可以选择不同的队列类型，如LinkedBlockingQueue、ArrayBlockingQueue等。
 * 通过设置这些参数，我们可以根据实际需求来调整线程池的大小和行为。同时，我们可以使用execute()方法向线程池提交任务，任务会在空闲线程中执行。最后，我们通过shutdown()方法关闭线程池，等待所有任务执行完成后才会完全关闭。
 */
class ThreadPoolExample2 {
    public static void main(String[] args) {
        // 创建一个具有自定义参数的线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, // 核心线程数
                10, // 最大线程数
                60, // 线程空闲时间
                TimeUnit.SECONDS, // 时间单位
                new LinkedBlockingQueue<Runnable>(100) // 任务队列
        );

        // 提交任务给线程池执行
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.execute(new Runnable() {
                public void run() {
                    System.out.println("Task " + taskId + " is being executed.");
                    // 执行具体的任务逻辑
                    // ...
                    System.out.println("Task " + taskId + " has completed.");
                }
            });
        }

        // 关闭线程池
        executor.shutdown();
    }
}

class ThreadPoolExample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 使用 Runnable
        Runnable runnableTask = () -> {
            System.out.println("Runnable Task is running");
        };

        executorService.submit(runnableTask);

        // 使用 Callable
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable Task is running");
            return 42;
        };

        Future<Integer> future = executorService.submit(callableTask);
        int result = future.get();
        System.out.println("Callable Task result: " + result);

        executorService.shutdown();
    }
}
