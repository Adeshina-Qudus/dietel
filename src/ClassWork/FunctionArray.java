package ClassWork;

public class FunctionArray {


    public static String[] switchCharacters(String [] param, int number) {
        String[] alpha = new String[]{String.valueOf(param.length / number)};
        String[] characters = new String[]{String.valueOf(param.length / number)};
        int counter = 0;
        for (int count = 0 ; count < param.length ; count++){
            if (count < param.length){
                 param[count] = alpha[counter];
            }if (count < param.length){
                param[count] = characters[counter];
            }
            counter += 1;
        }
        return param;
    }
}
