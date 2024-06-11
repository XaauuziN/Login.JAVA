package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEmail;
	private JPasswordField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHome frame = new LoginHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\PRATICAS\\LOGIN\\Login\\src\\login\\login_icon.png"));
		setFont(new Font("Arial", Font.PLAIN, 18));
		setTitle("Login Screen");
		setForeground(new Color(0, 0, 128));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 642);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPassword = new JLabel("Your Password");
		lblPassword.setBounds(50, 273, 111, 14);
		contentPane.add(lblPassword);
		
		tfPassword = new JPasswordField();
		tfPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			lblPassword.setText("");
			}
		});
		tfPassword.setFont(new Font("Arial Black", Font.BOLD, 18));
		tfPassword.setHorizontalAlignment(SwingConstants.CENTER);
		tfPassword.setEchoChar('*');
		tfPassword.setBackground(new Color(204, 204, 204));
		tfPassword.setBounds(45, 255, 295, 45);
		contentPane.add(tfPassword);
		
		JButton btnEnter = new JButton("ENTRAR");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				
				home.setVisible(true);
				setVisible(false);
				
			}
		});
		btnEnter.setFont(new Font("Arial", Font.BOLD, 14));
		btnEnter.setBackground(new Color(204, 204, 204));
		btnEnter.setBounds(116, 470, 169, 45);
		contentPane.add(btnEnter);
		
		tfEmail = new JTextField();
		tfEmail.setEditable(false);
		tfEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			        tfEmail.setText("");
			        tfEmail.setEditable(true);
			}
		});
		tfEmail.setText("Your E-mail");
		tfEmail.setBackground(new Color(204, 204, 204));
		tfEmail.setBounds(45, 147, 295, 45);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel Background = new JLabel("New label");
		Background.setIcon(new ImageIcon("E:\\PRATICAS\\LOGIN\\Login\\src\\login\\background2.jpg"));
		Background.setBounds(0, 0, 395, 610);
		contentPane.add(Background);
	}
}
