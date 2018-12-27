package Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Code.user;


public class Client {

	ObjectOutputStream oos;
	ObjectInputStream ois;
	final int LOGIN = 1001;
	final int REG = 1002;
	final int REGPLAY = 1003;
	final int REGPLAYLOVE = 1004;
	final int LOVE = 1005;
	final int ARMY = 1006;
	final int UPDA = 1007;
	final int TIME = 1008;
	final int SELECTTAKE = 1009;
	final int UPDATIME = 1010;
	final int MOODLEVEL = 1011;
	final int SELECTMOOD = 1012;
	final int DECIDEEND = 1013;
	final int MONEY = 1014;
	final int UPDATEMONEY = 1015;
	final int UPDATEIQ = 1016;
	final int UPDATEEQ = 1017;
	final int UPDATEPOWER = 1018;
	final int UPDATECLASS = 1019;
	final int DELETE = 1020;
	final int BOOK = 1021;
	final int NOVEL = 1022;
	final int EXERCISE = 1023;
	final int GIFT = 1024;
	final int CONFESSION = 1025;
	final int SHOW = 1026;
	final int FAILED = 1027;
	Socket s;
	public Client() throws UnknownHostException, IOException{
		s = new Socket("10.51.161.16",5508);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	
	public String[] login(String uname,String upw) throws IOException, ClassNotFoundException{
		String name[] = new String[3];
		int i = 0;
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		user.setUid(ois.readInt());
		while (i < 3) {
			name[i] = ois.readUTF();
			i++;
		}
		return name;
	}
	public int register(String umail,String upw) throws IOException, ClassNotFoundException{
		oos.writeInt(REG);
		oos.flush();
		oos.writeUTF(umail);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		int a = ois.readInt(); 
		if (a == 0) {
			System.out.println(1);
			JOptionPane.showMessageDialog(null, "用户名已经存在");
		} 
		return a;
	}
	public String[] registerperson(String name, int uid) throws IOException, ClassNotFoundException{
		String name1[] = new String[3];
		int i = 0;
		oos.writeInt(REGPLAY);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(uid);
		oos.flush();
		int a = ois.readInt();
		if (a == 1) {
			System.out.println(1);
			JOptionPane.showMessageDialog(null, "角色名重复");
		} else {
			while (i < 3) {
				name1[i] = ois.readUTF();
				i++;
			}
		}
		return name1;
	}
	public void registerloverlist(String name) throws IOException {
		oos.writeInt(REGPLAYLOVE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
	}
	public String[] love(String name) throws IOException, ClassNotFoundException {
		oos.writeInt(LOVE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		String name1[] = new String[6];
		for (int i = 0; i < 6; i ++) {
			name1[i] = ois.readUTF();
		}
		return name1;
	}
	public int army(String name) throws IOException {
		oos.writeInt(ARMY);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public void upda (String name, int IQ, int EQ, int power, int money, int moodmath, int mood, int actionpoints, int time) throws ClassNotFoundException, IOException {
		oos.writeInt(UPDA);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(IQ);
		oos.flush();
		oos.writeInt(EQ);
		oos.flush();
		oos.writeInt(power);
		oos.flush();
		oos.writeInt(money);
		oos.flush();
		oos.writeInt(moodmath);
		oos.flush();
		oos.writeInt(mood);
		oos.flush();
		oos.writeInt(actionpoints);
		oos.flush();
		oos.writeInt(time);
		oos.flush();
	}
	public String time (int timenumber) throws IOException {
		oos.writeInt(TIME);
		oos.flush();
		oos.writeInt(timenumber);
		oos.flush();
		String a = ois.readUTF();
		return a;
	}
	public String selecttake (int number) throws IOException {
		oos.writeInt(SELECTTAKE);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		String a = ois.readUTF();
		return a;
	}
	public void updatime (String name, int timenumber) throws IOException {
		oos.writeInt(UPDATIME);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(timenumber);
		oos.flush();
	}
	public String moodlevel(int moodnumber) throws IOException {
		oos.writeInt(MOODLEVEL);
		oos.flush();
		oos.writeInt(moodnumber);
		oos.flush();
		return ois.readUTF();
	}
	public int[] selectmood (String name) throws IOException {
		oos.writeInt(SELECTMOOD);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int[] a = new int[3];
		a[0] = ois.readInt();
		a[1] = ois.readInt();
		a[2] = ois.readInt();
		return a;
	}
	public String decideend(int enddingnumber) throws IOException {
		oos.writeInt(DECIDEEND);
		oos.flush();
		oos.writeInt(enddingnumber);
		oos.flush();
		String a = ois.readUTF();
		return a;
	}
	public int money(String name) throws IOException {
		oos.writeInt(MONEY);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public void updatemoney(String name, int money) throws IOException {
		oos.writeInt(UPDATEMONEY);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(money);
		oos.flush();
	}
	public void updateIQ(String name, int IQ) throws IOException {
		oos.writeInt(UPDATEIQ);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(IQ);
		oos.flush();
	}
	public void updateEQ(String name, int EQ) throws IOException {
		oos.writeInt(UPDATEEQ);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(EQ);
		oos.flush();
	}
	public void updatepower(String name, int power) throws IOException {
		oos.writeInt(UPDATEPOWER);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(power);
		oos.flush();
	}
	public void updateclass(String name, int cla) throws IOException {
		oos.writeInt(UPDATEPOWER);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(cla);
		oos.flush();
	}
	public void delete(String name) throws IOException {
		oos.writeInt(DELETE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
	}
	public int book(String name) throws IOException {
		oos.writeInt(BOOK);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public int novel(String name) throws IOException {
		oos.writeInt(NOVEL);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public int exercise(String name) throws IOException {
		oos.writeInt(EXERCISE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public int gift(String name, int number) throws IOException{
		oos.writeInt(GIFT);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		int a = ois.readInt();
		return a;
	}
	public void confession(String name, int number) throws IOException{
		oos.writeInt(CONFESSION);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
	}
	public int[] show(String name) throws IOException{
		oos.writeInt(SHOW);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		int[] a = new int[7];
		int i = 0;
		for (i = 0; i < 7; i++) {
			a[i] = ois.readInt();
		}
		return a;
	}
	public void failed(String name, int number) throws IOException{
		oos.writeInt(FAILED);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
	}
}
