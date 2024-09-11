
import Dayday-IT-2E;
-IT-2E;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LoanManager loanManager = new LoanManager();
            
            boolean running = true;
            while (running) {
                System.out.println("Loan Application System");
                System.out.println("1. Add a new loan application");
                System.out.println("2. View all loan applications");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        
                        System.out.print("Enter Application ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();  
                        
                        System.out.print("Enter Applicant's Name: ");
                        String name = sc.nextLine();
                        
                        System.out.print("Enter Monthly Income: ");
                        double monthlyIncome = sc.nextDouble();
                        
                        System.out.print("Enter Credit Score: ");
                        int creditScore = sc.nextInt();
                        
                        System.out.print("Enter Total Existing Loans: ");
                        double existingLoans = sc.nextDouble();
                        
                        loanManager.addLoanApplication(id, name, monthlyIncome, creditScore, existingLoans);
                        break;
                        
                    case 2:
                       
                        loanManager.viewAllLoanApplications();
                        break;
                        
                    case 3:
                      
                        running = false;
                        System.out.println("Exiting...");
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }
}