package HomeWorkClass11;

public class task1phone {
    public static void main(String[] args) {
     phone phone1= new phone();
     phone1.name="Iphone 14Pro Max";
     phone1.color="Purple";
     phone1.price=1500;
     phone1.WaterProof="yes";
     phone1.system="IOS";
    phone1.camera();
    phone1.call();
    phone1.speaker();
        System.out.println(phone1.name);
        //Samsung
        phone phone2=new phone();
        phone2.name="Samsung Galaxy Z Fold4";
        phone2.color="Black";
        phone2.price=1100;
        phone2.WaterProof="yes";
        phone2.system="Android";
        phone2.camraSamsung();
        phone2.fold();
        phone2.speaker();
        phone2.call();
        //pixel
        phone phone3=new phone();
        phone3.name="Pixel";
        phone3.color="Silver";
        phone3.price=1000;
        phone3.system="Android";
        phone3.WaterProof="yes";
        phone3.cameraPixel();
        phone3.call();
        phone3.speaker();

    }
}
