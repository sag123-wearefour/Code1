import static com.sun.glass.ui.Cursor.setVisible;
import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.*;
import javax.swing.*;

public class Panel extends JFrame
{
        private JSplitPane splitPaneV;
        private JSplitPane splitPaneH;
        private JPanel panel1;
        private JPanel panell2;
        private JPanel panell3;
        
        public Panel()
        {
            JFrame jf = new JFrame("P");
		jf.setVisible(true);
		jf.setBounds(200,300,400,350);
		jf.setBackground( Color.BLUE );

		JPanel panel = new JPanel();
		panel.setLayout( new BorderLayout() );
		jf.add( panel );

		// Create the panels
		createPanel1();
		createPanel2();
		createPanel3();
                
                splitPaneH=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
                panel.add(splitPaneH,BorderLayout.CENTER);
                splitPaneV = new JSplitPane( JSplitPane.VERTICAL_SPLIT );
		splitPaneV.setLeftComponent( panel1 );
		splitPaneV.setRightComponent( panell2 );

		splitPaneH.setLeftComponent( panell3 );
		splitPaneH.setRightComponent( splitPaneV );
        }

    private void createPanel1() {
      
        
        setSize(1100,710);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            JLabel jl = new JLabel();
        
            ImageIcon img = new ImageIcon(new ImageIcon("C:\\Users\\sagnik\\Desktop\\f.jpg").getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT));
                  jl.setIcon(img);
        
        add(jl,BorderLayout.CENTER);
      
    }

    private void createPanel2() {
            JPanel panel2 = new JPanel();
		panel2.setLayout( new FlowLayout() );

		panel2.add( new JButton( "Button 1" ) );
		panel2.add( new JButton( "Button 2" ) );
		panel2.add( new JButton( "Button 3" ) );
		panel2.add( new JButton( "Button 1" ) );
		panel2.add( new JButton( "Button 2" ) );
		panel2.add( new JButton( "Button 3" ) );
	}

    private void createPanel3() {
    
    }

}
    public static void main(String args[]){
        SwingUtilities.invokeLater()


          }
    
}
