/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendatecnologica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Andrea
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
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

        Fondo = new javax.swing.JPanel();
        IDUsuario = new javax.swing.JLabel();
        CajaUsuarios = new javax.swing.JTextField();
        IDProducto = new javax.swing.JLabel();
        CajaProductos = new javax.swing.JTextField();
        CajaCantidad = new javax.swing.JTextField();
        BarraSuperior = new javax.swing.JPanel();
        BarraInferior = new javax.swing.JPanel();
        Tienda = new javax.swing.JLabel();
        Comprar = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        IDUsuario.setBackground(new java.awt.Color(204, 204, 204));
        IDUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDUsuario.setText("ID Usuario");
        IDUsuario.setOpaque(true);

        CajaUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        CajaUsuarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaUsuariosActionPerformed(evt);
            }
        });

        IDProducto.setBackground(new java.awt.Color(204, 204, 204));
        IDProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDProducto.setText("ID Producto");
        IDProducto.setOpaque(true);

        CajaProductos.setBackground(new java.awt.Color(204, 204, 204));
        CajaProductos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaProductosActionPerformed(evt);
            }
        });

        CajaCantidad.setBackground(new java.awt.Color(204, 204, 204));
        CajaCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCantidadActionPerformed(evt);
            }
        });

        BarraSuperior.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        BarraInferior.setBackground(new java.awt.Color(204, 204, 204));

        Tienda.setText("Tienda Tecnológica");

        javax.swing.GroupLayout BarraInferiorLayout = new javax.swing.GroupLayout(BarraInferior);
        BarraInferior.setLayout(BarraInferiorLayout);
        BarraInferiorLayout.setHorizontalGroup(
            BarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraInferiorLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(Tienda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarraInferiorLayout.setVerticalGroup(
            BarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraInferiorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Tienda)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Comprar.setBackground(new java.awt.Color(204, 204, 204));
        Comprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comprar.setText("COMPRAR");
        Comprar.setOpaque(true);
        Comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarMouseClicked(evt);
            }
        });

        Cantidad.setBackground(new java.awt.Color(204, 204, 204));
        Cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cantidad.setText("Cantidad");
        Cantidad.setOpaque(true);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGap(63, 63, 63)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CajaProductos)
                                    .addComponent(CajaCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(CajaUsuarios)))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BarraInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(BarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BarraInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaUsuariosActionPerformed
        // TODO add your handling code here:
        buscarUsuarioPorId(CajaUsuarios);
    }//GEN-LAST:event_CajaUsuariosActionPerformed

    private void CajaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaProductosActionPerformed
        // TODO add your handling code here:
        buscarProductoPorId(CajaProductos);
    }//GEN-LAST:event_CajaProductosActionPerformed

    private void ComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarMouseClicked
        // TODO add your handling code here:
        System.out.println("Proceso de compra iniciado...");
        
        // Llama a los métodos de búsqueda para confirmar la operación
        buscarUsuarioPorId(CajaUsuarios);
        buscarProductoPorId(CajaProductos);
        buscarCantidadPorId(CajaProductos);
    
        System.out.println("Compra realizada exitosamente.");
    }//GEN-LAST:event_ComprarMouseClicked

    private void CajaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCantidadActionPerformed
        // TODO add your handling code here:
        buscarCantidadPorId(CajaProductos); 
    }//GEN-LAST:event_CajaCantidadActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraInferior;
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JTextField CajaCantidad;
    private javax.swing.JTextField CajaProductos;
    private javax.swing.JTextField CajaUsuarios;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Comprar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel IDProducto;
    private javax.swing.JLabel IDUsuario;
    private javax.swing.JLabel Tienda;
    // End of variables declaration//GEN-END:variables

