import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {

    private UUID uuid;
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal valorTotal;
    private Status status;
    private Cupom cupom;

    public Pedido() {
    }

    public Pedido(UUID uuid, List<Produto> produtos, BigDecimal valorTotal, Cupom cupom) {
        this.uuid = uuid;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.cupom = cupom;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cupom getCupom() {
        return cupom;
    }

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }
}
