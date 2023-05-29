import java.util.Scanner;

public class Aims{

    public static Cart anOrder = new Cart();
    public static Store inStock = new Store();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();       
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------"); 
        System.out.println("1. View store"); 
        System.out.println("2. Update store"); 
        System.out.println("3. See current cart"); 
        System.out.println("0. Exit"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3"); 

        int choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println("The application will now be terminated");
            scanner.close();
        }
        else if (choice == 1) {
            int p = 1;
            for (Media i : inStock.itemsInStore) {
                System.out.println(p + ". " + i.toString());
                p++;
            }
            storeMenu();
        }
        else if (choice == 2) {
            System.out.println("Add a media to or remove a media from the store, or press 0 to back out");
            if (scanner.nextInt() == 0) {
                showMenu();
            }
        }
        else if (choice == 3) {
            int k = 1;
            for (Media i : anOrder.itemsOrdered) {
                System.out.println(k + ". " + i.toString());
                k++;
            }
            cartMenu();
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");        
        System.out.println("--------------------------------");        
        System.out.println("1. See a media\'s details");        
        System.out.println("2. Add a media to cart");       
        System.out.println("3. Play a media");       
        System.out.println("4. See current cart");      
        System.out.println("0. Back");     
        System.out.println("--------------------------------");     
        System.out.println("Please choose a number: 0-1-2-3-4"); 

        if (scanner.nextInt() == 0) {
            showMenu();
        }
        else if (scanner.nextInt() == 1) {
            System.out.println("Enter your desired media's title: ");
            scanner.nextLine();
            anOrder.searchMedia(scanner.nextLine());
            if (anOrder.found == true) {
                anOrder.current.toString();
                mediaDetailsMenu();
            }
        }
        else if (scanner.nextInt() == 2) {
            System.out.println("Enter your desired media's title: ");
            scanner.nextLine();
            anOrder.findMedia(scanner.nextLine());
            if (anOrder.found == true) {
                anOrder.addMedia(anOrder.current);
                System.out.println(anOrder.itemsOrdered.size() + " items");
            }
            else {
                System.out.println("Can not find such requested Media");
            }
        }
        else if (scanner.nextInt() == 3) {
            System.out.println("Enter your desired media's title: ");
            scanner.nextLine();
            anOrder.findMedia(scanner.nextLine());
            if (anOrder.found == true) {
                if (anOrder.current.isBook == false) {
                    anOrder.current.play();
                }
                else {
                    System.out.println("This media can not be played");
                }
            }
            else {
                System.out.println("Can not find such requested Media");
            }
        }
        else if (scanner.nextInt()==4) {
            anOrder.print();
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");        
        System.out.println("--------------------------------");        
        System.out.println("1. Filter medias in cart");      
        System.out.println("2. Sort medias in cart");     
        System.out.println("3. Remove media from cart");       
        System.out.println("4. Play a media"); 
        System.out.println("5. Place order");      
        System.out.println("0. Back");      
        System.out.println("--------------------------------");      
        System.out.println("Please choose a number: 0-1-2-3-4-5"); 
        
        if (scanner.nextInt() == 0) {
            storeMenu();
        }
        else if (scanner.nextInt() == 1) {
            System.out.println("Enter your desired media's title: ");
            scanner.nextLine();
            anOrder.filterMedia(scanner.nextLine());
        }
        else if (scanner.nextInt() == 2) {

        }
        else if (scanner.nextInt() == 3) {
            System.out.println("Enter your desired media's title: ");
            scanner.nextLine();
            anOrder.findMedia(scanner.nextLine());
            anOrder.removeMedia(anOrder.current);
        }
        else if (scanner.nextInt() == 4) {
            for (Media i : anOrder.itemsOrdered) {
                if (i.isBook == false) {
                    i.play();
                }
                else {
                    System.out.println("This media can not be played");
                }
            }
        }
        else if (scanner.nextInt() == 5) {
            System.out.println("An order has been created");
            anOrder.itemsOrdered = null;
        }
    } 

    public static void mediaDetailsMenu() { 
        System.out.println("Options: ");   
        System.out.println("--------------------------------");      
        System.out.println("1. Add to cart");      
        System.out.println("2. Play");      
        System.out.println("0. Back");        
        System.out.println("--------------------------------");       
        System.out.println("Please choose a number: 0-1-2");  
        
        if (scanner.nextInt() == 0) {
            storeMenu();
        }
        else if (scanner.nextInt() == 1) {
            anOrder.addMedia(anOrder.current);
        }
        else if (scanner.nextInt() == 2) {
            if (anOrder.current.isBook == false) {
                anOrder.current.play();
            }
            else {
                System.out.println("This media can not be played");
            }
        }
    } 

}






































































































        /*DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        DigitalVideoDisc [] dvdList = new DigitalVideoDisc[3];
        dvdList[0] = dvd1;
        dvdList[1] = dvd2;
        dvdList[2] = dvd3;

        anOrder.addDigitalvideoDisc(dvdList);
        //anOrder.addDigitalvideoDisc(dvd1, dvd2, dvd3);

        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalvideoDisc(dvd3);
        anOrder.removeDigitalvideoDisc(dvd3);
        anOrder.removeDigitalvideoDisc(dvd2);
        anOrder.removeDigitalvideoDisc(dvd1);
        anOrder.removeDigitalvideoDisc(dvd1);*/