import java.util.*;

public class Book extends Media{
    
    private boolean iscase;
    private List<String> authors = new ArrayList<String>();
    public boolean isBook = true;

    public Book(String title, String category, List<String> authors, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setAuthors(authors);
        this.setCost(cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor (String authorName) {

        iscase = false;

        for (String i : authors) {
            if (i == authorName)  {
                iscase = true;
                System.out.println("That author is already included");
                break;
            }
        }

        if (iscase == false) {
            authors.add(authorName);
            System.out.println("Author added successfully");
        }
        
    }

    public void removeAuthor (String authorName) {

        iscase = false;
        
        for (String i : authors) {
            if (i == authorName) {
                iscase = true;
                authors.remove(authorName);
                System.out.println("Author removed successfully");
                break;
            }
        }

        if (iscase == false) {
            System.out.println("That author is not on the list");
        }

    }

    public String toString() {
        return ". Book - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getAuthors() + ": " + Float.toString(this.getCost()) + " $";
    }

}