import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class measurableViewer {

	   private static final int FRAME_WIDTH = 240;
	   private static final int FRAME_HEIGHT = 160;

	   public static void main(String[] args)
	   {
		   Scanner in = new Scanner(System.in);
		   
		  //Countries
			  //System.out.println("Countries Data:");
			  Measurable[] countries = new Measurable[3];
		      countries[0] = new Country("Uruguay", 176220);
		      countries[1] = new Country("Thailand", 513120);
		      countries[2] = new Country("Belgium", 30510);
		      
		      //double avg = Data.average(countries);
		      //System.out.println("Average area: " + avg);
		      //System.out.println("Expected: 239950");
		      //System.out.println("");
		      
		      //double maxData = Data.max(countries);
		      //System.out.println("Maximum area: " + maxData);
		      //System.out.println("Expected: 513120");
		      //System.out.println("");
		     
		      
		      //Bank Accounts
		      //System.out.println("Bank account data:");
		      Measurable[] bank = new Measurable[3];
		      bank[0] = new BankAccount(176220);
		      bank[1] = new BankAccount(513120);
		      bank[2] = new BankAccount(30510);
		      
		      //avg = Data.average(bank);
		      //System.out.println("Average balance: " + avg);
		      //System.out.println("Expected: 239950");
		      //System.out.println("");
		      
		      //maxData = Data.max(bank);
		      //System.out.println("Maximum balance: " + maxData);
		      //System.out.println("Expected: 513120");
		      //System.out.println("");
		  
		      //Quizzes
		      //System.out.println("Quiz Data:");
		      Measurable[] quiz = new Measurable[5];
		      quiz[0] = new Quiz("Sally",95);
		      quiz[1] = new Quiz("Joe", 80);
		      quiz[2] = new Quiz("Jane", 90);
		      quiz[3] = new Quiz("Billy", 50);
		      quiz[4] = new Quiz("Colby", 75);
		      
		      //avg = Data.average(quiz);
		      //System.out.println("Average score: " + avg);
		      //System.out.println("Expected: 78");
		      //System.out.println("");
		      
		      //maxData = Data.max(quiz);
		      //System.out.println("Maximum score: " + maxData);
		      //System.out.println("Expected: 95");   
	   
	   
	   System.out.println("Enter metric to use, 1 for max, 2 for min, and 3 for average: ");
	   int  whichMetric = in.nextInt();
	   String metricToUse = ("average");
		if (whichMetric == 1) {metricToUse = "Maximum";}
	   	if (whichMetric == 2) {metricToUse = "Minimum";}
	   	if (whichMetric == 3) {metricToUse = "Average";} 
 {
	 
		  JPanel panel = new JPanel();
	      JFrame frame = new JFrame();
	      frame.add(panel);

	      // Bank
	      JButton button = new JButton("Get " + metricToUse + " Balance");
	      panel.add(button);
	      ActionListener listener = new ButtonListener(bank, metricToUse);
	      button.addActionListener(listener);
	      
	      //Countries
	      JButton button2 = new JButton("Get " + metricToUse + " Area");
	      panel.add(button2);
	      ActionListener listener2 = new ButtonListener(countries, metricToUse);
	      button.addActionListener(listener2);
	      
	      //Quiz
	      JButton button3 = new JButton("Get " + metricToUse + " Score");
	      panel.add(button3);
	      ActionListener listener3 = new ButtonListener(quiz, metricToUse);
	      button.addActionListener(listener3);
	     
	      //display frame
	      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	   
	      
	      System.out.println("Enter 1 for max, 2 for min, 3 for average: ");
 		}
 	}
}



