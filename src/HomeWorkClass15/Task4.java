package HomeWorkClass15;

public class Task4 {
    /*
    4)Create a method that will say Hello in different language based on the country that will passed when method is executed
    return type=> String void
    name=> say hello
    parameter=> string countryName
     */
  String sayHello(String countryName){
      switch (countryName){
          case "USA":
              return "Hello";  // break is not needed when we use return keyword do the same as break
          case"Pakistan":
              return "Salam";
          case "China":
              return "Ni hao";
          case "Italy":
              return "Ciao";
          default:
              return "country not supported";
      }
  }

    public static void main(String[] args) {
        Task4 country=new Task4();
        System.out.println(country.sayHello("Pakistan"));
    }

}
