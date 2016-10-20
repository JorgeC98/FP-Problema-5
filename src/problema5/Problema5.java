/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;
import java.util.*;
/**
 *Programa para saber si un numeor es primo o no
 * @author JorgeRicardo
 */
public class Problema5 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num,primo;
    /*num es el numero que van a meter 
    y primo el numero de veces 
    que se divide entre un número*/
    num=pedirNum();//aqui pido el número
    primo=revisar(num);//aqui checo si es primo
    mostrarPrim(num,primo);
    }
    public static int pedirNum(){
    int num;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Escribe el numeor que decias verificar si es primo: ");
    num=teclado.nextInt();
    return num;
    }
    public static int revisar(int num){
    /*aqui sumo 1 a prim cada vez que se puede dividir entre otro número
    si prim es no es igual a dos es un numero primo*/
    int conta=1, primo=0;
    /*el while es para ir dividiendo el numero
      entre todos los numero posibles 
    iniciando por el 1 hasta llegar al número*/
    while (conta<=num){
    if(num%conta==0){
    ++primo;
    }       
    conta++;
      }
    return primo;
    }
    public static void mostrarPrim(int num,int primo){
    if(primo==2)//aqui se despliega si es primo o no
            System.out.println("EL "+num+" es un número primo");
    else System.out.println("El "+num+" no es un número primo");
    
    }
  }
