package Server;
import java.sql.*;

import Server.DataConnect;

public class DataConnect {
	private static Statement stat;
	
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("加载成功");
		String url = "jdbc:mysql://localhost:3306/zn?user=root&password=123456";
		Connection con = DriverManager.getConnection(url);
		System.out.println("连接成功");
		stat = con.createStatement();
	}

	public static Statement getStatement() throws ClassNotFoundException, SQLException {
		if (stat == null) {
			init();
		}
		return stat;
	}
	
	
	
	
	public static ResultSet login(String umail, String pw) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from uselist WHERE umail='"+umail+"' and upw='"+pw+"'";
		ResultSet rs =getStatement().executeQuery(sql);
		return rs;
		
	}
	
	public static void register(String umail, String pw) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO uselist(umail, upw)VALUES ('"+umail+"','"+pw+"')";
		getStatement().executeUpdate(sql);
	}
	
	public static void createperson(String name, int uid) throws ClassNotFoundException, SQLException {
		int IQ = 1 + (int)(Math.random()*15);
		int EQ = 1 + (int)(Math.random()*15);
		int power = 1 + (int)(Math.random()*15);
		String sql = "INSERT INTO storagelist(uid, name, power, IQ, EQ, money, time, mood, moodmath, actionpoints)VALUES ('"+uid+"', '"+name+"', '"+power+"', '"+IQ+"','"+EQ+"', 200, 1, 3, 50, 30)";
		getStatement().executeUpdate(sql);
	}
	
	public static void createloverlist(String name) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO loverlist(name)VALUES ('"+name+"')";
		getStatement().executeUpdate(sql);
	}
	
	public static ResultSet selectplayersum(int uid) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from storagelist WHERE uid like '"+uid+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;	
	}
	
	public static ResultSet selectplayer(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from storagelist WHERE name='"+name+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;	
	}
	
	public static ResultSet selecttake(int number) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from dialoguelist WHERE number='"+number+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;	
	}
	
	public static void updatime(String name, int time) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set time = '"+time+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updateall(String name, int IQ, int EQ, int power, int money, int moodmath, int mood, int actionpoints, int time) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set IQ = '"+IQ+"', EQ = '"+EQ+"', power = '"+power+"', money = '"+money+"',  moodmath = '"+moodmath+"', mood = '"+mood+"', actionpoints = '"+actionpoints+"',time = '"+time+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updatemoney(String name, int money) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set money = '"+money+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updateIQ(String name, int IQ) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set IQ = '"+IQ+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updateEQ(String name, int EQ) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set EQ = '"+EQ+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updatepower(String name, int power) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set power = '"+power+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updatelover(String name,int lover) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set lover = '"+lover+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updateclass(String name,int cla) throws ClassNotFoundException, SQLException {
		String sql = "update storagelist set class = '"+cla+"' where name = '"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void updateloverlist(String name, String lover, int number) throws ClassNotFoundException, SQLException {
		String sql = null;
		if (number == 1) {
			sql = "update loverlist set manone = '"+lover+"' where name = '"+name+"'";
		} else if (number == 2) {
			sql = "update loverlist set mantwo = '"+lover+"' where name = '"+name+"'";
		} else if (number == 3) {
			sql = "update loverlist set manthree = '"+lover+"' where name = '"+name+"'";
		} else if (number == 4) {
			sql = "update loverlist set grilone = '"+lover+"' where name = '"+name+"'";
		} else if (number == 5) {
			sql = "update loverlist set griltwo = '"+lover+"' where name = '"+name+"'";
		} else if (number == 6) {
			sql = "update loverlist set grilthree = '"+lover+"' where name = '"+name+"'";
		}
		
		getStatement().executeUpdate(sql);
	}
	
	public static ResultSet lover(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from loverlist WHERE name='"+name+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;
	}
	
	public static ResultSet egg(int eggnumber) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from egglist WHERE eggnumber='"+eggnumber+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;
	}
	
	public static ResultSet ending(int endingnumber) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from eddinglist WHERE endingnumber='"+endingnumber+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;
	}
	
	public static String time(int timenumber) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from timelist WHERE timenumber='"+timenumber+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		String timename = null;
		if (rs.next()) {
			timename = rs.getString(1);
		} 
		return timename;
	}
	
	public static ResultSet festival(int festivalnumber) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from festivallist WHERE festivalnumber='"+festivalnumber+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		return rs;
	}
	
	public static String moodlevel(int moodnumber) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * from moodlist WHERE moodnumber='"+moodnumber+"'";
		ResultSet rs = getStatement().executeQuery(sql);
		String moodname = null;
		if (rs.next()) {
			moodname = rs.getString(1);
		} 
		return moodname;
	}
	
	public static void deleteplayer(String name) throws ClassNotFoundException, SQLException {
		String sql = "Delete from storagelist WHERE name='"+name+"'";
		getStatement().executeUpdate(sql);
	}
	
	public static void deleteplayerloverlist(String name) throws ClassNotFoundException, SQLException {
		String sql = "Delete from loverlist WHERE name='"+name+"'";
		getStatement().executeUpdate(sql);
	}
}