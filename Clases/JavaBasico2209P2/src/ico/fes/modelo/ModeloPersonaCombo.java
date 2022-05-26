/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;

/**
 *
 * @author Jesus Flores
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona> {
        private ArrayList<Persona> datos;
        private Persona selected;


    public ModeloPersonaCombo() {
    }

        public ModeloPersonaCombo(ArrayList datos, Persona selected) {
            this.datos = datos;
            this.selected = selected;
        }
        

        public ArrayList getDatos() {
            return datos;
        }
        

        public void setDatos(ArrayList datos) {
            this.datos = datos;
        }
        /*
*/
 
    @Override
        public void setSelectedItem(Object anItem) {
            this.selected = (Persona)anItem;
            
            }

            @Override
            public Object getSelectedItem() {
                return selected;
            }

            @Override
            public int getSize() {
                //regresará el numero de elementos a mostrar
                return datos.size();
            }

            @Override
            public Persona getElementAt(int i) {
                return datos.get(i);
            }

            @Override
            public void addListDataListener(ListDataListener l) {

            }

            @Override
            public void removeListDataListener(ListDataListener l) {

            }
            
        public void consultarBaseDatos(){
                    PersonaDAO pdao=new PersonaDAO();
        
        try {
            datos=pdao.obtenerTodo();
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
                //datos = new ArrayList<>();
            //conexión a bd
            //consulta SQL
/*            datos.add (new Persona("José", 19));
            datos.add (new Persona("Maria", 21));
            datos.add (new Persona("Jesús", 33));
            datos.add (new Persona("Diana", 22));
  */          
        }
        
        public void agregarPersona(Persona p) {
        //Insert a BD
        PersonaDAO pdao=new PersonaDAO();
        datos.add(p);
        
        try {
            pdao.insertar(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
