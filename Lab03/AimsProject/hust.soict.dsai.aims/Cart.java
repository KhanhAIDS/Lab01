import java.util.*;

public class Cart {
    
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private byte qtyOrdered = 0;

    //Method that add one DVD to the current cart.
    public void addDigitalvideoDisc(DigitalVideoDisc disc) {

        if (qtyOrdered >= 20) {
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
            float sum = 0;
            for (byte i = 0; i < qtyOrdered; i++) {
                sum += itemsOrdered[i].getCost();
            }
            return sum;
        }

    }

    //Method that add a list of DVDs to the current cart.
    /*public void addDigitalvideoDisc(DigitalVideoDisc [] dvdList) {

        if (qtyOrdered >= 20) {
            System.out.println("The cart is almost full");
        }

        else {

            if (qtyOrdered+dvdList.length > 20) {

                int x = 20-qtyOrdered;
                for (int y = 0; y < dvdList.length; y++) {

                    if (y < x) {
                        itemsOrdered[qtyOrdered] = dvdList[y];
                        qtyOrdered++;
                        System.out.println("The disc has been added");
                    }

                    else {
                        System.err.println("The cart is almost full");
                    }
                        
                }

            }

            else {

                for (DigitalVideoDisc z : dvdList) {
                    itemsOrdered[qtyOrdered] = z;
                    qtyOrdered++;
                    System.out.println("The disc has been added");
                }

            }   

        }

    }*/

    //Method that add an arbitrary number of DVDs to the current cart.
    public void addDigitalvideoDisc(DigitalVideoDisc ... a) {

        if (qtyOrdered >= 20) {
            System.out.println("The cart is almost full");
        }

        else {

            if (qtyOrdered+a.length > 20) {

                int b = 20-qtyOrdered;
                for (int c = 0; c < a.length; c++) {

                    if (c < b) {
                        itemsOrdered[qtyOrdered] = a[c];
                        qtyOrdered++;
                        System.out.println("The disc has been added");
                    }

                    else {
                        System.err.println("The cart is almost full");
                    }
                        
                }

            }

            else {

                for (DigitalVideoDisc d : a) {
                    itemsOrdered[qtyOrdered] = d;
                    qtyOrdered++;
                    System.out.println("The disc has been added");
                }

            }

        }

    }

    //Method that add 2 DVDs to the current cart.
    public void addDigitalvideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {

        if (qtyOrdered >= 20) {
            System.out.println("The cart is almost full");
        }

        else {

            if (qtyOrdered == 19) {

                itemsOrdered[qtyOrdered] = disc1;
                qtyOrdered++;
                System.out.println("The disc has been added");
                System.err.println("The cart is almost full");  

            }

            else {

                itemsOrdered[qtyOrdered] = disc1;
                qtyOrdered++;
                System.out.println("The disc has been added");
                itemsOrdered[qtyOrdered] = disc2;
                qtyOrdered++;
                System.out.println("The disc has been added");

            }

        }

    }

    public void print() {
        System.out.println("***********************CART*********************** ");
        System.out.println("Ordered Items: ");

        for (int i = 0; i < qtyOrdered; i++) {
            itemsOrdered[i].DVDdata();
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("*************************************************** ");
    }

    public void searchDVDs(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title) == true) {
                found = true;
                System.out.println("Found requested DVD: ");
                itemsOrdered[i].DVDdata();
            }
        }

        if (found == false) {
            System.out.println("Can not find any such requested DVD");
        }
    }

    public void searchDVDs(int id) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(id) == true) {
                found = true;
                System.out.println("Found requested DVD: ");
                itemsOrdered[i].DVDdata();
            }
        }

        if (found == false) {
            System.out.println("Can not find any such requested DVD");
        }
    }

}