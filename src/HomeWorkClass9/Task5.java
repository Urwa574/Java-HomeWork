package HomeWorkClass9;

public class Task5 {
    public static void main(String[] args) {
        //5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
       int[] numbers={10,12,13,14,15};
       int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
            sum=sum+numbers[i];
        }
        System.out.print("the sum of all the elements is "+sum);
    }
}
