//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c=0;
        try {
            c = calc.devide.apply(a, b);//в данном случае произошло деление на 0,
            // что вызвало исключение типа ArithmeticException - поместим вызов данного метода
            // в конструкцию try/catch
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        calc.println.accept(c);
    }
}