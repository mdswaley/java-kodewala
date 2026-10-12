package StringBuilderAndBuffer;

public class GenerateQuery {

    public StringBuilder generateQuery(int salary, String empID){
        StringBuilder query = new StringBuilder("Select * from employees ");

        if (salary > 0) {
            query.append(" where salary = "+salary+";");
        }else if(empID != null){
            query.append(" where empID = "+empID+";");
        }else{
            query.append(";");
        }

        return query;
    }
}
