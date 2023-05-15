public class Aims{

    public static void main(String[] args) {

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
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
        anOrder.removeDigitalvideoDisc(dvd1);

    }

}