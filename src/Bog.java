public class Bog {
    private String name;
    private String author;
    private int releaseYear;

    private int ISBN;

    public Bog(){}

    public Bog(String name, String author, int releaseYear, int ISBN){
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.ISBN = ISBN;
    }
    @Override
    public String toString(){
        return "\nBook name: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nRelease year: " +getReleaseYear() +
                "\nISBN: "+ getISBN()+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
