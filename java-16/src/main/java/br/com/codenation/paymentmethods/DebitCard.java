package br.com.codenation.paymentmethods;
import br.com.codenation.paymentmethods.PriceStrategy;

public class DebitCard implements PriceStrategy {
    private final double DESCONTO = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }

}