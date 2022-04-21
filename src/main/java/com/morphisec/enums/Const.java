package com.morphisec.enums;

/**
 * This {@code enum} class has items with a single value, classic replacement
 * of {@code final} properties use in Java prior to Java 1.5.0.
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public enum Const {
    TAB("\t"),
    DOUBLE_TAB("\t\t"),
    TRIPLE_TAB("\t\t\t"),
    ENTER("\r\n"),
    NEW_LINE("\n"),
    SINGLE_SPACE(" "),
    DOUBLE_SPACE("  "),
    TRIPLE_SPACE("   "),
    COPYRIGHTS("©"),
    REGISTERED("®")
    ;

    private String value;

    Const(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
