package HomeWorkClass17;

public class Task6Book {
    /*6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
      String authorName;
      String bookName;
      int publishYear;

      Task6Book(String name,String Book){
          authorName=name;
          bookName=Book;
      }
      Task6Book(int year){
          publishYear=year;
      }
      void bookInfo(){
          System.out.println(authorName+" "+bookName+" "+publishYear);
      }

    public static void main(String[] args) {
        Task6Book book1=new Task6Book(2009);
        book1.bookInfo();
        Task6Book book2=new Task6Book("Elife","The Forty Rules of Love");
        book2.bookInfo();

    }

}
