package com.morphisec.enums;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This {@code enum} class has items with multiple values
 * @author Beni Regev e-mail: beniregev@finastra.com
 * @since Java 5
 */
public enum Country {
    ISRAEL("Israel", "IL", "ILS", "he", 972),
    UNITED_STATES("United States of America", "US", "USD", "en", 1),
    CANADA("Canada", "CA", "CAD", "en", 1),
    UKRAINE("Ukraine", "UA", "UAH", "ru", 380);

    private String fullName;
    private String short2ch;
    private String currency;
    private String language;
    private int countryCode;

    Country(String fullName, String short2ch, String currency) {
        this.fullName = fullName;
        this.short2ch = short2ch;
        this.currency = currency;
    }

    Country(String fullName, String short2ch, String currency, String language) {
        this.fullName = fullName;
        this.short2ch = short2ch;
        this.currency = currency;
        this.language = language;
    }

    Country(String fullName, String short2ch, String currency, String language, int countryCode) {
        this.fullName = fullName;
        this.short2ch = short2ch;
        this.currency = currency;
        this.language = language;
        this.countryCode = countryCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShort2ch() {
        return short2ch;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLanguage() {
        return language;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public static Stream<Country> stream() {
        return Stream.of(Country.values());
    }

    public static void printAllValuesUsingForLoop() {
        for (Country country : Country.values()) {
            System.out.println(country);
        }
    }

    public static void printAllValuesUsingStreamAPI() {
        Arrays.stream(Country.values())
                .forEach(System.out::println);
    }

    public String toJson() {
        return "{ \n" +
                Const.TAB.getValue() + "fullName: \"" + this.getFullName() + "\", " + Const.NEW_LINE.getValue() +
                Const.TAB.getValue() + "short2ch: \"" + this.getShort2ch() + "\", " + Const.NEW_LINE.getValue()+
                Const.TAB.getValue() + "currency: \"" + this.getCurrency() + "\", " + Const.NEW_LINE.getValue()+
                Const.TAB.getValue() + "language: \"" + this.getLanguage() + "\", " + Const.NEW_LINE.getValue()+
                Const.TAB.getValue() + "countryCode: " + this.getCountryCode() + " }";
    }

    public static String toJson(Country country) {
        return "{ \n" +
                Const.TAB.getValue() + "fullName: \"" + country.getFullName() + "\", \n" +
                Const.TAB.getValue() + "short2ch: \"" + country.getShort2ch() + "\", \n" +
                Const.TAB.getValue() + "currency: \"" + country.getCurrency() + "\", \n" +
                Const.TAB.getValue() + "language: \"" + country.getLanguage() + "\", \n" +
                Const.TAB.getValue() + "countryCode: " + country.getCountryCode() + ", \n" +
                " }";
    }
}
