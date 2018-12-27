package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Code.All;
import Code.MusicPlay;
import Code.user;
import Server.Client;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.UnknownHostException;

public class InterFace extends JPanel {
	public static JLabel label_18;
	public static JLabel label_19;
	public static JLabel label_20;
	public static JLabel label_21;
	public static JLabel label_22;
	public static JLabel label_23;
	public static JLabel label_26;
	public static JLabel lblNewLabel;
	public static JLabel lblNewLabel_1;
	public static JLabel lblNewLabel_2;
	public static JLabel label_16;
	public static JButton button_3;
	public static JButton button_4;
	public static JButton button_5;
	public static JButton button_9;
	public static JButton button_10;
	private static JPanel panel;
	private static int IQ;
	private static int EQ;
	private static int power;
	private static int money;
	

	/**
	 * Create the panel.
	 */
	public InterFace() {	
		panel = new JPanel();
		add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				Login a = new Login();
				add(a);
				
			}
		});
		button_2.setText("\u9000\u51FA\u767B\u5F55");
		button_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		button_2.setBorder(null);
		button_2.setBackground(new Color(252, 252, 208));
		button_2.setBounds(110, 830, 105, 20);
		layeredPane.add(button_2);
		
		JLabel label = new JLabel();
		label.setText("\u5E74\u7EA7\uFF1A");
	
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(210, 160, 82, 29);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("\u6635\u79F0\uFF1A");
	
		label_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_1.setBounds(210, 110, 82, 29);
		layeredPane.add(label_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBackground(new Color(172, 220, 251));
		layeredPane_1.setBounds(940, 375, 290, 402);
		layeredPane.add(layeredPane_1);
		
		button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4F11\u606F.jpg")));
				if (button_3.getText().equals("休息(无)")) {
					
					 JOptionPane.showMessageDialog(null,"啊舒服了！");
					 int b = user.getActionpoints();
					 b = b - 1;
					 user.setActionpoints(b);
					 label_26.setText(b + "");
					 try {
						take();
						time(user.getActionpoints(), user.getTimenumber());
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
				} else if (button_3.getText().equals("体育赛事(体钱)")){
					label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
					power = Integer.valueOf(label_21.getText()) + 35;
					power = moodinfluence(user.getMood(), power);
					money = Integer.valueOf(label_22.getText()) + 14;
					label_20.setText(power + "");
					label_22.setText(money + "");
					int a = user.getMoodmath();
					a = a - 20;
					try {
						if (All.judemood(a) == 0) {
							panel.setVisible(false);
							Login L = new Login();
							add(L);
						}
					} catch (UnknownHostException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					user.setMoodmath(a);
					int b = user.getActionpoints();
					b = b - 1;
					user.setActionpoints(b);
					try {
						ending();
						try {
							All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
							label_26.setText(b + "");
							label_23.setText(All.moodlevel(user.getMood()));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
					try {
						change(3, label_21);
						take();
						ending();
						time(user.getActionpoints(), user.getTimenumber());
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
		button_3.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_3.setBorder(null);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(40, 226, 200, 40);
		layeredPane_1.add(button_3);
		
		button_4 = new JButton();
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!button_4.getText().equals("----------")) {
					label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u6253\u5DE5.jpg")));
					try {
						change(4, label_22);
						take();
						ending();
						time(user.getActionpoints(), user.getTimenumber());
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
		button_4.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(40, 279, 200, 40);
		layeredPane_1.add(button_4);
		
		button_5 = new JButton();
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (button_5.getText().equals("打工(钱)")) {
						money = Integer.valueOf(label_22.getText()) + 4;
						label_22.setText(money + "");
						int b = user.getActionpoints();
						b = b - 1;
						user.setActionpoints(b);
						label_26.setText(b + "");
						label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u6253\u5DE5.jpg")));
						try {
							take();
							time(user.getActionpoints(), user.getTimenumber());
							All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
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
					} else if (button_5.getText().equals("打散工(情钱)")){
						label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u6253\u5DE5.jpg")));
						EQ = Integer.valueOf(label_20.getText()) + 35;
						EQ = moodinfluence(user.getMood(), EQ);
						money = Integer.valueOf(label_22.getText()) + 14;
						label_20.setText(EQ + "");
						label_22.setText(money + "");
						int a = user.getMoodmath();
						a = a - 20;
						try {
							if (All.judemood(a) == 0) {
								panel.setVisible(false);
								Login L = new Login();
								add(L);
							}
						} catch (UnknownHostException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						};
						user.setMoodmath(a);
						int b = user.getActionpoints();
						b = b - 1;
						user.setActionpoints(b);
						try {
							ending();
							All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
							label_26.setText(b + "");
							label_23.setText(All.moodlevel(user.getMood()));
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} else {
						label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
						try {
							change(2, label_20);
							take();
							ending();
							time(user.getActionpoints(), user.getTimenumber());
							All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
							label_23.setText(All.moodlevel(user.getMood()));
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
		button_5.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_5.setBorder(null);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(40, 173, 200, 40);
		layeredPane_1.add(button_5);
		
		button_9 = new JButton();
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_9.getText().equals("军训(智情体)")) {
					IQ = Integer.valueOf(label_19.getText()) + 3;
					EQ = Integer.valueOf(label_20.getText()) + 3;
					power = Integer.valueOf(label_21.getText()) + 4;
					label_19.setText(IQ + "");
					label_20.setText(EQ + "");
					label_21.setText(power + "");
					int b = user.getActionpoints();
					b = b - 1;
					user.setActionpoints(b);
					label_26.setText(b + "");
					try {
						take();
						time(user.getActionpoints(), user.getTimenumber());
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
				} else if (button_9.getText().equals("家教(智钱)")){
					IQ = Integer.valueOf(label_19.getText()) + 35;
					IQ = moodinfluence(user.getMood(), IQ);
					money = Integer.valueOf(label_22.getText()) + 14;
					label_19.setText(IQ + "");
					label_22.setText(money + "");
					int a = user.getMoodmath();
					a = a - 20;
					try {
						if (All.judemood(a) == 0) {
							panel.setVisible(false);
							Login L = new Login();
							add(L);
						}
					} catch (UnknownHostException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					};
					user.setMoodmath(a);
					int b = user.getActionpoints();
					b = b - 1;
					user.setActionpoints(b);
					label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u6253\u5DE5.jpg")));
					try {
						ending();
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_26.setText(b + "");
						label_23.setText(All.moodlevel(user.getMood()));
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} else {
					try {
						change(1, label_19);
						take();
						ending();
						time(user.getActionpoints(), user.getTimenumber());
						label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
		button_9.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_9.setBorder(null);
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(40, 120, 200, 40);
		layeredPane_1.add(button_9);
		
		button_10 = new JButton();
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4F11\u606F.jpg")));
				if (button_10.getText().equals("假期休息(心情)")) {
					int a = user.getMoodmath();
					a = a + 20;
					if (a > 100) {
						a = 100;
					}
					try {
						if (All.judemood(a) == 0) {
							panel.setVisible(false);
							Login L = new Login();
							add(L);
						}
					} catch (UnknownHostException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					};
					user.setMoodmath(a);
					int b = user.getActionpoints();
					b = b - 1;
					user.setActionpoints(b);
					label_26.setText(b + "");
					try {
						take();
						ending();
						time(user.getActionpoints(), user.getTimenumber());
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
				} else {
					int a = user.getMoodmath();
					a = a + 10;
					if (a > 100) {
						a = 100;
					}
					try {
						if (All.judemood(a) == 0) {
							panel.setVisible(false);
							Login L = new Login();
							add(L);
						}
					} catch (UnknownHostException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					};
					user.setMoodmath(a);
					int b = user.getActionpoints();
					b = b - 1;
					user.setActionpoints(b);
					label_26.setText(b + "");
					try {
						take();
						ending();
						time(user.getActionpoints(), user.getTimenumber());
						All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
						label_23.setText(All.moodlevel(user.getMood()));
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
		button_10.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_10.setBorder(null);
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(40, 332, 200, 40);
		layeredPane_1.add(button_10);
		
		JLabel label_2 = new JLabel();
		label_2.setText("\u5F85\u6267\u884C\u4EFB\u52A1");
		label_2.setFont(new Font("Dialog", Font.BOLD, 24));
		label_2.setBounds(80, -62, 140, -1);
		layeredPane_1.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("\u6682\u65E0\u66F4\u591A");
		label_3.setForeground(new Color(204, 204, 204));
		label_3.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_3.setBounds(100, 268, 100, -1);
		layeredPane_1.add(label_3);
		
		JLabel label_24 = new JLabel();
		label_24.setText("\u4EFB\u52A1\u5217\u8868");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Dialog", Font.BOLD, 24));
		label_24.setBounds(40, 76, 195, 31);
		layeredPane_1.add(label_24);
		
		JLabel label_25 = new JLabel();
		label_25.setText("\u5269\u4F59\u884C\u52A8\u70B9\uFF1A");
		label_25.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_25.setBounds(30, 34, 144, 29);
		layeredPane_1.add(label_25);
		
		label_26 = new JLabel("");
		label_26.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_26.setBounds(178, 34, 98, 29);
		layeredPane_1.add(label_26);
		
		JLabel label_4 = new JLabel();
		label_4.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u9E45\u9EC4.jpg")));
		label_4.setBounds(0, 0, 304, 402);
		layeredPane_1.add(label_4);
		
		JButton button_6 = new JButton();
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chatroom a = new Chatroom();
				a.setVisible(true);
				a.setLocationRelativeTo(null);
			}
		});
		button_6.setIcon(new ImageIcon(InterFace.class.getResource("/img/34.png")));
		button_6.setText("\u793E\u4EA4");
		button_6.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_6.setBorder(null);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(1100, 820, 130, 40);
		layeredPane.add(button_6);
		
		JButton button_7 = new JButton();
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shopping a = new Shopping();
				a.setVisible(true);
				a.setLocationRelativeTo(panel);
			}
		});
		button_7.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u5546\u5E97.jpg")));
		button_7.setText("\u5546\u5E97");
		button_7.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_7.setBorder(null);
		button_7.setBackground(Color.WHITE);   
		button_7.setBounds(930, 820, 130, 40);
		layeredPane.add(button_7);
		
		JLabel label_5 = new JLabel();
		label_5.setIcon(new ImageIcon(InterFace.class.getResource("/img/734.jpg")));
		label_5.setBounds(80, 830, 20, 20);
		layeredPane.add(label_5);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setText(user.getChoosename());
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel.setBounds(285, 110, 98, 29);
		layeredPane.add(lblNewLabel);
		
		label_18 = new JLabel("");
		label_18.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_18.setBounds(285, 160, 98, 29);
		layeredPane.add(label_18);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBackground(new Color(255, 255, 204));
		layeredPane_2.setBounds(40, 290, 230, 330);
		layeredPane.add(layeredPane_2);
		
		JLabel label_9 = new JLabel();
		label_9.setText("\u667A\u5546\uFF1A");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_9.setBounds(24, 68, 79, 34);
		layeredPane_2.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setText("\u60C5\u5546\uFF1A");
		label_10.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_10.setBounds(24, 115, 79, 34);
		layeredPane_2.add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setText("\u4F53\u80FD\uFF1A");
		label_11.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_11.setBounds(24, 162, 79, 34);
		layeredPane_2.add(label_11);
		
		JLabel label_12 = new JLabel();
		label_12.setText("\u91D1\u94B1\uFF1A");
		label_12.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_12.setBounds(24, 209, 79, 34);
		layeredPane_2.add(label_12);
		
		JLabel label_17 = new JLabel();
		label_17.setText("\u5FC3\u60C5\uFF1A");
		label_17.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_17.setBounds(24, 256, 79, 34);
		layeredPane_2.add(label_17);
		
		JLabel label_13 = new JLabel();
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setText("\u89D2\u8272\u5C5E\u6027");
		label_13.setFont(new Font("Dialog", Font.BOLD, 24));
		label_13.setBounds(42, 13, 155, 31);
		layeredPane_2.add(label_13);
		
		label_19 = new JLabel("");
		label_19.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_19.setBounds(99, 71, 98, 29);
		layeredPane_2.add(label_19);
		
		label_20 = new JLabel("");
		label_20.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_20.setBounds(99, 120, 98, 29);
		layeredPane_2.add(label_20);
		
		label_21 = new JLabel("");
		label_21.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_21.setBounds(99, 165, 98, 29);
		layeredPane_2.add(label_21);
		
		label_22 = new JLabel("");
		label_22.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_22.setBounds(99, 212, 98, 29);
		layeredPane_2.add(label_22);
		
		label_23 = new JLabel("");
		label_23.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_23.setBounds(99, 259, 131, 29);
		layeredPane_2.add(label_23);
		
		JLabel label_14 = new JLabel();
		label_14.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u9E45\u9EC4.jpg")));
		label_14.setBounds(0, 0, 230, 330);
		layeredPane_2.add(label_14);
		
		JLabel label_15 = new JLabel();
		label_15.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u5934\u50CF.jpg")));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(40, 80, 140, 140);
		layeredPane.add(label_15);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
			}
		});
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setBounds(361, 307, 497, 113);
		layeredPane.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u9E45\u9EC4.jpg")));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(335, 290, 551, 145);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u9E45\u9EC4.jpg")));
		lblNewLabel_3.setBounds(194, 90, 230, 121);
		layeredPane.add(lblNewLabel_3);
		
		label_16 = new JLabel();
		label_16.setIcon(new ImageIcon(InterFace.class.getResource("/img/\u4E3B\u754C\u9762.jpg")));
		label_16.setBounds(0, 0, 1280, 960);
		layeredPane.add(label_16);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1280, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1280, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 961, Short.MAX_VALUE)
				.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 961, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		try {
			data();
			if (user.getActionpoints() == 30 && user.getTimenumber() == 1) {
				showtake(3);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static void data() throws ClassNotFoundException, SQLException, IOException{
		
		String name = user.getChoosename();
		int[] num = new int[4];
		Client c = new Client();
		num = c.show(name);
		IQ = num[0];
		EQ = num[1];
		power = num[2];
		money = num[3];
		int a = num[4];
		int b = num[6];
		user.setTimenumber(b);
		user.setActionpoints(num[5]);
		label_18.setText(All.time(b));
		label_19.setText(IQ + "");
		label_20.setText(EQ + "");
		label_21.setText(power + "");
		label_22.setText(money + "");
		if (All.army(name)) {
			button_9.setText("军训(智情体)");
			button_5.setText("打工(钱)");
			button_3.setText("休息(无)");
		} else if (b % 5 == 0){
			button_9.setText("家教(智钱)");
			button_5.setText("打散工(情钱)");
			button_3.setText("体育赛事(体钱)");
			button_4.setText("无");
			button_10.setText("假期休息(心情)");
		} else {
			button_9.setText("学习(智)");
			button_5.setText("社团活动(情)");
			button_3.setText("锻炼(体)");
			button_4.setText("打工(钱)");
			button_10.setText("休息(心情)");
		}
		int[] a1 = All.selectmood(name);
		user.setMood(a1[0]);
		user.setMoodmath(a1[1]);
		label_23.setText(All.moodlevel(user.getMood()));
		label_26.setText(user.getActionpoints() + "");
	}
	
	public void change(int math, JLabel label) throws UnknownHostException, IOException {
		int num = 10;
		int mood = user.getMood();
		num = moodinfluence(mood, num);
		switch(math) {
			case 1: IQ = Integer.valueOf(label.getText()) + num;
				label.setText(IQ + "");
				break;
			case 2: EQ = Integer.valueOf(label.getText()) + num;
				label.setText(EQ + "");
				break;
			case 3: power = Integer.valueOf(label.getText()) + num;
				label.setText(power + "");
				break;
			case 4: money = Integer.valueOf(label.getText()) + 4;
				label.setText(money + "");
				break;
		}
		int a = user.getMoodmath();
		a = a - 4;
		if (All.judemood(a) == 0) {
			panel.setVisible(false);
			Login L = new Login();
			add(L);
		};
		user.setMoodmath(a);
		int b = user.getActionpoints();
		b = b - 1;
		user.setActionpoints(b);
		label_26.setText(b + "");
	}
	
	public static void time(int actionpotions, int timenumber) throws ClassNotFoundException, SQLException, IOException {
		if (timenumber == 1 && actionpotions == 0) {
			button_9.setText("学习(智)");
			button_5.setText("社团活动(情)");
			button_3.setText("锻炼(体)");
			button_4.setText("打工(钱)");
			button_10.setText("休息(心情)");
		}
		if (actionpotions == 0) {
			user.setTimenumber(timenumber + 1);
			if ((timenumber + 1) % 5 == 0) {
				user.setActionpoints(4);
				All.updatime(user.getChoosename(), user.getTimenumber());
				button_9.setText("家教(智钱)");
				button_5.setText("打散工(情钱)");
				button_3.setText("体育赛事(体钱)");
				button_4.setText("----------");
				button_10.setText("假期休息(心情)");
				label_26.setText(4 + "");
			} else {
				button_9.setText("学习(智)");
				button_5.setText("社团活动(情)");
				button_3.setText("锻炼(体)");
				button_4.setText("打工(钱)");
				button_10.setText("休息(心情)");
				user.setActionpoints(30);
				All.updatime(user.getChoosename(), user.getTimenumber());
				label_26.setText(30 + "");
			}
			label_18.setText(All.time(user.getTimenumber()));
		}
	} 
	
	public static int moodinfluence(int mood, int num) {
		if (mood == 5) {
			num = num + 2;
		} else if (mood == 4) {
			num = num + 1;
		} else if (mood == 2) {
			num = num - 1;
		} else if (mood == 1) {
			num = num - 1;
		}
		return num;
	}
	
	public void take() throws ClassNotFoundException, SQLException, IOException {
		
		if (user.getActionpoints() == 0 && user.getTimenumber() % 10 == 0) {
			money = Integer.valueOf(label_22.getText());
			if (money < 100){
				JOptionPane.showMessageDialog(null,"你因为没钱交学费，自动退学！游戏结束，正在清除数据！");
				panel.setVisible(false);
				Login a = new Login();
				add(a);
				Client c = new Client();
				c.delete(user.getChoosename());
			}
			money = money - 100;
			label_22.setText(money + "");
			All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
		}
		
		if (user.getActionpoints() == 0 && user.getTimenumber() % 5 == 0) {
			int[] a = All.selectmood(user.getChoosename());
			
			if (a[2] == 1) {
				showtake(33);
				money = Integer.valueOf(label_22.getText()) - 40;
				label_22.setText(money + "");
				All.upclass(user.getChoosename(), 0);
				All.upda(user.getChoosename(), IQ, EQ, power, money, user.getMoodmath(), user.getMood(), user.getActionpoints(), user.getTimenumber());
			}
		} 
		
		if (user.getActionpoints() == 1 && user.getTimenumber() == 1) {
			showtake(4);
		} else if(user.getActionpoints() == 29 && user.getTimenumber() == 1){
			showtake(70);
		}
		else if (user.getActionpoints() == 0 && user.getTimenumber() == 1) {
			showtakes(15);
		} else if (user.getActionpoints() == 0 && user.getTimenumber() == 10) {
			showtake(7);
		} else if (user.getActionpoints() == 0 && user.getTimenumber() == 20) {
			showtake(9);
		} else if (user.getActionpoints() == 0 && user.getTimenumber() == 30) {
			showtake(11);
		} else if (user.getActionpoints() == 0 && (user.getTimenumber() + 2) % 5 == 0) {
			showtake(30);
		} else if (user.getActionpoints() == 0 && (user.getTimenumber() + 1) % 5 == 0) {
			int num = (user.getTimenumber() + 1) / 5;
			if (IQ < 600 * num) {
				showtake(31);
				All.upclass(user.getChoosename(), 1);
			} else {
				showtake(32);
			}
		} else {
			lblNewLabel_1.setVisible(false);
			lblNewLabel_2.setVisible(false);
		}
		
	}
	
	public static void showtake(int number) throws ClassNotFoundException, SQLException, IOException {
		String str = All.selecttake(number);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_2.setVisible(true);
		lblNewLabel_2.setText("<html>" + str + "</html>");
	}
	
	public static void showtakes(int number) throws ClassNotFoundException, SQLException, IOException{
		String str = All.selecttake(number);
		String str1 =  All.selecttake(number + 1);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_2.setVisible(true);
		lblNewLabel_2.setText("<html><body>"+str+"<br>"+str1+"<body></html>");
	}
	
	public void ending () {
		if (user.getActionpoints() == 0 && user.getTimenumber() == 39 && IQ >= 5500) {
			user.setEndding(1);
			JOptionPane.showMessageDialog(null,"你毕业了");
			panel.setVisible(false);
			EasterEgg a = new EasterEgg();
			add(a);
		} else if (user.getActionpoints() == 0 && user.getTimenumber() == 39 && EQ >= 5500) {
			user.setEndding(3);
			JOptionPane.showMessageDialog(null,"你毕业了");
			panel.setVisible(false);
			EasterEgg a = new EasterEgg();
			add(a);
		} else if (user.getActionpoints() == 0 && user.getTimenumber() == 39 && power >= 5500) {
			user.setEndding(2);
			JOptionPane.showMessageDialog(null,"你毕业了");
			panel.setVisible(false);
			EasterEgg a = new EasterEgg();
			add(a);
		}else{
			user.setEndding(4);
			JOptionPane.showMessageDialog(null,"你毕业失败了");
			panel.setVisible(false);
			EasterEgg a = new EasterEgg();
			add(a);
		}
		
	}
}
