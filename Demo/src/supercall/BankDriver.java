package supercall;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************Welcome**************");
		SavingAccount s=new SavingAccount("SBI","sbi348",20321,"Amjaz",123888749,9878679.3);
		s.displayAcc();
		SavingAccount s1=new SavingAccount("SBI","sbi948",20321,"Anmol",123888749,9878679.3);
		s1.displayAcc();
		
		

	}

}
