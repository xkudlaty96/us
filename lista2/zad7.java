import java.util.Scanner;
public class zad7 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("znak wypelnienia:");
		String w=reader.next();
		System.out.println("wspolrzedne gornego lewego rogu");
		int x = reader.nextInt();
		int y = reader.nextInt();
		System.out.println("dlugosc bokow");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int i;
		int j;
		for (i=2; i<=y; i++) {
			System.out.println();
		}
		for (i=0; i<b; i++) {
			for (j=2; j<=x; j++) {
				System.out.print(" ");
			}
			for (j=0; j<a; j++) {
				System.out.print(w);
			}
			System.out.println();
		}

	}
}
