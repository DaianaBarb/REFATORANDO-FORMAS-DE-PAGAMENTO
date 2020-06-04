package br.com.codenation.paymentmethods;
import br.com.codenation.paymentmethods.PriceStrategy;

public class CreditCard implements PriceStrategy {
    private final double DESCONTO = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }

}