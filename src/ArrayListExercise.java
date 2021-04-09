import java.util.ArrayList;
public class ArrayListExercise {
    private static String printProblemDescription(){
        String question = "Skriv en metode med navnet ArraylistContainString, der modtager 2 parametrer: " +
                "En arrayliste og en streng. Metoden returnere en boolean";
        System.out.println(question);
        return question;
    }

    public boolean doesArraylistContainString(String s) {
        ArrayList<String> arrList = new ArrayList<String>();
        printProblemDescription();

        arrList.add("Tekst 1");
        arrList.add("Tekst 2");
        arrList.add("Tekst 3");

        boolean res = arrList.contains(s);
        if (res){
            System.out.println("The string has been found");
        }
        else{
            arrList.add(s);
            System.out.println("Added to arraylist and false");
            return false;
        }
        return true;
    }
    @Override
    public String toString() {

        return ""; // NOT PRETTY!!! :(
    }
}