public class EmployeeWage {
    static int fullTime = 1;
    static int partTime = 2;
    static int ratePerHr = 20;

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program...");
        int empHrs = 0;
        int empWage = 0;

        int EmpPresent = (int) Math.floor(Math.random( )*10) % 3;

        switch (EmpPresent)
        {
            case 1:
                empHrs = 4;
                break;
            case 2:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * ratePerHr;
        System.out.println("Employee wage is: "+ empWage );

    }
}