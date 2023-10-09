package Chapter5;

public class Diamond {
    public static void main(String[] args) {

    for (int count = 1; count <= 5 ; count++){
        for (int j = count ; j <= 5 ; j++){
            System.out.print(" ");
        }
        System.out.print(" ");
        for (int k = 1 ; k <= count ; k++){
            System.out.print("*");
        }
        System.out.print("");
        for (int g = 1 ; g <= count ; g++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int k = 1 ; k <= 5 ; k++){
        for (int t = 1; t <= k ; t++){
            System.out.print("*");
        }
        for (int l = 1; l <= k ; l++ ){
            System.out.print("*");
        }
        System.out.println();
            //System.out.print(" ");
        }


    }
}