private void buscarProductoPorId(JTextField campoTexto) {
    Connection conexion = Conexion.getConnection();
    if (conexion == null) {
        System.out.println("No se pudo conectar a la base de datos.");
        return;
    }

    // Obtener el texto del campo de búsqueda y verificar si está vacío
    String textoIngresado = campoTexto.getText().trim();
    if (textoIngresado.isEmpty()) {
        System.out.println("El campo de texto está vacío. Por favor, ingresa un ID de producto.");
        return;
    }

    // Intentar convertir el texto ingresado en un número entero
    int productoId;
    try {
        productoId = Integer.parseInt(textoIngresado);
    } catch (NumberFormatException ex) {
        System.out.println("Entrada inválida. El ID debe ser un número entero.");
        return;
    }

    // Consulta para verificar si existe un producto con el ID proporcionado
    String consultaSQL = "SELECT id_producto, nombre FROM productos WHERE id_producto = ?";

    try (PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {
        consultaPreparada.setInt(1, productoId); // Vincular el parámetro
        ResultSet resultado = consultaPreparada.executeQuery();

        if (resultado.next()) {
            String nombreProducto = resultado.getString("nombre");
            System.out.println("Producto encontrado: " + nombreProducto + " (ID: " + productoId + ")");
        } else {
            System.out.println("No se encontró ningún producto con el ID " + productoId + ".");
        }

    } catch (SQLException ex) {
        System.out.println("Error al buscar el producto en la base de datos: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}

private void buscarUsuarioPorId(JTextField campoTexto) {
    Connection conexion = Conexion.getConnection();
    if (conexion == null) {
        System.out.println("No se pudo conectar a la base de datos.");
        return;
    }

    // Obtener el texto del campo de búsqueda y verificar si está vacío
    String textoIngresado = campoTexto.getText().trim();
    if (textoIngresado.isEmpty()) {
        System.out.println("El campo de texto está vacío. Por favor, ingresa un ID de usuario.");
        return;
    }

    // Intentar convertir el texto ingresado en un número entero
    int usuarioId;
    try {
        usuarioId = Integer.parseInt(textoIngresado);
    } catch (NumberFormatException ex) {
        System.out.println("Entrada inválida. El ID debe ser un número entero.");
        return;
    }

    // Consulta para verificar si existe un usuario con el ID proporcionado
    String consultaSQL = "SELECT id_usuario, nombre, email FROM usuarios WHERE id_usuario = ?";

    try (PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {
        consultaPreparada.setInt(1, usuarioId); // Vincular el parámetro
        ResultSet resultado = consultaPreparada.executeQuery();

        if (resultado.next()) {
            String nombreUsuario = resultado.getString("nombre");
            String emailUsuario = resultado.getString("email");
            System.out.println("Usuario encontrado: " + nombreUsuario + " (ID: " + usuarioId + ", Email: " + emailUsuario + ")");
        } else {
            System.out.println("No se encontró ningún usuario con el ID " + usuarioId + ".");
        }

    } catch (SQLException ex) {
        System.out.println("Error al buscar el usuario en la base de datos: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}

private void buscarCantidadPorId(JTextField campoTexto) {
    Connection conexion = Conexion.getConnection();
    if (conexion == null) {
        System.out.println("No se pudo conectar a la base de datos.");
        return;
    }

    // Obtener el texto del campo de búsqueda y verificar si está vacío
    String textoIngresado = campoTexto.getText().trim();
    if (textoIngresado.isEmpty()) {
        System.out.println("El campo de texto está vacío. Por favor, ingresa un ID de producto.");
        return;
    }

    // Intentar convertir el texto ingresado en un número entero
    int productoId;
    try {
        productoId = Integer.parseInt(textoIngresado);
    } catch (NumberFormatException ex) {
        System.out.println("Entrada inválida. El ID debe ser un número entero.");
        return;
    }

    // Consulta para verificar y obtener la cantidad del producto en inventario
    String consultaSQL = "SELECT inventario FROM productos WHERE id_producto = ?";

    try (PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {
        consultaPreparada.setInt(1, productoId); // Vincular el parámetro
        ResultSet resultado = consultaPreparada.executeQuery();

        if (resultado.next()) {
            int cantidadInventario = resultado.getInt("inventario");
            System.out.println("Cantidad en inventario para el producto con ID " + productoId + ": " + cantidadInventario);
        } else {
            System.out.println("No se encontró ningún producto con el ID " + productoId + ".");
        }

    } catch (SQLException ex) {
        System.out.println("Error al buscar la cantidad del producto en la base de datos: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}
}