package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class BankAccount{
    private int accnum;
    private String accholder;
    private double balance;
    static int totalaccount;

    BankAccount(String accholder  , int accnum , double balance){
        this.accnum = accnum;
        this.accholder = accholder;
        this.balance = balance;
        totalaccount++;
    }
    public void display()
    {
        System.out.println("Account Number : "+ accnum +" , "+ "Account Holder : "+" , "+accholder+" "+"Account Balance : "+balance);
    }
    void deposit(int amt){
        if (amt<=0){
            System.out.println(" Invalid Amount !!!");
        }
        else{
            System.out.println("The updated balance is : "+(balance+amt));
        }
    }
    void withdraw(int amt){
        if (amt>balance){
            System.out.println("Insufficient Balance !!!");
        }
        else{
            System.out.println("Remaining balance is : "+(balance-amt));
        }
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Pulkit" , 101,400000);
        acc1.display();
        System.out.println();
        BankAccount acc2 = new BankAccount("Tanvi" , 102,40000);
        acc2.display();
        acc1.deposit(500);
        acc1.withdraw(200);
        System.out.println();
        acc2.deposit(300);
        acc2.withdraw(900);

        System.out.println();

        acc1.display();
        acc2.display();
    }

}
