import java.util.Scanner;
public class zad8 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("podaj liczbe");
		int a=reader.nextInt();
		System.out.println("dzielniki: ");
		for (int i=1;i<=a;i++) {
			   if (a%i==0) {
				 System.out.println(i);
			}
		}
	}
}
