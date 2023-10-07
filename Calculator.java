public class Calculator {
   
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    public static void main(String[] args) {
       
        int result = add(5, 3);
        int result1 = sub(5, 3);

      
        System.out.println("The sum is: " + result);
        System.out.println("The subtract is: " + result1);
    }
}
