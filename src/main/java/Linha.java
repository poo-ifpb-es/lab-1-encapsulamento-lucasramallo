public class Linha {
    private Ponto inicio;
    private Ponto fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        double squareX = (fim.getX() - inicio.getX()) * (fim.getX() - inicio.getX());
        double squareY = (fim.getY() - inicio.getY()) * (fim.getY() - inicio.getY());

        return Math.sqrt(squareX + squareY);
    }
}
