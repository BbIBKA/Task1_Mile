public class Main {

    public static void main(String[] args) {
        int costTiket = 107;
        int millesCost = 20;


        int loyalityMilles;
        if (costTiket >= millesCost) {
               loyalityMilles = costTiket / millesCost;
            System.out.println(loyalityMilles);
        }

    }
}
