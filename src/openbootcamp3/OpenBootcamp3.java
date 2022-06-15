/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcamp3;

/**
 *
 * @author nando
 */
public class OpenBootcamp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(33);
        persona1.setTelefono(396358974);
        persona1.setNombre("John Doe");
        System.out.println(persona1.getNombre()+" tiene "+persona1.getEdad()+" años, y su telefono es "+persona1.getTelefono());
        
    }
    
}

class Persona{
    private int edad,telefono;
    private String nombre;

    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    
    
}