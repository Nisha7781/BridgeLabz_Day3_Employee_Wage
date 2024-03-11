public class EmployeeWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");
        int is_present = 1;

        double EmpPresent = Math.floor(Math.random() * 10) % 2;
        System.out.println(EmpPresent);

        if(EmpPresent == is_present)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}