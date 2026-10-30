package padroescomportamentais.strategy.ecommerce;

public class Carrinho {

    private float total;

    public float getTotal() {
        return total;
    }

    public void aplicarAcrescimo(float valorProduto, float taxa) {
        CalculadorPreco calculador = new CalculadorPreco(valorProduto, taxa);
        this.total = calculador.calcular(new EstrategiaAcrescimo());
    }

    public void aplicarDescontoFixo(float valorProduto, float desconto) {
        CalculadorPreco calculador = new CalculadorPreco(valorProduto, desconto);
        this.total = calculador.calcular(new EstrategiaDescontoFixo());
    }

    public void aplicarDivisaoParcelas(float valorProduto, float parcelas) {
        CalculadorPreco calculador = new CalculadorPreco(valorProduto, parcelas);
        this.total = calculador.calcular(new EstrategiaDivisaoParcelas());
    }

    public void aplicarTaxaMultiplicadora(float valorProduto, float multiplicador) {
        CalculadorPreco calculador = new CalculadorPreco(valorProduto, multiplicador);
        this.total = calculador.calcular(new EstrategiaTaxaMultiplicadora());
    }

    public void aplicarRateioMedio(float valorProduto1, float valorProduto2) {
        CalculadorPreco calculador = new CalculadorPreco(valorProduto1, valorProduto2);
        this.total = calculador.calcular(new EstrategiaRateioMedio());
    }
}