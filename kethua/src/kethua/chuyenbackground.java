/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author AD
 */
public class chuyenbackground {
    private JPanel root;
    private String kinSelected =" ";
    private List<Danhmucchuyen> listItem = null;
    public chuyenbackground(JPanel root){
        this.root = root;
    }
    public void Setview(JPanel JfrItem, JLabel jlbItem)
    {
        kinSelected = "QLySinhvien";
        JfrItem.setLayout(new BorderLayout());
        root.removeAll();
        root.add(new Panelngul());
        root.validate();
        root.repaint();
    }
    public void SetEvent(List<Danhmucchuyen> listItem){
        this.listItem = listItem;
        for(Danhmucchuyen Dm: listItem){
            Dm.getJbl().addMouseListener(new LabelEvent(Dm.getKind(), Dm.getJpn(),Dm.getJbl()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel JpnItem;
        private JLabel JlbItem;

        public LabelEvent(String kind, JPanel JpnItem, JLabel JlbItem) {
            this.kind = kind;
            this.JpnItem = JpnItem;
            this.JlbItem = JlbItem;
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "Thongke":
                   node = new Panelngul();
                  break;
                case "GioHang":
                   node = new Panelngul2();
                   break;
                default:
                    node = new Panelngul();
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            SetchangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kinSelected = kind;
           JpnItem.setBackground(Color.red);
           JlbItem.setBackground(Color.red);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JpnItem.setBackground(Color.red);
            JlbItem.setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(kinSelected.equalsIgnoreCase(kind)){
                 JpnItem.setBackground(Color.BLUE);
                 JlbItem.setBackground(Color.BLUE);
            }
        }
        private void SetchangeBackground(String kind)
        {
            for(Danhmucchuyen item: listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJbl().setBackground(Color.red);
                    item.getJpn().setBackground(Color.red);
                }
                else{
                    item.getJbl().setBackground(Color.BLUE);
                    item.getJpn().setBackground(Color.BLUE);
                }
            }
        }
    }
}
