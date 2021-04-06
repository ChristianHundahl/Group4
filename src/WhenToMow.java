public class WhenToMow {
    private String problemDescription = "Om sommerenvokser græsset ca. 0,8 cm om dagen." +
            "Skriv en metode,der tager imod2 inputparametre: hvor langt græsset er lige nu og hvor højtdetmåvære for at " +
            "skulle slås. Metoden skal beregne og returnere hvor mange dage der er til,at græsset skal slås næste gang." +
            "Hvor højt græsset er,når det skal slås,kan forstås på 2 måder." +
            "1.Græsset skal overstige denne værdi, før vi starter græsslåmaskinen" +
            "2.Græsset skal slås,inden værdien overstiges. " +
            "Du vælger selv hvilken løsning du vil implementere." +
            " Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen";

    public int whenToMow (double heightNow, double heightCut){
        double growthPerDay = 0.8;
        int numberOfDays;

        double numberOfDaysDouble = (heightCut - heightNow) / growthPerDay;
        numberOfDays = (int) numberOfDaysDouble;

        return numberOfDays;
    }

    public void printProblemDescription(){
        System.out.println(problemDescription);
    }
}
