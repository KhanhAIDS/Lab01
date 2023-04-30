import java.util.*;

public class Cart {
    
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private byte qtyOrdered = 0;
    private float sum;

    public void addDigitalvideoDisc(DigitalVideoDisc disc) {

        if (qtyOrdered == 20) {
            System.out.println("The cart is almost full");
        }

        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }        

    }

    public void removeDigitalvideoDisc(DigitalVideoDisc disc) {

        boolean removed = false;
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
        }

        else {
            for (byte i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    for (byte j = i; j < qtyOrdered-1; j++) {
                        itemsOrdered[j] = itemsOrdered[j+1];
                    }
                    itemsOrdered[qtyOrdered-1] = null;
                    qtyOrdered--;
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

    public float totalCost() {

        if (qtyOrdered == 0) {
            return 0;
        }

        else {
            for (byte i = 0; i < qtyOrdered; i++) {
                sum += itemsOrdered[i].getCost();
            }
            return sum;
        }

    }

}