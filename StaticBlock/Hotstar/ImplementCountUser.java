package StaticBlock.Hotstar;

public class ImplementCountUser {
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            CountUser c1 = new CountUser("3i4ui3", "Swaley", "Sub");
        }

        System.out.println("Total number of Object : "+CountUser.liveUserCount);
    }
}
