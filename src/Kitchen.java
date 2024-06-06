import java.util.Random;

/**
 * Kitchen - If available, takes orders from the KitchenQueue and processes them
 *
 * @author Manuel Fellner
 * @version 06.06.2024
 */
public class Kitchen implements Runnable {
    private KitchenQueue kitchenQueue;

    private boolean running;

    public Kitchen(KitchenQueue kitchenQueue)  {
        this.kitchenQueue = kitchenQueue;
        this.running = true;
    }

    @Override
    public void run() {
        while (this.running) {
            String latestOrder = this.kitchenQueue.takeOrder();
            System.out.println("[Kitchen] Processing order: " + latestOrder + "...");
            // wait for a random amount of time for order processing (cooking)
            double startTime = System.currentTimeMillis();
            try {
                Thread.sleep(new Random().nextInt(5000 - 1000 + 1) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double endTime = System.currentTimeMillis();
            double totalCookingTime = endTime - startTime;
            System.out.println("Processed order " + latestOrder + " in " + totalCookingTime + "ms.");
        }
    }

    public void setRunning(boolean running)  {
        this.running = running;
    }
}
