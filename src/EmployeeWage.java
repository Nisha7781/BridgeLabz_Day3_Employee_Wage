public class EmployeeWage {
    public static int fullTime = 1;
    public static int partTime = 2;
    static int ratePerHr = 20;
    static int workingDays = 20;

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");

        int empHr = 0, empWage = 0, totalEmpWage =0;
        for (int i=0; i < workingDays; i++)
        {
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


            empWage = empHr * ratePerHr;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Emp Wage on day "+ i +" is " + empWage);

        }
        System.out.println("Total Emp Wage:" + totalEmpWage);
    }
}