import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarrinhoDeCompras {

    private UUID uuid;
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal valorTotal;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal.add(produto.getValor());
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        valorTotal.subtract(produto.getValor());
    }

    public void esvaziarCarrinho() {
        produtos.clear();
        valorTotal = BigDecimal.ZERO;
    }

    public Pedido finalizarCompra(Cupom cupom) {
        return new Pedido(UUID.randomUUID(), produtos, valorTotal, cupom);
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
}
