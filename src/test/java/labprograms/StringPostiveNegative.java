package labprograms;

public class StringPostiveNegative {
    public static void main(String[] args) {
        String n = "123";

        try {
            int num = Integer.parseInt(n);
            if (num > 0) {
                System.out.println(n + " It's a positive number");
            } else {
                System.out.println(n +" Not a positive number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
    }
}
