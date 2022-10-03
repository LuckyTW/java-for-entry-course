import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel lblSize, lblBev, lblGlass, lblReport;
    private JComboBox<String> size;
    private JRadioButton rdJuice, rdWater, rdTea, rdCoffee;
    private ButtonGroup btnGroup;
    private JTextField txtGlass;
    private JButton bntAdd, bntOrder;
    int amount_of;

    public Label() {
        setLayout(null);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Order");
        init();
        bntAdd.addActionListener(this);
        bntOrder.addActionListener(this);
        setVisible(true);
    }

    public void init(){
        lblSize = new JLabel("Select Size");
        lblSize.setSize(250, 50);
        lblSize.setLocation(100, 10);
        add(lblSize);

        String[] sizes = {"Small", "Medium", "Large"};
        size = new JComboBox<String>(sizes);
        size.setSelectedIndex(0); // default small
        size.setSize(100, 25);
        size.setLocation(100, 50);
        add(size);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
