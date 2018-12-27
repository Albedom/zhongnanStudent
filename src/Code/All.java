package Code;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Server.Client;
import Server.DataConnect;

public class All {
	
	
	
	
	public static String[] login(String umail,String upw) throws  SQLException, ClassNotFoundException, IOException{
		Client c = new Client();
		String name[] = new String[3];
		name = c.login(umail, upw);
		if (name[0] != "") {
			for (int i = 0; i < 3; i++) {
				if(name[i].equals("null")){
					name[i] = null;
				}
			}
 			user.setName(name);
 			return name;
 		}
 		return null;
 	} 
	
	public static int registerperson (String name, int uid) throws SQLException,ClassNotFoundException, IOException{
		Client c = new Client();
		String name1[] = new String[3];
		System.out.println(2);
		name1 = c.registerperson(name, uid);
		if (name1[0] != null) {
			for (int i = 0; i < 3; i++) {
				if(name1[i].equals("null")){
					name1[i] = null;
				}
			}
 			user.setName(name1);
 			return 0;
 		}
		return 1;
 	}
	
	public static void registerloverlist (String name) throws SQLException,ClassNotFoundException,IOException{
 		Client c = new Client();
 		c.registerloverlist(name);
 	}
	
	public static String[] love(String name) throws ClassNotFoundException, IOException {
		Client c = new Client();
		String name1[] = new String[6];
		name1 = c.love(name);
		return name1;
	}
	
	public static int register (String umail, String upw) throws SQLException,ClassNotFoundException, IOException{
 		Client c = new Client();
 		int a = c.register(umail, upw);
 		if (a == 1) {
 			JOptionPane.showMessageDialog(null,"注册成功！");
 		}
 		return a;
 	}
	
	public static boolean army(String name) throws IOException {
		Client c = new Client();
		int a = c.army(name);
		if (a == 1) {
			System.out.println(1);
			return true;
		}
		return false;
		
	}
	
