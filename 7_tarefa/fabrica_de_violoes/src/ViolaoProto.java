public abstract class ViolaoProto {
    String nome;
    int qtdCorda;
    String tipoCorda;
    String descricao;

    public ViolaoProto() {};

    public ViolaoProto(ViolaoProto violao) {
        this.nome = violao.nome;
        this.qtdCorda = violao.qtdCorda;
        this.tipoCorda = violao.tipoCorda;
        this.descricao = violao.descricao;
    };

    public abstract ViolaoProto clone();

    @Override
    public String toString() {
        return "Nome:" + nome + "\nQuantidade de cordas:" + qtdCorda + "\nTipo de Corda:" + tipoCorda + "\nDescrição:"
                + descricao;
    }
}
