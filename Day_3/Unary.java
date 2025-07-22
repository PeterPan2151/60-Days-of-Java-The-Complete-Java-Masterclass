public class Unary {
    public static void main(String[] args) {
        // Unary Operator
        int a = 5;
        int negative = -a;
        System.out.println(negative);

        // Increment operator
        int b = a++; // post increment: first b gets assign a(5), then we incement a(6)
        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(a);
        System.out.println(c);
    }
}
