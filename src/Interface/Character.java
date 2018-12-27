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
import Code.user;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Character extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Character() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "创建角色失败，名字不能为空");
				} else {
					String name = textField.getText();
					try {
						int num = All.registerperson(name, user.getUid());
						if (num == 1) {
							return;
						}
						All.registerloverlist(name);
						JOptionPane.showMessageDialog(null, "创建角色成功");
						panel.setVisible(false);
						FileIF a = new FileIF();
						add(a);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		button.setText("\u786E\u5B9A");
		button.setFont(new Font("Dialog", Font.PLAIN, 24));
		button.setBackground(new Color(191, 221, 233));
		button.setBounds(410, 770, 100, 37);
		layeredPane.add(button);
		
		JLabel label = new JLabel();
		label.setText("\u8F93\u5165\u6635\u79F0\uFF1A");
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(120, 770, 120, 30);
		layeredPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 24));
		textField.setBounds(250, 770, 140, 35);
		layeredPane.add(textField);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon(Character.class.getResource("/img/\u68112.jpg")));
		label_1.setBounds(0, 0, 1280, 960);
		layeredPane.add(label_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1277, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 1277, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 960, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);

	}

}
