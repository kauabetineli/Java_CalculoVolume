public class Esfera {

    public static double calcularVolume(double raio){
        double volume = 0.0;
        volume =  (4 * Math.PI * Math.pow(raio, 3))/3.0;
        return volume;
    }

}
