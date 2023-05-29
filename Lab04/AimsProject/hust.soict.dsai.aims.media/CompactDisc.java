import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    
    private String artist;
    private ArrayList<Track> tracks;
    public boolean isBook = false;
    
    @Override
    public void play() {
        if (this.isBook == false) {
            for (Track i : tracks) {
                System.out.println("Playing track: " + i.getTitle());
                System.out.println("Track length: " + i.getLength());
            }
        }
    }

    public CompactDisc(String title, String category, int length, String director, String artist, ArrayList<Track> tracks, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.artist = artist;
        this.setLength(length);
        this.setCost(cost);
        this.setDirector(director);
        this.setTrack(tracks);
    }

    public String getArtist() {
        return artist;
    }

    public void setTrack(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    CompactDisc() {

    }

    public void addTrack() {

    }

    public void removeTrack() {

    }

    public int getLength() {
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
        }
        return total;
    }

    public String toString() {
        return ". CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + Integer.toString(this.getLength()) + ": " + Float.toString(this.getCost()) + " $";
    }

}