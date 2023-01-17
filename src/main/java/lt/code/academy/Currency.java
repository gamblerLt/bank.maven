package lt.code.academy;

public enum Currency {

    EURO(1, "E"),
    USD(1.2, "$");

    private final double currencyValue;
    private final String currencySign;

    Currency(double currencyValue, String currencySign) {
        this.currencyValue = currencyValue;
        this.currencySign = currencySign;
    }

    public double getCurrencyValue() {
        return currencyValue;
    }

    public String getCurrencySign() {
        return currencySign;
    }
}

