
import datos.alumno;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo Lollipop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bCap = new Scanner(System.in);
        String bKml;
        int bKml1;
        
      alumno sPersona = new alumno();
      
        System.out.println("Ingresa tu nombre: ");
        bKml=bCap.nextLine();
        sPersona.setNombre(bKml);
        
        System.out.println("Ingresa tu apellido: ");
        bKml=bCap.nextLine();
        sPersona.setApellido(bKml);
        
        System.out.println("Ingresa tu Genero: ");
        bKml=bCap.nextLine();
        sPersona.setGenero(bKml);
        
        System.out.println("Ingresa tu carrera cursando: ");
        bKml=bCap.nextLine();
        sPersona.setCarrera(bKml);
        
        System.out.println("Ingresa tu direccion: ");
        bKml=bCap.nextLine();
        sPersona.setDireccion(bKml);
        
        System.out.println("Ingresa tu Email: ");
        bKml=bCap.nextLine();
        sPersona.setEmail(bKml);
        
        System.out.println("Ingresa tu numero de control: ");
        bKml1=bCap.nextInt();
        sPersona.setNcontrol(bKml1);
        
        System.out.println("Ingresa tu edad: ");
        bKml1=bCap.nextInt();
        sPersona.setEdad(bKml1);
        
        System.out.println("Ingresa tu año de nacimiento: ");
        bKml1=bCap.nextInt();
        sPersona.setAñoNacim(bKml1);
        
        System.out.println("Ingresa tu numero de nacimiento: ");
        bKml1=bCap.nextInt();
        sPersona.setDia(bKml1);
        
        System.out.println("Ingresa el numero de mes de tu nacimiento: ");
        bKml1 = bCap.nextInt();
        switch (bKml1)
        {
            case 1:
                sPersona.setMes("Enero");
                break;
            case 2:
                sPersona.setMes("Febrero");
                break;
            case 3:
                sPersona.setMes("Marzo");
                break;
            case 4:
                sPersona.setMes("Abril");
                break;
            case 5:
                sPersona.setMes("Mayo");
                break;
            case 6:
                sPersona.setMes("Junio");
                break;
            case 7:
                sPersona.setMes("Julio");
                break;
            case 8:
                sPersona.setMes("Agosto");
                break;
            case 9:
                sPersona.setMes("Septiembre");
                break;
            case 10:
                sPersona.setMes("Octubre");
                break;
            case 11:
                sPersona.setMes("Noviembre");
                break;
            case 12:
                sPersona.setMes("El Mes es Diciembre");
                break;
            default: 
                sPersona.setMes("El mes no existe");
        }
        System.out.println("Tus datos son: ");
        System.out.println("Nombre: " +sPersona.getNombre());
        System.out.print("Apellido: " +sPersona.getApellido());
        System.out.println("Genero: " +sPersona.getGenero());
        System.out.print("Carrera: " +sPersona.getCarrera());
        System.out.print("Direccion: " +sPersona.getDireccion());
        System.out.print("Email: " +sPersona.getEmail());
        System.out.print("No. Control: " +sPersona.getNcontrol());
        System.out.print("Edad: " +sPersona.getEdad());
        System.out.print("Fecha de nacimiento: " +sPersona.getDia()+ " de " +sPersona.getMes()+ " del año " +sPersona.getAñoNacim()+ "");
    }
    
}
