import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Queue for all Orders from customers (Data class)
 *
 * @author Manuel Fellner
 * @version 06.06.2024
 */
public class KitchenQueue {
    private BlockingQueue<String> kitchenQueue;

    public KitchenQueue(int maxElementCount)  {
        this.kitchenQueue = new LinkedBlockingQueue<>(maxElementCount);
    }

    public void addNewOrder(String newOrder)  {
        //thread-safe addition to the kitchenQueue
        try {
            this.kitchenQueue.put(newOrder);
        } catch (InterruptedException ignore) {}
    }

    public String takeOrder()  {
        //thread-safe removal out of the kitchenQueue
        try  {
            return this.kitchenQueue.take();
        } catch (InterruptedException ignore) {}
        return null;
    }

    public int getQueueSize()  {
        return this.kitchenQueue.size();
    }
}
