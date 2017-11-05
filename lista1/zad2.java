import java.util.Scanner;
public class zad2 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    int a = reader.nextInt();
    int b = reader.nextInt();
    int c = reader.nextInt();
    System.out.print("Najwieksza:");
    if (a<b&&b<c){
      System.out.print(c);
    }else{
      if(a<b){
        System.out.print(b);
      }else{
        System.out.print(a);
      }
    }
    System.out.print("Najmniejsza:");
    if (a>b&&b>c){
      System.out.print(c);
    }else{
      if(a>b){
        System.out.print(b);
      }else{
        System.out.print(a);
      }
    }
  }
}
