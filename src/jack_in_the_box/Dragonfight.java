package jack_in_the_box;

import javax.swing.JOptionPane;

public class Dragonfight {
public static void main(String[] args) {
	int PlayerHealth = 100;
	int DragonHealth = 1000;
	int DragonAttack = 15;
	
for (int i = 0; i < 1;) {
	String kickoryell = JOptionPane.showInputDialog("Do you want to kick or yell at the dragon or heal?");
	if (kickoryell.equals("kick")) {
	DragonHealth = DragonHealth - 100;
	JOptionPane.showMessageDialog(null, "You kicked the dragon! The dragon's health is "+DragonHealth+", and your health is "+PlayerHealth+".");
}else if (kickoryell.equals("yell")) {
	DragonAttack = DragonAttack-1;
	JOptionPane.showMessageDialog(null, "You yelled at the Dragon! The dragon's attack was reduced to "+DragonAttack+".");
}else if (kickoryell.equals("heal")) {
	PlayerHealth=PlayerHealth+30;
	if (PlayerHealth>100) {
		PlayerHealth=100;
	}
	JOptionPane.showMessageDialog(null, "You healed yourself. You health is now "+PlayerHealth+".");
}else {
	JOptionPane.showMessageDialog(null, "I don't know what you are saying. Your turn will be skipped. >:C");
}
	if (DragonHealth<1) {
		JOptionPane.showMessageDialog(null, "You have defeated the dragon. You gain fame and recognition across the globe!");
		break;
	}
	PlayerHealth=PlayerHealth-DragonAttack;
	JOptionPane.showMessageDialog(null, "Ouch! The dragon dealt "+DragonAttack+" damage and your health has been reduced to "+PlayerHealth+".");
	if (PlayerHealth<1) {
		JOptionPane.showMessageDialog(null, "You died. ;C");
		break;
	}
}
}
}
