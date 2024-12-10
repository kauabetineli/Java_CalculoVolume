import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura = 0.0;
        double lado = 0.0;
        double comprimento = 0.0;
        double largura = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do {

            System.out.println(" ------------------------------------------------ ");
            System.out.println(" Programa: Calcular volume de figuras geométricas");
            System.out.println(" ------------------------------------------------ ");
            System.out.println("    1- Volume do Cilindro");
            System.out.println("    2- Volume do Cone");
            System.out.println("    3- Volume do Prisma");
            System.out.println("    4- Volume da Esfera");
            System.out.println("    5- Volume do Cubo");
            System.out.println("    6- Volume da Pirâmide Quadrangular");
            System.out.println("    7- Volume da Paralelepípedo");
            System.out.println("    0- Sair");
            System.out.println("\n");
            System.out.println(" Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" digite o valor da altura: ");
                    altura = sc.nextDouble();
                    volume = Cilindro.calcularVolume(raio, altura);
                    System.out.printf(" O volume do cilindro é: %.2f\n", volume);
                    break;
                case 2:
                    System.out.println(" digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" digite o valor da altura: ");
                    altura = sc.nextDouble();
                    volume = Cone.calcularVolume(raio, altura);
                    System.out.printf(" O volume do cone é: %.2f\n", volume);
                    break;
                case 3:
                    System.out.println(" digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println(" digite o valor da altura: ");
                    altura = sc.nextDouble();
                    volume = Prisma.calcularVolume(lado, altura);
                    System.out.printf(" O volume do Prisma é: %.2f\n", volume);
                    break;
                case 4:
                    System.out.println(" digite o valor do raio: ");
                    raio = sc.nextDouble();
                    volume = Esfera.calcularVolume(raio);
                    System.out.printf(" O volume da Esfera é: %.2f\n", volume);
                    break;
                case 5:
                    System.out.println(" digite o valor do lado: ");
                    lado = sc.nextDouble();
                    volume = Cubo.calcularVolume(lado);
                    System.out.printf(" O volume do Cubo é: %.2f\n", volume);
                    break;
                case 6:
                    System.out.println(" digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println(" digite o valor da altura: ");
                    altura = sc.nextDouble();
                    volume = PiramideQuadrangular.calcularVolume(lado, altura);
                    System.out.printf(" O volume da Piramide Quadrangular é: %.2f\n", volume);
                    break;
                case 7:
                    System.out.println(" digite o valor da largura: ");
                    largura = sc.nextDouble();
                    System.out.println(" digite o valor da altura: ");
                    altura = sc.nextDouble();
                    System.out.println(" digite o valor do comprimento: ");
                    comprimento = sc.nextDouble();
                    volume = Paralelepipedo.calcularVolume(comprimento, largura, altura);
                    System.out.printf(" O volume da Piramide Quadrangular é: %.2f\n", volume);
                    break;

                case 0:
                    System.out.println(" sair");
                    break;
                default:
                    System.out.println(" opcao invalida");
                    break;
            }

        } while (opcao != 0);

        sc.close();


    }

}
