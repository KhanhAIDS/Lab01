public abstract class Media {
    
    private int id;
    private String title;
    private String category;
    private float cost;
    public boolean isBook;
    
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Media) {

            Media media = (Media) o;
            if (this.getTitle().equals(media.getTitle())) {
                return true;
            }
            return false;

        }
        return false;

    }

    public boolean isMatch(String title) {

        if (this.getTitle() == title) {
            return true;
        }
        return false;

    }

    public void play() {
        
    }

}