/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_6;

/**
 *<h1>Burger<h1>
 * Clase que representa una hamburguesa
 * @author afprietoa
 */
public class Burger {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Nombre de la hamburguesa en el menú
     */
    private String name;
    
    /**
     * Costo de producción de una hamburguesa
     */
    private double productionCost;
    
    /**
     * Número de hamburguesas producidas
     */
    private int quantityProduced;
    
    /**
     * Precio de venta de una hamburguesa
     */
    private double sellPrice;
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * Inicializa los datos de la hamburguesa con los valores que vienen por parámetro. <br>
     * <b>post: </b> el precio de venta se inicializa en cero.<br>
     * @param name Nombre de la hamburguesa
     * @param productionCost costo de producción de una hamburguesa
     * @param sellPrice precio de venta de una hamburguesa
     */
    public Burger(String name, double productionCost, double sellPrice) {
        this.name = name;
        this.productionCost = productionCost;
        this.quantityProduced = 0;
        this.sellPrice = sellPrice;
    }
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
    
    /**
     * Devuelve la ganancia unitaria por una hamburguesa preparada
     * @return la ganancia por unidad de hamburguesa producida, diferencia entre el precio de venta y el costo de producción
     */
    public double getUnitGain(){
        return(sellPrice - productionCost);
    }
    
    /**
     * Devuelve la ganancia total por las hamburguesas preparadas
     * <b>pre: </b>  getUnitGain() > 0
     * @return la ganancia total de las hamburguesas producidas, producto de la ganancia unitaria por la cantidad producida 
     */
    public double getTotalGain(){
        return getUnitGain() * quantityProduced;
    }

     /**
     * Devuelve el nombre de la hamburguesa del menú
     * @return Nombre de la hamburguesa del menú
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve el nombre del candidato.
     * <b>post: </b> Se establece el nombre de la hamburguesa para el menú, 
     * @param name nombre de la hamburguesa en el menú
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Devuelve por consola el tiempo de preparación de la hamburguesa
     * <b>post: </b> Es impreso el tiempo de preparación en consola
     */
    private static void getPreparationTime(){
        System.out.println("30 minutes");
    }
    
    /**
     * Devuelve por consola los tipos de hamburguesa
     * <b>post: </b> Son impresos los tipos de hamburguesa de preparación en consola
     */
    private static void getBurgerMenu(){
        System.out.println("veggie and meat burger");
    }
    
    /**
     * Devuelve por consola los valores de la hamburguesa(s)
     * @return valores de la hamburguesa(s) impresos en consola
     */
    @Override
    public String toString() {
        return "Burger \n" 
                + "name=" + name + "\n" 
                +"productionCost=" + productionCost + "\n" 
                +"quantityProduced=" + quantityProduced + "\n" 
                + "sellPrice=" + sellPrice;
    }
    
    
}
