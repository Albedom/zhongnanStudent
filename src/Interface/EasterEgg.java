package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import Code.All;
import Code.user;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class EasterEgg extends JPanel {
	private static JLabel lblNewLabel;
	/**
	 * Create the panel.
	 */
	public EasterEgg() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Login L = new Login();
				add(L);
		}
		});
		button.setText("\u786E\u5B9A");
		button.setForeground(new Color(0, 51, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 36));
		button.setBorder(null);
		button.setBackground(new Color(195, 232, 250));
		button.setBounds(580, 590, 107, 40);
		layeredPane.add(button);
		
		JLabel label = new JLabel();
		label.setText("\u7ED3\u5C40");
		label.setFont(new Font("Dialog", Font.PLAIN, 48));
		label.setBounds(580, 280, 100, 80);
		layeredPane.add(label);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1249, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1249, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 959, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 959, GroupLayout.PREFERRED_SIZE)
		);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(492, 400, 282, 153);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(EasterEgg.class.getResource("/img/\u9E45\u9EC4.jpg")));
		lblNewLabel_1.setBounds(453, 373, 352, 204);
		layeredPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel();
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(EasterEgg.class.getResource("/img/\u4FE1\u606F2.jpg")));
		label_1.setBounds(-30, 0, 1280, 960);
		layeredPane.add(label_1);
		panel.setLayout(gl_panel);
		try {
			value();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void value() throws ClassNotFoundException, IOException {
		lblNewLabel.setText("<html>" + All.decideend(user.getEndding()) + "</html>");
	}
}
