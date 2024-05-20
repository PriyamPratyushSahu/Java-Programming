package string_programs;

public class Question1_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionParty t=new TransactionParty("Smita Ray", "Ria Sinha");
		Receipt r=new Receipt(t, "250,10@100,3@50,7");
		GenerateReceipt g=new GenerateReceipt();
		System.out.println(g.calcGST(r));
	}

}
