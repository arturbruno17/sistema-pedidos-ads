import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {

    private UUID uuid;
    private String nome;
    private String cpf;
    private List<Pedido> historicoPedidos = new ArrayList<>();

    public Cliente() {
    }

    public void efetuarPedido(Pedido pedido) {
        historicoPedidos.add(pedido);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void setHistoricoPedidos(List<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }
}
