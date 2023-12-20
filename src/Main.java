import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        MyTask task1 = new MyTask(1);
        MyTask task2 = new MyTask(2);
        MyTask task3 = new MyTask(3);

        MyFutureTask<String> futureTask1 = new MyFutureTask<>(task1);
        MyFutureTask<String> futureTask2 = new MyFutureTask<>(task2);
        MyFutureTask<String> futureTask3= new MyFutureTask<>(task3);

        executor.execute(futureTask1);
        executor.execute(futureTask2);
        executor.execute(futureTask3);

        // Dodaj słuchacza do futureTask za pomocą metody 'done'
        futureTask1.run();
        futureTask2.run();
        futureTask3.run();

        executor.shutdown();
    }
}