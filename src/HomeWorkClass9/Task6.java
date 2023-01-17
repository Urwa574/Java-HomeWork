package HomeWorkClass9;

public class Task6 {
    public static void main(String[] args) {
        //6) Create an array of countries. While retrieving all values from an array print capital for each country choose any five countries.
        String [] names={"Germany","Pakistan","Russia","Usa","UK"};
      String [] capital={"Berlin","Islamabad","Moscow","Washington Dc","London"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(capital[i]+ " is the capital of " +names[i]);

        }
    }
}
