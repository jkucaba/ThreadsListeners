import java.util.concurrent.*;
class MyFutureTask<V> extends FutureTask<V> {
    public MyFutureTask(Callable<V> callable) {
        super(callable);
    }

    // Nasłuchujemy aż Task zakończy działanie. wtedy wypisujemy wartość
    @Override
    protected void done() {
        try {
            V result = get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}