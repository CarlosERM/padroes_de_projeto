public class Violao extends ViolaoProto {

    public Violao() {
    };

    public Violao(Violao violao) {
        super(violao);
    }

    @Override
    public ViolaoProto clone() {
        return new Violao(this); 
    }
}
