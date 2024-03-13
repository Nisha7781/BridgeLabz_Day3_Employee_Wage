public class EmployeeWage {
    public static int fullTime = 1;
    public static int partTime = 2;

    public void calculateWage(String company, int ratePerHr,int maxWorkingDays, int maxWorkinghrs)
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
            System.out.println("Day :" + WorkDays + " Emp HR: "+empHr);

            empWage = empHr * ratePerHr;


        }

        System.out.println();
        System.out.println("Total working Days: "+WorkDays);
        System.out.println("Total working hours: "+WorkHrs);
        totalEmpWage = WorkHrs * ratePerHr;
        System.out.println("Total Employee Wage of company " +company + " is "+ totalEmpWage);
        System.out.println();

    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");
        EmployeeWage wage = new EmployeeWage();
        wage.calculateWage("TATA", 20, 20, 100);
        wage.calculateWage("QK", 18, 20, 120);
        wage.calculateWage("Reliance", 24, 22, 150);

    }
}