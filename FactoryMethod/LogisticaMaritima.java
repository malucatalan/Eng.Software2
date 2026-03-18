public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Navio(); // Aqui nasce o navio
    }
}