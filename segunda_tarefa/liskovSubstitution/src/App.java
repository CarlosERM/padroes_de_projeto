class App {
    // Objetos de subclasse possam ser substituídos por seus 
    // objetos de superclasse sem afetar o comportamento correto 
    // do programa.
    public static void main(String[] args) {

        ICarro gol = new GolCorrect();
        ICarro gol2 = new GolWrong();

        gol.andar();
        gol2.andar();
    }
 }