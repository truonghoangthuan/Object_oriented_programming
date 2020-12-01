package thuchanh.buoi1;

public class SumOfArguments {
    public static void main(String args[]) {
        double sum = 0.0, n = 0.0;
        for (String x : args) {
            try {
                n = Double.parseDouble(x);
            } catch (NumberFormatException e) {
                n = 0;
            }
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}
