/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosal
 */
public class Persona {

    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Calle;
    private String NCasa;
    private String CodigoP;
    private String Colonia;
    private String Ciudad;
    private String Estado;

    public Persona(String Nombre, String ApellidoP, String ApellidoM, String Calle, String NCasa, String CodigoP, String Colonia, String Ciudad, String Estado) {
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Calle = Calle;
        this.NCasa = NCasa;
        this.CodigoP = CodigoP;
        this.Colonia = Colonia;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApellidoP
     */
    public String getApellidoP() {
        return ApellidoP;
    }

    /**
     * @param ApellidoP the ApellidoP to set
     */
    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    /**
     * @return the ApellidoM
     */
    public String getApellidoM() {
        return ApellidoM;
    }

    /**
     * @param ApellidoM the ApellidoM to set
     */
    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    /**
     * @return the Calle
     */
    public String getCalle() {
        return Calle;
    }

    /**
     * @param Calle the Calle to set
     */
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    /**
     * @return the NCasa
     */
    public String getNCasa() {
        return NCasa;
    }

    /**
     * @param NCasa the NCasa to set
     */
    public void setNCasa(String NCasa) {
        this.NCasa = NCasa;
    }

    /**
     * @return the CodigoP
     */
    public String getCodigoP() {
        return CodigoP;
    }

    /**
     * @param CodigoP the CodigoP to set
     */
    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    /**
     * @return the Colonia
     */
    public String getColonia() {
        return Colonia;
    }

    /**
     * @param Colonia the Colonia to set
     */
    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    /**
     * @return the Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

}
