/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author EQUIPO
 */
public class CifrarTexto 
{
    List<String> datos=new ArrayList<String>();
    String cadena;

    public  String cifradoCesar(String texto, int codigo) throws IOException 
    {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') 
            {
                if ((texto.charAt(i) + codigo) > 'z') 
                {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } 
                else 
                {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } 
            else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') 
            {
                if ((texto.charAt(i) + codigo) > 'Z') 
                {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                }
                else 
                {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        
        guardarCifrado(cifrado.toString());
        
        return cifrado.toString();
    }
    
    public void guardarCifrado(String archivo) throws IOException
    {
        File f=new File("ArchivoCifrado.txt");
        
        try
        {
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter wr=new PrintWriter(bw);
            
            wr.write(archivo);
            
            wr.close();
            bw.close();
            
        }catch(Exception e)
        {
            System.out.println("Error... No se pudo guardar el archivo");
        }
    }

    //método para descifrar el texto
    public String descifradoCesar(String texto, int codigo) throws IOException 
    {
        System.out.println("Entro al descifrado");
        StringBuilder descifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) 
        {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') 
            {
                if ((texto.charAt(i) - codigo) < 'a') 
                {
                    descifrado.append((char) (texto.charAt(i) - codigo + 26));
                }
                else 
                {
                    descifrado.append((char) (texto.charAt(i) - codigo));
                }
            } 
            else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z')  
            {
                if ((texto.charAt(i) - codigo) < 'A') 
                {
                    descifrado.append((char) (texto.charAt(i) - codigo + 26));  
                }
                else 
                {
                    descifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        
        guardarDescifrado(descifrado.toString());
        
        return descifrado.toString();
    }
    
    public void guardarDescifrado(String archivo) throws IOException
    {
        File f=new File("ArchivoDescifrado.txt");
        
        try
        {
            FileWriter fr=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fr);
            PrintWriter pw=new PrintWriter(bw);
            
            pw.write(archivo);
            
            pw.close();
            bw.close();
        }catch(Exception e){System.out.println("Error... No se puede guardar el archivo!");}
    }
}