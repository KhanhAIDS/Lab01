public class DigitalVideoDisc extends Disc implements Playable{
    
    public boolean isBook = false;

    public String toString() {
        return ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + Integer.toString(this.getLength()) + ": " + Float.toString(this.getCost()) + " $";
    }

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
