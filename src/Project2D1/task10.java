package Project2D1;

public class task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second-largest number in the array?
        int largestNo=0;
        int secondNo=0;
       int [] arr={125,160,111,300,600};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestNo){
                secondNo=largestNo;
                largestNo=arr[i];
            }
        }
        System.out.println(secondNo);





    }
}
