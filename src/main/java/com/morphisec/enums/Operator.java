package com.morphisec.enums;

/**
 * This {@code enum} class has items that override nad implement an abstract method
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public enum Operator {
    ADD {
        @Override public int execute(final int num1, final int num2) {
            return num1 + num2;
        }
    },
    SUBTRACT {
        @Override public int execute(final int num1, final int num2) {
            return num1 - num2;
        }
    },
    MULTIPLY {
        @Override public int execute(final int num1, final int num2) {
            return num1 * num2;
        }
    },
    DIVIDE {
        @Override public int execute(final int num1, final int num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Can't divide by zero.");
            }
            return 0;
        }
    },
    POWER {
        @Override public int execute(final int num1, final int num2) {
            return (int) Math.pow(num1, num2);
        }
    };

    public abstract int execute(int num1, int num2);
}
