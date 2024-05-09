package model;

public class ListaFigura {

    private FiguraGeometrica[] figuras;
    private int cantidadActual;
    private int cantidadMaxima;

    public ListaFigura(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.figuras = new FiguraGeometrica[cantidadMaxima];
        this.cantidadActual = 0;
    }

    public void agregarFigura(FiguraGeometrica figura) {
        if (this.cantidadActual < this.cantidadMaxima) {
            this.figuras[this.cantidadActual] = figura;
            this.cantidadActual++;
        } else {
            System.out.println("No se pueden agregar más figuras");
        }
    }

    public Rectangulo[] obtenerRectangulos(){

        if (this.cantidadActual == 0){
            return null;
        }

        Rectangulo[] rectangulos = new Rectangulo[this.cantidadActual];
        int posAux = 0;

        for (FiguraGeometrica aux : this.figuras){

            if (aux instanceof Rectangulo){
                rectangulos[posAux] = (Rectangulo) aux;
                posAux++;
            }

        }
        return rectangulos;
    }


}
