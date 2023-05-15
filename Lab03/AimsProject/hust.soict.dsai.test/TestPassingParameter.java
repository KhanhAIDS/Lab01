public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap (jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle (jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        
    }

    public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2) {
        String title = o1.getTitle();
        o1.setTitle(o2.getTitle());
        o2.setTitle(title);

        String category = o1.getCategory();
        o1.setCategory(o2.getCategory());
        o2.setCategory(category);

        String director = o1.getDirector();
        o1.setDirector(o2.getDirector());
        o2.setDirector(director);

        int length = o1.getLength();
        o1.setLength(o2.getLength());
        o2.setLength(length);

        float cost = o1.getCost();
        o1.setCost(o2.getCost());
        o2.setCost(cost);
    }

    public static void changeTitle (DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

}