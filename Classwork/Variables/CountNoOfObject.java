package Variables;

public class CountNoOfObject {
    static int count;

    CountNoOfObject(){
        count++;
    }

    public static void main(String[] args) {
        CountNoOfObject c1 = new CountNoOfObject();
        CountNoOfObject c2 = new CountNoOfObject();
        CountNoOfObject c3 = new CountNoOfObject();

        System.out.println(CountNoOfObject.count);

    }
}
