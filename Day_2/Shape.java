public class Shape {
    public static void main(String[] args) {
        double shapeValue = 5.0;
        int shapeInt = (int) shapeValue;
        long shapeLong = (long) shapeValue;
        float shapeFloat = (float) shapeValue;

        System.out.println("Current Shape (double): " + shapeValue);
        System.out.println("Transforming shapes...");
        System.out.println("Transformed into int: " + shapeInt);
        System.out.println("Transformed into long: " + shapeLong);
        System.out.println("Transformed into float: " + shapeFloat);
    }
}
