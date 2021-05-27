import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Layout implements ActionListener{
	double number, answer;
    int calculation;
	boolean isOperatorClicked=false;
	JFrame jf;
	String oldValue,oldValueMin,oldValueMul,oldValueDiv;
	JLabel DisplayLabel;
	JButton ClearButton,SevenButton,EightButton,NineButton,FourButton,FiveButton,SixButton,OneButton,TwoButton,ThreeButton,DotButton,ZeroButton,EqualButton,PlusButton,MinusButton,MulButton,DivButton;

	public Layout() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setResizable(false);
		jf.setLocation(250, 250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DisplayLabel=new JLabel("");
		DisplayLabel.setFont(new Font("Calibri", Font.PLAIN, 55));
		DisplayLabel.setBounds(50, 20,300,90 );
		jf.add(DisplayLabel);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.RED);
		DisplayLabel.setBackground(Color.black);
		DisplayLabel.setOpaque(true);
		

		ClearButton=new JButton("<<");
		ClearButton.setBounds(350, 20, 80, 90);
		ClearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ClearButton.addActionListener(this);
		ClearButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(ClearButton);
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(50, 120, 80, 80);
		SevenButton.setFont(new Font("Arial", Font.PLAIN, 50));
		SevenButton.addActionListener(this);
		SevenButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(SevenButton);
		
		EightButton=new JButton("8");
		EightButton.setBounds(150, 120, 80, 80);
		EightButton.setFont(new Font("Arial", Font.PLAIN, 50));
		EightButton.addActionListener(this);
		EightButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(250, 120, 80, 80);
		NineButton.setFont(new Font("Arial", Font.PLAIN, 50));
		NineButton.addActionListener(this);
		NineButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(NineButton);
		
		FourButton=new JButton("4");
		FourButton.setBounds(50, 220, 80, 80);
		FourButton.setFont(new Font("Arial", Font.PLAIN, 50));
		FourButton.addActionListener(this);
		FourButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(150, 220, 80, 80);
		FiveButton.setFont(new Font("Arial", Font.PLAIN, 50));
		FiveButton.addActionListener(this);
		FiveButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(FiveButton);
		
		SixButton=new JButton("6");
		SixButton.setBounds(250, 220, 80, 80);
		SixButton.setFont(new Font("Arial", Font.PLAIN, 50));
		SixButton.addActionListener(this);
		SixButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(SixButton);
		
		OneButton=new JButton("1");
		OneButton.setBounds(50, 320, 80, 80);
		OneButton.setFont(new Font("Arial", Font.PLAIN, 50));
		OneButton.addActionListener(this);
		OneButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(150, 320, 80, 80);
		TwoButton.setHorizontalAlignment(SwingConstants.CENTER);
		TwoButton.addActionListener(this);
		TwoButton.setFont(new Font("Arial", Font.PLAIN, 50));
		jf.add(TwoButton);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(250, 320, 80, 80);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN, 50));
		ThreeButton.addActionListener(this);
		ThreeButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(ThreeButton);
	
		DotButton=new JButton(".");
		DotButton.setBounds(50, 420, 80, 80);
		DotButton.setFont(new Font("Arial", Font.PLAIN, 50));
		DotButton.addActionListener(this);
		DotButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(150, 420, 80, 80);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN, 50));
		ZeroButton.addActionListener(this);
		ZeroButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(ZeroButton);
		
		EqualButton=new JButton("=");
		EqualButton.setBounds(250, 420, 80, 80);
		EqualButton.setFont(new Font("Arial", Font.PLAIN, 50));
		EqualButton.addActionListener(this);
		EqualButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(EqualButton);
		
		PlusButton=new JButton("+");
		PlusButton.setBounds(350, 120, 80, 80);
		PlusButton.setFont(new Font("Arial", Font.PLAIN, 50));
		PlusButton.addActionListener(this);
		PlusButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(PlusButton);
		
		MinusButton=new JButton("-");
		MinusButton.setBounds(350, 220, 80, 80);
		MinusButton.setFont(new Font("Arial", Font.PLAIN, 50));
		MinusButton.addActionListener(this);
		MinusButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(MinusButton);
		
		MulButton=new JButton("*");
		MulButton.setBounds(350, 320, 80, 80);
		MulButton.setFont(new Font("Arial", Font.PLAIN, 50));
		MulButton.addActionListener(this);
		MulButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(MulButton);
		
		DivButton=new JButton("/");
		DivButton.setBounds(350, 420, 80, 80);
		DivButton.setFont(new Font("Arial", Font.PLAIN, 50));
		DivButton.addActionListener(this);
		DivButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(DivButton);
		
		
	}
	public static void main(String[] args) {
		new Layout();
	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==ZeroButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("0");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"0");	
		}
	}
	else if (e.getSource()==OneButton) {
		
		if(isOperatorClicked==true) {
			DisplayLabel.setText("1");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"1");	
		}

	}
	else if (e.getSource()==TwoButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("2");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"2");	
		}
	}
	else if (e.getSource()==ThreeButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("3");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"3");	
		}
	}
	else if (e.getSource()==FourButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("4");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"4");	
		}
	}
	else if (e.getSource()==FiveButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("5");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"5");	
		}
	}
	else if (e.getSource()==SixButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("6");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"6");	
		}
	}
	else if (e.getSource()==SevenButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("7");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"7");	
		}
	}
	else if (e.getSource()==EightButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("8");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"8");	
		}
	}
	else if (e.getSource()==NineButton) {
		if(isOperatorClicked==true) {
			DisplayLabel.setText("9");
			isOperatorClicked=false;
			
		}
		else {
		String labelText=DisplayLabel.getText();
		DisplayLabel.setText(labelText+"9");	
		}
	}
			
	
	
	else if (e.getSource()==DotButton) {
		String labelText10=DisplayLabel.getText();
		DisplayLabel.setText(labelText10+".");	
	}
	else if (e.getSource()==PlusButton) {
		String str = DisplayLabel.getText();
		DisplayLabel = Double.parseDouble(DisplayLabel.getText());
        DisplayLabel.setText("");
        label.setText(str + "+");
        calculation = 1;
		isOperatorClicked=true;
		oldValue = DisplayLabel.getText();
	}
	else if (e.getSource()==MinusButton) {
		isOperatorClicked=true;
		oldValueMin = DisplayLabel.getText();
	}
	else if (e.getSource()==MulButton) {
		isOperatorClicked=true;
		oldValueMul=DisplayLabel.getText();
	}
	else if (e.getSource()==DivButton) {
		isOperatorClicked=true;
		oldValueDiv=DisplayLabel.getText();

	
	}
	else if (e.getSource()==ClearButton) {
		isOperatorClicked=true;
	String labelText=DisplayLabel.getText();
	DisplayLabel.setText("");	
	}
	else if (e.getSource()==EqualButton) {
		String newValue=DisplayLabel.getText();
		float oldvaluef=Float.parseFloat(oldValue);
		float newvaluef=Float.parseFloat(newValue);
		float oldvalueMin=Float.parseFloat(oldValueMin);
//		float oldValueMul=Float.parseFloat(oldValueMul);
//		float oldValueDiv=Float.parseFloat(oldValueDiv);
		
		float Result=oldvaluef+newvaluef;
		float Result1=oldvalueMin-newvaluef;
//		float Result2=oldValueMul*newvaluef;
//		float Result4=oldValueDiv/newvaluef;
		
		DisplayLabel.setText(Result+"");
//		DisplayLabel.setText(Result2+"");
		DisplayLabel.setText(Result1+"");
//		DisplayLabel.setText(newValue);
	}
	}

}