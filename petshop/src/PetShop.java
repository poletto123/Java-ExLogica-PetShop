import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private String endereco;
    private NotaFiscal notaFiscal;

    public PetShop(String endereco, NotaFiscal notaFiscal) {
        this.endereco = endereco;
        this.notaFiscal = notaFiscal;
    }

    public PetShop() {
    }

    public boolean examinar(Animal animal) {
        notaFiscal.adicionarValor(70);
        return true;
    }

    public boolean darBanho(Animal animal) {
        if (animal.getPorte().equals("pequeno")) {
            notaFiscal.adicionarValor(40);
        } else if (animal.getPorte().equals("medio")) {
            notaFiscal.adicionarValor(50);
        } else if (animal.getPorte().equals("grande")) {
            notaFiscal.adicionarValor(60);
        }
        return true;
    }

    public boolean vacinar(Animal animal) {
        if (animal.getTipo().equals("cachorro") || animal.getTipo().equals("gato")) {
            notaFiscal.adicionarValor(100);
        } else {
            notaFiscal.adicionarValor(150);
        }
        return true;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
