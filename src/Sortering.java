import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sortering {
    private String problemStatement = """
    Skriv en metode der indlæser 5 tekststrenge fra 
    tastaturet og udskriver dem på skærmen i 
    alfabetisk faldende orden.""";

    public void printProblemDescription(){
        System.out.println(problemStatement);
    }

    public static void SorteringsMetode() {
        ArrayList<String> sortThisList = new ArrayList<>(); //Create ArrayList
        Scanner userInput = new Scanner(System.in);
        System.out.println("Skriv fem tekststrenge her:");

        for (int i = 0; i < 5; i++) { //Ask for 5 required inputs
             sortThisList.add(userInput.nextLine()); //Get input from user
        }
        System.out.println("Listen før den kommer i bagvendt alfabetisk orden: " + sortThisList);
        sortThisList.sort(Comparator.reverseOrder());
        System.out.println("Listen efter den kommer i bagvendt alfabetisk orden: " + sortThisList);
        System.out.println();
    }
}