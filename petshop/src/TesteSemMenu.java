import java.time.LocalDate;

public class TesteSemMenu {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        NotaFiscal notaFiscal = new NotaFiscal(0);
        PetShop petshop = new PetShop("Avenida Turim 123", notaFiscal);

        Animal animal1 = new Animal("Malu","cachorro", "pequeno");
        Animal animal2 = new Animal("Dippy", "cachorro","grande");
        Animal animal3 = new Animal("Lola", "hamster","pequeno");
        Animal animal4 = new Animal("Nino","gato","medio");
        Animal animal5 = new Animal("Chimbinha","gato","medio");

        if (petshop.darBanho(animal1)) {
            System.out.println("Banho dado - " + animal1.getNome());
        }

        if (petshop.darBanho(animal4)) {
            System.out.println("Banho dado - " + animal4.getNome());
        }

        if (petshop.darBanho(animal2)) {
            System.out.println("Banho dado - " + animal2.getNome());
        }

        if (petshop.vacinar(animal5)) {
            System.out.println("Vacina dada - " + animal5.getNome());
        }

        if (petshop.vacinar(animal3)) {
            System.out.println("Vacina dada - " + animal3.getNome());
        }

        if (petshop.examinar(animal1)) {
            System.out.println("Tudo certo no exame - " + animal1.getNome());
        }

        System.out.println("Petshop - " + petshop.getEndereco() + "\nTotal da nota fiscal - R$" + notaFiscal.getValorTotal());

    }

}
