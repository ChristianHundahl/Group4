import java.util.ArrayList;

public class Bibliotek {
    //TODO: mange ting skal tænkes over
    private ArrayList<Bog> bookList = new ArrayList<>();

    public Bibliotek(){};

    public ArrayList<Bog> getBookList() {
        return bookList;
    }

    public boolean isBookInList(Bog s, ArrayList bookList){
        bookList.contains(s.getISBN());
        return true;
    }

}
