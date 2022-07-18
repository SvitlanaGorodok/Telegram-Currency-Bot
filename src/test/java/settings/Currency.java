package settings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Currency {
    USD("USD", true),
    EUR("EUR", false),
    PLN("PLN", false),
    BTC("BTC", false);

    private String currencyName;
    private boolean currencySelect;

    Currency(String currency, boolean select) {
        this.currencyName = currency;
        this.currencySelect = select;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public boolean isCurrencySelect() {
        return currencySelect;
    }

    public void setCurrencySelect(boolean currencySelect) {
        this.currencySelect = currencySelect;
    }

    public static String getSelectedCurrency() {
        return getSelectedCurrencyList().stream()
                .map(currency -> currency.currencyName)
                .collect(Collectors.joining(", ", "(", ")"));

    }

    public static List<Currency> getSelectedCurrencyList() {
        List<Currency> selectedCurrency = new ArrayList<>();
        for (Currency curr : Currency.values()) {
            if (curr.currencySelect) {
                selectedCurrency.add(curr);
            }
        }
        return selectedCurrency;
    }

//    public static void main(String[] args) {
//        System.out.println(getSelectedCurrency());
//        EUR.setCurrencySelect(true);
//        System.out.println(getSelectedCurrency());
//        PLN.setCurrencySelect(true);
//        System.out.println(getSelectedCurrency());
//        BTC.setCurrencySelect(true);
//        System.out.println(getSelectedCurrency());
//
//        System.out.println(getSelectedCurrencyList());
//
//    }
}

