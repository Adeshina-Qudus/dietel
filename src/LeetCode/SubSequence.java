package LeetCode;

public class SubSequence {

    public static void main(String[] args) {
        System.out.println(subSequence("ace", "abcde"));
    }


    public static boolean subSequence(String input, String subSequence){
        StringBuilder newString = new StringBuilder();
        for (int outter = 0 ; outter < input.length(); outter++){
            for (int inner = 0 ; inner < subSequence.length(); inner++){
               if (input.charAt(outter) == subSequence.charAt(inner)){
                   newString.append(subSequence.charAt(inner));
               }
            }
        }
        return !newString.equals(input);
    }
}
