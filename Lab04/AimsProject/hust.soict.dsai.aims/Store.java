import java.util.ArrayList;

public class Store {

    public ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {

        itemsInStore.add(media);
        System.out.println("The disc has been added");

    }
    

    public void removeMedia(Media media) {

        itemsInStore.remove(media);
        System.out.println("Remove disc successfully");
    
    }

}