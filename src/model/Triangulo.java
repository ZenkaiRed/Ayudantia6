package model;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(String color, double base, double altura, double lado1, double lado2) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    public double calcularPerimetro() {
        return this.base + this.lado1 + this.lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
