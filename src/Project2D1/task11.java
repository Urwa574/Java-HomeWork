package Project2D1;

public class task11 {
    public static void main(String[] args) {
    //11)Write a program to print out duplicate elements from an Array of Strings?
        String [] arr={"hey","hello","salam","hello","hey","hallo","hi","hi","salam"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
            if (arr[i].equals(arr[j])) {
                System.out.println(arr[j]);
            }
            }

        }








}
}