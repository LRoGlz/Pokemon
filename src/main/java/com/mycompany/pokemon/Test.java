/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lrosellg
 */
public class Test {
    
     public static void main(String[] args) {
         
         Random r = new Random();
         Pokemon p0 = new Pokemon("Ratata", r.nextInt(5)+1, r.nextInt(10)+1+1);
         Pokemon p1 = new Pokemon("Charmander", r.nextInt(5)+1, r.nextInt(10)+1);
         Pokemon p2 = new Pokemon("Pidgy", r.nextInt(5)+1, r.nextInt(10)+1);
         Pokemon p3 = new Pokemon("Bulvasur", r.nextInt(5)+1, r.nextInt(10)+1);
         Pokemon p4 = new Pokemon("Charmaleon", r.nextInt(5, 10)+1+1, r.nextInt(10, 20));
         Pokemon p5 = new Pokemon("Ivysur", r.nextInt(5, 10)+1+1, r.nextInt(10, 20));
         Pokemon p6 = new Pokemon("Raichu", r.nextInt(5, 10)+1+1, r.nextInt(10, 20));
         
         Wild.addWild(p0);
         Wild.addWild(p1);
         Wild.addWild(p2);
         Wild.addWild(p3);
         Wild.addWild(p4);
         Wild.addWild(p5);
         Wild.addWild(p6);
         
         System.out.println("<<<<Elije tu nombre de entrenador Pokemon>>>>");
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         Trainner tr = new Trainner(name);
         System.out.println("<<<<\nElije tu primer Pokemon:\n1-Bulvasur\n2-Charmander\n3-Squirtle\n>>>>");
         int op = Integer.parseInt(sc.nextLine());
         Pokemon first = null;
         do{
         switch(op){
             case 1: 
                 first = new Pokemon("Bulvasur", 1, r.nextInt(10)+1);
                 System.out.println("Genial has elegido a Bulvasur!");
                 break;
             case 2: 
                 first = new Pokemon("Charmander", 1, r.nextInt(10)+1);
                 System.out.println("Genial has elegido a Charmander!");
                 break;
             case 3:
                 first = new Pokemon("Squirtle", 1, r.nextInt(10)+1);
                 System.out.println("Genial has elegido a Squirtle!");
                 break;
             default:
                 System.out.println("Elije un pokemon valido");
         }
         }while(op != 1 && op !=2 && op != 3);
         
         tr.catcher(first);
         tr.setPpal(first);
         
         do{
             System.out.println("<<<<\n¿Qué quieres hacer ahora?\n1-Buscar pokemons\n2-Entrenar pokemon principal\n3-Cambiar pokemon principal\n4-Ver mi pokedex\n0-SALIR\n>>>>");
             op = Integer.parseInt(sc.nextLine());
             switch(op){
                 case 1:
                   Pokemon villain = tr.find(Wild.getWildPokemon());
                   int fi = 0;
                   do{
                     System.out.println("<<<<\n¿Quieres pelear con él?\n1-Pelear\n2-Huir\n>>>>");
                     fi = Integer.parseInt(sc.nextLine());
                     switch(fi){
                         case 1:
                             boolean win = tr.getPpal().figth(villain);
                             if(win){
                             System.out.println("<<<<\n¿Quieres capturar a "+villain.getName()+"?\n 1-CAPTURAR\n2-Dejar ir\n>>>>");
                             int cat = Integer.parseInt(sc.nextLine());
                             switch(cat){
                                 case 1:
                                     tr.catcher(villain);
                                     break;
                                 case 2:
                                     System.out.println(villain.getName()+" escapo!");
                                     break;
                                 default:
                                     System.out.println("No has decidido bien y "+villain.getName()+" escapó");
                             }
                             
                             }
                         break;
                         case 2:
                             System.out.println("Has escapado");
                             break;
                         default:
                             System.out.println("Introduce una opción válida");
                             fi = Integer.parseInt(sc.nextLine());
                     }
                   }while(fi != 2 && fi !=1);
                   break;
                 case 2:
                     tr.getPpal().trainning();
                     break;
                 case 3:
                     System.out.println("<<<<Selecciona un pokemon>>>>");
                     tr.openPokedex();
                     int choose = Integer.parseInt(sc.nextLine());
                     if(choose < tr.getPokedex().size())
                     tr.setPpal(choose);
                     else
                         System.out.println("No has elegido una opción válida");
                     
                     break;
                 case 4:
                     tr.openPokedex();
                     break;
                 default:
                     System.out.println("Elije una opción válida");
             }
             
         }while(op != 0);
         
    }
    
}
