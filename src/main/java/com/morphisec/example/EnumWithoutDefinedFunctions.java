package com.morphisec.example;

import com.morphisec.enums.Country;
import com.morphisec.enums.Operator;

/**
 * This class runs examples to demonstrate {@link Country} {@code enum}  class
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public class EnumWithoutDefinedFunctions {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 2;

        Operator operator = Operator.ADD;
        int intResult = operator.execute(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + intResult);

        operator = Operator.SUBTRACT;
        intResult = operator.execute(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + intResult);

        operator = Operator.MULTIPLY;
        intResult = operator.execute(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + intResult);

        operator = Operator.DIVIDE;
        intResult = operator.execute(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + intResult);

        operator = Operator.POWER;
        double doubleResult = operator.execute(3,4);
        System.out.println(num1 + " ^ " + num2 + " = " + doubleResult);

    }

}
