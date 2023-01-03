package summerProject;

public class BirthdayGift {

	public static void main(String[] args) {
		int gift = 10;
		int age = 12;
		int sum = 10;
		while (gift<=1000) {
			gift = gift*2;
			sum=sum+gift;
			age++;
		}
		System.out.println("The girl's last amount when she turns "+age+" is $"+gift+". Total earned=$"+sum);

	}

}
