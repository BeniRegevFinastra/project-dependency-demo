package com.morphisec.example;

import com.morphisec.enums.Const;
import com.morphisec.enums.Country;

/**
 * This class runs examples to demonstrate {@link Country} {@code enum}  class
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public class CountryEnumExamples {

    public static void main(String[] args) {
        Country country = Country.ISRAEL;
        System.out.println("* printAllValuesUsingForLoop");
        Country.printAllValuesUsingForLoop();
        System.out.println("-------------------------------------------------");
        System.out.println("* printAllValuesUsingStreamAPI");
        Country.printAllValuesUsingStreamAPI();
        System.out.println("-------------------------------------------------");
        System.out.println("* Print a single-Country's values: \nfullName\tShort2ch\tCurrency");
        System.out.println(country.getFullName() + Const.DOUBLE_TAB.getValue() +
                        country.getShort2ch() + Const.TRIPLE_TAB.getValue() +
                        country.getCurrency() + Const.DOUBLE_SPACE.getValue());
        System.out.println("-------------------------------------------------");
        System.out.println("* Print all Country enum values using forEach method of Stream API: \nfullName\tShort2ch\tCurrency");
        Country.stream().forEach(c -> System.out.println(
                c.getFullName() + Const.DOUBLE_TAB.getValue() +
                c.getShort2ch() + Const.TRIPLE_TAB.getValue() +
                c.getCurrency() + Const.DOUBLE_SPACE.getValue()));
        System.out.println("-------------------------------------------------");
        System.out.println(Country.toJson(Country.CANADA));
        System.out.println(Country.toJson(Country.ISRAEL));
        System.out.println(Country.toJson(Country.UNITED_STATES));
        System.out.println(Country.toJson(Country.UKRAINE));
    }
}
