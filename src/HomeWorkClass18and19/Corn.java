package HomeWorkClass18and19;

public class Corn {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    String corn;
    static void printF(){
        System.out.println("satic method");
    }
}
class popcorn extends Corn{
    String pinkSalt;
    }
    class Main{
        public static void main(String[] args) {
            Corn c=new Corn();
            c.corn="corn";
            Corn.printF();
            popcorn pop=new popcorn();
            pop.corn="corn";
            pop.pinkSalt="pink";
            popcorn.printF();
        }
    }

