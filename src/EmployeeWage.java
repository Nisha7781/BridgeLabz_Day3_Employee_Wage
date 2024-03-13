public class EmployeeWage {
    public static int fullTime = 1;
    public static int partTime = 2;

    private final String company;
    private final int ratePerHr;
    private final int maxWorkingDays;
    private final int maxWorkinghrs;
    private int totalEmpWage;

    public EmployeeWage(String company, int ratePerHr,int maxWorkingDays, int maxWorkinghrs)
    {
        this.company = company;
        this.ratePerHr = ratePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkinghrs = maxWorkinghrs;
    }


    public void calculateWage()
    {
        int empHr = 0, empWage = 0;
        int totalEmpWage =0;
        int WorkHrs = 0,  WorkDays = 0;

        while(WorkDays < maxWorkingDays && WorkHrs < maxWorkinghrs )
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
            empWage = empHr * ratePerHr;

        }
        totalEmpWage = WorkHrs * ratePerHr;
    }

    public String toString()
    {
        System.out.println("Details of " + company + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour:" + ratePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkinghrs);
        return "Total wage for a month of " + company + " employee is " + totalEmpWage + "\n";

    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");

        EmployeeWage google = new EmployeeWage("Google", 20, 20, 100);
        google.calculateWage();
        System.out.println(google);

        EmployeeWage microsoft = new EmployeeWage("Microsoft", 18, 20, 120);
        microsoft.calculateWage();
        System.out.println(microsoft);


    }

}
