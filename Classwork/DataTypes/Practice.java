package DataTypes;

public class Practice {
    public static void main(String[] args) {
        
        int empId = 123;

        if(empId > 100){
            throw new ResourceNotFoundException("Employee with given id is not present "+empId);
        }

        System.out.println("Employee is present with id : "+empId);
    }
}
