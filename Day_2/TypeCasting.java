public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting from Int to Double
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        // Explicit Casting from double to Int, we have data loss
        double numDouble2 = 10.5;
        int numInt2 = (int) numDouble2;
        System.out.println(numDouble2);
        System.out.println(numInt2);

        double result = 1 / 2.0;
        System.out.println(result);
    }
}
