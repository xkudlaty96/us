import java.util.Scanner;
public class zad10 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("liczba:");
		int a=reader.nextInt();
		double pi=0;
		double ni=0;
		int s=0;
		int p=0;
		int n=0;
		for(int i=1;i<a;i*=10){
			int b=a/i;
			int c=b%10;
			s+=c;
			if (c%2==0) {
				p+=c;
				pi++;
			}else{
				n+=c;
				ni++;
			}
		}
		pi=(p/pi)/(n/ni);
		System.out.print("cyfr: "+s);
		System.out.print("\nstosunek "+pi);
	}
}
