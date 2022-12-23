public class WeightOnPlanets {
    public static void main(String[] args){
        int myMass=50 ;//بر حسب kg
        double weightOnEarth=myMass*10, weightOnMoon= myMass*1.62 , weightOnMars=myMass*3.721;
        String sentence=String.format("My weight on earth is %f , my weight on moon is %f and my weight on mars is %f.",weightOnEarth,weightOnMoon,weightOnMars);
        System.out.println("**************************************");
        System.out.println(sentence);
        System.out.print("-----------------------------------------");
    }
    
}
