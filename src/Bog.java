public class Bog {
    private String name;
    private String author;

    private int ISBN;

    public Bog(){};

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

    @Override
    public String toString(){
        return "Book name: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nISBN: "+ getISBN();
    }
}
