/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author alexj
 */
public class VentanaPaint extends javax.swing.JFrame {
    
    BufferedImage buffer = null;
    BufferedImage buffer2 = null;
    Graphics2D bufferGraphics, buffer2Graphics, lienzoGraphics = null;
    Color colorSeleccionado = Color.blue;
    int formaSeleccionada = 0;
    //monto un objeto de tipo circulo llamado miCirculo y Cuadrado llamado miCuadrado.
    Circulo miCirculo;
    Cuadrado miCuadrado;
    
    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(685, 454);
        
    }

    private void inicializaBuffers(){
        lienzoGraphics = (Graphics2D) lienzo.getGraphics(); //casteo para convertir el Grphics en Graphics2D
        //creo una imagen del mismo ancho y alto que el lienzo llamado buffer.
        buffer = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        //creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        //dibujamos un rectangulo blanco del tamaño del lienzo
        bufferGraphics.setColor(Color.white); //le doy color blanco
        bufferGraphics.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight()); //y el tamaño de la imagen del alto y ancho de lienzo
        
        
        
        //inicializo el 2º buffer
        //creo una imagen del mismo ancho y alto que el lienzo llamado buffer.
        buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        //creo una imagen modificable, sin el Graphics2D porq lo tengo declarado arriba.
        buffer2Graphics = buffer2.createGraphics();
        //dibujamos un rectangulo blanco del tamaño del lienzo
        buffer2Graphics.setColor(Color.white); //le doy color blanco
        buffer2Graphics.fillRect(0, 0, buffer2.getWidth(), buffer2.getHeight()); //y el tamaño de la imagen del alto y ancho de lienzo
    }
    
    @Override //modifico el metodo padre paint()
    public void paint(Graphics g){
        super.paint(g); //coge el parametro de la clase padre.
        //apuntamos al lienzo
        lienzoGraphics.drawImage(buffer, 0, 0, null); //dibujamosm el buffer en la posicion 0, 0 y es null (para que llene el resto)
                                          //ponemos el null porq el metodo drawImage, necesita 4 parametros, el null no lo usa.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lienzo = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton3.setText("Aceptar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton3)
                .addGap(171, 171, 171)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jButton2.setText("Color");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton5.setText("Circulos");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setText("Cuadrados");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        //switch para ver que figura es
        switch(formaSeleccionada){//tantos casos como figuras tengamos en el Paint
            //creo el objeto circulo, con los parametros del contructor de Circulo.java
            case 0: miCirculo = new Circulo(evt.getX(), evt.getY(), 1, colorSeleccionado, true);
                //.... usamos el metodo que queremos para rellenar auxiliar con color
                miCirculo.dibujate(bufferGraphics);break;
             //creo el objeto cuadrado, con los parametros del contructor de Cuadrado.java
            case 1: miCuadrado = new Cuadrado(evt.getX(), evt.getY(), 1, colorSeleccionado, true);
                //.... usamos el metodo que queremos para rellenar auxiliar con color
                miCuadrado.dibujate(bufferGraphics);break;           
        }
        
       
        //le decimos que repinte en el buffer el objeto
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMousePressed


//metodo para que dibuje un tamaño determinado cuando el raton se desplace cuando esta pulsado.
    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        //sobrescribimos el buffer para que lo dibujado no se borre
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        
        switch (formaSeleccionada) {//tantos casos como figuras tengamos en el Paint
            //creo el objeto circulo, con los parametros del contructor de Circulo.java
            case 0:
                //creamos una variable int llamada radio, restamos la posicion X del circulo y le restamos la posX del evento de raton
                //como dara negativo, lo metemos dentro de un Math.abs (absoluto) y nos lo devolvera positivo, el (int) es para
                //decirle que sera de tipo int.
                int radio = Math.abs((int) miCirculo.x - evt.getX());
                //le cambiamos el alto y el ancho al circulo
                miCirculo.width = radio;
                miCirculo.height = radio;
                miCirculo.dibujate(bufferGraphics);
                break;
            //creo el objeto cuadrado, con los parametros del contructor de Cuadrado.java
            case 1:
                //creamos una variable int llamada lado, restamos la posicion X del cuadrado y le restamos la posX del evento de raton
                //como dara negativo, lo metemos dentro de un Math.abs (absoluto) y nos lo devolvera positivo, el (int) es para
                //decirle que sera de tipo int.
                int lado = Math.abs((int) miCuadrado.x - evt.getX());
                //le cambiamos el alto y el ancho al circulo
                miCuadrado.width = lado;
                miCuadrado.height = lado;
                miCuadrado.dibujate(bufferGraphics);
                break;
        }
        //apuntamos al lienzo
        lienzoGraphics.drawImage(buffer, 0, 0, null);
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        switch(formaSeleccionada){//tantos casos como figuras tengamos en el Paint
            //creo el objeto circulo, con los parametros del contructor de Circulo.java
            case 0: miCirculo.dibujate(buffer2Graphics);break;
             //creo el objeto cuadrado, con los parametros del contructor de Cuadrado.java
            case 1: miCuadrado.dibujate(buffer2Graphics);break;           
        }
        
        
    }//GEN-LAST:event_lienzoMouseReleased

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        colorSeleccionado = jColorChooser1.getColor();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        formaSeleccionada = 1;
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        formaSeleccionada = 0;
    }//GEN-LAST:event_jButton5MousePressed

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
