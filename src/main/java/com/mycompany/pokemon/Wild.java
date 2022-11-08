/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

import java.util.ArrayList;

/**
 *
 * @author lrosellg
 */
public class Wild extends Pokemon {
    
    private static ArrayList<Pokemon> wildPokemon = new ArrayList();

    public Wild(String name, int level, int power) {
        super(name, level, power);
    }
    
    public static void addWild(Pokemon p){
        wildPokemon.add(p);
    }

    public static ArrayList<Pokemon> getWildPokemon() {
        return wildPokemon;
    }

    public static void setWildPokemon(ArrayList<Pokemon> wildPokemon) {
        Wild.wildPokemon = wildPokemon;
    }
    
    
}
