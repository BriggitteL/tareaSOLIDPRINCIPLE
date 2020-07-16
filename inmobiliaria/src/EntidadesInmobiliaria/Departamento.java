/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;

/**
 *
 * @author Ronny Segura
 */
public class Departamento extends Modelo{

    
    
    private String parqueo;
    private String lavandero;
    private String ascensor;

    /**
     * Construtor de la clase Departamentoque recibe los siguientes parametros:
     *
     * @param parqueo parqueo
     * @param lavandero lavandero
     * @param ascensor ascensor
     * @param nombre nombre
     * @param numeroPlantas
     * @param numeroCuarto
     * @param cocina cocina
     * @param cuartoServicio cuartoSerivivio
     * @param precioCasa precioCasa
     * @param metConstruccion metConstruccion
     * @param numeroBaños numeroBaños
     * 
     */
    

    public Departamento(String parqueo, String lavandero, String ascensor, String nombre, int numeroPlantas, int numeroCuarto, String cocina, String cuartoServicio, int numeroBaños, double precioCasa, double metConstruccion, Urbanizacion urbanizacion) {
        super(nombre, numeroPlantas, numeroCuarto, cocina, cuartoServicio, numeroBaños, precioCasa, metConstruccion, urbanizacion);
        this.parqueo = parqueo;
        this.lavandero = lavandero;
        this.ascensor = ascensor;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        this.parqueo = parqueo;
    }

    public String getLavandero() {
        return lavandero;
    }

    public void setLavandero(String lavandero) {
        this.lavandero = lavandero;
    }

    public String getAscensor() {
        return ascensor;
    }

    public void setAscensor(String ascensor) {
        this.ascensor = ascensor;
    }
}
