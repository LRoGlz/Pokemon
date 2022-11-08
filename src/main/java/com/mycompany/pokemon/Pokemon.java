/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pokemon;

import java.util.ArrayList;

/**
 *
 * @author lrosellg
 */
public class Pokemon {
    
    private String name;
    private String type;
    private int level;
    private int power;
    
    public Pokemon(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
        switch(name){
            case "Squirtle", "Wartortle", "Magicar", "Gyarados":
                this.type = "Agua";
                break;
            case "Ratata", "Ratikate":
                this.type = "Siniestro";
                break;
            case "Pidgy", "Pidgiotto":
                this.type = "Volador";
                break;
            case "Charmander", "Charmaleon":
                this.type = "Fuego";
                break;
            case "Pikachu","Raichu":
                this.type = "Electrico";
                break;
            case "Bulvasur", "Ivysur":
                this.type = "Planta";
                break;
            case "Caterpie", "Metapod":
                this.type = "Bicho";
                
        }
    }
    
    public boolean figth (Pokemon k){
        if(this.power > k.power){
            this.win();
            return true;
        }else if(this.power == k.power){
            if(this.type == "Agua" && (k.type == "Fuego" || k.type == "Siniesto" || k.type == "Volador" || k.type == "Bicho")){
                this.win();
                return true;
            }
            else if (this.type == "Fuego" && (k.type == "Planta" || k.type == "Siniesto" || k.type == "Volador" || k.type == "Bicho")){
                this.win();
                return true;
            }
            else if (this.type == "Planta" && (k.type == "Agua" || k.type == "Siniesto" || k.type == "Volador" || k.type == "Bicho")){
                this.win();
                return true;
            }
            else if(this.type == "Siniestro" && ( k.type == "Electrico" || k.type == "Volador" || k.type == "Bicho")){
                this.win();
                return true;
            }
            else if(this.type == "Volador" && ( k.type == "Electrico" || k.type == "Bicho")){
                this.win();
                return true;
            }
            else if(this.type == "Electrico" && ( k.type == "Agua" || k.type == "Planta" || k.type == "Fuego")){
                this.win();
                return true;
            }
            else {
                this.loose(k);
                return false;
            }
        }else{
            this.loose(k);
            return false;
        }
           
    }
    
     public void trainning (){
        this.setLevel(this.getLevel()+1);
        System.out.println(this.getName()+" Ha subido al nivel "+this.getLevel());
        if(this.getLevel()==5)
            this.evolve();
    }
    
    public void win(){
        System.out.println("Has ganado!");
            this.level += 2;
            System.out.println(this.name+" ha subido al nivel "+this.level);
            if(this.level == 5)
                this.evolve();
    }
    
    public void loose(Pokemon k){
        System.out.println("Has perdido y "+k.name+" escapó!");
    }
    
    public void evolve(){
        this.power *=2;
        if(this.getName() == "Squirtle"){
            this.setName("Wartortle");
            this.power+=10;
            System.out.println("Squirtle evolucionó a Wartortle!");
        }
        else if(this.getName() == "Ratata"){
            this.setName("Ratikate");
            this.power+=10;
            System.out.println("Ratata evolucionó a Ratikate!");
        }
        else if(this.name == "Pidgy"){
            this.setName("Pidgiotto");
            this.power+=10;
            System.out.println("Pidgy evolucionó a Pidgiotto!");
        }
        else if(this.name == "Charmander"){
            this.setName("Charmaleon");
            this.power+=10;
            System.out.println("Charmander evolucionó a Charmaleon!");
        }
        else if(this.name == "Pikachu"){
            this.setName("Raichu");
            this.power+=10;
            System.out.println("Pikachu evolucionó a Raichu!");
        }
        else if(this.name == "Bulvasur"){
            this.setName("Ivysur");
            this.power+=10;
            System.out.println("Bulvasur evolucionó a Ivysur!");
        }
        else if(this.name == "Magicar"){
            this.setName("Gyarados");
            this.power+=10;
            System.out.println("Magicar evolucionó a Wartortle!");
        }
        else if(this.name == "Caterpie"){
            this.power+=10;
            this.setName("Metapod");
            System.out.println("Caterpie evolucionó a Metapod");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
   
}
