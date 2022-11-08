/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lrosellg
 */
public class Trainner {
    private String name;
    private Pokemon ppal;
    private ArrayList<Pokemon> pokedex = new ArrayList();
    
    public Trainner(String name){
        this.name = name;
    }
    
    public void catcher(Pokemon p){
        System.out.println("Has capturado a "+p.getName());
        pokedex.add(p);
    }
    
    public Pokemon find(ArrayList<Pokemon> wildPokemon){
        Random r = new Random();
        int i = r.nextInt(wildPokemon.size());
        
        System.out.println("un "+wildPokemon.get(i).getName()+" salvaje apareció");
        return wildPokemon.get(i);
    }
    
    public void openPokedex (){
        int cont = 0;
        for(Pokemon p: pokedex){
            System.out.println(cont+"- "+p.getName()+",  Fuerza: "+p.getPower()+" Nivel :"+p.getLevel());
            cont++;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPpal() {
        return ppal;
    }

    public void setPpal(Pokemon ppal) {
        System.out.println("Ahora "+ppal.getName()+" es tu pokemon principal");
        this.ppal = ppal;
    }
    
    public void setPpal(int ind){
        this.ppal = pokedex.get(ind);
        System.out.println("Ahora "+ppal.getName()+" es tu pokemon principal");
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }
    
    
}
