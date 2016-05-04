package org.erc.xlstowiki;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField txtFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFile = new JLabel("File");
		lblFile.setBounds(20, 11, 79, 14);
		frame.getContentPane().add(lblFile);
		
		txtFile = new JTextField();
		txtFile.setEditable(false);
		txtFile.setBounds(109, 8, 230, 20);
		frame.getContentPane().add(txtFile);
		txtFile.setColumns(10);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		btnLoad.setBounds(345, 7, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JPanel pnlOptions = new JPanel();
		pnlOptions.setBounds(10, 36, 424, 225);
		frame.getContentPane().add(pnlOptions);
		pnlOptions.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sheet");
		lblNewLabel.setBounds(10, 11, 78, 14);
		pnlOptions.add(lblNewLabel);
		
		JComboBox cmbSheet = new JComboBox();
		cmbSheet.setBounds(98, 8, 226, 20);
		pnlOptions.add(cmbSheet);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		btnConvert.setBounds(334, 7, 89, 23);
		pnlOptions.add(btnConvert);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 36, 413, 178);
		pnlOptions.add(textPane);
	}
}
