package car;

import java.util.Scanner;

/**
 * @author Markus
 */
public class Problem {
    public static void main(String[] args) {
	int i = 4;
	int j;
	double d = 4.0;
	double e;
	String s = "HackerRank ";
	String t;
	Scanner scan = new Scanner(System.in);
	j = scan.nextInt();
	e = scan.nextDouble();
	scan.nextLine();
	t = scan.nextLine();
	System.out.println(i+j);
	System.out.println(d+e);
	System.out.println(s+t);
	scan.close();
    }
}
