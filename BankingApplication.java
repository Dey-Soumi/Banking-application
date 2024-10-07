import java.util.Scanner;
public class BankingApplication {
    public static void main(String[]args){
   /*Scanner scanner=new Scanner(System.in);
   //int a= scanner.nextInt();
   System.out.println("enter the charecter");
   char c=scanner.next().charAt(0);
   System.err.println("value="+c);*/
   BankAccount obj1=new BankAccount("XYZ","BA001");
   obj1.showMenu();


    }
}
    class BankAccount{
       int balance;
       int previousTransaction;
       String customerName;
       String customerId;

       BankAccount(String cname,String cid)
       {
             customerName=cname;
             customerId=cid;

       }

       void deposit(int amount){
           if(amount!=0)
           {
            balance=balance+amount;
            previousTransaction=amount;
           }
       }
       void withdraw(int amount)
       {
        if(amount!=0)
         {
            balance= balance-amount;
            previousTransaction= -amount;
         }
       }
       void  getpreviousTransection(){
        if(previousTransaction>0)
        {
            System.out.println(("Deposit:"+previousTransaction));
        }
        else if(previousTransaction<0)
        {
            System.out.println("Withdraw:"+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transection");
        }
       }

       void showMenu()
       {
          char option='\0';
            Scanner scanner=new Scanner(System.in);
            System.out.println("welcome"+customerName);
            System.out.println("your ID is"+customerId);
            System.out.println("\n");
            System.out.println("A. Checkbalance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. previous transection");
            System.out.println("E. Exit");

            do{
                System.out.println("*********************************");
                System.out.println("enter the option");
                System.out.println("**********************************");
                option=scanner.next().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                    System.out.println("*********************************");
                    System.out.println("Balance="+balance);
                    System.out.println("*********************************");
                    System.out.println("\n");
                        break;
                    
                        case 'B':
                        System.out.println("*********************************");
                        System.out.println("enter the amount to deposit");
                        System.out.println("*********************************");
                        int amount=scanner.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break; 
                        
                        case 'C':
                        System.out.println("*********************************");
                        System.out.println("enter the amount to withdraw");
                        System.out.println("*********************************");
                        int amount2=scanner.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break; 

                        case 'D':
                    System.out.println("*********************************");
                   getpreviousTransection();
                    System.out.println("*********************************");
                    System.out.println("\n");
                        break;
                        case 'E':
                        System.out.println("*****************************");
                        break;
                
                    default:
                    System.out.println("Invalid option!!please eneter again");
                        break;
                }
            }while(option!='E');
            System.out.println("Thank you");
       }

    }

