package HomeWorkClass33;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    //2) Create a static method that will return a List of Exceptions.
    //Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
    //Call your method inside main and print name and details of all Exception objects.
    public static List<Exception> exceptionList(){
        List<Exception> list= new LinkedList<>();
        try {
            System.out.println(10/0);
        }catch (ArithmeticException AException){
            AException.printStackTrace();
            list.add(AException);
        }
        try {
            String name="";
        }catch (NullPointerException ne){
            ne.printStackTrace();
            list.add(ne);
        }
        try {
            int [] no=new int[3];
            System.out.println(no[5]);
        }catch (ArrayIndexOutOfBoundsException AIE){
            AIE.printStackTrace();
            list.add(AIE);
        }
        try {
            String name="urwa";
            name.charAt(8);
        }catch (StringIndexOutOfBoundsException SE){
            SE.printStackTrace();
            list.add(SE);
        }
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("");
        }catch (FileNotFoundException FE){
            FE.printStackTrace();
            list.add(FE);
        }
        return list;

    }

    public static void main(String[] args) {
        exceptionList();
    }

}
