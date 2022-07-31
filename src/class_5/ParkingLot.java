/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_5;

/**
 *<h1>PhoneLine<h1>
 * Clase que representa un parqueadero.
 * @author afprietoa
 */
public class ParkingLot {
    
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Número de vehiculos ingresados al parqueadero
     */
    private int vehiclesNumber;
     /**
     * Número de minutos de permanencia en el parqueadero
     */
    private int minutesNumber;
    /**
     * Costo total de estacionamiento
     */
    private double parkingCost;
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * Inicializa los valores del parqueadero <br>
     * <b>post: </b> El parqueadero se inicializa con valores en cero.
     */
    public ParkingLot() {
        init();
    }
    //-----------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------- 
    
    /**
     * Inicializa los valores del parqueadero <br>
     * <b>post: </b> El parqueadero se inicializa con valores en cero.
     */
    public void init(){
        vehiclesNumber = 0;
        minutesNumber = 0;
        parkingCost = 0;
    }
     /**
     * Inicializa los valores del parqueadero <br>
     * <b>post: </b> El parqueadero se inicializa con valores en cero.
     */
    public void restar(){
        init();
    }

    /**
     * Devuelve el costo total en estacionamiento
     * @return Costo total del estacionamiento
     */
    public double getParkingCost() {
        return parkingCost;
    }

     /**
     * Devuelve el total de minutos de permanencia en el parqueadero
     * @return Número total de minutos de permanencia en el parqueadero
     */
    public int getMinutesNumber() {
        return minutesNumber;
    }

    /**
     * Devuelve total de vehiculos ingresados
     * @return Número total de vehiculos ingresados
     */
    public int getVehiclesNumber() {
        return vehiclesNumber;
    }
    
    
    /**
     * Agrega parqueo de bicicleta al estacionamiento <br>
     * <b>post: </b>  El número de vehiculos se incrementa en 1, 
     * se incrementa número de minutos en minutos, el costo de la llamada aumenta en (minutos*10)
     * @param minutos Número de minutos de permanecia de una bicicleta en el estacionamiento
     */
    public void addBikeParking(int minutes){
        
        vehiclesNumber += 1;
        
        minutesNumber += minutes;
        
        parkingCost += ( minutes*10 );
    }
    
    /**
     * Agrega parqueo de motocicleta al estacionamiento <br>
     * <b>post: </b>  El número de vehiculos se incrementa en 1, 
     * se incrementa número de minutos en minutos, el costo de la llamada aumenta en (minutos*65)
     * @param minutos Número de minutos de permanecia de una motocicleta en el estacionamiento
     */
    public void addMotorcycleParking( int minutes ){
        
        vehiclesNumber += 1;
        
        minutesNumber += minutes;
        
        parkingCost += ( minutes*65 );
    }
    
    /**
     * Agrega parqueo de carro al estacionamiento <br>
     * <b>post: </b>  El número de vehiculos se incrementa en 1, 
     * se incrementa número de minutos en minutos, el costo de la llamada aumenta en (minutos*95)
     * @param minutos Número de minutos de permanecia de un carro en el estacionamiento
     */
    public void addCarParking( int minutes ){
        
        vehiclesNumber += 1;
        
        minutesNumber += minutes;
        
        parkingCost += ( minutes*95 );
    }

}
