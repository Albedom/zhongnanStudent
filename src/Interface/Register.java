package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Code.All;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Register extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public Register() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u7528\u6237\u540D\uFF1A");
		label_1.setFont(new Font("Dialog", Font.BOLD, 36));
		label_1.setBounds(360, 290, 160, 70);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u6CE8\u518C");
		label_2.setForeground(new Color(51, 51, 51));
		label_2.setFont(new Font("Dialog", Font.BOLD, 60));
		label_2.setBounds(610, 170, 130, 90);
		layeredPane.add(label_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 247, 247));
		textField.setBounds(540, 300, 290, 50);
		layeredPane.add(textField);
		
		JLabel label_3 = new JLabel();
		label_3.setText("\u8F93\u5165\u5BC6\u7801\uFF1A");
		label_3.setFont(new Font("Dialog", Font.BOLD, 36));
		label_3.setBounds(320, 360, 190, 70);
		layeredPane.add(label_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(233, 247, 247));
		passwordField_1.setBounds(540, 370, 290, 50);
		layeredPane.add(passwordField_1);
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("«Î ‰»Î’À∫≈")) {
					   JOptionPane.showMessageDialog(null,"◊¢≤· ß∞‹");
				   } else	if(textField.getText().equals("")){
					   JOptionPane.showMessageDialog(null,"◊¢≤· ß∞‹£¨’À∫≈≤ªƒ‹Œ™ø’£°");
				   } else if(passwordField_1.getText().equals("")){
						   JOptionPane.showMessageDialog(null,"◊¢≤· ß∞‹£¨√‹¬Î≤ªƒ‹Œ™ø’£°");
				   } else if(!textField.getText().equals("«Î ‰»Î’À∫≈")){
					   if(!passwordField_1.getText().equals("«Î ‰»Î√‹¬Î")){
						   try {
							   int c = All.register(textField.getText(),passwordField_1.getText());
							   if (c == 1) {
								   panel.setVisible(false);
								   Login a = new Login();
								   add(a);
							   }
						   } catch (ClassNotFoundException e1) {
							   // TODO Auto-generated catch block
							   e1.printStackTrace();
						   } catch (SQLException e1) {
							   // TODO Auto-generated catch block
							   e1.printStackTrace();
							   JOptionPane.showMessageDialog(null," ˝æ›ø‚¡¨Ω” ß∞‹");
						   } catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					   }
				   }
			}
		});
		button_1.setText("\u6CE8\u518C");
		button_1.setForeground(new Color(0, 51, 102));
		button_1.setFont(new Font("Dialog", Font.BOLD, 24));
		button_1.setBorder(null);
		button_1.setBackground(new Color(195, 232, 250));
		button_1.setBounds(723, 448, 107, 29);
		layeredPane.add(button_1);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Login a = new Login();
				add(a);
			}
		});
		button.setText("\u5DF2\u6709\u8D26\u53F7");
		button.setForeground(new Color(0, 51, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 24));
		button.setBorder(null);
		button.setBackground(new Color(195, 232, 250));
		button.setBounds(540, 448, 107, 29);
		layeredPane.add(button);
		
		JLabel label_4 = new JLabel();
		label_4.setIcon(new ImageIcon(Register.class.getResource("/img/\u5934\u50CF.jpg")));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(882, 290, 140, 140);
		layeredPane.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setIcon(new ImageIcon(Register.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
		label_5.setBounds(30, 0, 1280, 960);
		layeredPane.add(label_5);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1282, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1330, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 961, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);

	}
}
