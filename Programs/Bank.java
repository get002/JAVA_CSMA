
public class Bank {
	public static void main(String args[]) {
		Account ac1=new Account("sai","88888",250000.00,"565656");
		ac1.deposit(250000);
		
		Account ac2=new Account("bharath","666666",2000000.0,"88877666");
	
		ac2.deposit(200);
	}
}

class Account{
	
	
	public String name;
	public String phone;
	public double balance;
	public String AcNumber;
	
	Account(String n,String phone,double balance,String acnumber){
		name=n;
		this.phone=phone;
		this.balance=balance;
		AcNumber=acnumber;
	
		
	}
	public void deposit(double damount) {
		balance +=damount;
		System.out.println("Amount deposited succesffully");
		System.out.println("New Balance is Rs."+balance);
		
	}
	public void withdraw(double wamount) {
		if(balance-wamount<0) {
			System.out.println("Insufficient balance");
			System.out.println("Balance is Rs."+balance);
		}else {
			balance=balance-wamount;
			System.out.println("New Balance is Rs."+balance);
		}
		
	}
}