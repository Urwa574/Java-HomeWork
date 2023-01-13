package HomeWorkClass4;

public class MortgageTask2 {
    public static void main(String[] args) {
        /* Create a Java program and store values of mortgage rate and mortgage price.
        First, program should check if rate is higher than 4.5 user will not buy a house,
         otherwise user will consider buying. Once user decides to buy a house, if price of the
         house is larger than 200000 than user will take a loan, otherwise user will pay cash.
         */
        float mortgagePrice=3.9f;
        int housePrice=190000;
        if(mortgagePrice>4.5){
            System.out.println("You should not buy a House");
        }else{
            System.out.println("You consider to buy a House");
        }
        if (housePrice>200000){
            System.out.println("You should take a loan");
            }else{
                System.out.println("User will pay Cash");
            }
    }
    }


