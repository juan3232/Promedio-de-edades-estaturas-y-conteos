import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int edad, sumaedad = 0, contadormayor18 = 0, contadormayor175=0;
        float altura, sumaaltura = 0,mediaEdad=0,mediadelaedad,mediadelaestatura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno" + i + "\n Digita tu edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Altura" + i + "\n Diguite la altura"));

            sumaedad += edad;
            sumaaltura += edad;
            if (edad > 18) {
                contadormayor18++;
            }
            if(altura > 1.75){
                contadormayor175++;

            }
        }

        mediaEdad = (float) sumaedad/5;
        mediadelaestatura = (Float) sumaaltura;
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La altura media es : "+mediadelaestatura);
        System.out.println("conteo mayot a 18: "+contadormayor18);
        System.out.println("Cantidad de alumnos moyor a 18"+contadormayor175);


    }

}
