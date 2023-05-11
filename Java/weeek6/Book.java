package weeek6;

public class Book {
    String title;

    String[] authors;

   public String getTitle() {
       return title;
   }

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthors(String[] name){
        authors = name;
    }
}
