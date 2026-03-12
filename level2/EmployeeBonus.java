import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sal[] = new double[10], yrs[] = new double[10];
        double bonus, newSal;
        double totalBonus=0, totalOld=0, totalNew=0;

        for(int i=0;i<10;i++){
            System.out.print("Salary: ");
            sal[i]=sc.nextDouble();
            System.out.print("Years: ");
            yrs[i]=sc.nextDouble();

            if(sal[i]<0 || yrs[i]<0){
                System.out.println("Invalid, enter again");
                i--;
            }
        }

        for(int i=0;i<10;i++){
            bonus = (yrs[i]>5) ? sal[i]*0.05 : sal[i]*0.02;
            newSal = sal[i] + bonus;

            totalBonus += bonus;
            totalOld += sal[i];
            totalNew += newSal;
        }

        System.out.println("Total Bonus = "+totalBonus);
        System.out.println("Total Old Salary = "+totalOld);
        System.out.println("Total New Salary = "+totalNew);
    }
}