package aplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javafx.Application.Application;
import javafx.Application.Plataform;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Tetris extends Application{

	//VARIAVEIS
		public static final int MOVE = 25;
		public static final int SIZE = 25;
		public  static int XMAX = SIZE *12;
		public  static int YMAX = SIZE * 24;
		public static int [][] MESH = new int [XMAX/SIZE][YMAX/SIZE];
		private static Pane groupe = new Pane();
		private static Form object;
		private static Scene scene = new scene(groupe, XMAX + 150, YMAX);
		public static int score = 0;
		private static boolean game = true;
		private static Form nextObj = controller.makeRect();
		private static int linesNO = 0;
	
	public void start(Stage arg0) throws Excepetion{
	
}
