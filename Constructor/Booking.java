package Constructor;

public class Booking {
    String name;
    int age;
    String phone;


    Booking(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Booking by : "+name+" age : "+age+" phone : "+phone;
    }


}
