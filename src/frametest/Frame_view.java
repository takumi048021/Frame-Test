package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;



public class Frame_view extends Frame implements ActionListener,WindowListener{
  
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private TextField text4 = new TextField("",10);
	private Button button1 = new Button("‘«‚µŽZ");
	private Button button2 = new Button("ˆø‚«ŽZ");
	private Button button3 = new Button("Š|‚¯ŽZ");
	private Button button4 = new Button("Š„‚èŽZ");
	public Frame_view() {
    	addWindowListener(this);
    	setTitle("FrameTest");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(text1);
        add(text2);
     	add(button1);
     	button1.addActionListener(this);
     	add(button2);
     	button2.addActionListener(this);
     	add(button3);
     	button3.addActionListener(this);
     	add(button4);
     	button4.addActionListener(this);
        add(text3);
        add(new Label("—]‚è"));
        add(text4);
        
       
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
	//	text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1,val2);
		if(e.getSource() == button1) {
			text3.setText(String.valueOf(clib.getPlus()));
			text4.setText(null);
		}
		
		else if(e.getSource() == button2) {
			text3.setText(String.valueOf(clib.getMinus()));
			text4.setText(null);
		}
		
		else if(e.getSource() == button3) {
			text3.setText(String.valueOf(clib.getTime()));
			text4.setText(null);
		}
		
		else if(e.getSource() == button4) {
			text3.setText(String.valueOf(clib.getDivide()));
			text4.setText(String.valueOf(clib.getMod()));
		}
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
