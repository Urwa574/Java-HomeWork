package Project2D1;

public class Task5 {
    public static void main(String[] args) {
        //5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
        int sumEven = 0;
        int sumOdd=0;
        int[][] numbers = {{1, 2, 3, 4},
                       {4, 5, 6, 7},
                       {8, 9, 10, 11}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven = sumEven + numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    sumOdd= sumOdd+numbers[i][j];}}
        }
        System.out.println(sumEven+" ");
        System.out.println(sumOdd+" ");

    }}