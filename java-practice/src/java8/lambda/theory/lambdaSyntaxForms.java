package java8.lambda.theory;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class lambdaSyntaxForms {

    public static void main(String [] args){

        //1. No parameters
        Supplier<String> hello = () -> "Hello!";

        //2. One parameter (parens optional)
        Function<String, Integer> len = s -> s.length();

        //3. Two or more parameters
        BinaryOperator<Integer> add = (a,b) -> a + b;

        //4. Multi-statement block body
        Consumer<String> print = s -> {
          String upper = s.toUpperCase();
          System.out.println(upper);
        };

    }

}
