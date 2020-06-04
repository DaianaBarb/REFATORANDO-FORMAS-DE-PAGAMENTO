package br.com.codenation.paymentmethods;
import br.com.codenation.paymentmethods.PriceStrategy;

public class Transfer implements PriceStrategy {
    private final double DESCONTO = 0.92;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }

}