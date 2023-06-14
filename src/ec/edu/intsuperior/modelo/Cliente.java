/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Mishel
 */
public class Cliente extends Persona{
    String idCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String ci, String apellido1, String apellido2, String nombre1, String nombre2, String direccion, String correo, String celular, String fechaNacimiento) {
        super(ci, apellido1, apellido2, nombre1, nombre2, direccion, correo, celular, fechaNacimiento);
        this.idCliente = idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    
    
    
}