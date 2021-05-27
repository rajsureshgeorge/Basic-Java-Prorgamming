import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Layout {

	public Layout() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(375,500);
		jf.setResizable(false);
		jf.setLocation(250, 250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel DisplayLabel=new JLabel("Hello");
		DisplayLabel.setBounds(40, 50, 300,60 );
		jf.add(DisplayLabel);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.RED);
	//	DisplayLabel.setVisible(true);
		DisplayLabel.setBackground(Color.black);
		DisplayLabel.setOpaque(true);
		
		JButton SevenButton=new JButton("7");
		SevenButton.setBounds(50, 120, 80, 80);
		SevenButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(SevenButton);
		
		JButton EightButton=new JButton("8");
		EightButton.setBounds(150, 120, 80, 80);
		EightButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(EightButton);
		
		JButton NineButton=new JButton("9");
		NineButton.setBounds(250, 120, 80, 80);
		NineButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(NineButton);
		
		JButton FourButton=new JButton("4");
		FourButton.setBounds(50, 220, 80, 80);
		FourButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(FourButton);
		
		JButton FiveButton=new JButton("5");
		FiveButton.setBounds(150, 220, 80, 80);
		FiveButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(FiveButton);
		
		JButton SixButton=new JButton("6");
		SixButton.setBounds(250, 220, 80, 80);
		SixButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(SixButton);
		
		JButton ThreeButton=new JButton("1");
		ThreeButton.setBounds(50, 320, 80, 80);
		ThreeButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(ThreeButton);
		
		JButton TwoButton=new JButton("2");
		TwoButton.setBounds(150, 320, 80, 80);
		TwoButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(TwoButton);
		
		JButton OneButton=new JButton("3");
		OneButton.setBounds(250, 320, 80, 80);
		OneButton.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(OneButton);
	
	}
	public static void main(String[] args) {
		new Layout();
	

	}

}