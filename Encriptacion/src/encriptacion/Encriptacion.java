/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Encriptacion 
{
    public String principal(String ruta, int desplazamientos) throws IOException 
    {
        CifrarTexto ct=new CifrarTexto();
        List<String> datos=new ArrayList<String>();
        
        String textoAux = "", cadena = ruta;
        try
        {
            FileReader f = new FileReader(cadena);
            BufferedReader b = new BufferedReader(f);
            
            System.out.println("Texto a Cifrar: ");
            
            while ((cadena = b.readLine()) != null) 
            {
                System.out.println(cadena);
                cadena=cadena.replaceAll("\\s", "");
                datos.add(cadena);
            }
            
            b.close();
            
            for(int i=0; i<datos.size(); i++)
            {
                textoAux=datos.get(i);
                System.out.println("Texto: " + textoAux);
                System.out.println("Texto Cifrado: " + ct.cifradoCesar(textoAux, desplazamientos));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
     return textoAux;   
    }
}