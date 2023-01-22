package HomeWorkClass9;

public class Task2 {
    public static void main(String[] args) {
        //2) Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
        String [] names={"Urwa","Olga","Fouzia","Batyr","Esther"};
        System.out.println("name "+names[0]);
        // 2nd method;
        System.out.println("---------------");
        String []name=new String[5];
        name [0]="Urwa";
        name [1]="Olga";
        name [2]="Fouzia";
        name [3]="Batyr";
        name [4]="Esther";
        System.out.println("name "+name[0]);

        System.out.println("_______________");
        String [] arr=new String[5];
         arr [0]="This";
         arr [1]="is";
         arr [2]="array";
         arr [3]="of";
         arr [4]="String";
        for (int i = 0; i <=4 ; i++) {
            System.out.print(arr[i]+" ");

        }
        // replit practice array with for loop
        int [] num=new int[10];
        int no=1;
        for (int i = 0; i < num.length; i++) {
         num[i]=no+i;
            System.out.println(num[i]);

        }











    }
}
