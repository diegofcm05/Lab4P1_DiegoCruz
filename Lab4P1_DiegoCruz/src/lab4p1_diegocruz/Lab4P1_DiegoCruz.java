/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_diegocruz;

import java.util.Scanner;

/**
 *
 * @author dfcm9
 */
public class Lab4P1_DiegoCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scnum = new Scanner(System.in);
        boolean resp = true;
        while (resp){
            System.out.println("Menu.");
            System.out.println("1. Conjuntos");
            System.out.println("2. Contrasena Mejorada");
            System.out.println("Ingrese una opcion:");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                {
                    String pal1, pal2;
                    System.out.println("Ingrese el primer conjunto:");
                    pal1 = sc.next();
                    
                    System.out.println("Ingrese el segundo conjunto");
                    pal2 = sc.next();
                    
                    boolean iguales= true;
                    for (int d=0; d<pal1.length();d++){
                        if (d>2){
                            char c2 = pal2.charAt(d);
                            String char2 = Character.toString(c2);
                            if (!pal1.contains(char2)){
                                iguales = false;
                                System.out.println("Los conjuntos son diferentes");
                            }
                        
                        }
                    }
                    String un = pal1;
                    for (int i =0; i<pal1.length(); i++){
                        String ch = Character.toString(pal1.charAt(i));
                        if (!un.contains(ch)){
                            un += ch;
                        }
                    }
                    System.out.println("La union de A y B es: "+un);
                    String inter = "";
                    for (int k =0; k<pal1.length();k++){
                        String c5 = Character.toString(pal1.charAt(k));
                        if (pal2.contains(c5)){
                            inter+=c5;
                        }
                        
                    }
                    System.out.println("La interseccion de A y B es"+inter);
                    break;
                    
                    
                }
                case 2:
                {
                    String pal1;
                    System.out.println("Ingrese una contrasena:");
                    pal1 = sc.next();
                    System.out.println("Ingrese un numero");
                    int num = scnum.nextInt();
                    boolean letras = false;
                    boolean nums = false;
                    boolean largo = false;
                    boolean seguro = false;
                    while (seguro == false){
                        for (int i = 0; i< pal1.length(); i++){
                            char letra = pal1.charAt(i);
                            int cod = (int)letra;
                            if (cod>=65 && cod<=90 || cod>=97 && cod<=122){
                                letras = true;
   
                            }
                        }
                        
                        for (int i = 0; i< pal1.length(); i++){
                            char letra = pal1.charAt(i);
                            int cod = (int)letra;
                            if (cod>=48 && cod<=57){
                                nums = true;
                                
                            }
                        }
                        if (pal1.length()>7){
                            largo = true;
                            
                        }
                        
                        
                        if (letras == false){
                            System.out.println("La contrasena no tiene letras. Ingrese otra contrasena:");
                        }
                        if (nums == false){
                            System.out.println("La contrasena no tiene numeros. Ingrese otra contrasena:");
                        }
                        if (largo == false){
                            System.out.println("La contrasena es menor que 8 caracteres. Ingrese otra contrasena:");
                        }
                        if (letras == true && nums == true && largo == true){
                            System.out.println("La contrasena es segura");
                            seguro = true;
                            break;
                        }
                        letras = false;
                        nums = false;
                        largo = false;
                        pal1 = sc.next();
                    }
                    String acum = "";
                    int q = 0;
                    for (int j = 0; j<pal1.length(); j++){
                        char s = pal1.charAt(j);
                        acum += s;
                        if (q >0&& (j % 2 != 0)){
                            acum += num;
                            num++;
                            
                        }
                        q++;
                    }
                    System.out.println("Nueva contrasena:" +acum);
                    break;
                }
                default:
                    break;
        
                
            }
        // TODO code application logic here
    }
    }
    
}
