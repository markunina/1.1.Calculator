import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    static BinaryOperator<Integer> plus = (x, y) -> x + y;
    static BinaryOperator<Integer> minus = (x, y) -> x - y;
    static BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //Исправляем ошибку деления на ноль в методе devide. Теперь, если знаменатель равен нулю, то и результат ноль
    static BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    static UnaryOperator<Integer> pow = x -> x * x;
    static UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    static Predicate<Integer> isPositive = x -> x > 0;
    static Consumer<Integer> println = System.out::println;
}
