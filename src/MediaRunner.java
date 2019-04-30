import javax.swing.*;
import javax.swing.event.*;
import javafx.application.Application;
import javafx.scene.media.*;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


public class MediaRunner {
	//initisalising frame with buttons laid out
	JFrame fMain;
	JMenuBar mbMain;
	JMenu mFile;
	JMenuItem miOpen;
	JMenuItem miExit;
	
//	JPanel pPlayer;
//	Media media;
//	MediaPlayer mediaPlayer;
//	MediaView mediaView;
	
	JPanel pControls;
	JButton btnPlayPause;
	JButton btnSeekBackwards;
	JButton btnSeekForwards;
	JButton btnStop;
	
	public MediaRunner() {
		fMain = new JFrame("Media Runner");
		
		mbMain  = new JMenuBar();
		mFile = new JMenu("File");
		miOpen = new JMenuItem("Open...");
		miExit = new JMenuItem("Exit");
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		
//		pPlayer = new JPanel();
//		media = new Media(MediaRunner.class.getResource("/test.mp4").toExternalForm());
//		mediaPlayer = new MediaPlayer(media);
//		mediaView = new MediaView(mediaPlayer);
		
		pControls = new JPanel();
		btnPlayPause = new JButton("Pause");
		btnSeekBackwards = new JButton("<");
		btnSeekForwards = new JButton(">");
		btnStop = new JButton("Stop");
		
		mFile.add(miOpen);
		mFile.add(miExit);
		mbMain.add(mFile);
		
		pControls.add(btnPlayPause); pControls.add(btnSeekBackwards); pControls.add(btnSeekForwards); pControls.add(btnStop);
		pControls.setLayout(new GridLayout(1,4));
		
		fMain.add(mbMain, BorderLayout.PAGE_START);
		fMain.add(pControls, BorderLayout.PAGE_END);
		
		fMain.setSize(800, 600);
		fMain.setLocation(300, 300);
		fMain.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MediaRunner();
	}

}
