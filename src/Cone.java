public class Cone {
    public static double calcularVolume(double raio, double altura) {
        double volume = 0.0;
        volume = (altura * Math.PI * Math.pow(raio, 2))/3.0;
        return volume;
    }
}
