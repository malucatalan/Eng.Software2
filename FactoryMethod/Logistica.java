public abstract class Logistica {
    // Este é o Factory Method - Ele não tem corpo { }
    public abstract Transporte criarTransporte();

    public void organizarEntrega() {
        // Chamamos o método que as subclasses vão implementar
        Transporte t = criarTransporte();
        t.entregar();
    }
}