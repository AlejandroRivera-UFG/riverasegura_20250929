/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riverasegura_20250929;

/**
 *
 * @author UFG
 */
public class BusquedaBinaria {
    
    public int buscarEnteroArray(int[] arreglo, int valorBuscado){
        int inicio = 0;
        int fin = arreglo.length;
 
        while(inicio <= fin){  
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == valorBuscado) {
                return medio;
            }
            else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            }
            else {fin = medio - 1;}
        }
     return -1;
    }
    
    //METODO PARA BUSCAR UN VALOR EN UNA MATRIZ
    public void buscarEnteroMatriz(int[][] matriz, int objetivo){
        //repeticion mientras la matriz posea al    menos un elemento
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        //SE ESTABLECE EL INICIO Y EL FIN DE UNA MATRIZ
        int inicio = 0;
        //ELEMENTOS TOTALES DE UNA MATRIZ
        int fin = (filas * columnas) - 1;
        
        //INDICA SI EL VALOR SE ENCONTRO O NO
        boolean encontrado = false;
        
        //REPETICION MIENTRAS LA MATRIZ POSEA AL MENOS UN ELEMENTO
        while(inicio <= fin){
            //SE DEDUCE EL PUNTO MEDIO DE LA MATRIZ
            int medio = (inicio + fin) / 2;
            //SE SIMULA UN ARREGLO BIDIMENSIONAL COMO UN ARREGLO UNIDIMENSINONAL
            int F = medio / columnas;//CUAL FILA ES?(CUANTAS FILAS COMPLETAS EXISTEN ANTES DEL PUNTO MEDIO)
            int C = medio % columnas;//CUAL COLUMNA ES? {POSICION EXACTA DE LA COLUMNA}
            
            //SE EVALUA SI EL VALOR BUSCADO SE ENCUENTRA EN LA POSICION MEDIA
            if (matriz[F][C] == objetivo) {
                System.out.println("En la matriz, el elemento buscado esta en la posicion: " + "["+F+"]" + "["+C+"]");
                //SE ESTABLECE LA BANDERA COMO VERDADERO DEBIDO QUE SE ENCONTRO EL VALOR BUSCADO
                encontrado = true;
                break;
            }
            else if (matriz[F][C] < objetivo) {
                //SE EVALUA SI EL VALOR DEL PUNTO MEDIO ES MENOR QUE EL VALOR BUSCADO
                inicio = medio + 1;
            }
            //ENTONCES, EL VALOR DEL PUNTO MEDIO ES MAYOR
            else{fin = medio - 1;}
        }//FIN DEL WHILE
        
        //SE EVALUA LA BANDERA POR SI NO SE ENCONTRO UN VALOR
        if (encontrado == false) {
            //SE IMPRIME LA SALIDA EN CONSOLA
            System.out.println("El numero no fue encontrado.");
        }
    }//FIN DEL METODO buscarEnteroMatriz
        
}
