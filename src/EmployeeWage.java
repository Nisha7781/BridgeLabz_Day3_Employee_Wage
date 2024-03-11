public class EmployeeWage {
    public static int fullTime = 1;
    public static int partTime = 2;
    static int ratePerHr = 20;
    static int MaxWorkingDays = 20;
    static int MaxWorkinghrs = 100;

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");

        int empHr = 0, empWage = 0, totalEmpWage =0;
        int WorkHrs = 0, WorkDays = 0;

        while(WorkDays < MaxWorkingDays && WorkHrs < MaxWorkinghrs )
        {
            WorkDays++;
            int EmpPresent = (int) Math.floor(Math.random( )*10) % 3;

            if(EmpPresent == fullTime)
            {
                empHr = 8;
            }
            else if(EmpPresent == partTime)
            {
                empHr = 5;
            }
            else
            {
                empHr = 0;
            }

            WorkHrs = WorkHrs + empHr;
            System.out.println("Day :" + WorkDays + " Emp HR: "+empHr);

            empWage = empHr * ratePerHr;
            System.out.println("Employee Wage on day " + WorkDays +" is: " + empWage);

        }
        System.out.println("Total working Days: "+WorkDays);
        System.out.println("Total working hours: "+WorkHrs);
        totalEmpWage = WorkHrs * ratePerHr;
        System.out.println("Total Employee Wage:" + totalEmpWage);
    }
}