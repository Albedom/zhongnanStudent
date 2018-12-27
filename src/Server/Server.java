package Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import Code.user;


public class Server extends Thread{
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
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
	public Server(Socket socket) {
		this.s = socket;

	}	
	public void run() {
			try {
				ois = new ObjectInputStream(s.getInputStream());
				oos = new ObjectOutputStream(s.getOutputStream());
			    int command = ois.readInt();
			    if (command == LOGIN) {
			    	login();
				}
			    if (command ==REG) {
				    register();
			    }
			    if (command == REGPLAY) {
			    	registerperson();
			    }
			    if (command == REGPLAYLOVE) {
			    	registerloverlist();
			    }
			    if (command == LOVE) {
			    	love();
			    }
			    if (command == ARMY) {
			    	army();
			    }
			    if (command == UPDA) {
			    	upda();
			    }
			    if (command == TIME) {
			    	time();
			    }
			    if (command == SELECTTAKE) {
			    	selecttake();
			    }
			    if (command == UPDATIME) {
			    	updatime();
			    }
			    if (command == MOODLEVEL) {
			    	moodlevel();
			    }
			    if (command == SELECTMOOD) {
			    	selectmood();
			    }
			    if (command == DECIDEEND) {
			    	decideend();
			    }
			    if (command == MONEY) {
			    	money();
			    }
			    if (command == UPDATEMONEY){
			    	updatemoney();
			    }
			    if (command == UPDATEIQ){
			    	updateIQ();
			    }
			    if (command == UPDATEEQ){
			    	updateEQ();
			    }
			    if (command == UPDATEPOWER){
			    	updatepower();
			    }
			    if (command == UPDATECLASS){
			    	updateclass();
			    }
			    if (command == DELETE) {
			    	delete();
			    }
			    if (command == BOOK) {
			    	book();
			    }
			    if (command == NOVEL) {
			    	novel();
			    }
			    if (command == EXERCISE) {
			    	exercise();
			    }
			    if (command == GIFT) {
			    	gift();
			    }
			    if (command == CONFESSION) {
			    	confession();
			    }
			    if (command == SHOW) {
			    	show();
			    }
			    if (command == FAILED) {
			    	failed();
			    }
			    
			    } catch (IOException e) {
				// TODO Auto-generated catch block
				    e.printStackTrace();
			} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
	public void login() throws IOException, SQLException, ClassNotFoundException{
		String uname = ois.readUTF();
		String upw = ois.readUTF();
		int a = 0, i =0;
		String name[] = new String[3];
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.login(uname, upw);
		if (rs.next()){
			a = rs.getInt(1);
			System.out.println(a);
			ResultSet rs1 = DataConnect.selectplayersum(a);
			while (rs1.next()) {
				name[i] = rs1.getString(2);
				i++;
 			}
		}
		oos.writeInt(a);
		oos.writeUTF(name[0] + "");
		oos.flush();
		oos.writeUTF(name[1] + "");
		oos.flush();
		oos.writeUTF(name[2] + "");
		oos.flush();
	}
	
	public void register() throws IOException, ClassNotFoundException, SQLException{
		String umail =ois.readUTF();
		String upw = ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.login(umail, upw);
		if (rs.next()){
			oos.writeInt(0);
			oos.flush();
		} else {
			DataConnect.register(umail, upw);
			oos.writeInt(1);
			oos.flush();
		}
	}
	
	public void registerperson() throws IOException, ClassNotFoundException, SQLException {
		String name =ois.readUTF();
		int uid = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if (rs.next()) {
			oos.writeInt(1);
			oos.flush();
		} else {
			DataConnect.createperson(name, uid);
			ResultSet rs1 = DataConnect.selectplayersum(uid);
			int i = 0;
	 		String name1[] = new String[3];
	 		while (rs1.next()) {
				name1[i] = rs1.getString(2);
				i++;
			}
	 		oos.writeInt(0);
			oos.flush();
	 		oos.writeUTF(name1[0] + "");
			oos.flush();
			oos.writeUTF(name1[1] + "");
			oos.flush();
			oos.writeUTF(name1[2] + "");
			oos.flush();
		}
	}
	
	public void registerloverlist() throws ClassNotFoundException, SQLException, IOException {
		String name =ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.createloverlist(name);
	}
	public void love() throws IOException, ClassNotFoundException, SQLException {
		String name =ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.lover(name);
		if (rs.next()) {
			int i = 0;
			for (i = 2; i < 8; i++) {
				oos.writeUTF(rs.getString(i));
				oos.flush();
			}
		}
	}
	
	public void army() throws IOException, SQLException, ClassNotFoundException {
		String name =ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		int a = 0;
		if (rs.next()) {
			a = rs.getInt(11);
			oos.writeInt(a);
			oos.flush();
		} else {
			oos.writeInt(a);
			oos.flush();
		}
	}
	public void upda () throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int IQ = ois.readInt();
		int EQ = ois.readInt();
		int power = ois.readInt();
		int money = ois.readInt();
		int moodmath = ois.readInt();
		int mood = ois.readInt();
		int actionpoints = ois.readInt();
		int time = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updateall(name, IQ, EQ, power, money, moodmath, mood, actionpoints, time);
	}
	
