import java.util.Scanner;
public class zadanie5 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    double i=0,max,min;
    double suma=0,a;
    do {

    a=read.nextInt();
    if (i==0) {
    max=a;
    min=a;
    }
    if(a>max)max=a;if(a<min)min=a;
    suma+=a;
    if(b!=0)i++;
    }while (a!=0);
    double srednia=suma/i;
    System.out.print("min:"+min+"\nmax:"+max+"\nsuma:"+suma+"\nsrednia:"+srednia);
    }

}
