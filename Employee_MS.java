import java.util.*;

public class exp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees:");
        int n = sc.nextInt();
        sc.nextLine();

        int[] empId = new int[n];
        String[] depName = new String[n];
        String[] empDes = new String[n];
        String[] empName = new String[n];
        String[] dateJoin = new String[n];
        float[] basic = new float[n];
        float[] hra = new float[n];
        float[] it = new float[n];
        String[] desCodes = new String[n];
        int choice;

        do {
            System.out.println("\n1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: 
                    for(int i = 0; i <n ; i++){
                        System.out.println("Enter the details for Employee " + (i+1) + " :");

                        System.out.print("Employee ID: ");
                        empId[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Department Name: ");
                        depName[i] = sc.nextLine();

                        System.out.print("Employee Designation: ");
                        empDes[i] = sc.nextLine();

                        System.out.print("Employee Name: ");
                        empName[i] = sc.nextLine();

                        System.out.print("Date of Joining (dd-mm-yyyy): ");
                        dateJoin[i] = sc.nextLine();

                        System.out.print("Basic Salary: ");
                        basic[i] = sc.nextFloat();

                        System.out.print("House Rent Allowance: ");
                        hra[i] = sc.nextFloat();

                        System.out.print("Income Tax: ");
                        it[i] = sc.nextFloat();
                        sc.nextLine();

                        System.out.print("Designation Code: ");
                        desCodes[i] = sc.nextLine();

                        System.out.print("Employee "+(i+1)+" details saved succesfully!\n");
                    }
                break;
                case 2:
                    System.out.println("Employee details:");
                    System.out.printf("%-10s %-10s %-10s %-15s %-15s %-10s %-10s %-10s %-10s %-10s\n","Employee", "ID",  "Department",   "Desisgnation",  "Name", "Date", "Basic Salary","HRA","IT", "DesCode");
                    for(int i = 0; i < n; i++){
                        System.out.printf("%-10d %-10d %-10s %-15s %-15s %-10s %-13.2f %-10.2f %-10.2f %-10s\n",(i+1),empId[i],depName[i],empDes[i],empName[i],dateJoin[i],basic[i],hra[i],it[i],desCodes[i]);
                    }
                    for(int i = 0; i<n ; i++){
                        float da = getDA(desCodes[i]);
                        float TS = basic[i] + hra[i] + da - it[i];
                        System.out.print("Total salary of Employee "+ (i+1) +" :" +TS+"\n");
                    }
                break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        while (choice != 3);
    }
    public static float getDA(String desCode) {
        float da = 0.0f;
        switch (desCode) {
            case "HR":
                da = 5000;
                break;
            case "SD":
                da = 4000;
                break;
            default : 
                da = 0;
                break;
        }
        return da;
    }
}