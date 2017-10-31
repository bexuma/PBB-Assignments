import java.io.PrintStream;
import java.util.Scanner;

public class Derivative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStream ps = System.out;
		int n; // value of the highest power assigned to the first coefficient
		double f1 = 0;
		double f2 = 0;
		double f3 = 0;
		double[] c = new double[100];
		double[] k = new double[3];

		n = sc.nextInt();

		if (n > 0 && n < 100) {
			for (int i = 0; i < n + 1; i++)
				c[i] = sc.nextDouble();
			
			for (int i = 0; i < 3; i++)
				k[i] = sc.nextDouble();

			for (int i = 0; i < n; i++) {
				f1 += c[i] * (n - i) * Math.pow(k[0], n - i - 1);
				f2 += c[i] * (n - i) * Math.pow(k[1], n - i - 1);
				f3 += c[i] * (n - i) * Math.pow(k[2], n - i - 1);
			}

			ps.printf("%.2f", min(f1, f2, f3));
			sc.close();
			
		} else {
			sc.close();
			throw new IllegalArgumentException();
		}
	}

	public static double min(double x1, double x2, double x3) {
		double min;

		if (x1 < x2 && x1 < x3)
			min = x1;
		else if (x2 < x1 && x2 < x3)
			min = x2;
		else
			min = x3;
		return min;
		
	}
}
