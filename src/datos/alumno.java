/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author jesus
 */
public class alumno
{
    private String Nombre, Apellido, Genero, Carrera, Direccion, Email, Mes;
    private int Ncontrol, Edad, Dia, AñoNacim;
    
    public void setNombre(String iVal)
    {
        Nombre=iVal;
    }
    public void setApellido(String iVal)
    {
        Apellido=iVal;
    }
    public void setGenero(String iVal)
    {
        Genero=iVal;
    }
     public void setCarrera(String iVal)
    {
        Carrera=iVal;
    }
     public void setDireccion(String iVal)
    {
        Direccion=iVal;
    }
     public void setEmail(String iVal)
    {
        Email=iVal;
    }
    public void setMes(String iVal)
    {
        Mes=iVal;
    }
    public void setNcontrol(int iVal)
    {
        Ncontrol=iVal;
    }
    public void setEdad(int iVal)
    {
        Edad=iVal;
    }
    public void setDia(int iVal)
    {
        Dia=iVal;
    }
    public void setAñoNacim(int iVal)
    {
        AñoNacim=iVal;
    }
    
    
    public String getNombre()
    {
        return Nombre;
    }
    public String getApellido()
    {
        return Apellido;
    }
    public String getGenero()
    {
        return Genero;
    }
    public String getCarrera()
    {
        return Carrera;
    }
    public String getDireccion()
    {
        return Direccion;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getMes()
    {
        return Mes;
    }
    public int getNcontrol()
    {
        return Ncontrol;
    }
    public int getEdad()
    {
        return Edad;
   }
    public int getDia()
    {
        return Dia;
    }
    public int getAñoNacim()
    {
        return AñoNacim;
    }
    
}
