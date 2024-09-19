import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //добавим русскоязычное описание ошибки в реализацию метода
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y!=0) return x / y;
        throw new ArithmeticException("Делить на 0 нельзя");
};

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate <Integer> isPositive = x-> x>0;

    Consumer<Integer> println = System.out::println;
}
