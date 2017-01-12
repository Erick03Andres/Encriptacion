/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Cifrado 
{
    public static String Charset="abcdefghijklmnopqrstuvwxyz";
    public static String CharsetA="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String cifrado(String textoAux, int n)
    {
        String salida="";
        
        for(int i=0; i< textoAux.length(); i++)
        {
            if((Charset.indexOf(textoAux.charAt(i)) != -1) || (CharsetA.indexOf(textoAux.charAt(i)) != -1))
            {
                salida += (Charset.indexOf(textoAux.charAt(i)) != -1) ? Charset.charAt(((Charset.indexOf(textoAux.charAt(i)))+n)%Charset.length()) : CharsetA.charAt((CharsetA.indexOf(textoAux.charAt(i))+n)%CharsetA.length());
            } 
            else
            {
                salida += textoAux.charAt(i);
            }
        }
        escribirArchivo(salida);
        return salida;
    }
    
    public void descrifrar(String texto, int n)
    {
        
    }
    
    public void escribirArchivo(String archivo)
    {
        File f=new File("Cifrado.txt");
        
        try
        {
            FileWriter w=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(w);
            PrintWriter wr=new PrintWriter(bw);
            
            wr.write(archivo);
            
            wr.close();
            bw.close();
            
        }catch(Exception e){ }
    }
}