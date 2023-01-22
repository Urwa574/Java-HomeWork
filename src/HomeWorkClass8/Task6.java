package HomeWorkClass8;

public class Task6 {
    public static void main(String[] args) {
        /*
        6) Print the following pattern:
       *

      *

     *
    **
    *
    **
    *
      */
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println("*");
            }
            System.out.println("**");
        }
        System.out.println("*");
        System.out.println("--------------------");

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 1; j++) {
//                System.out.println("*");
//                System.out.println();}
//            for (int j = 6; j <=8; j++) {
//                if(i==6||i==8){
//                    System.out.print("**");
//                }else {
//                    System.out.println("*");
//                }
//            for (int j = 0; j < 10; j++) {
//                if (i==1||i==3|i==5){
//                    System.out.println();
//                    continue;
//                }
//                if (i==6||i==8){
//                    System.out.println("**");
//                }else {
//                    System.out.println("*");
//
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 1; j++) {
                if (i == 2 || i == 4 ) {
                    System.out.println();
                } else if (i == 6 || i == 8) {
                    System.out.println("**");
                } else {
                    System.out.println("*");
                }

            }
        }

    }}








