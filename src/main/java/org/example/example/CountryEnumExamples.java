package org.example.example;

import org.example.enums.Const;
import org.example.enums.Country;

/**
 * This class runs examples to demonstrate {@link Country} {@code enum}  class
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public class CountryEnumExamples {

    public static void main(String[] args) {
        Country country = Country.ISRAEL;
        Country.printAllValuesUsingForLoop();
        System.out.println("-------------------------------------------------");
        Country.printAllValuesUsingStreamAPI();
        System.out.println("-------------------------------------------------");
        System.out.println(country.getFullName() + Const.DOUBLE_SPACE +
                        country.getShort2ch() + Const.DOUBLE_SPACE +
                        country.getCurrency() + Const.DOUBLE_SPACE);
        System.out.println("-------------------------------------------------");
        Country.stream().forEach(c -> System.out.println(c.getFullName() + Const.DOUBLE_SPACE +
                c.getShort2ch() + Const.DOUBLE_SPACE +
                c.getCurrency() + Const.DOUBLE_SPACE));
        System.out.println("-------------------------------------------------");
        System.out.println(Country.toJson(Country.CANADA));
        System.out.println(Country.toJson(Country.ISRAEL));
        System.out.println(Country.toJson(Country.UNITED_STATES));
        System.out.println(Country.toJson(Country.UKRAINE));
    }
}
