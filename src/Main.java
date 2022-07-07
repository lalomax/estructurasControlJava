public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("While: " + numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 2;

        do {
            System.out.println("doWhile: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.println("for:" + numeroFor);
        }

        String estacion;
        estacion = "algo";

        switch (estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otonio":
                System.out.println("Es otonio");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }

}