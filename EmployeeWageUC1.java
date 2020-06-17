import java.util.Random;

class EmployeeWageUC1{
    public static void main(String[] dp){

        System.out.println("Welcome");

        if(Helper.isPresent()){
            System.out.println("Present");
        }else{
            System.out.println("Absent");
        }
    }
}


class Helper{
    // checks if the emp is present or not
    static public Boolean isPresent(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
