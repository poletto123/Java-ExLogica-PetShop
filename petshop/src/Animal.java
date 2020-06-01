public class Animal {

    private String nome;
    private String tipo;
    private String porte;

    public Animal(String nome, String tipo, String porte) {
        this.nome = nome;
        this.tipo = tipo;
        this.porte = porte;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
