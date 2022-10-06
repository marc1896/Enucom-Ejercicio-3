package ejercicio3;

/*Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, 
imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características 
de cada vehículo y crear una clase que represente a cada uno de ellos.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Se utiliza para leer los datos ingresados por el teclado
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numVehiculos;
        System.out.println("Digite la cantidad de vehiculos: ");
        numVehiculos = sc.nextInt();
        
        //Se crea el objeto para los vehiculos
        Vehiculo vehiculos[] = new Vehiculo[numVehiculos];
        
        for (int i = 0; i < vehiculos.length; i++) {
            sc.nextLine();
            System.out.println("Digite los datos del automovil " + (i + 1) + ":");
            System.out.println("Ingrese la Marca: ");
            marca = sc.nextLine();
            System.out.println("Ingrese el Modelo: ");
            modelo = sc.nextLine();
            System.out.println("Ingrese el Precio: ");
            precio = sc.nextFloat();
            
            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }
        int posMenor = obtenerPrecioBarato(vehiculos);
        System.out.println("El automovil con el precio mas barato es: \n" + vehiculos[posMenor].mostrarDatos());
    }
    
    /**
     * El siguiente metodo obtiene 
     * la posición del coche mas barato
     * @param coches
     * @return 
     */
    public static int obtenerPrecioBarato(Vehiculo coches[]){
        float precio;
        int posMenor = 0;
        
        precio = coches[0].getPrecio();
        
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                posMenor = i;
            }
        }
        return posMenor;
    }
    
}
