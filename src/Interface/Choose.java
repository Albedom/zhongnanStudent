package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Choose extends JPanel {

	/**
	 * Create the panel.
	 */
	public Choose() {
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel label = new JLabel();
		label.setText("\u5C5E\u6027");
		label.setBounds(750, 550, 200, 40);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u5C5E\u6027");
		label_1.setBounds(750, 500, 200, 40);
		layeredPane.add(label_1);
		
		JButton button = new JButton();
		button.setText("\u5B8C\u6210");
		button.setForeground(new Color(0, 51, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 36));
		button.setBorder(null);
		button.setBackground(new Color(195, 232, 250));
		button.setBounds(490, 650, 107, 40);
		layeredPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.setText("\u653E\u5F03");
		button_1.setForeground(new Color(0, 51, 102));
		button_1.setFont(new Font("Dialog", Font.BOLD, 36));
		button_1.setBorder(null);
		button_1.setBackground(new Color(195, 232, 250));
		button_1.setBounds(700, 650, 107, 40);
		layeredPane.add(button_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u4EFB\u52A1\u5185\u5BB9\u4EFB\u52A1\u5185\u5BB9\u4EFB\u52A1\u5185\u5BB9");
		label_2.setBounds(400, 440, 290, 60);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("\u4EFB\u52A1\u65F6\u95F4\u4EFB\u52A1\u65F6\u95F4\u4EFB\u52A1\u65F6\u95F4");
		label_3.setBounds(400, 570, 290, 60);
		layeredPane.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("\u5C5E\u6027");
		label_4.setBounds(750, 450, 200, 40);
		layeredPane.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setText("\u4EFB\u52A1\u65F6\u95F4");
		label_5.setFont(new Font("Dialog", Font.BOLD, 36));
		label_5.setBounds(390, 510, 160, 70);
		layeredPane.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("\u5177\u4F53\u5206\u503C");
		label_6.setFont(new Font("Dialog", Font.BOLD, 36));
		label_6.setBounds(760, 380, 160, 70);
		layeredPane.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setText("\u4EFB\u52A1\u5185\u5BB9");
		label_7.setFont(new Font("Dialog", Font.BOLD, 36));
		label_7.setBounds(390, 370, 160, 70);
		layeredPane.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setIcon(new ImageIcon(Choose.class.getResource("/img/\u4FE1\u606F2.jpg")));
		label_8.setBounds(0, 0, 1280, 960);
		layeredPane.add(label_8);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1279, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1279, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 962, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 962, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);

	}

}
