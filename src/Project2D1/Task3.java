package Project2D1;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
//        int sum=0;
//        int [][] numbers={{1,2,3},
//                {4,5,6},
//                {7,8,9}};
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                sum=sum+numbers[i][j];
//            }
//        }
//        System.out.println("the sum of numbers is "+sum);
//
//        System.out.println("**********");
//        //another way with enhance loop
//        int sum1=0;
//        for (int [] num:numbers){
//            for (int no:num){
//                sum1+=no;
//            }
//        }
//        System.out.println(sum1);

        int sum=0;
        int[][] row = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        for(int i=0;i<row.length;i++){

            sum=sum+row[0][i];
                System.out.println(sum);
            }}
}
