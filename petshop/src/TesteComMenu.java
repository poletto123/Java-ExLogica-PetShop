import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TesteComMenu {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        NotaFiscal notaFiscal1 = new NotaFiscal(0);
        PetShop petshop = new PetShop("Avenida Turim 123", notaFiscal1);

        boolean maisAnimais = true;

        while (maisAnimais == true) {

            boolean maisAcoes = true;

            String nome = JOptionPane.showInputDialog
                    ("Seja bem vindo ao Petshop.\n" +
                    "Qual é o nome do seu animal?");

            String tipo = JOptionPane.showInputDialog
                    ("E qual o tipo dele?\n" +
                            "Gato\n" +
                            "Cachorro\n" +
                            "Outro\n");

            tipo = tipo.toLowerCase();

            String porte = JOptionPane.showInputDialog
                    ("E qual o porte dele?\n" +
                            "Pequeno\n" +
                            "Medio\n" +
                            "Grande\n");

            porte = porte.toLowerCase();

            Animal animal = new Animal(nome, tipo, porte);

            while (maisAcoes == true) {
                String servico = JOptionPane.showInputDialog
                        ("Qual serviço deseja para "
                                + animal.getNome() + " ?\n" +
                                "Exame\n" +
                                "Banho\n" +
                                "Vacina\n");

                servico = servico.toLowerCase();

                if (servico.equals("exame")) {
                    if (petshop.examinar(animal)) {
                        JOptionPane.showMessageDialog(null, "Tudo certo no exame - " + animal.getNome());
                    }
                } else if (servico.equals("banho")) {
                    if (petshop.darBanho(animal)) {
                        JOptionPane.showMessageDialog(null, "Banho dado - " + animal.getNome());
                    }
                } else if (servico.equals("vacina")) {
                    if (petshop.vacinar(animal)) {
                        JOptionPane.showMessageDialog(null, "Vacina dada - " + animal.getNome());
                    }
                }

                int opcaoAcoes = Integer.parseInt(JOptionPane.showInputDialog
                        ("Deseja realizar mais ações para  "
                                + animal.getNome() + " ?\n" +
                                "1. Sim\n" +
                                "2. Não\n"));

                if (opcaoAcoes == 2) {
                    maisAcoes = false;
                }

            }

            int opcaoAnimais = Integer.parseInt(JOptionPane.showInputDialog
                    ("Deseja serviços para um novo animal?\n" +
                            "1. Sim\n" +
                            "2. Não\n"));

            if (opcaoAnimais == 2) {
                maisAnimais = false;
            }

        }

        JOptionPane.showMessageDialog(null,"Petshop - " + petshop.getEndereco() + "\nTotal da nota fiscal - R$" + notaFiscal1.getValorTotal());

    }

}
