package Code;
import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
 
public class MusicPlay {	
//	static URL root=MusicPlay.class.getResource("/Music/MUSIC.wav");
//	private static File f = new File(root+"");
	
public static void playMusic(int a){
		URL cb=MusicPlay.class.getResource("/Music/MUSIC.wav");
	
        AudioClip auc;
		auc = Applet.newAudioClip(cb);
        System.out.println(cb);
		//auc.play();	
        if(a==1){
		auc.loop();
		}
		if(a==2){
			auc.stop();
		}
	
	}
	public static void playMusicstop(){
		URL ab=MusicPlay.class.getResource("/Music/MUSIC.wav");
		AudioClip auc;
				auc = Applet.newAudioClip(ab);
		   System.out.println(ab);
		        auc.loop();
				auc.stop();
		
	
	}
}
