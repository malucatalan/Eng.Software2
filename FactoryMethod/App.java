public class App {
    public static void main(String[] args) {
        // Se eu quiser terrestre:
        Logistica log = new LogisticaTerrestre();
        log.organizarEntrega();

        // Se eu quiser mudar para marítima, mudo apenas UMA linha:
        log = new LogisticaMaritima();
        log.organizarEntrega();
    }
}