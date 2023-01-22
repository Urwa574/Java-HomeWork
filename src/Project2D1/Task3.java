package Project2D1;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int sum=0;
        int [][] numbers={{1,2,3},
                {4,5,6},
                {7,8,9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];
            }
        }
        System.out.println("the sum of numbers is "+sum);

    }
}
