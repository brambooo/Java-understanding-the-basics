package table;

import javax.swing.JFrame;

/**
 * DefaultTableModel is contains all the data of the table and is used to put
 * all the data on a JTable So a JTable self don't contain any items
 * 
 * @author Bram
 *
 */

public class Main extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PanelWithTable panelWithTable = new PanelWithTable();
		frame.setTitle("JTable and DefaultTableModel");
		frame.setContentPane(panelWithTable);
		frame.setSize(400, 250);
		frame.setVisible(true);

	}
}
