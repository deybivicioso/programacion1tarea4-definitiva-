import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.geom.*;

public class ventana1 extends JFrame {
    lamina1 componentes = new lamina1();

    public ventana1() {
        setVisible(true);
        setTitle("JLabel1 [JLabel_estudent]-Font");
        setSize(475, 595);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(componentes);
    }
}

class lamina1 extends JPanel {
    public lamina1() {
        setLayout(null);
        texto();
        botones();
        bordes();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // primer texto superior
        g2.drawString("establecer propiedades ", 10, 25);
        g2.drawString("utilizando:", 220, 26);
    }

    public void texto() {
        // este codigo de unlabel se aplica junto a primer texto superior
        JLabel label1 = new JLabel("jlabels's font");
        label1.setBounds(145, 12, 160, 18);
        add(label1);
        // este codigo aplica el label que esta al lado del primer checkbox de arriba
        // hacia abajo
        JLabel label2 = new JLabel("obtener el tipo de letra del tipo predeterminado");
        label2.setBounds(40, 43, 268, 25);// ajustar correctamente
        add(label2);
        // este codigo aplica el texto arriba del combobox de los tipos de fuentes
        JLabel label3 = new JLabel("fuente:");
        label3.setBounds(25, 80, 50, 20);
        add(label3);
        // este codigo aplica el texto arriba del combobox de los tipos de estilos
        // fuentes
        JLabel label4 = new JLabel("estilos de fuentes");
        label4.setBounds(170, 80, 105, 20);
        add(label4);
        // ttexto:tamaño
        JLabel label5 = new JLabel("tamaño");
        label5.setBounds(310, 80, 130, 25);
        add(label5);
        // texto inferior
        JLabel label6 = new JLabel("vista previa");
        label6.setBounds(35, 414, 85, 35);
        add(label6);
        // texto de vista previa
        JLabel label7 = new JLabel("the quick fox jumps over the lazy dog");
        label7.setBounds(35, 435, 250, 50);
        add(label7);
    }

    public void botones() {
        // este es combobox que esta al lado del primer texto superior
        String[] opciones = { "editor por defecto", "preferido de editor" };
        JComboBox boton1 = new JComboBox(opciones);
        boton1.setBounds(280, 15, 163, 18);
        add(boton1);
        // primer checkbox de arriba hacia abajo
        JCheckBox boton2 = new JCheckBox();
        boton2.setBounds(20, 48, 18, 15);
        add(boton2);
        // combobox de las fuentes
        String[] fuentes = { "sylfaen", "symbol", "tahoma", "Times new roman",
                "trebuchet MS", "verdana", "webdings", "windings", "Yu Ghotic",
                "italic", "calibri (cuerpo)", "cobel" };
        JComboBox fuentess = new JComboBox<>(fuentes);
        fuentess.setBounds(25, 100, 135, 25);
        add(fuentess);
        // combobox de los estilos de fuentes
        String[] estilosFuentes = { "Sin Formato", "Negrita", "Cursiva", "Negrita Cursiva" };
        JComboBox estilossFuntess = new JComboBox<>(estilosFuentes);
        estilossFuntess.setBounds(170, 100, 130, 25);
        add(estilossFuntess);
        // comboBox de los numero de tamaño de fuentes
        String[] tamañoLetra = { "3", "5", "8", "10", "12",
                "14", "18", "24", "36", "40", "44", "48" };
        JComboBox tamañoLetras = new JComboBox<>(tamañoLetra);
        tamañoLetras.setBounds(310, 100, 125, 25);
        add(tamañoLetras);
        // boton aceptar parte inferor
        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds(160, 520, 90, 25);
        add(aceptar);
        // boton cancelar parte inferor
        JButton cancelar = new JButton("cancelar");
        cancelar.setBounds(258, 520, 90, 25);
        add(cancelar);
        // boton ayuda parte inferor
        JButton ayuda = new JButton("ayuda");
        ayuda.setBounds(355, 520, 90, 25);
        add(ayuda);
    }

    public void bordes() {
        // segundo borde, borde inferior
        JPanel border2 = new JPanel();
        border2.setLayout(null);
        border2.setBounds(15, 395, 410, 50);
        border2.setBorder(BorderFactory.createEtchedBorder());
        // primer borde, borde superior
        JPanel border1 = new JPanel();
        border1.setLayout(null);
        border1.setBounds(10, 40, 435, 450);
        border1.setBorder(BorderFactory.createEtchedBorder());
        border1.add(border2);
        add(border1);
    }
}
