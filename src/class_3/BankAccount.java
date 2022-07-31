/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_3;

/**
 *<h1>BankAccount<h1>
 * Clase que representa una cuenta bancaria
 * @author afprietoa
 */
public class BankAccount {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Número de cuenta.
     */
    private int accountNumber;
    
    /**
     * Estado de la cuenta
     */
    protected boolean activated;
    //-----------------------------------------------------------------
    // Constructor
    //------------------------------------------------------------------
    
    /**
     * Inicializa los datos de la cuenta bancaria con los valores que vienen por parámetro. <br>
     * @param accountNumber número de cuenta
     * @param activated estado de la cuenta bancaria
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    //-----------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------- 

    /**
     * Devuelve el número de cuenta bancaria
     * @return número de cuenta bancaria
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Modifica el número de cuenta bancaria.<br>
     * <b>post: </b> Se modifica el número de cuenta bancaria para un número de cuenta pasada por parametro
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Devuelve el estado de la cuenta bancaria
     * @return estado de la cuenta bancaria
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Cambia el estado de la cuenta bancaria.<br>
     * <b>post: </b> Se cambia el estado de la cuenta bancaria para un estado pasada por parametro.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
}
