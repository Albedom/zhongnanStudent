package Code;



public class user {

	private static int uid;
	private static String choosename;
	private static String grade;
	private static String[] name;
	private static int actionpoints;
	private static int mood;
	private static int moodmath;
	private static int timenumber;
	private static int endding;
	
	
	public static int getEndding() {
		return endding;
	}
	public static void setEndding(int endding) {
		user.endding = endding;
	}
	public static int getTimenumber() {
		return timenumber;
	}
	public static void setTimenumber(int timenumber) {
		user.timenumber = timenumber;
	}
	public static int getActionpoints() {
		return actionpoints;
	}
	public static void setActionpoints(int actionpoints) {
		user.actionpoints = actionpoints;
	}
	public static int getMood() {
		return mood;
	}
	public static void setMood(int mood) {
		user.mood = mood;
	}
	public static int getMoodmath() {
		return moodmath;
	}
	public static void setMoodmath(int moodmath) {
		user.moodmath = moodmath;
	}
	public static int getUid() {
		return uid;
	}
	public static void setUid(int uid) {
		user.uid = uid;
	}
	public static String getChoosename() {
		return choosename;
	}
	public static void setChoosename(String choosename) {
		user.choosename = choosename;
	}
	public static String getGrade() {
		return grade;
	}
	public static void setGrade(String grade) {
		user.grade = grade;
	}
	public static String[] getName() {
		return name;
	}
	public static void setName(String[] name) {
		user.name = name;
	}

}
