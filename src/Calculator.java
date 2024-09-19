import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y; //операция сложения
    BinaryOperator<Integer> minus = (x, y) -> x - y; //операция вычитания
    BinaryOperator<Integer> multiply = (x, y) -> x * y; //операция умножения

    //добавим русскоязычное описание ошибки в реализацию метода
    BinaryOperator<Integer> devide = (x, y) -> { //операция деления
        if (y!=0) return x / y;
        throw new ArithmeticException("Делить на 0 нельзя");
};

    UnaryOperator<Integer> pow = x -> x * x;  //возведение в квадрат
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; //абсолютное значение переменной

    Predicate <Integer> isPositive = x-> x>0;

    Consumer<Integer> println = System.out::println; //вывод в консоль
}
