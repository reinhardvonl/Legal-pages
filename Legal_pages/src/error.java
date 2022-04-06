import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class error extends JDialog {

	/**
	 * Launch the application.
	 * @param txt 
	 */
	public static void main(String[] args, String txt) {
		try {
			error dialog = new error(txt);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param txt 
	 */
	public error(String txt) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(new ActionListener() {
			private Legal win;

			public void actionPerformed(ActionEvent e) {
				win = new Legal();

			
				
				error.this.dispose();;
			}
		});
		ok.setBounds(166, 227, 89, 23);
		getContentPane().add(ok);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 414, 205);
		getContentPane().add(textPane);
		textPane.setText(txt);
		
	}

	
}
