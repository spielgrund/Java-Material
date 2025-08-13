public class Buch {
    String isbn;
    String titel;
    String genre;

    public Buch(String isbn, String titel, String genre){
        this.isbn = isbn;
        this.titel = titel;
        this.genre = genre;
    }


    public String toString() {
        return isbn + "\n" + titel + "\n" + genre;
    }
}
