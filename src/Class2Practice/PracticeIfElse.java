package Class2Practice;

public class PracticeIfElse {
    public static void main(String[] args) {
        int money=500;
        System.out.println(money>=300);
        if(money>=300){
            System.out.println("yayy lets go for shopping");
        }
        //lets make this condition false
        int money1=150;
        System.out.println(money1>=300);
        if(money1>=300) {
            System.out.println("yayy lets go for shopping");
        }
        //lets have another case
        if(money1<300){
            System.out.println("Lets save money");
            System.out.println("Maybe im spending too much on food");
        }
    }
}
