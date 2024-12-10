public class PiramideQuadrangular {

    public static double calcularVolume(double lado, double altura){
        double volume = 0.0;
        volume = (Math.pow(lado, 2) * altura)/3.0;
        return volume;
    }

}