	public static void upda (String name, int IQ, int EQ, int power, int money, int moodmath, int mood, int actionpoints, int time) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.upda(name, IQ, EQ, power, money, moodmath, mood, actionpoints, time);
	}
	
	public static String time (int timenumber) throws ClassNotFoundException,IOException {
		Client c = new Client();
		return c.time(timenumber);
	} 
	
	public static String selecttake (int number) throws ClassNotFoundException, IOException {
		Client c = new Client();
		return c.selecttake(number);
	} 
	
	public static void updatime (String name, int timenumber) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updatime(name, timenumber);
	}
	
	public static String moodlevel(int moodnumber) throws ClassNotFoundException, IOException {
		Client c = new Client();
		return c.moodlevel(moodnumber);
	}
	
	public static int[] selectmood (String name) throws ClassNotFoundException, IOException {
		Client c = new Client();
		return c.selectmood(name);
	}
	
	public static String decideend(int enddingnumber) throws ClassNotFoundException, IOException {
		Client c = new Client();
		return c.decideend(enddingnumber);
	}
	
	public static int money(String name) throws ClassNotFoundException, IOException {
		Client c = new Client();
		return c.money(name);
	}
	
	public static void money(String name, int money) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updatemoney(name, money);
	}
	
	public static void IQ(String name, int IQ) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updateIQ(name, IQ);
	}
	
	public static void EQ(String name, int EQ) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updateEQ(name, EQ);
	}
	
	public static void power(String name, int power) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updatepower(name, power);
	}
	
	public static void upclass(String name, int cla) throws ClassNotFoundException, IOException {
		Client c = new Client();
		c.updateclass(name, cla);
	}
	
	public static int judemood(int moodmath) throws UnknownHostException, IOException {
		if (moodmath <= 100 && moodmath > 80) {
			user.setMood(5);
		} else if (moodmath <=80 && moodmath > 60) {
			user.setMood(4);		
		} else if (moodmath <=60 && moodmath > 40) {
			user.setMood(3);	
		} else if (moodmath <=40 && moodmath > 20) {
			user.setMood(2);
		} else if (moodmath <=20 && moodmath >= 0) {
			user.setMood(1);
		} else {
			JOptionPane.showMessageDialog(null,"你因为觉得人间不值得，跳楼自杀，游戏结束，正在清除数据！");
			Client c = new Client();
			c.delete(user.getChoosename());
			return 0;
		}
		return 1;
		
	}
	
	public static int book() throws ClassNotFoundException, IOException {
		int x = 0;
		Client c = new Client();
		x = c.book(user.getChoosename());
		x = x + 55;
		JOptionPane.showMessageDialog(null,"你通过读书，智商上升了！");
		return x;
	}
	
	public static int novel() throws ClassNotFoundException, IOException {
		int x = 0;
		Client c = new Client();
		x = c.novel(user.getChoosename());
		x = x + 55;
		JOptionPane.showMessageDialog(null,"你通过阅读小说，情商上升了！");
		return x;
	}
	
	public static int exercise() throws ClassNotFoundException, IOException {
		int x = 0;
		Client c = new Client();
		x = c.exercise(user.getChoosename());
		x = x + 55;
		JOptionPane.showMessageDialog(null,"你因为使用了健身器材锻炼，体能上升了！");
		return x;
	}
	
	public static void gift(String name, int number, String str) throws ClassNotFoundException, IOException {
		if ( !str.equals("伴侣") && !str.equals("失败")) {
			int x = 0;
			Client c = new Client();
			x = c.gift(user.getChoosename(), number);
			if (x == 1) {
				JOptionPane.showMessageDialog(null,"对方收到了你的礼物，好感已经满了无法继续上升！");			
			} else {
				JOptionPane.showMessageDialog(null,"对方收到了你的礼物，很开心，对你的好感上升了！");
			}
		} else if (str.equals("伴侣")){
				JOptionPane.showMessageDialog(null,"对方已经是你的伴侣了！");
		} else {
				JOptionPane.showMessageDialog(null,"虽然对方拒绝了你，收你礼物也不会上升好感的，当着你的面把礼物扔进了垃圾车！");
		}
		
	}
	
	public static int Confession(String name, int number, String str) throws ClassNotFoundException, IOException {
		if ( !str.equals("伴侣") && !str.equals("失败")) {
			Client c = new Client();
			String[] x = c.love(name);
			int a = Integer.parseInt(x[number - 1]);
			int lover = 0;
			int y = 0;
			if (a < 50) {
				JOptionPane.showMessageDialog(null,"对方拒绝了你！");
				Client c1 = new Client();
				c1.failed(name, number);
				return 2;
			} else if (a >= 50 && a < 60) {
				y = 1 + (int)(Math.random()*5);
				if (y != 1) {
					JOptionPane.showMessageDialog(null,"很遗憾，对方拒绝了你！");
					Client c1 = new Client();
					c1.failed(name, number);
					return 2;
				}
			} else if (a >= 60 && a < 70) {
				y = 1 + (int)(Math.random()*5);
				if (y == 1 || y == 5 || y == 4) {
					JOptionPane.showMessageDialog(null,"很可惜，对方犹豫了下选择拒绝了你！");
					Client c1 = new Client();
					c1.failed(name, number);
					return 2;
				}
			} else if (a >= 70 && a < 80) {
				y = 1 + (int)(Math.random()*5);
				if (y == 1 || y == 5 ) {
					JOptionPane.showMessageDialog(null,"很可惜，对方慎重考虑后选择拒绝了你！");
					Client c1 = new Client();
					c1.failed(name, number);
					return 2;
				}
			} else if (a >= 80 && a < 100) {
				y = 1 + (int)(Math.random()*5);
				if (y == 1 || y == 5 ) {
					JOptionPane.showMessageDialog(null,"很可惜，对方慎重考虑后选择拒绝了你！");
					Client c1 = new Client();
					c1.failed(name, number);
					return 2;
				}
			} 
			
			Client d = new Client();
			d.confession(name, number);
			JOptionPane.showMessageDialog(null,"表白成功，对方成为了你的伴侣！");
			return 1;
		} else if(str.equals("失败")) {
			JOptionPane.showMessageDialog(null,"人家都已经拒绝了，你为何还死缠烂打啊！");
			return 2;
		} else {
			JOptionPane.showMessageDialog(null,"对方已经是你的伴侣了！");
			return 1;
		}
	}
	//数据库无关！
	public static int lotterytwo() {
		int x = 0;
		int y = 1;
		int z = 2;
		x = 1 + (int)(Math.random() * 5);
		if (x == y || x == z) {
			x = 1 + (int)(Math.random() * 9);
			JOptionPane.showMessageDialog(null,"你买的彩票中奖了，奖金为" + x + "!");
			return x;
		} else {
			JOptionPane.showMessageDialog(null,"你没有中奖!");
		}
		return 0;
	}
	
	public static int lotteryfive() {
		int x = 0;
		int y = 1;
		int z = 2;
		x = 1 + (int)(Math.random() * 5);
		if (x == y || x == z) {
			x = 1 + (int)(Math.random() * 25);
			JOptionPane.showMessageDialog(null,"你买的彩票中奖了，奖金为" + x + "!");
			return x;
		} else {
			JOptionPane.showMessageDialog(null,"你没有中奖!");
		}
		return 0;
	}
	
	public static int lotteryten() {
		int x = 0;
		int y = 1;
		x = 1 + (int)(Math.random() * 5);
		if (x == y) {
			x = 1 + (int)(Math.random() * 85);
			JOptionPane.showMessageDialog(null,"你买的彩票中奖了，奖金为" + x + "!");
			return x;
		} else {
			JOptionPane.showMessageDialog(null,"你没有中奖!");
		}
		return 0;
	}
	
	public static int attributerandom() {
		int x=0;
		x = 1 + (int)(Math.random()*15);
		return x;
	}
}
