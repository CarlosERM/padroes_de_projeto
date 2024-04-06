public class SandwichBuilder implements Builder {
    private String nome;
    private String tipoCarne;
    private String tipoQueijo;
    private String recheio;
    private String salada;
    private String molho;
    private String pao;
    private double preco;
    private String tamanho;

    @Override
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    @Override
    public void setTipoQueijo(String tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    @Override
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public void setSalada(String salada) {
        this.salada = salada;
    }

    @Override
    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public void setPao(String pao) {
        this.pao = pao;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Sandwich getResult() {
        return new Sandwich(nome, tipoCarne, tipoQueijo, recheio, salada, molho, pao, preco, tamanho);
    }
}
