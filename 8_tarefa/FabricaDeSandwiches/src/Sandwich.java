public class Sandwich {
    private String nome;
    private String tipoCarne;
    private String tipoQueijo;
    private String recheio;
    private String salada;
    private String molho;
    private String pao;
    private double preco;
    private String tamanho;

    public Sandwich(String nome, String tipoCarne, String tipoQueijo, String recheio, String salada, String molho,
            String pao, double preco, String tamanho) {
        this.nome = nome;
        this.tipoCarne = tipoCarne;
        this.tipoQueijo = tipoQueijo;
        this.recheio = recheio;
        this.salada = salada;
        this.molho = molho;
        this.pao = pao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getTipoQueijo() {
        return tipoQueijo;
    }

    public void setTipoQueijo(String tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTipo Carne: " + tipoCarne + "\nTipo de Queijo: " + tipoQueijo + "\nRecheio: "
                + recheio + "\nSalada: " + salada + "\nMolho: " + molho + "\nPão: " + pao + "\nPreço: " + preco
                + "\nTamanho: " + tamanho;
    }
}
