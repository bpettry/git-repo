package module_2;

/*
 * Imports needed for GUIApplication
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * GUIApplication class
 */
public class GUIApplication extends JFrame implements ActionListener {
	
	//variables to be used throughout GUIApplication class
	private JLabel dateLabel;
	private JLabel ageLabel;
	private JTextField dateField;
	private JTextField ageField;
	private JButton calcButton;

	/*
	 * GUIApplication Constructor
	 */
	GUIApplication() {
		
		//initiate the GUI components 
		GridBagConstraints localeConst = null;
		
		//frame title
		setTitle("Age Claculator");
		
		//set the date and age labels
		dateLabel = new JLabel("Birthdate:");
		ageLabel = new JLabel("Calculated age:");
		
		//set the date and age textFields
		dateField = new JTextField(15);
		dateField.setEditable(true);
		dateField.setText("yyyy-MM-dd");
		
		ageField = new JTextField(15);
		ageField.setEditable(false);
		
		//create the calculate age button
		//connect button yo action event
		calcButton = new JButton("Calculate Age");
		calcButton.addActionListener(this);
		
		/*
		 * GridBadLayout and GridBagConstraints
		 */
		setLayout(new GridBagLayout());
		
		//setup dateLabel via layout
		localeConst = new GridBagConstraints();
		localeConst.gridx = 0;
		localeConst.gridy = 0;
		localeConst.insets = new Insets(10, 10, 10, 10);
		add(dateLabel, localeConst);
		
		//setup dateField via layout
		localeConst = new GridBagConstraints();
		localeConst.gridx = 1;
		localeConst.gridy = 0;
		localeConst.insets = new Insets(10, 10, 10, 10);
		add(dateField, localeConst);

		//setup ageLabel via layout
		localeConst = new GridBagConstraints();
		localeConst.gridx = 0;
		localeConst.gridy = 1;
		localeConst.insets = new Insets(10, 10, 10, 10);
		add(ageLabel, localeConst);

		//setup ageField via layout
		localeConst = new GridBagConstraints();
		localeConst.gridx = 1;
		localeConst.gridy = 1;
		localeConst.insets = new Insets(10, 10, 10, 10);
		add(ageField, localeConst);

		//setup calcButton via layout
		localeConst = new GridBagConstraints();
		localeConst.gridx = 0;
		localeConst.gridy = 2;
		localeConst.insets = new Insets(10, 10, 10, 10);
		add(calcButton, localeConst);

	} //end of constructor GUIApplication
	
	
	/*
	 * Override method to call Action Listener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		//variables to be used with Action Listener
		String userInput;
		Period calcAge;
		LocalDate userDate;
		LocalDate nowDate;
		
		//get the user birth date
		userInput = dateField.getText();
		
		//convert userInput to a date
		nowDate = LocalDate.now();
	    userDate = LocalDate.parse(userInput, DateTimeFormatter.ISO_DATE);
	    
	    //calculate the age based on userInput and nowDate
	    calcAge = Period.between(userDate,nowDate);
	    
	    //display the calculated age
	    ageField.setText(calcAge.getYears() + " years old!");
	    
	} //end of Action Listener override
	
	/*
	 * Age calculator frame
	 */
	public static void main(String[] args) {
		//create a GUIApplication object
		GUIApplication appFrame = new GUIApplication();
		
		//setup the appFrame object
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.pack();
		appFrame.setVisible(true);
	}

}
