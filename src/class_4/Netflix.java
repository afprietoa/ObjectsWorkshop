/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_4;

/**
 *<h1>Netflix<h1>
 * Clase que representa el servicio de streaming o "transmisión", Netflix.
 * Netflix es una clase padre.
 * <p>
 * Esta clase es la clase que envuelve las categorias de películas y series
 * @author afprietoa
 */
public class Netflix {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    /**
     * Titulo de la película o serie.
     */
    protected String title;
    
    /**
     * Genero de la película o serie.
     */
    protected String genre;
    
    /**
     * Creador de la película o serie.
     */
    protected String creator;
    
    /**
     * Duración de la película o serie. 
     */
    protected int duration;
    
    /**
     * Marcador de visualización de la película o serie.
     */
    protected boolean viewed;
    
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * Inicializa los datos de la serie o película con los valores que vienen por parámetro. <br>
     * <b>post: </b> el marcador de visualización es inicializado en false.<br>
     * @param title titulo de la ´película o serie
     * @param creator creador de la película o serie
     */
    public Netflix(String title, String creator) {
        this.title = title;
        this.creator = creator;
        viewed=false;
    }
    /**
     * Inicializa los datos del candidato con los valores que vienen por par�metro. <br>
     * <b>post: </b> el marcador de visualización es inicializado en false.<br>
     * @param title titulo de la película
     * @param genre género de la película
     * @param creator creador de la película
     * @param duration duración de la película
     */
    public Netflix(String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        viewed=false;
    }
    //-----------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------- 
    
    
     /**
     * Devuelve el titulo de la película o serie
     * @return titulo de la película o serie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modifica el titulo de la película o serie.<br>
     * <b>post: </b> Se modifica el titulo de la película o serie para un titulo pasado por parametro
     */
    public void setTitle(String title) {
        this.title = title;
    }

    
    /**
     * Devuelve el género de la película o serie
     * @return género de la película o serie
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Modifica el género de la película o serie.<br>
     * <b>post: </b> Se modifica el género de la película o serie para una género pasada por parametro
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Devuelve el creador de la película o serie
     * @return Creador de la película o serie
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Modifica el creador de la película o serie.<br>
     * <b>post: </b> Se modifica el creador de la película o serie para un creador pasado por parametro
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Devuelve el tiempo de duración de la película o serie
     * @return duración de la película o serie
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Modifica el tiempo de duración de la película o serie.<br>
     * <b>post: </b> Se modifica la duración de la película o serie para una duración pasada por parametro
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    /**
     * Cambia el estado de visualización de la película o serie.<br>
     * <b>post: </b> Se cambia el estado de visualización de la película o serie a true.
     */
    protected void markViewed(){
        viewed = true;
    }
    
    /**
     * Devuelve el tiempo de visualización de la película o serie
     * @return tiempo de visualización de la película o serie
     */
    protected int timeViewed(int time){
        return time;
    }
    
    /**
     * Devuelve por consola los valores de la película o serie
     * @return valores de las pelicula o serie impresos en consola
     */
    @Override
    public String toString() {
        return "Film/Serie \n" 
                + "Title=" + title +"\n" 
                +", Genre=" + genre +"\n" 
                +", Creator=" + creator +"\n" 
                +", Duration=" + duration + "\n";
    }
    
    
}
