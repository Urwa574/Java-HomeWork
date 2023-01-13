package Class2Practice;

public class PracticeIfElse2 {
    public static void main(String[] args) {
       int age=19;
        System.out.println(age<18); // false bcz 19 is not lesser than 18
       if(age<18){  // only print the code within brackets if condition is true
           System.out.println("Time to play");
       }// another condition apply
        int age1=17;
        System.out.println(age1<18); //just to show you how it works no need otherwise also 17 is lesser than 18 true
          if (age1<18){
              System.out.println("time to play");
}
          /* if conditions works based on boolean true or false if we have a true inside the if() it executes all the
          code
          but inside if () it is false the code does not execute any code inside{}
           */
          boolean inSyntexBootCamp=true;
          if(true){
              System.out.println("Time to start practicing Java");
          }
          char c='M';
          if(c=='M'){
              System.out.println("Male");
          }
          String name="Sam"; //with non-primitive data types such as string cant use ==symbols instead of this
        // we use variable name .equals()
        if(name.equals("Sam")) {
            System.out.println("Amazing Student");
        }
        if(!name.equals("nat")){ //name is not equal to same=true
            //! symbol can change true to false and false to true
            System.out.println("amazing girl");
        }

    }
}
