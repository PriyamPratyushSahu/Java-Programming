package _0_Challenges;

import java.util.Scanner;

class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob){
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add){ address=add; }
    public void setPhno(String phno){ this.phno=phno;}
            
}

class SavingsAccount extends Account{
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void deposit(long amt){ balance+=amt; }
    public void withdraw(long amt){ balance-=amt; }
}

class LoanAccount extends Account{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void payEMI(long amt){ balance-=amt;}
    public void repay(long amt){
        if(balance==amt)
            balance=0;
    }
}

public class _36_AccountCustomer {

    public static void main(String[] args) 
    {
        SavingsAccount sa = new SavingsAccount("12345", "Priyam Pratyush Sahu", "Bangalore", "1231211", "05/07/2000");
        LoanAccount la = new LoanAccount("12345", "Priyam Pratyush Sahu", "Bangalore", "1231211", "05/07/2000");

        int ch;
        long bl, wh;
        Scanner pp = new Scanner(System.in);
        do {
            
            System.out.print("1. Check Balance\n2. Deposit Amount\n3.Withdraw Amount\nEnter Choice: ");
            ch = pp.nextInt();
            switch (ch) {
                case 1:
                    System.out.format("Balance: %d\n", sa.getBalance());
                    break;
                case 2:
                    System.out.println("Enter Deposit amount: ");
                    while(true){
                        bl = pp.nextLong();
                        if(bl > 0)
                            break;
                        else
                            System.out.println("! Enter a positive amount");
                    }
                    sa.deposit(bl);//sa.balance += bl;
                    System.out.format("Balance: %d\n", sa.getBalance());
                    break;
                case 3:
                    System.out.println("Enter withdrawl amount: ");
                    wh = pp.nextLong();
                    if (wh > sa.balance)
                        System.out.println("Balance limit exceeded!");
                    else
                        sa.withdraw(wh);
                        System.out.format("Balance: %d\n", sa.getBalance());
                    break;
            }

            System.out.println("Press 1 to continue ");
            ch = pp.nextInt();
            
        } while (ch == 1);
        System.out.println("Logging out ...thank you,Have a nice day");
        pp.close();
    } 
    
}
