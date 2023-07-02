/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author AD
 */
public class Danhmucchuyen {
    public String kind;
    private JLabel jbl;
    private JPanel jpn;

    public Danhmucchuyen(String kind, JLabel jbl, JPanel jpn) {
        this.kind = kind;
        this.jbl = jbl;
        this.jpn = jpn;
    }

    public Danhmucchuyen() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JLabel getJbl() {
        return jbl;
    }

    public void setJbl(JLabel jbl) {
        this.jbl = jbl;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }
    
}
