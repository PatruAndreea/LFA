package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegexPattern 
{
	static boolean result;
	
	public static void main(String[] arg)
	{
		
		String input = JOptionPane.showInputDialog("Enter the string");
		String pattern = JOptionPane.showInputDialog("Enter the pattern");
		
		JFrame f;
		f = new JFrame();
		
		try
		{
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(input);
			result = m.matches();
			JOptionPane.showMessageDialog(f, result, "Title", JOptionPane.PLAIN_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(f, "Wrong regex", "Title", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
