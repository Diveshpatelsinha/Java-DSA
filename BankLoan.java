
// A bank wants to build a system to determine loan eligibility.
// The system takes the applicant’s salary, CIBIL score, and age as input.
// Eligibility rules:
// If salary is ₹30,000 or more AND CIBIL score is 750 or above → Applicant is Eligible.
// If salary is ₹25,000 or more AND CIBIL score is 700 or above → Applicant is Conditionally Eligible.
// Otherwise → Applicant is Not Eligible.
// However:
// The applicant’s age must be between 21 and 60 years.
// If age is outside this range → Automatically Not Eligible.
// Write a program to determine and display the loan status.



import java.util.Scanner;
public class BankLoan {

    static void Eligibility(double salary, double Cibil_Score, int Age){
      if(Age>=21 && Age <=60){
        if(salary>=30000 && Cibil_Score>=750){
           System.out.println("You are Eligible for Loan");
        }
        else if(salary>=25000 && Cibil_Score>=700){
           System.out.println("You are conditionally eligible");
    }
}
        else{
            System.out.println("you are not eligible");
        }

}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

          System.out.print("Enter Cibil Score: ");
        double Cibil_Score = sc.nextDouble();

          System.out.print("Enter Age: ");
        int Age = sc.nextInt();

        Eligibility(salary, Cibil_Score, Age);

    }
}
