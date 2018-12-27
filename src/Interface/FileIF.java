package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Code.user;
import Server.DataConnect;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class FileIF extends JPanel {
	private static JButton button_1;
	private static JButton button_2;
	private static JButton button_3;
	/**
	 * Create the panel.
	 */
	public FileIF() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"你的人生已经开始了，怎能返回！");
				
			}
		});
		button.setText("\u8FD4\u56DE");
		button.setFont(new Font("Dialog", Font.PLAIN, 24));
		button.setBackground(new Color(191, 221, 233));
		button.setBounds(30, 140, 90, 37);
		layeredPane.add(button);
		
		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_1.getText() == null) {
					panel.setVisible(false);
					Character a = new Character();
					add(a);
				} else {
					String name = button_1.getText().toString();
					user.setChoosename(name);
					panel.setVisible(false);
					InterFace a = new InterFace();
					add(a);
				}
			}
		});
		button_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_1.setBackground(new Color(191, 221, 233));
		button_1.setBounds(313, 380, 200, 37);
		layeredPane.add(button_1);
		
		button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_2.getText() == null) {
					panel.setVisible(false);
					Character a = new Character();
					add(a);
				} else {
					String name = button_2.getText().toString();
					user.setChoosename(name);
					panel.setVisible(false);
					InterFace a = new InterFace();
					add(a);
				};
			}
		});
		button_2.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_2.setBackground(new Color(191, 221, 233));
		button_2.setBounds(314, 447, 199, 37);
		layeredPane.add(button_2);
		
		button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_3.getText() == null) {
					panel.setVisible(false);
					Character a = new Character();
					add(a);
				} else {
					String name = button_3.getText().toString();
					user.setChoosename(name);
					panel.setVisible(false);
					InterFace a = new InterFace();
					add(a);
				}
			}
		});
		button_3.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_3.setBackground(new Color(191, 221, 233));
		button_3.setBounds(313, 504, 200, 37);
		layeredPane.add(button_3);
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u9009\u62E9");
		label_1.setFont(new Font("Dialog", Font.BOLD, 36));
		label_1.setBounds(300, 280, 90, 50);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u89D2\u82721\uFF1A");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_2.setBounds(230, 380, 90, 30);
		layeredPane.add(label_2);
		
		JLabel label = new JLabel();
		label.setText("\u89D2\u82722\uFF1A");
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(230, 447, 90, 30);
		layeredPane.add(label);
		
		JLabel label_4 = new JLabel();
		label_4.setText("\u89D2\u82723\uFF1A");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_4.setBounds(230, 511, 90, 30);
		layeredPane.add(label_4);
		
		JLabel label_3 = new JLabel();
		label_3.setIcon(new ImageIcon(FileIF.class.getResource("/img/\u6811.png")));
		label_3.setBounds(0, -11, 1280, 910);
		layeredPane.add(label_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1281, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 909, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		Show();
	}
	
	private void Show() {
		String name[] = new String[3];
		name = user.getName();
		for (int i = 0; i < 3; i ++){
			System.out.println(name[i]);
		}
		button_1.setText(name[0]);
		button_2.setText(name[1]);
		button_3.setText(name[2]);
	} 
}
