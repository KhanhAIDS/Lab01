public class Store {

    private int amount = 32767;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[amount];
    private int quantity = 0;

    public void addDVD(DigitalVideoDisc ... disc) {

        for (DigitalVideoDisc d : disc) {

            itemsInStore[quantity] = d;
            quantity++;
            System.out.println("The disc has been added");

        }
    
    }

    public void removeDVD(DigitalVideoDisc ... disc) {

        for (DigitalVideoDisc d : disc) {
            boolean removed = false;
            if (quantity == 0) {
                System.out.println("The cart is empty");
                break;
            }

            else {
                for (int i = 0; i < quantity; i++) {
                    if (itemsInStore[i] == d) {
                        for (int j = i; j < quantity-1; j++) {
                            itemsInStore[j] = itemsInStore[j+1];
                        }

                        itemsInStore[quantity-1] = null;
                        quantity--;
                        removed = true;
                        System.out.println("Remove disc successfully");
                        break;
                    }
                }
                if (removed == false) {
                    System.out.println("That disc is not on the cart");
                }
            }
        }
    }

}