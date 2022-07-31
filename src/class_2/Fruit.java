/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_2;

import java.util.ArrayList;

/**
 *<h1>Fruit<h1>
 * Clase que representa una fruta
 * @author afprietoa
 */
public class Fruit {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Nombre de la fruta.
     */
    public String name;
    
    /**
     * Peso medio de la fruta.
     */
    private float averageWeight;
    
    /**
     * Colores de la fruta.
     */
    public ArrayList<String> colors;
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * Inicializa los datos de la fruta con los valores que vienen por parámetro. <br>
     * @param name nombre de la fruta
     * @param averageWeight peso medio de la fruta
     * @param colors lista de colores de la fruta
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    //-----------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------- 
    
    /**
     * Devuelve el nombre de la fruta
     * @return nombre de la fruta
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica el nombre de la fruta.<br>
     * <b>post: </b> Se modifica el nombre de la fruta para un nombre pasado por parametro
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Devuelve el peso promedio de la fruta
     * @return peso promedio de la fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Modifica el peso promedio de la fruta.<br>
     * <b>post: </b> Se modifica el peso de la fruta para un peso pasado por parametro
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Devuelve los colores de la fruta
     * @return lista de colores de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Agrega los colores de la fruta.<br>
     * <b>post: </b> agrega colores a la lista de colores para para un color pasado por parametro
     */
    public void addColors(ArrayList<String> colors, String color) {
        colors.add(color);
    }
    
    
}
