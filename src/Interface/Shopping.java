package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.All;
import Code.user;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Toolkit;

public class Shopping extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shopping frame = new Shopping();
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
	public Shopping() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Shopping.class.getResource("/img/\u56FE\u6807.png")));
		setResizable(false);
		setTitle("\u5546\u5E97");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(221, 221, 251));
		layeredPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setBounds(180, 30, 190, 50);
		label.setText("\u4E2D\u5357\u5F0F\u5546\u5E97");
		label.setForeground(new Color(51, 51, 51));
		label.setFont(new Font("Dialog", Font.BOLD, 36));
		layeredPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("2\u5143\u5F69\u7968");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					lottery(1);
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
		});
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(154, 185, 87, 50);
		layeredPane.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("5\u5143\u5F69\u7968");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					lottery(2);
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
		});
		label_2.setBounds(257, 185, 87, 50);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel("10\u5143\u5F69\u7968");
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					lottery(3);
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
		});
		label_3.setBounds(362, 185, 94, 50);
		layeredPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u4E66\u672C");
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					commodity(1);
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
		});
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(154, 312, 62, 50);
		layeredPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u5C0F\u8BF4");
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					commodity(2);
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
		});
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(257, 312, 62, 50);
		layeredPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u5065\u8EAB\u5668\u6750");
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					commodity(3);
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
		});
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(348, 312, 87, 50);
		layeredPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u793C\u7269");
		label_7.setFont(new Font("宋体", Font.PLAIN, 20));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(154, 417, 62, 50);
		layeredPane.add(label_7);
		
		JLabel lblNewLabel_3 = new JLabel("\u5F69\u7968\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(125, 167, 72, 18);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("\u4E00\u5F8B20\u5143\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(125, 273, 116, 26);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("\u4E00\u5F8B15\u5143\uFF1A");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(125, 372, 105, 35);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(113, 132, 343, 412);
		lblNewLabel.setIcon(new ImageIcon(Shopping.class.getResource("/img/\u9E45\u9EC4.jpg")));
		layeredPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(0, 0, 550, 733);
		label_1.setIcon(new ImageIcon(Shopping.class.getResource("/img/\u6559\u9633.jpg")));
		label_1.setForeground(new Color(102, 102, 102));
		layeredPane.add(label_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 547, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 731, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
		);
		panel_1.setLayout(gl_panel_1);
	}
	
	public void commodity(int number) throws ClassNotFoundException, SQLException, IOException {
		int money = All.money(user.getChoosename());
		int IQ = 0, EQ = 0, power = 0;
		int a = 0;
		if (money < 20 ) {
			JOptionPane.showMessageDialog(null,"你的金钱不够!");
		} else {
			if (number == 1) {
				money = money - 20;
				IQ = All.book();
				All.IQ(user.getChoosename(), IQ);
				InterFace.label_19.setText(IQ+"");			
			}
			if (number == 2) {
				money = money - 20;
				EQ = All.novel();
				All.EQ(user.getChoosename(), EQ);
				InterFace.label_20.setText(EQ + "");
			}
			if (number == 3) {
				money = money - 20;
				power = All.exercise();
				All.power(user.getChoosename(), power);
				InterFace.label_21.setText(power + "");
			}
		}
		InterFace.label_22.setText(money + "");
		All.money(user.getChoosename(),money);
	}
	
	public void lottery(int number) throws ClassNotFoundException, SQLException, IOException {
		int money = All.money(user.getChoosename());
		int a = 0;
		if (number == 1) {
			if (money < 2) {
				JOptionPane.showMessageDialog(null,"你的金钱不够!");
			} else {
				money = money - 2 + All.lotterytwo();
				InterFace.label_22.setText(money + "");
			}
		} else if (number == 2) {
			if (money < 5) {
				JOptionPane.showMessageDialog(null,"你的金钱不够!");
			} else {
				money = money - 5 + All.lotteryfive();
				InterFace.label_22.setText(money + "");
			}
		} else if (number == 3) {
			if (money < 10) {
				JOptionPane.showMessageDialog(null,"你的金钱不够!");
			} else {
				money = money - 10 + All.lotteryten();
				InterFace.label_22.setText(money + "");
			}
		}
		All.money(user.getChoosename(),money);
	}
}
