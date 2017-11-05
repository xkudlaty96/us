import java.util.Scanner;
public class zad5 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    double c,r;
    do{
      System.out.print("\nCena: ");
      c = reader.nextDouble();
    }while(!(c>100&&c<10000))
    do{
      System.out.print("\nRaty: ");
      r = reader.nextDouble();
    }while(!(r>6&&r<48))
    if(r<=12) c*=1.025;
    if(r>12&&r<=24)c*=1.05;
    if(r>24)c*=1.1;
    c/=r;
    System.out.print("\nRata wynosi: "+p+" PLN");
  }
}
