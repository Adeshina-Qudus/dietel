package Chapter4;

public class WorldPopulation {
    public static void main(String[] args) {

        long total = 0;
        for (int i = 1; i <= 75; i++) {
            double percent = 0.011;
            long population = 7_000_000_000L;

            long result = (long) (population * percent);
            total += result;
            //System.out.println(total);
            System.out.println(i);
        }
    }
}