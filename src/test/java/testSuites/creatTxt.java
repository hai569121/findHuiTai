package testSuites;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.testng.annotations.Test;

public class creatTxt {
	
//	OutputStream out=null;
//	OutputStreamWriter we=null;
//	BufferedWriter bu=null;
	
	@Test
	public void create(){
		try {
			OutputStream out=new FileOutputStream("C:/桌面/123/222.txt",true);
			OutputStreamWriter we=new OutputStreamWriter(out);
			BufferedWriter ww=new BufferedWriter(we);
			ww.write("胜多负少");
			ww.append("aaaa");
			ww.close();
			we.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
