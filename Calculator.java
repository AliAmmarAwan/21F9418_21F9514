public class Calculator {
   
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b) {
        int subtract = a - b;
        return subtract;
    }
    public static int divide(int a, int b) {
        int div = a / b;
        return div;
    }
    public static int multiply(int a, int b) {
        int mul= a * b;
        return mul;
    }
    

    public static void main(String[] args) {
       
        int result = add(5, 3);
        int result1 = sub(5, 3);
        int result2 = divide(5, 3);
        int result3 = multiply(5, 3);
        System.out.println("The sum is: " + result);
        System.out.println("The subtract is: " + result1);
        System.out.println("The division is: " + result2);
        System.out.println("The multiply is: " + result3);
    }
}
