package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JPanel {

	/**
	 * Create the panel.
	 */
	public Start() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Character a = new Character();
				add(a);
			}
		});
		button.setText("\u7EE7\u7EED");
		button.setFont(new Font("Dialog", Font.PLAIN, 24));
		button.setBorder(null);
		button.setBackground(new Color(219, 244, 249));
		button.setBounds(590, 300, 70, 29);
		layeredPane.add(button);
		
		JLabel label = new JLabel();
		label.setText("\u8FD9\u91CC\u5C06\u4F1A\u662F\u4F60\u672A\u6765\u56DB\u5E74\u594B\u6597\u7684\u5730\u65B9\uFF0C\u800C\u5173\u4E8E\u4F60\u7684\u6545\u4E8B");
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(330, 200, 590, 50);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u5C06\u5728\u6B64\u5F00\u5C55");
		label_1.setFont(new Font("Dialog", Font.BOLD, 24));
		label_1.setBounds(560, 250, 130, 40);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u4E2D\u5927\u5357\u65B9");
		label_2.setFont(new Font("Dialog", Font.BOLD, 24));
		label_2.setBounds(570, 160, 120, 50);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("\u7ECF\u8FC7\u4E8612\u5E74\u5BD2\u7A97\u82E6\u8BFB\uFF0C\u8DE8\u8FC7\u4E86\u9AD8\u8003\u8FD9\u9053\u574E\u7684\u4F60\uFF0C\u7EC8\u4E8E\u8003\u5230\u4E86");
		label_3.setFont(new Font("Dialog", Font.BOLD, 24));
		label_3.setBounds(300, 110, 660, 50);
		layeredPane.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setIcon(new ImageIcon(Start.class.getResource("/img/\u5927\u95E8.jpg")));
		label_4.setBackground(new Color(0, 102, 204));
		label_4.setBounds(0, 0, 1280, 960);
		layeredPane.add(label_4);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1280, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1280, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 963, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);

	}

}
