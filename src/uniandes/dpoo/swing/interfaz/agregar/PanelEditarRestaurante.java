package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {

    	// Crea el campo para el nombre con una etiqueta al frente
        txtNombre = new JTextField(22);

        // Crea el selector para la calificación con una etiqueta al frente
        cbbCalificacion = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        cbbVisitado = new JComboBox<>(new String[]{"No", "Sí"});

        // Agregar todos los elementos al panel
        setLayout(new GridLayout(3, 1));
        JPanel filaNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaNombre.add(new JLabel("Nombre: "));
        filaNombre.add(txtNombre);
        JPanel filaCalificacion = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaCalificacion.add(new JLabel("Calificación: "));
        filaCalificacion.add(cbbCalificacion);
        JPanel filaVisitado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaVisitado.add(new JLabel("Visitado: "));
        filaVisitado.add(cbbVisitado);
        add(filaNombre);
        add(filaCalificacion);
        add(filaVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	return "Sí".equals(cbbVisitado.getSelectedItem());
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	return txtNombre.getText().trim();
    }
}
