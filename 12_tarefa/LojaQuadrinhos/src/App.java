public class App {
    public static void main(String[] args) throws Exception {
        Quadrinho quadrinho = new Quadrinho("Quadrinho", 15.00);
        Chaveiro chaveiro = new Chaveiro("Chaveiro", 5.00);
        Busto busto = new Busto("Busto", 10.00);
        Adesivo adesivo = new Adesivo("Adesivo", 1.00);
        Poster poster = new Poster("Pôster", 25.00);
        Camiseta camiseta = new Camiseta("Camiseta", 25.00);
        Caneta caneta = new Caneta("Caneta", 3.00);
        Miniatura miniatura = new Miniatura("Miniatura", 20.00);

        CaixaBronze caixaBronze = new CaixaBronze(quadrinho, chaveiro, busto);
        CaixaPrata caixaPrata = new CaixaPrata(quadrinho, chaveiro, busto, adesivo, poster);
        CaixaOuro caixaOuro = new CaixaOuro(quadrinho, chaveiro, busto, adesivo, poster, camiseta, caneta);
        CaixaPlatina caixaPlatina = new CaixaPlatina(quadrinho, chaveiro, busto, adesivo, poster, camiseta, caneta, miniatura, quadrinho, chaveiro);
        
        System.out.println(caixaBronze);
        System.out.println(caixaPrata);
        System.out.println(caixaOuro);
        System.out.println(caixaPlatina);
    }
}
