import java.util.ArrayList;

public class Cart {
    
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public boolean found;
    public Media current;
    public ArrayList<Media> filter = new ArrayList<Media>();

    public void addMedia (Media media) {

        itemsOrdered.add(media);
        System.out.println("The item has been added");

    }

    public void removeMedia (Media media) {

        itemsOrdered.remove(media);
        System.out.println("Remove item successfully");

    }

    public float totalCost() {

        if (itemsOrdered == null) {
            return 0;
        }

        else {

            float sum = 0;
            for (Media i : itemsOrdered) {
                sum += i.getCost();
            }
            return sum;

        }

    }

    public void print() {
        System.out.println("***********************CART*********************** ");
        System.out.println("Ordered Items: ");

        for (Media i : itemsOrdered) {
            i.toString();
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("*************************************************** ");
    }

    public void searchMedia(String title) {
        boolean found = false;
        current = null;

        for (Media i : itemsOrdered) {
            if (i.isMatch(title) == true) {
                found = true;
                System.out.println("Found requested DVD: ");
                i.toString();
                current = i;
                break;
            }
        }

        if (found == false) {
            System.out.println("Can not find such requested DVD");
            current = null;
        }
    }

    public void findMedia(String title) {
        boolean found = false;
        current = null;

        for (Media i : itemsOrdered) {
            if (i.isMatch(title) == true) {
                found = true;
                current = i;
                break;
            }
        }

        if (found == false) {
            current = null;
        }
    }

    public void filterMedia(String title) {
        filter = null;

        for (Media i : itemsOrdered) {
            if (i.isMatch(title) == true) {
                filter.add(i);
            }
        }

        for (Media j : filter) {
            j.toString();
        }
    }

}