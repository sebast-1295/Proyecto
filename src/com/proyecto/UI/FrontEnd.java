package com.proyecto.UI;

import com.proyecto.repositories.FileRepository;
import com.proyecto.services.BitacoraServices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo) {
        super(titulo);
        this.build();
    }

    public void build() {
        this.contruccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void contruccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }
    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }
    private void crearComponentes(){

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblcedula = new JLabel("Cedula:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblPrestamo = new JLabel("Prestamo:");
        JLabel lblempleo = new JLabel("Empleo:");
        JLabel lblcantidad = new JLabel("Cantidad:");


        JTextField txtNombre = new JTextField();
        JTextField txtcedula = new JTextField();
        JTextField txtEdad = new JTextField();
        JCheckBox txtPrestamo = new JCheckBox();
        JTextField txtempleo = new JTextField();
        JTextField txtcantidad = new JTextField();

        JButton Guardar = new JButton( "Guardar");
        Guardar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraServices service = new BitacoraServices(new FileRepository());
                try {
                    service.save(txtNombre.getText(),
                            txtcedula.getText(),
                            txtEdad.getText(),
                            txtPrestamo.isSelected(),
                            txtempleo.getText(),
                            txtcantidad.getText());
                } catch (ErrorEndEdadException errorEndEdadException) {
                    errorEndEdadException.printStackTrace();
                }

                txtNombre.setText("");
                txtcedula.setText("");
                txtEdad.setText("");
                txtPrestamo.setText("");
                txtempleo.setText("");
                txtcantidad.setText("");

                String reporte = String.join("\n", service.get());
                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);
            }
        });

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblcedula);
        this.agregarComponente(txtcedula);
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblPrestamo);
        this.agregarComponente(txtPrestamo);
        this.agregarComponente(lblempleo);
        this.agregarComponente(txtempleo);
        this.agregarComponente(lblcantidad);
        this.agregarComponente(txtcantidad);
        this.agregarComponente(Guardar);
    }
}
