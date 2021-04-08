import java.util.ArrayList;
import java.util.Iterator;

public class Bibliotek {
   private ArrayList<Bog> bookList = new ArrayList<>();
   private String pd = """
           Skriv en klasse kaldet Bog, der indeholderISBN-nummer,titelog udgivelsesår.Skriv flg.metoder:
           •Constructor
           •Getters og setters
           •toString
           Skriv en klasse kaldet Bibliotek,der indeholder en liste af Bog objekter.
           •Indsæt tre forskellige bøger i Biblioteket
           •Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true,
           hvis listen indeholderet Bog objekt med samme ISBN.
           """;

    public Bibliotek(){}

    public void addBook( Bog x){
       getBookList().add(x);
    }

    public boolean isBookInList(Bog s){
        Iterator<Bog> bookListIterator = bookList.iterator();
        if(bookListIterator.next().getISBN() == s.getISBN()){
            System.out.println("This ISBN is already on the list");
            return true;
        }else {
            System.out.println("ISBN is not on the list");
            return false;
        }
    }

    public ArrayList<Bog> getBookList() {
        return bookList;
    }

    public void printProblemDescription(){
        System.out.println(pd);
    }
}
