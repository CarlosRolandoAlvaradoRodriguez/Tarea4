package Tarea4;

import java.util.Scanner;

public class ArregloVariado
{
    Scanner scanner = new Scanner(System.in);

    public int arreglo[];
    public int posicion;
    public int numElementos;


    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int pos) {
        posicion = pos;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElem) {
        numElementos = numElem;
    }

    public void cantidadArreglo()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad del arreglo: ");
        numElementos = scanner.nextInt();

        arreglo = new int [numElementos];
    }
    public void ingresarArreglo(){
        arreglo = new int[getNumElementos()];

        System.out.println("Ingrese los "+ getNumElementos() +" datos del arreglo.");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("posicion(" + i + "): ");
            arreglo[i] = scanner.nextInt();
        }
    }


    public void mostrarArreglo(){
        System.out.println("MOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("\t" + arreglo[i]);
        }
    }


    public void buscarElemento(){
        System.out.println("\nDigite el numero a buscar");
        int numero;
        numero = scanner.nextInt();

        int i = 0;
        while (i<getNumElementos() && arreglo[i]<numero)
        {
            i++;
        }
        if (i==getNumElementos())
        {
            System.out.println("\nNumero no encontrado");
        }else {
            if (arreglo[i]==numero){
                System.out.println("Numero " + numero + " encontrado en la posición: " + i);
            }
        }
    }

    public void editarElemento(){

        System.out.println("Digite la posición del elemento que busca editar: ");
        posicion = scanner.nextInt();

        while (posicion>=getNumElementos()){
            System.out.println("El número " + posicion + " excede el rango del arreglo[" + getNumElementos() + "]");
            System.out.print("Digite nuevamente: ");
            posicion = scanner.nextInt();
        }

        System.out.print("Posicion(" + posicion + ") = " + arreglo[posicion]);
        System.out.print("\nEditar con: ");
        arreglo[posicion] = scanner.nextInt();

        System.out.println("\nMOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("\t" + arreglo[i]);
        }
    }


    public void eliminarElemento(){

        System.out.println("Digite el elemento que desea elminar: ");
        posicion = scanner.nextInt();

        for(int i = 0; i < getNumElementos(); i++){
            if (arreglo[i]==posicion){
                System.out.println("Eliminando el elemento " + posicion);

                for (i=i;i<getNumElementos()-1;i++){
                    arreglo[i]=arreglo[i+1];
                }
                numElementos--;
            }
        }

        System.out.println("MOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("\t" + arreglo[i]);
        }
    }
}