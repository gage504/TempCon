import java.util.Scanner;
public class tempConverter {
    static Scanner sc = new Scanner(System.in);

    // Celsius to Fahrenheit
    static double c2f(double c) {
        double f = c * 9 / 5 + 32;
        return f;
    }

    // Celsius to Kelvin
    static double c2k(double c) {
        double k = c + 273.15;
        return k;
    }

    // Fahrenheit to Celsius
    static double f2c(double f) {
        double c = (f - 32) * 5 / 9;
        return c;
    }

    //Fahrenheit to Kelvin
    static double f2k(double f) {
        double k = (f - 32) * 5 / 9 + 273.15;
        return k;
    }

    // Kelvin To Celsius
    static double k2c(double k) {
        double c = k - 273.15;
        return c;
    }

    //Kelvin to Fahrenheit
    static double k2f(double k) {
        double f = (k - 273.15) * 9 / 5 + 32;
        return f;
    }

    // Receive Input
    static double temp(String x) {
        System.out.println("Enter your temperature: " + x);
        double y = sc.nextDouble();
        return y;
    }

    static void output(double y, String x) {

        System.out.printf("%s value: %.2f", x, y);
    }

    // Main method
    public static void main(String args[]) {

        for (int y = 0; y < 7; y++) {
            System.out.println("\nPress 1 to covert C to F\nPress 2 to convert C to K\n" +
                    "Press 3 to convert F to C\nPress 4 to convert F to K\n" +
                    "Press 5 to convert K to C\nPress 6 to convert K to F\nPress 7 to Quit");
            int t = sc.nextInt();
            double count = 0;
            switch (t) {

                case 1:
                    count = temp("C");
                    output(c2f(count), "F");
                    break;
                case 2:
                    count = temp("C");
                    output(c2k(count), "K");
                    break;
                case 3:
                    count = temp("F");
                    output(f2c(count), "C");
                    break;
                case 4:
                    count = temp("F");
                    output(f2k(count), "K");
                    break;
                case 5:
                    count = temp("K");
                    output(k2c(count), "C");
                    break;
                case 6:
                    count = temp("K");
                    output(k2f(count), "F");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
                sc.nextLine();
            System.out.println("\nChoose another conversion to make!");



        }
        }
    }



