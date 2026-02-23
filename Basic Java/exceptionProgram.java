public class exceptionProgram {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a/b;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally{
            System.out.println("Welcome");
        }
    }
}
