import model.*;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo("Rojo", 5, 10);

        FiguraGeometrica rectangulo2 = new Rectangulo("Azul", 4, 6);

        ListaFigura figuras = new ListaFigura(99);

        figuras.agregarFigura(rectangulo2);
        figuras.agregarFigura(rectangulo);
        figuras.agregarFigura(new Triangulo("Verde", 8, 9, 10, 10));

        Rectangulo[] rectangulos = figuras.obtenerRectangulos();

        for (Rectangulo aux : rectangulos){

            if (aux != null){
                System.out.println(aux.getColor());
                System.out.println(aux.calcularArea());
            }

        }



    }
}