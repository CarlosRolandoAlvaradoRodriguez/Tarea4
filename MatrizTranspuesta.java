package Tarea4;

import java.util.Scanner;

public class MatrizTranspuesta
{
    public int matriz1[][];
    public int matrizT[][];
    public int fila;
    public int columna;
    int i, j;



    public int getFila() {
        return fila;
    }

    public void setFila(int fil) {
        fila = fil;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int col) {
        columna = col;
    }

    public void ordenMatriz()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fila de la matriz: ");
        fila = scanner.nextInt();

        System.out.print("Ingrese la columna de la matriz: ");
        columna = scanner.nextInt();

        matriz1 = new int [fila][columna];
    }
    public void ingresarMatriz(){

        matriz1 = new int[getFila()][getColumna()];
        for(i=0;i<getFila();i++)
        {
            for(j=0;j<getColumna();j++)
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese los valores de la matriz ");

                int valores;
                valores = scanner.nextInt();

                matriz1[i][j] = valores ;
            }
        }
    }
        public void mostrarMatriz1(){

        System.out.println("Matriz Principal");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + matriz1[i][j]);
            }
            System.out.println();
        }
    }


    public void transponerMatriz(){
        matrizT = new int[getColumna()][getFila()];

        for (int i=0; i < matriz1.length; i++) {
            for (int j=0; j < matriz1[i].length; j++) {
                matrizT[j][i] = matriz1[i][j];
            }
        }
    }
    public void mostrarMatrizTranspuesta(){

        System.out.println("\nMatriz Transpuesta");
        for(i=0;i<getColumna();i++){
            for(j=0;j<getFila();j++){
                System.out.print("\t" + matrizT[i][j]);
            }
            System.out.println();
        }
    }

}
