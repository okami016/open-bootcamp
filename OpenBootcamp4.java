/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcamp4;

/**
 *
 * @author nando
 */
public class OpenBootcamp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(25);
        cliente1.setTelefono(6578523);
        cliente1.setNombre("Señor potato");
        cliente1.setCredito("1.000€");
        System.out.println("El cliente "+cliente1.getNombre()+ " con edad "+cliente1.getEdad()+ " y telefono "
        +cliente1.getTelefono()+ " tiene un crédito activo de "+cliente1.getCredito());
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(32);
        trabajador1.setTelefono(91586445);
        trabajador1.setNombre("Aurelio García");
        trabajador1.setSalario("1.500€");
        System.out.println("El empleado "+trabajador1.getNombre()+ " con edad "+trabajador1.getEdad()+ " y telefono "
        +trabajador1.getTelefono()+ " tiene un salario de "+trabajador1.getSalario());
    }
    
}

class Persona{
    
    private int edad, telefono;
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

class Cliente extends Persona{
    
    private String credito;
    
    
    public String getCredito(){
        return this.credito;
    }
    
    public void setCredito(String credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    
    private String salario;
    
    public String getSalario(){
        return this.salario;
    }
    
    public void setSalario(String salario){
        this.salario=salario;
    }
}
