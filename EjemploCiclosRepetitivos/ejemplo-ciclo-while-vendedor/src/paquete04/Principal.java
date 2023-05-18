/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Vendedor;

/**
 *
 * @author SALA I
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Inicio de proceso iterativo 
        bandera = true;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino,
                    autos);
            v.calcularPagoMensual();
            System.out.println("-----------------------------------");
            System.out.printf("Datos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n", v.obtenerNombres(),
                    v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());
            System.out.println("-----------------------------------");
            entrada.nextLine(); // limpieza del buffer
            
        }

    }
}

