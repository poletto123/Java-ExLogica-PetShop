public class NotaFiscal {

    private float valorTotal;

    public NotaFiscal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public NotaFiscal() {
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarValor(float valor) {
        valorTotal += valor;
    }

    public void retirarValor(float valor) {
        valorTotal -= valor;
    }

}
