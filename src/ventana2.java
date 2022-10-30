import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.*;
import javax.imageio.*;

import java.io.*;

public class ventana2 extends JFrame {
    diseño componentes1 = new diseño();

    public ventana2() {
        setVisible(true);
        setSize(615, 598);
        setLocation(55, 70);
        setDefaultCloseOperation(HIDE_ON_CLOSE);// Al finalizar cambiar a HIDE_ON_CLOSE
        add(componentes1);

    }
}

class diseño extends JPanel {
    private Image imagen;

    public diseño() {
        setLayout(null);
        laminaSuperior();
        laminaInferior();
        tabla();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // imagen principal
        Graphics2D g2 = (Graphics2D) g;
        File miImagen = new File("src/graficos/VimagenFormulario2.png");
        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException E) {
            System.out.println("fallo en la recuperacion de imagen");
        }
        g2.drawImage(imagen, 35, 17, null);
        // texto principal
        Font texto = new Font("Arial Black", Font.PLAIN, 24);
        g2.setFont(texto);
        g2.drawString("FORMULARIO DE CLIENTES", 110, 55);
        ;
    }

    public void laminaSuperior() {
        // datos de cliente
        JLabel datosClientes = new JLabel("Datos de Cliente");
        datosClientes.setBounds(30, 98, 112, 35);
        add(datosClientes);
        // datos que que se llenaran, debajo de cliente
        // el ID
        JLabel ID = new JLabel("ID");
        ID.setBounds(12, 7, 20, 25);
        JTextField ID1 = new JTextField(" id", 20);
        ID1.setBounds(12, 28, 55, 25);
        // descripcion
        JLabel descripcion = new JLabel("Descripcion");
        descripcion.setBounds(78, 7, 90, 25);
        JTextField DESCRIPCION = new JTextField(" descripcion");
        DESCRIPCION.setBounds(78, 28, 225, 25);
        // direccion...
        JLabel direccion = new JLabel("Direccion");
        direccion.setBounds(320, 7, 85, 25);
        JTextField DIRECCION = new JTextField(" direccion");
        DIRECCION.setBounds(320, 28, 225, 25);
        // telefono
        JLabel telefono = new JLabel("Telefono");
        telefono.setBounds(10, 45, 75, 45);
        JTextField TELEFONO = new JTextField(" telefono");
        TELEFONO.setBounds(10, 78, 225, 25);
        // El RUC
        JLabel Ruc = new JLabel("RUC");
        Ruc.setBounds(245, 55, 55, 25);
        JTextField RUC = new JTextField(" ruc");
        RUC.setBounds(245, 77, 225, 26);
        // lamina donde se aplican los componentes de arriba
        JPanel lamina1 = new JPanel();
        lamina1.setLayout(null);
        lamina1.setBounds(20, 120, 555, 135);
        lamina1.setBorder(BorderFactory.createEtchedBorder());
        lamina1.add(ID);
        lamina1.add(ID1);
        lamina1.add(descripcion);
        lamina1.add(DESCRIPCION);
        lamina1.add(direccion);
        lamina1.add(DIRECCION);
        lamina1.add(telefono);
        lamina1.add(TELEFONO);
        lamina1.add(Ruc);
        lamina1.add(RUC);
        add(lamina1);
    }

    public void laminaInferior() {
        // boton de "nuevo"
        JButton nuevo = new JButton("nuevo");
        nuevo.setBackground(Color.WHITE);
        // nuevo.setText("Nuevo",12,15);
        nuevo.setBounds(12, 7, 80, 75);
        ImageIcon NUEVO = new ImageIcon("src/graficos/icono de nuevo2.png");
        nuevo.setIcon(new ImageIcon(NUEVO.getImage().getScaledInstance(84, 70, Image.SCALE_SMOOTH)));
        JLabel nuevo1 = new JLabel("nuevo");
        nuevo1.setBounds(12, 50, 80, 75);
        // boton de guardar..
        JButton guardar = new JButton("Guardar");
        guardar.setBackground(Color.WHITE);
        guardar.setBounds(98, 7, 80, 75);
        ImageIcon guadar1 = new ImageIcon("src/graficos/icono guardar2.png");
        guardar.setIcon(new ImageIcon(guadar1.getImage().getScaledInstance(84, 70, Image.SCALE_SMOOTH)));
        JLabel guardar2 = new JLabel("guardar");
        guardar2.setBounds(97, 50, 80, 75);
        // Boton de editar
        JButton editar = new JButton("Editar");
        editar.setBackground(Color.WHITE);
        editar.setBounds(183, 7, 80, 75);
        ImageIcon editar1 = new ImageIcon("src/graficos/icono de editar2.png");
        editar.setIcon(new ImageIcon(editar1.getImage().getScaledInstance(80, 75, Image.SCALE_SMOOTH)));
        JLabel editar2 = new JLabel("editar");
        editar2.setBounds(183, 50, 80, 75);
        // boton de eliminar
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBackground(Color.WHITE);
        eliminar.setBounds(268, 7, 80, 75);
        ImageIcon eliminar1 = new ImageIcon("src/graficos/icono de delete2.png");
        eliminar.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(80, 75, Image.SCALE_SMOOTH)));
        JLabel eliminar3 = new JLabel("eliminar");
        eliminar3.setBounds(268, 50, 80, 75);
        // boton de informe
        JButton informe = new JButton("");
        informe.setBackground(Color.WHITE);
        informe.setBounds(353, 7, 80, 75);
        ImageIcon informe2 = new ImageIcon("src/graficos/icono de informe2.png");
        informe.setIcon(new ImageIcon(informe2.getImage().getScaledInstance(60, 67, Image.SCALE_SMOOTH)));
        JLabel informe3 = new JLabel("informe");
        informe3.setBounds(353, 50, 80, 75);
        // boton de cancelar
        JButton cancelar = new JButton("");
        cancelar.setBackground(Color.WHITE);
        cancelar.setBounds(439, 7, 95, 75);
        ImageIcon cancelar2 = new ImageIcon("src/graficos/icono de cancelar2.png");
        cancelar.setIcon(new ImageIcon(cancelar2.getImage().getScaledInstance(80, 75, Image.SCALE_SMOOTH)));
        JLabel cancelar3 = new JLabel("cancelar");
        cancelar3.setBounds(439, 50, 95, 72);
        // lamina donde se aplican los componentes de abajo excepto el cuadro
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(null);
        lamina2.setBounds(20, 275, 555, 140);
        lamina2.setBorder(BorderFactory.createEtchedBorder());
        lamina2.add(nuevo);
        lamina2.add(nuevo1);
        lamina2.add(guardar);
        lamina2.add(guardar2);
        lamina2.add(editar);
        lamina2.add(editar2);
        lamina2.add(eliminar);
        lamina2.add(eliminar3);
        lamina2.add(informe);
        lamina2.add(informe3);
        lamina2.add(cancelar);
        lamina2.add(cancelar3);
        add(lamina2);
    }

    public void tabla() {
        String[] columna = { "ID", "Descripcion", "Direccion", "Telefono", "RUC" };
        Object[][] filas = {
                { "", "", "", "", "" },
                { "", "", "", "", "" },
                { "", "", "", "", "" },
                { "", "", "", "", "" },
        };
        JTable tablas = new JTable(filas, columna);
        JScrollPane sp = new JScrollPane(tablas);
        JPanel lamina4 = new JPanel();
        lamina4.setBounds(20, 420, 555, 90);
        lamina4.add(sp);
        add(lamina4);
    }
}
