package Interfaceconcept;

public class Devolopement implements Bankingclient {

	public static void main(String[] args) {
		
		Devolopement dav = new Devolopement();
		dav.chackingbalance();
		dav.Craditcardbalance();
		dav.Transferbalance();
		dav.loan();
		
		

	}

	

	public void chackingbalance() {
		// TODO Auto-generated method stub
		System.out.println("check the balance in bank account");
		
	}

	public void Transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("Transfer the balance in bank account");
		
	}

	public void Craditcardbalance() {
		// TODO Auto-generated method stub
		System.out.println("check the cradit card balance in bank account");
		
	}
	public void loan() {
		System.out.println("loan payments ");
	}

}
