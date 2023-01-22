package Project2D1;

public class Task9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?
        int [] arr={10,20,30,40,50};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the maximum value is :"+max);
        System.out.println("the minimum value is : "+min);
    }
}
