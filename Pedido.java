import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {

    private UUID uuid;
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal valorTotal;

    public Pedido() {
    }

    public Pedido(UUID uuid, List<Produto> produtos, BigDecimal valorTotal) {
        this.uuid = uuid;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public UUID getUuid() {
        return uuid;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
