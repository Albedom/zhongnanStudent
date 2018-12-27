package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Shop extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shop() {
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(221, 221, 251));
		
		JButton button = new JButton();
		button.setText("\u8FD4\u56DE");
		button.setFont(new Font("Dialog", Font.PLAIN, 24));
		button.setBackground(new Color(252, 252, 234));
		button.setBounds(420, 670, 110, 37);
		layeredPane.add(button);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.setBackground(new Color(250, 250, 235));
		tabbedPane.setBounds(60, 240, 430, 410);
		layeredPane.add(tabbedPane);
		
		JLabel label = new JLabel();
		label.setText("\u4E2D\u5357\u5F0F\u5546\u5E97");
		label.setForeground(new Color(51, 51, 51));
		label.setFont(new Font("Dialog", Font.BOLD, 36));
		label.setBounds(180, 30, 190, 50);
		layeredPane.add(label);
		
		JButton button_1 = new JButton();
		button_1.setBackground(new Color(254, 254, 240));
		button_1.setBounds(150, 100, 260, 120);
		layeredPane.add(button_1);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon(Shop.class.getResource("/img/\u6559\u9633.jpg")));
		label_1.setForeground(new Color(102, 102, 102));
		label_1.setBounds(0, 0, 550, 733);
		layeredPane.add(label_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 547, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 731, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);

	}

}
