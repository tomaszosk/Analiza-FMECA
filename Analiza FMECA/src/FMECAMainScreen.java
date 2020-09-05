import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.Panel;

public class FMECAMainScreen {

	private JFrame frame;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMECAMainScreen window = new FMECAMainScreen();
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
	public FMECAMainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAMIR Sp. z o.o.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(6, 6, 165, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Szacowanie ryzyka procesu produkcyjnego metodą FMECA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(6, 50, 738, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Więcej informacji o tej metodzie:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(440, 117, 191, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("www");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://mfiles.pl/pl/index.php/Analiza_FMEA"));
				}
				catch(IOException error) {
					
				}
				catch(URISyntaxException error) {
					
				}
			}
		});
		btnNewButton.setBounds(642, 111, 70, 29);
		frame.getContentPane().add(btnNewButton);
		
		Object[] columns = {"L.p.","Podmiot","Rodzaj wady","Przyczyna","Skutek","Ryzyko wystąpienia wady","Znaczenie Wady","Możliwość wykrycia","Wskaźnik priorytetowy RxZxW","Zalecane działanie","Osoba odpowiedzialna","Ryzyko wystąpienia po naprawie","Znaczenie wady po naprawie","Możliwość wykrycia po naprawie","Wskaźnik priorytetowy RxZxW","Poprawa wskaźnika po zaleconych działaniach"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 730, 200);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
//		ScrollPane scrollPane = new ScrollPane();
//		scrollPane.setBounds(10, 150, 730, 263);
//		frame.getContentPane().add(scrollPane);
//		g.draw
	}
	
	public void paint(Graphics g) {
		g.drawLine(150, 150, 350, 200);
	}
}
