import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    
    private String artist;
    private ArrayList<Track> tracks;
    
    @Override
    public void play() {
        for (Track i : tracks) {
            System.out.println("Playing track: " + i.getTitle());
            System.out.println("Track length: " + i.getLength());
        }      
    }

    public CompactDisc(int id, String title, String category, String director, String artist, ArrayList<Track> tracks, float cost) {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setArtist(artist);
        this.setTrack(tracks);
        this.setCost(cost);  
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    } 

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTrack(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public int getLength() {
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
        }
        return total;
    }

    public void addTrack(String title, int length) {
        tracks.add(new Track(title, length));
        System.out.println("Track added successfully");
    }

    public void removeTrack(String title) {
        for (Track i : tracks) {
            if (i.getTitle() == title) {
                tracks.remove(i);
            }
        }
    }

    public String toString() {
        return ". CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + Integer.toString(this.getLength()) + ": " + Float.toString(this.getCost()) + " $";
    }

}
