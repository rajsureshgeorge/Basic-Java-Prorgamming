import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Layout implements ActionListener{
	JFrame jf;
	JLabel DisplayLabel;
	JButton SevenButton,EightButton,NineButton,FourButton,FiveButton,SixButton,OneButton,TwoButton,ThreeButton,DotButton,ZeroButton,EqualButton,PlusButton,MinusButton,MulButton,DivButton;

	public Layout() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setResizable(false);
		jf.setLocation(250, 250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DisplayLabel=new JLabel("");
		DisplayLabel.setFont(new Font("Calibri", Font.PLAIN, 50));
		DisplayLabel.setBounds(50, 20,380,90 );
		jf.add(DisplayLabel);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.RED);
	//	DisplayLabel.setVisible(true);
		DisplayLabel.setBackground(Color.black);
		DisplayLabel.setOpaque(true);
		
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
		DisplayLabel.setText("0");	
	}
	else if (e.getSource()==OneButton) {
		DisplayLabel.setText("1");	
	}
	else if (e.getSource()==TwoButton) {
		DisplayLabel.setText("2");	
	}
	else if (e.getSource()==ThreeButton) {
		DisplayLabel.setText("3");	
	}
	else if (e.getSource()==FourButton) {
		DisplayLabel.setText("4");	
	}
	else if (e.getSource()==FiveButton) {
		DisplayLabel.setText("5");	
	}
	else if (e.getSource()==SixButton) {
		DisplayLabel.setText("6");	
	}
	else if (e.getSource()==SevenButton) {
		DisplayLabel.setText("7");	
	}
	else if (e.getSource()==EightButton) {
		DisplayLabel.setText("8");	
	}
	else if (e.getSource()==NineButton) {
		DisplayLabel.setText("9");	
	}
	else if (e.getSource()==DotButton) {
		DisplayLabel.setText(".");	
	}
	else if (e.getSource()==PlusButton) {
		DisplayLabel.setText("+");	
	}
	else if (e.getSource()==MinusButton) {
		DisplayLabel.setText("-");	
	}
	else if (e.getSource()==MulButton) {
		DisplayLabel.setText("*");	
	}
	else if (e.getSource()==DivButton) {
		DisplayLabel.setText("/");	
	}
	else if (e.getSource()==EqualButton) {
		DisplayLabel.setText("=");	
	}
	}

}