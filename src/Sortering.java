import  java.util.ArrayList;

public class Sortering {
    String problemDescription = "Skriv en metode der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetiskfaldende orden på skærmen";

    public static void Sortering() {
        ArrayList<String> arrayList = new ArrayList<>(); //Create ArrayList
        arrayList.add("Abekat"); //Add spcified items to ArrayList
        arrayList.add("Musefælde");
        arrayList.add("Ananas");
        arrayList.add("Slut");
        arrayList.add("Solskin");

        for (int i = 0; i < arrayList.size(); i++) //Create loop to print contents in regular order
            System.out.println(arrayList.get(i));

        System.out.println(); //Linebreak

        for (int i = arrayList.size() -1; i >= 0; i--) //Create loop to print contents in reverse order
            System.out.println(arrayList.get(i));
    }
}
