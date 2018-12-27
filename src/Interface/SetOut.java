package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.MusicPlay;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SetOut extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlay.playMusic(1);
					SetOut frame = new SetOut();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SetOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SetOut.class.getResource("/img/\u56FE\u6807.png")));
		setResizable(false);
		setBounds(100, 100, 1280, 960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel label = new JLabel();
		label.setText("\u4E2D\u5357\u5F0F\u5B66\u751F");
		label.setForeground(new Color(51, 51, 51));
		label.setFont(new Font("Dialog", Font.BOLD, 60));
		label.setBounds(460, 100, 320, 90);
		layeredPane.add(label);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Register a = new Register();
				setContentPane(a);
				validate();
			}
		});
		button.setText("\u6CE8\u518C");
		button.setForeground(new Color(0, 51, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 24));
		button.setBorder(null);
		button.setBackground(new Color(195, 232, 250));
		button.setBounds(490, 220, 107, 33);
		layeredPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Login a = new Login();
				setContentPane(a);
				validate();
			}
		});
		button_1.setText("\u767B\u5F55");
		button_1.setForeground(new Color(0, 51, 102));
		button_1.setFont(new Font("Dialog", Font.BOLD, 24));
		button_1.setBorder(null);
		button_1.setBackground(new Color(195, 232, 250));
		button_1.setBounds(650, 220, 107, 30);
		layeredPane.add(button_1);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon(SetOut.class.getResource("/img/\u5927\u95E8.jpg")));
		label_1.setBounds(0, 0, 1280, 960);
		layeredPane.add(label_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1295, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1281, GroupLayout.PREFERRED_SIZE)
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
