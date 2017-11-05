import java.util.Scanner;
public class zad9 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("podaj liczbe:");
		int a=reader.nextInt();
		int i;
		int j=0;
		if (a>1) {
		for (i=2;i<=a/2;i++) {
			if (a%i==0) {
				System.out.println("nie pierwsza");
				return;
			}
		}
		System.out.println("pierwsza");
	}
}
