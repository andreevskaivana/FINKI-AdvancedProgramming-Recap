package AV1andAV2;

public class Matrix {
    public static double sum(double[][] matrica) {
        //suma na matrica e zbir na site elementi
        //matrica.length->broj na redici
        //matrica[0].length->broj na koloni
        double suma = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[0].length; j++) {
                suma += matrica[i][j];
            }
        }
        return suma;
    }


    public static double average(double[][] matrica) {
        return sum(matrica) / (matrica.length * matrica[0].length);
    }

    public static void main(String[] args) {
        double matrica[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(sum(matrica));
        System.out.println(average(matrica));
    }

}
