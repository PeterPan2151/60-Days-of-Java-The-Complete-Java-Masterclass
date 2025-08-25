public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3,4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }


        String[] friends = {"Nancy", "David", "Paul"};
        for (String friend : friends){
            System.out.println("Hello " + friend);
        }
    }
}
