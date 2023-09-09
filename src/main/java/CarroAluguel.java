public class CarroAluguel {
    private float valorPorKm;
    private int distanciaPercorrida;
    private boolean disponivel;
    private boolean sinistro;
    private boolean pago;
    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.disponivel = true;
        this.sinistro = false;
        this.pago = false;
    }

    void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }
    float getValorPorKm() {
        return this.valorPorKm;
    }
    void setDistanciaPercorrida(int distancia) {
        this.distanciaPercorrida = distancia;
    }
    float getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }
    public boolean isDisponivel() {
        return this.disponivel;
    }
    void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }
    boolean hasSinistro() {
        return this.sinistro;
    }
    float getDebito() {
        if(hasSinistro()){
            float debito = valorPorKm * distanciaPercorrida;
            return debito + (debito * 0.60f);
        } else {
            return valorPorKm * distanciaPercorrida;
        }
    }
    void pagar() throws CarroDisponivelException {
        if(isDisponivel()) {
            throw new CarroDisponivelException();
        }
        this.distanciaPercorrida = 0;
    }
    void alugar() throws CarroIndisponivelException {
        if(!isDisponivel()) {
            throw new CarroIndisponivelException();
        }
        this.disponivel = false;
        this.sinistro = false;
    }
    void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (isDisponivel()) {
            throw new CarroDisponivelException();
        } else if(getDebito() != 0){
            throw new CarroNaoPagoException();
        }
        this.disponivel = true;
        setDistanciaPercorrida(0);
        setSinistro(false);
    }
}
