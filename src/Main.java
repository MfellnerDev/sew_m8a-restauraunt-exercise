public class Main {
    public static void main(String[] args) {
        // 0. init objects
        KitchenQueue kitchenQueue = new KitchenQueue(10);
        Kitchen kitchen = new Kitchen(kitchenQueue);
        Waiter waiter = new Waiter(kitchenQueue);

        // 1. starting threads
        Thread kitchenT = new Thread(kitchen);
        kitchenT.start();
        Thread waiterT = new Thread(waiter);
        waiterT.start();

        String[] foodOrders = {"Hamburgir", "Pizza", "Salami", "Bread", "Cucumber", "I dunno", "Sushi", "Onigiri", "Fish", "Schnitzelsemmel", "Semmel"};
        // 2. add orders
        for (String foodOrder : foodOrders) {
            kitchenQueue.addNewOrder(foodOrder);
        }

        // 3. let the waiter and kitchen wait for some time
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. stop both threads
        kitchen.setRunning(false);
        waiter.setRunning(false);

        try {
            // wait until both threads have finished their work
            kitchenT.join();
            waiterT.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
