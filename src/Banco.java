import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();


    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removeConta(Conta conta) {
        this.contas.remove(conta);
    }

    public void imprimirContas(){
        System.out.println("=== BANCO "+this.nome+" ====");
        for (Conta conta:
             contas) {
            System.out.println("Agencia: "+conta.getAgencia());
            System.out.println("Numero: "+conta.getNumero());
            System.out.println("Cliente: "+conta.getCliente());
            System.out.println("");
 }
    }
}
