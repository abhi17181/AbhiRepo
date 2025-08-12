public class FunctionOverloadingExample {

    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        FunctionOverloadingExample obj = new FunctionOverloadingExample();
        obj.display(5);
        obj.display(10, 20);
        obj.display("Hello!");
    }
}
