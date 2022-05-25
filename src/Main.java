public class Main {
    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int resultado = suma(a,b,c);
        System.out.println("El resultado de "+a+" + "+b+" + "+c+" = " + resultado);
        Coche micoche = new Coche();
        micoche.AgregarPuerta();
        micoche.AgregarPuerta();
        micoche.AgregarPuerta();
        micoche.AgregarPuerta();
        System.out.println("El carro tiene " + micoche.puertas + " puertas.");
    }

    public static int suma (int first_value, int second_value, int third_value) {
        return first_value + second_value + third_value;
    }
}


class Coche {
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }
}
