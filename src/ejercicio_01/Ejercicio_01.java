package ejercicio_01;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de horas: ");
        int h = entrada.nextInt();
        System.out.println("Ingrese el número de minutos: ");
        int m = entrada.nextInt();
        System.out.println("Ingrese el número de segundos: ");
        int s = entrada.nextInt();
        System.out.println("El numero expresado en segundos es: " + calculo(h, m, s) + " segundos. ");

    }

    public static int calculo(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;

    }

}
