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
import javax.swing.JTextField;

import Code.All;
import Code.MusicPlay;
import Code.user;
import Server.DataConnect;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Register a = new Register();
				add(a);
			}
		});
		button_1.setText("\u5C1A\u672A\u6CE8\u518C");
		button_1.setForeground(new Color(0, 51, 102));
		button_1.setFont(new Font("Dialog", Font.BOLD, 24));
		button_1.setBorder(null);
		button_1.setBackground(new Color(195, 232, 250));
		button_1.setBounds(500, 440, 107, 29);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet ab;
				try {
					ab = DataConnect.login(textField.getText(),passwordField.getText());
				if(!textField.getText().equals("")&& !passwordField.getText().equals("")){
					if(ab.next()){
						System.out.println(ab);
					String name[] = new String[3];
					name = All.login(textField.getText(), passwordField.getText());
					if (name != null) {
						if(name[0] != null){
							panel.setVisible(false);
							FileIF a = new FileIF();
							add(a);
						} else {
							panel.setVisible(false);
							Start a = new Start();
							add(a);
						}
					                          } 
			                          }else
				JOptionPane.showMessageDialog(null, "用户名或密码错误！");      
				}else{
				JOptionPane.showMessageDialog(null, "用户名或密码不能为空！");
				}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "数据库未响应！");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setText("\u786E\u8BA4\u767B\u5F55");
		button_2.setForeground(new Color(0, 51, 102));
		button_2.setFont(new Font("Dialog", Font.BOLD, 24));
		button_2.setBorder(null);
		button_2.setBackground(new Color(195, 232, 250));
		button_2.setBounds(720, 440, 107, 29);
		layeredPane.add(button_2);
		
		JLabel label = new JLabel();
		label.setText("\u5BC6\u7801\uFF1A");
		label.setFont(new Font("Dialog", Font.BOLD, 36));
		label.setBounds(430, 330, 120, 70);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u8D26\u53F7\uFF1A");
		label_1.setFont(new Font("Dialog", Font.BOLD, 36));
		label_1.setBounds(430, 260, 120, 70);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u767B\u5F55");
		label_2.setFont(new Font("Dialog", Font.BOLD, 60));
		label_2.setBounds(580, 140, 130, 90);
		layeredPane.add(label_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 247, 247));
		textField.setBounds(570, 270, 290, 50);
		layeredPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(233, 247, 247));
		passwordField.setBounds(570, 340, 290, 50);
		layeredPane.add(passwordField);
		
		JLabel label_3 = new JLabel();
		label_3.setIcon(new ImageIcon(Login.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
		label_3.setBounds(14, 0, 1280, 960);
		layeredPane.add(label_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1278, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1282, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 961, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 961, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);

	}

}
