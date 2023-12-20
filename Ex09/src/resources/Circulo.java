package resources;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        double area;
        area = Math.PI * raio * raio;
        area = Math.round(area);

        return area;
    }
}
