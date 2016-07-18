package table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Customer {
	String name;
	int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + age;
	}
}

public class PanelWithTable extends JPanel{
	// Attributes
	private static JTable table;
	private static DefaultTableModel model;
	private JPanel panel;

	public PanelWithTable() {
		panel = new JPanel(new BorderLayout(0, 0));
		panel.setBackground(Color.YELLOW);

		// Create a new customer
		Customer c = new Customer("Bram", 22);

		// Instantiate table and model
		table = new JTable();
		model = new DefaultTableModel();
		
		table.setModel(model);

		// Add titles to model
		model.addColumn("Column 1");
		model.addColumn("Column 2");

		// Like this way we can add objects in a row
		model.addRow(new Object[] { c.name, c.age });
		model.addRow(new Object[] { c.name, c.age  });
		model.addRow(new Object[] { c.name, c.age  });
		
		// Now we first add the panel
		add(panel);
		// add table to the panel
		panel.add(table, BorderLayout.CENTER);
	}

}
