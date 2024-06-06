import java.util.ArrayList;
import java.util.Random;

/**
 * Waiter - Takes and adds orders to the KitchenQueue
 *
 * @author Manuel Fellner
 * @version 06.06.2024
 */
public class Waiter implements Runnable {
    private KitchenQueue kitchenQueue;
    private boolean running;


    public Waiter(KitchenQueue kitchenQueue)  {
        this.kitchenQueue = kitchenQueue;
        this.running = true;
    }

    @Override
    public void run()  {
        while (this.running)  {
            // deliver an order
            String latestOrder = this.kitchenQueue.takeOrder();
            System.out.println("[Waiter] Delivering Order: " + latestOrder);
            try {
                Thread.sleep(new Random().nextInt(1000 - 500 + 1) + 500);
            } catch (InterruptedException ignore)   {}
        }
    }

    public void setRunning (boolean running)  {
        this.running = running;
    }
}
