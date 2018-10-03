import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double a,b,c;
            System.out.println("Insert value for a: ");
            a=s.nextDouble();
            System.out.println("Insert value for b: ");
            b=s.nextDouble();
            System.out.println("Insert value for c: ");
            c=s.nextDouble();
            s.close();
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            if (Double.isNaN(x1) || Double.isNaN(x2))
            {
                System.out.println("No solution");
            } else System.out.println("The values are: " + x1 + ", " + x2);
        }
    }
