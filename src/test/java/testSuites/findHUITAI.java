package testSuites;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.testng.annotations.Test;

import com.mail.api.driverAction;

public class findHUITAI {

	String HuiTai001 = "��̩����050104";
	String HuiTai002 = "��̩����060055";

	@Test
	public void findStart() throws IOException {
		driverAction action = driverAction.Instance();
		for (int i = 1833; i > 0; i--) {
			action.goToUrl("https://www.huitai188.com/index/transfer.html?id="+i);
			action.waitElement(10,"//span[text()='ÿ�����棬���ڻ���' ]/parent::h3 | //span[text()='���ڻ���+����' ]/parent::h3");
			String strtemp = action.getElement("//span[text()='ÿ�����棬���ڻ���' ]/parent::h3 | //span[text()='���ڻ���+����' ]/parent::h3").getText();
			if(strtemp.contains(HuiTai001)||strtemp.contains(HuiTai002)){
				OutputStream out=new FileOutputStream("D:\\urlTA.txt",true);
				OutputStreamWriter we=new OutputStreamWriter(out);
				BufferedWriter bu=new BufferedWriter(we);
				bu.write(strtemp+":"+action.getUrl()+"\r\n");
				bu.close();
				we.close();
				out.close();
			}
		}
	}

}
