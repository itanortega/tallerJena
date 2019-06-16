
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Hashtable;


import javax.swing.*;
/**
 *
 * @author io
 */
public class RenderLista extends JLabel implements ListCellRenderer{
    
    public static int _LOAD = 1;
    public static int _Ok = 2;
    public static int _KO = 3;
    
 
    ImageIcon iOk = new ImageIcon(this.getClass().getResource("/iconos/ok.png"));
    ImageIcon iError = new ImageIcon(this.getClass().getResource("/iconos/error.png"));
    ImageIcon iCargando = new ImageIcon(this.getClass().getResource("/iconos/cargando.png"));
    int[] iconos;

    RenderLista(int[] iconos) {
        this.iconos = iconos;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(iconos[index] == 1) {
            setIcon(iCargando);
        }
        if(iconos[index] == 2) {
            setIcon(iOk);
        }
        if(iconos[index] == 3) {
            setIcon(iError);
        }
        setText(""+value);
        if(isSelected){
            setFont(new Font("Verdana",Font.BOLD,16));
        }else{
            setFont(null);
        }  
        return this;
    }
}
