package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookieifalkdhsaljfjeilsajfidksajfojdsa implements ActionListener {
		   public void showButton() {
			   JFrame frame = new JFrame();
			   frame.setVisible(true);
			   JButton button = new JButton();
			   frame.add(button);
			   frame.pack();
			   button.addActionListener(this);
			   
		     System.out.println("Button clicked");
		    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int rand = new Random().nextInt(5);
			if (rand==1) {
				JOptionPane.showMessageDialog(null, "Stop clicking me.");
			}
			if (rand==2) {
				JOptionPane.showMessageDialog(null, "Please stop clicking me.");
			}
			if (rand==3) {
				JOptionPane.showMessageDialog(null, "Stop clicking me now.");
			}
			if (rand==4) {
				JOptionPane.showMessageDialog(null, "If you keep clicking me, you will break your mouse.");
			}
			if (rand==0) {
				JOptionPane.showMessageDialog(null, "Please stop clicking me now.");
			}
		}
		}
