import java.util.Scanner;
public class Euclid {

  public static void main(String[] args) {
    String s = "";
    int m = 0;
    int n = 0;
    int r = 0;
    int gcd = 0;
    boolean done = false;

    while(!done){
      System.out.println("We are going to perform Euclid's Algorithm." + "\n"
      + "Please enter in two value to find their GCD. Or type exit to stop.");
      Scanner input = new Scanner(System.in);
 
        s = input.next();
        if (s.equalsIgnoreCase("Exit")){
          done = true;
          System.exit(0);
        }  else {
          m = Integer.parseInt(s);       
          n = input.nextInt();
     
          if (m == 0 || n == 0) {
            System.out.println("0");
          }
          else {
            while (n != 0) {
              r = m % n;
              System.out.println("gcd(" + m + "," + n + ")" + " = " + r);
              m = n;
              n = r;
              if (n == 0) {
                System.out.println("gcd(" + m + "," + n + ")" + " = " + r);
              }
            }
            gcd = m;
            System.out.print("Greatest common divisor: " + gcd);
            System.out.println("\n");
        }
      }
    }
  }
}