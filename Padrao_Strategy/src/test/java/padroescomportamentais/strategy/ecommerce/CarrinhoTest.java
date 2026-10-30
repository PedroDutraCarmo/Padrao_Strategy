package padroescomportamentais.strategy.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void deveAplicarAcrescimoNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.aplicarAcrescimo(80.0f, 20.0f);
        assertEquals(100.0f, carrinho.getTotal());
    }

    @Test
    void deveAplicarDescontoFixoNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.aplicarDescontoFixo(80.0f, 10.0f);
        assertEquals(70.0f, carrinho.getTotal());
    }

    @Test
    void deveAplicarTaxaMultiplicadoraNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.aplicarTaxaMultiplicadora(80.0f, 1.1f);
        assertEquals(88.0f, carrinho.getTotal());
    }

    @Test
    void deveAplicarDivisaoParcelasNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.aplicarDivisaoParcelas(100.0f, 2.0f);
        assertEquals(50.0f, carrinho.getTotal());
    }

    @Test
    void naoDeveDividirParcelasPorZero() {
        try {
            Carrinho carrinho = new Carrinho();
            carrinho.aplicarDivisaoParcelas(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveAplicarRateioMedioNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.aplicarRateioMedio(70.0f, 80.0f);
        assertEquals(75.0f, carrinho.getTotal());
    }
}