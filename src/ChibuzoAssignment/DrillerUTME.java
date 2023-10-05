package ChibuzoAssignment;

public class DrillerUTME {

    public static int UTME(int copies){
       if (copies <=4){
           return copies * 2000;
       } else if (copies <= 9){
           return  copies * 1800;
       } else if (copies <= 29){
           return copies * 1600;
       } else if (copies <= 49){
           return copies * 1500;
       } else if (copies <= 99){
           return copies * 1300;
       }else if (copies <= 199){
           return copies * 1200;
       } else if ( copies <= 499){
           return copies * 1100;
       }else {
           return copies * 1000;
       }
    }

}
