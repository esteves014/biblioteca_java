public class Book {
    private String title;
    private String author;

    public void setBook(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public String getBook(){
        return String.format("Titulo: %s\nAutor: %s", title, author);
    }
}
