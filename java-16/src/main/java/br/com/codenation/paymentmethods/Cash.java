package br.com.codenation.paymentmethods;
import br.com.codenation.paymentmethods.PriceStrategy;

public class Cash implements PriceStrategy {
    private final double DESCONTO = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }

}