package HomeWorkClass13;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */
//    StringBuilder str=new StringBuilder("This is sentence i want to reverse");
//        System.out.println(str.reverse());
//        String st=str.toString();
//        st.sp
        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String word:arr){
            for (int i =word.length()-1 ; i >=0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
  /*for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse(); //another way
            System.out.print(st);
            System.out.print(" ");
        }
   */ //best approach
        /* for(String word:arr){ enhance loop and converting from string to string builder
        system.out.println(new StringBuilder(word).reverse()+" ");
         */


    }
}
