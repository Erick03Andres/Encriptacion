/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author EQUIPO
 */
public class Pantalla extends javax.swing.JFrame 
{
    List<String> datos=new ArrayList<String>();
    List<String> datosD=new ArrayList<String>();
    CifrarTexto ct=new CifrarTexto();
    
    String textoAux="";
    String textoAuxi="";
    String ruta;
    
    int desplaza;
    
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnCargar = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaOriginal = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaCifrado = new javax.swing.JTextArea();
        lblDesplazamientos = new javax.swing.JLabel();
        txtDesplazamientos = new javax.swing.JTextField();
        btnEncriptar = new javax.swing.JButton();
        btnDesencriptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criptografia");

        btnCargar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        txtaOriginal.setEditable(false);
        txtaOriginal.setColumns(10);
        txtaOriginal.setRows(5);
        jScrollPane1.setViewportView(txtaOriginal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto Convertido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 248));

        txtaCifrado.setColumns(20);
        txtaCifrado.setRows(5);
        jScrollPane2.setViewportView(txtaCifrado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDesplazamientos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDesplazamientos.setText("N° Desplazamientos: ");

        txtDesplazamientos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        btnEncriptar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnEncriptar.setText("Encriptar");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        btnDesencriptar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnDesencriptar.setText("Desencriptar");
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargar)
                                .addGap(18, 18, 18)
                                .addComponent(txtRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDesplazamientos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDesplazamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDesencriptar)
                            .addComponent(btnEncriptar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnEncriptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesencriptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesplazamientos)
                            .addComponent(txtDesplazamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        System.out.println("Carga de Archivo");
        try
        {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(this);
            File f = chooser.getSelectedFile();
            
            ruta = f.getAbsolutePath();
            txtRuta.setText(ruta);
            
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            
            String cadena = "", contenido="";
            System.out.println("cadena: " + cadena);
            
            while((cadena=br.readLine())!=null)
            {
                txtaOriginal.append(cadena);
                System.out.println(cadena);
                datos.add(cadena);
            }
            br.close();
        }catch(Exception e)
        {
            System.out.println("No ha seleccionado ningun archivo");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        System.out.println("Encriptado");
        try
        {
            if(txtRuta.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "Seleccione un archivo");
            }
            else System.out.println("Correcto");
        }catch(Exception e)    
        {
            System.out.println("Ningun archivo seleccionado");
        }
        try
        {
            if (txtDesplazamientos.getText().length()==0) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor de desplazamiento");
            } else {
                desplaza = Integer.parseInt(txtDesplazamientos.getText());

                if (desplaza <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un desplazamiento mayor a 0");
                } else {
                    for (int i = 0; i < datos.size(); i++) {
                        textoAux = datos.get(i);
                        txtaCifrado.append(ct.cifradoCesar(textoAux, desplaza));
                    }
                    datosD.add(txtaCifrado.getText());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error de numero de desplazamiento");
        }        
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed
        System.out.println("Desencriptar");
        try
        {
            if(txtRuta.getText().length()==0)
            {
                System.out.println(txtRuta.getText().length());
                JOptionPane.showMessageDialog(null, "Seleccione el Archivo");
            }
            else System.out.println("Ruta obtenida...");
        }catch(Exception e){System.out.println("Ningun Archivo Seleccionado");}
        
        try
        {
            if(txtDesplazamientos.getText().length()==0)
            {
                System.out.println("Entro al if");
                System.out.println("txtDesplazamientos.getText(): " + txtDesplazamientos.getText());
                JOptionPane.showMessageDialog(null, "Ingrese el Total de Desplazamientos");
            }
            else
            {
                int desp=Integer.parseInt(txtDesplazamientos.getText());
                if(desp<=0)
                {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor mayor a 0");
                }
                else
                {
                    for(int i=0; i<datos.size(); i++)
                    {
                        textoAuxi=datos.get(i);
                        txtaCifrado.append(ct.descifradoCesar(textoAuxi, desp));
                    }
                    System.out.println("datos.size" + datos.size());
                }
            }
        }catch(Exception e){System.out.println("Error de numero de desplazamiento");}
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDesplazamientos.setText(null);
        txtRuta.setText(null);
        txtaCifrado.setText(null);
        txtaOriginal.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblDesplazamientos;
    private javax.swing.JTextField txtDesplazamientos;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtaCifrado;
    private javax.swing.JTextArea txtaOriginal;
    // End of variables declaration//GEN-END:variables
}
