package Chapter8;

public class Time1Test {
    public static void main(String[] args) {

        Time1 time = new Time1();
    }


    private static void displayTime(String header , Time1 t){
        System.out.printf("%s%nUniversal time :  %s%nStandard time : %s%n" ,
                header, t.toUnivasalString(), t.toString());
    }
}
