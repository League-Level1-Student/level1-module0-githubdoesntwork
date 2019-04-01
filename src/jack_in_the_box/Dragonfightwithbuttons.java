package jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dragonfightwithbuttons {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton kick = new JButton();
	static JButton yell = new JButton();
	static JButton heal = new JButton();
	static int PlayerHealth = 100;
	static int DragonHealth = 1000;
	static int DragonAttack = 15;
	static JButton timer = new JButton();
static Thread thread = new Thread();
	public static void main(String[] args) throws InterruptedException {
		panel.add(kick);
		panel.add(yell);
		panel.add(heal);
		panel.add(timer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		kick.setText("Kick");
		yell.setText("Yell");
		heal.setText("Heal");
		for (int i = 0; i < 1;) {
		kick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DragonHealth = DragonHealth - 30;
				JOptionPane.showMessageDialog(null, "You kicked the dragon! The dragon's health has been reduced to "+DragonHealth+".");
			}
		});
		yell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DragonAttack = DragonAttack - 1;
				JOptionPane.showMessageDialog(null, "You yelled at the dragon! The dragon's attack has been reduced to "+DragonAttack+".");
			}
		});
		heal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PlayerHealth = PlayerHealth + 15;
				if (PlayerHealth>100) {
					PlayerHealth=100;
				}
				JOptionPane.showMessageDialog(null, "You healed yourself! Your health has been increased to "+PlayerHealth+".");
			}
		});
		for (int j = 5; j >0; j=j-1) {
			thread.sleep(1000);
			String jString = Integer.toString(j); 
			timer.setText(jString);
		}
		PlayerHealth=PlayerHealth-DragonAttack;
		if (PlayerHealth<1) {
			JOptionPane.showMessageDialog(null, "You died. :C");
			break;
		}
		JOptionPane.showMessageDialog(null, "Ouch! The dragon dealt "+DragonAttack+" damage to you. You health is now "+PlayerHealth+".");
		}
		}

}
