public class Cilindro {

    public static double calcularVolume(double raio, double altura){
        double volume = 0.0;
        volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;


    }

}
