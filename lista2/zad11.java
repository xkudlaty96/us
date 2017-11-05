import java.util.Scanner;
public class zad11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("podaj liczbe:");
		int a=reader.nextInt();
		int b=a;
		int c=a-1;
		int i;
		int j;
		int k;
		for (i=0;i<a;i++) {
			for (j=b;j>1;j--){
				System.out.print(" ");
			}
			for (k=0; k<a-c; k++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
			c-=2;
		}
	}
}
