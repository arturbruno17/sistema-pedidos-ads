import java.math.BigDecimal;
import java.util.UUID;

public class Produto {

    private UUID uuid;
    private String nome;
    private String descricao;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(UUID uuid, String nome, String descricao, BigDecimal valor) {
        this.uuid = uuid;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
