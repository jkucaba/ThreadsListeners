import java.util.concurrent.Callable;
public class MyTask implements Callable<String> {
    private final int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(2000); // Symulujemy jakieś długie zadanie

        return "Task " + taskId + " zakończony sukcesem";
    }
}