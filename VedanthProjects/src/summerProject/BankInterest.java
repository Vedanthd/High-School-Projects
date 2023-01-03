package summerProject;

public class BankInterest {

	public static void main(String[] args) {
		double account=1000;
		for(int year = 1; year<=10; year++) {
			account=(account*.008)+account;
			System.out.println("You have $" +account+ " after " +year+ " years");
		}

	}

}
