public class EmployeeWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program...");
        int fullTime = 1;
        int ratePerHr = 20;

        int empHr = 0;
        int empWage = 0;

        double EmpPresent = Math.floor(Math.random() * 10) % 2;
        System.out.println(EmpPresent);

        if(EmpPresent == fullTime)
        {
            empHr = 8;
        }
        else
        {
            empHr = 0;
        }

        empWage = empHr * ratePerHr ;
        System.out.println("Employee wage is: " + empWage);
    }
}