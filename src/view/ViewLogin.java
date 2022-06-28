package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
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
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(169, 81, 38, 14);
		frame.getContentPane().add(lblNewLabel);

		txtLogin = new JTextField();
		txtLogin.setBounds(169, 106, 215, 31);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(169, 155, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(169, 180, 215, 31);
		frame.getContentPane().add(txtSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {

					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!");

				} else {

					JOptionPane.showMessageDialog(null, "Dados inválidos!", "Meu título", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnEntrar.setBounds(234, 258, 89, 36);
		frame.getContentPane().add(btnEntrar);
	}

	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("123");
	}

}
