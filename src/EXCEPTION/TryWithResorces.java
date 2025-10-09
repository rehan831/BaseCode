
package EXCEPTION;
import java.io.*;

public class TryWithResorces {
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader ("abc.txt")) )
		{
		//br = new BufferedReader(new FileReader("output.txt"));
			//if i write like this ce: saying autocloseabl resource br may not be asigned
		}

	}

}
