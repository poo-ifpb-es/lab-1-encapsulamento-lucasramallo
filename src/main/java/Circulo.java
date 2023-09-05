public class Circulo {
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float getArea(){
        float pi = (float) 3.14159;
        return pi * (this.raio * this.raio);
    }

    public float getCircunferencia() {
        float pi = (float) 3.14159;
        return (2 * pi) * this.raio;
    }
}
