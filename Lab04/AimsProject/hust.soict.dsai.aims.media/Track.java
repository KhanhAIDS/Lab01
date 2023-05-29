public class Track implements Playable{
    
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    Track() {
        this.play();
    }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Track) {

            Track track = (Track) o;
            if (this.getTitle().equals(track.getTitle())) {

                if (this.getLength() == track.getLength()) {
                    return true;
                }
                return false;
                
            }
            return false;

        }
        return false;

    }

}