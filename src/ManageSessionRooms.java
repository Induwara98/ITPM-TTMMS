import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManageSessionRooms {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageSessionRooms window = new ManageSessionRooms();
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
	public ManageSessionRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 0, 250, 661);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("Back");
		button.setBounds(69, 11, 89, 23);
		panel.add(button);
		
		JLabel lblManageSesssion = new JLabel("Manage Sesssion Rooms");
		lblManageSesssion.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblManageSesssion.setBounds(262, 30, 381, 37);
		frame.getContentPane().add(lblManageSesssion);
		
		JLabel lblSelectYear = new JLabel("Select Year");
		lblSelectYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelectYear.setBounds(344, 97, 181, 28);
		frame.getContentPane().add(lblSelectYear);
		
		JLabel lblSelectFaculty = new JLabel("Select Faculty");
		lblSelectFaculty.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelectFaculty.setBounds(576, 97, 181, 28);
		frame.getContentPane().add(lblSelectFaculty);
		
		JLabel lblSelectFaculty_1 = new JLabel("Select Session");
		lblSelectFaculty_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelectFaculty_1.setBounds(801, 97, 181, 28);
		frame.getContentPane().add(lblSelectFaculty_1);
		
		JLabel lblSelectRoomFor = new JLabel("Select Room For Selected Session");
		lblSelectRoomFor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelectRoomFor.setBounds(585, 241, 263, 28);
		frame.getContentPane().add(lblSelectRoomFor);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLocation.setBounds(275, 368, 181, 28);
		frame.getContentPane().add(lblLocation);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(1017, 131, 119, 37);
		frame.getContentPane().add(btnView);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(310, 138, 156, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(542, 138, 156, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(777, 138, 156, 22);
		frame.getContentPane().add(comboBox_1_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(310, 173, 239, 89);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(826, 244, 156, 22);
		frame.getContentPane().add(comboBox_1_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(638, 295, 119, 37);
		frame.getContentPane().add(btnClear);
		
		JButton btnView_1_1 = new JButton("Submit");
		btnView_1_1.setBounds(852, 295, 119, 37);
		frame.getContentPane().add(btnView_1_1);
		
		JButton btnView_1_1_1 = new JButton("Refresh");
		btnView_1_1_1.setBounds(942, 424, 119, 37);
		frame.getContentPane().add(btnView_1_1_1);
	}

}