	public void time() throws IOException, ClassNotFoundException, SQLException {
		int timenumber = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oos.writeUTF(DataConnect.time(timenumber));
		oos.flush();
	}
	
	public void selecttake() throws IOException, ClassNotFoundException, SQLException {
		int number = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selecttake(number);
		if (rs.next()) {
			oos.writeUTF(rs.getString(1));
			oos.flush();
		}
	}
	
	public void updatime() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int timenumber = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updatime(name, timenumber);
	}
	
	public void moodlevel() throws ClassNotFoundException, SQLException, IOException {
		int moodnumber = ois.readInt();
		String a = DataConnect.moodlevel(moodnumber);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oos.writeUTF(a);
		oos.flush();
	}
	public void selectmood() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		int[] a = new int[3];
		if (rs.next()) {
			a[0] = rs.getInt(8);
			a[1] = rs.getInt(7);
			a[2] = rs.getInt(12);
		}
		oos.writeInt(a[0]);
		oos.flush();
		oos.writeInt(a[1]);
		oos.flush();
		oos.writeInt(a[2]);
		oos.flush();
	}
	public void decideend() throws IOException, ClassNotFoundException, SQLException {
		int enddingnumber = ois.readInt();
		String a = null;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.ending(enddingnumber);
		if (rs.next()) {
			a = rs.getString(1);
		}
		oos.writeUTF(a);
		oos.flush();
	}
	public void money() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		int a = 0;
		if (rs.next()) {
			a = rs.getInt(6);
		}
		oos.writeInt(a);
		oos.flush();
	}
	public void updatemoney() throws IOException,  SQLException, ClassNotFoundException {
		String name = ois.readUTF();
		int money = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updatemoney(name, money);
	}
	public void updateIQ() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int IQ = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updateIQ(name, IQ);
	}
	public void updateEQ() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int EQ = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updateEQ(name, EQ);
	}
	public void updatepower() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int power = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updatepower(name, power);
	}
	public void updateclass() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int cla = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updateclass(name, cla);
	}
	public void delete() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.deleteplayerloverlist(name);
		DataConnect.deleteplayer(name);
	}
	public void book() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int a = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if (rs.next()) {
			a = rs.getInt(4);
		}
		oos.writeInt(a);
		oos.flush();
	}
	public void novel() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int a = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if (rs.next()) {
			a = rs.getInt(5);
		}
		oos.writeInt(a);
		oos.flush();
	}
	public void exercise() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int a = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if (rs.next()) {
			a = rs.getInt(3);
		}
		oos.writeInt(a);
		oos.flush();
	}
	public void gift() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int number = ois.readInt();
		int x = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.lover(name);
		if (rs.next()) {
			x = rs.getInt(number + 1);
			if (x == 100) {		
				oos.writeInt(1);
				oos.flush();
			} else {
				x = x + 5;
				oos.writeInt(0);
				oos.flush();
			}
		}
		DataConnect.updateloverlist(name, x + "", number);
	}
	public void  confession() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int number = ois.readInt();
		int lover = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if(rs.next()) {
			lover = rs.getInt(9) + 1;
		}
		DataConnect.updatelover(name, lover);
		DataConnect.updateloverlist(name, "°éÂÂ", number);
	}
	public void show() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int IQ = 0, EQ = 0, power = 0, money = 0, time = 0, mood = 0, actionpoints = 0;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = DataConnect.selectplayer(name);
		if(rs.next()){
			IQ = rs.getInt(4);
			EQ = rs.getInt(5);
			power = rs.getInt(3);
			money = rs.getInt(6);
			mood = rs.getInt(8);
			actionpoints = rs.getInt(10);
			time = rs.getInt(11);
		}
		oos.writeInt(IQ);
		oos.flush();
		oos.writeInt(EQ);
		oos.flush();
		oos.writeInt(power);
		oos.flush();
		oos.writeInt(money);
		oos.flush();
		oos.writeInt(mood);
		oos.flush();
		oos.writeInt(actionpoints);
		oos.flush();
		oos.writeInt(time);
		oos.flush();
	}
	public void failed() throws IOException, ClassNotFoundException, SQLException {
		String name = ois.readUTF();
		int number = ois.readInt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataConnect.updateloverlist(name, "Ê§°Ü", number);
	}
}