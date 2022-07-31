/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_1;

import java.util.Date;

/**
 *<h1>Person<h1>
 * Clase que representa una persona
 * @author afprietoa
 */
public class Person {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Nombre de la persona.
     */
    public String name;
    
    /**
     * Primer apellido de la persona.
     */
    public String lastName1;
    
    /**
     * Segundo apellido de la persona.
     */
    public String lastName2;
    
    /**
     * Fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    
    /**
     * Altura de la persona.
     */
    private float height;
    
    /**
     * Peso de la persona.
     */
    private float weight;
    
    /**
     * Edad de la persona.
     */
    private byte age;
    
    /**
     * Género de la persona.
     */
    private char genre;
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * Inicializa los datos de la persona con los valores que vienen por parámetro. <br>
     * @param name nombre de la persona
     * @param lastName1 primer apellido de la persona
     * @param lastName2 segundo apellido de la persona
     * @param dateBirth fecha de nacimiento de la persona
     * @param height altura de la persona
     * @param weight peso de la persona
     * @param age edad de la persona
     * @param genre género de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, float weight, byte age, char genre) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.genre = genre;
    }
    //-----------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------- 
    
    /**
     * Devuelve el indice de masa corporal.
     * @return indice de masa corporal, cociente del peso sobre la altura al cuadrado.
     */
    public float calculateBMI(){
        return  weight / (float) Math.pow( height,2);
    }
    
    /**
     * Devuelve la validación de la edad.
     * @return validación de la edad, valida si una persona es mayor de edad.
     */
    public boolean isOlder(){
      return age >= 18;  
    }

    /**
     * Devuelve el nombre de la persona
     * @return nombre de la persona
     */
    public String getName() {
        return name;
    }


    /** 
     * Modifica el nombre de la persona.<br>
     * <b>post: </b> Se modifica el nombre de la persona para un nombre pasada por parametro
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el primer apellido de la persona
     * @return primer apellido de la persona
     */
    public String getLastName1() {
        return lastName1;
    }

    /** 
     * Modifica el primer apellido de la persona.<br>
     * <b>post: </b> Se modifica el primer apellido de la persona para un apellido pasada por parametro
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    
    /**
     * Devuelve el segundo apellido de la persona
     * @return segundo apellido de la persona
     */
    public String getLastName2() {
        return lastName2;
    }

    /** 
     * Modifica el segundo apellido de la persona.<br>
     * <b>post: </b> Se modifica el segundo apellido de la persona para un apellido pasada por parametro
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Devuelve la fecha de nacimiento de la persona
     * @return fecha de nacimiento de la persona
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    
    /** 
     * Modifica la fecha de nacimiento de la persona.<br>
     * <b>post: </b> Se modifica la fecha de nacimiento de la persona para una fecha pasada por parametro
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Devuelve la altura de la persona
     * @return altura de la persona
     */
    public float getHeight() {
        return height;
    }

    /** 
     * Modifica la altura de la persona.<br>
     * <b>post: </b> Se modifica la altura de la persona para una altura pasada por parametro
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Devuelve el peso de la persona
     * @return peso de la persona
     */
    public float getWeight() {
        return weight;
    }

    /** 
     * Modifica el peso de la persona.<br>
     * <b>post: </b> Se modifica el peso de la persona para un peso pasado por parametro
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Devuelve la edad de la persona
     * @return edad de la persona
     */    
    public byte getAge() {
        return age;
    }

    /** 
     * Modifica la edad de la persona.<br>
     * <b>post: </b> Se modifica la edad de la persona para una edad pasada por parametro
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * Devuelve el género de la persona
     * @return género de la persona
     */    
    public char getGenre() {
        return genre;
    }

    /** 
     * Modifica el género de la persona.<br>
     * <b>post: </b> Se modifica el género de la persona para un género pasado por parametro
     */
    public void setGenre(char genre) {
        this.genre = genre;
    }
    
    /**
     * Devuelve por consola los valores de la persona
     * @return valores de la persona impresos en consola
     */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName1=" + lastName1 + ", height=" + height + ", weight=" + weight + ", age=" + age + ", genre=" + genre + '}';
    }
    
}
