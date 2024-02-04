import java.util.Scanner;

public class SwitchCaseStatement {
    public static double areaSwitchCase(int ch, double []a) {
        double area;
        switch(ch) {
            case 1:
            area = Math.PI * a[0] * a[0];
            break;

            case 2:
            area = a[0] * a[1];
            break;

            default:
            area = 0.0;
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double[] a = new double[ch];
        for(int i=0; i<ch; i++) {
            a[i] = sc.nextDouble();
        }
        System.out.println(areaSwitchCase(ch, a));
        sc.close();
    }
}