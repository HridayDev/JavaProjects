import java.util.Scanner;

public class BankBackup {
    public static void main(String[] args) {    new Bank();    }
    public BankBackup(){
        Scanner sc=new Scanner(System.in);//input taker
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");//ask details
        String name=sc.nextLine();//get name
        String customerId=sc.nextLine();//get cm
        BankAccountBackup soft=new BankAccountBackup(name, customerId);//start software
        soft.menu();//show options
        sc.close();}
}

//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------

class BankAccountBackup{
    double balance;
    double prevTrans;
    String customerName;
    String customerId;

    void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
        // welcomes
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID:"+customerId);
        System.out.println("\n");
        // ask options
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        System.out.println("f) Log Out");

        do{  // asks option
            System.out.println("********************************************");
            System.out.println("Choose an option");
            option=sc.next().charAt(0);
            System.out.println("\n");
            
            //does stuff
            switch (option){
                case 'a': // shows balance if option a
                    System.out.println("......................");
                    System.out.println("Balance ="+balance);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b': // deposits amount to balance if option b
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt=sc.nextDouble();// gets amount
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c': // withdraws amount from balance if option b
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW=sc.nextDouble();// gets amount
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd': // shows previous transaction if option b
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'e':
                    System.out.println("......................");
                    System.out.println("Thank you for using our banking services");
                    System.out.println("......................");
                    break;
                case 'f':
                    System.out.println("......................");
                    System.out.println("Logging Out...");
                    logOut();
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }// switch
            
        }while(option!='e');// detect close option
        sc.close();
    }// void menu
    
    void logOut(){
    	System.out.println("\n\n\n\n");
    	new Bank();
    }
    
//--------------------------------------------------------------------------------------
    
    BankAccountBackup(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;    				
    }

//--------------------------------------------------------------------------------------

    void deposit(double amount){  
        if(amount!=0){
            balance+=amount;// add amount
            prevTrans=amount;}// set previous tranc 				
    }

//--------------------------------------------------------------------------------------
    
    void withdraw(double amt){  // withraw money
        if(amt!=0 && balance>=amt){
            balance-=amt;
            prevTrans=-amt;
        }
        else if(balance<amt){
            System.out.println("Bank balance insufficient");
        }
    }

//--------------------------------------------------------------------------------------
    
    void getPreviousTrans(){  //just show last transaction
        if(prevTrans>0){
            System.out.println("Deposited: "+prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: "+Math.abs(prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }
    }

//--------------------------------------------------------------------------------------
    


}// class