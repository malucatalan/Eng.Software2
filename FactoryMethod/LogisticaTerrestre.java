public class LogisticaTerrestre extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao(); // Aqui é onde o objeto real nasce
    }
}