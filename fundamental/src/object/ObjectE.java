package object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

//��ʱ�������test����
public class ObjectE implements ActionListener {

	//����������ִ�и÷���
	public void actionPerformed(ActionEvent e) {
		Date date = new Date();
		System.out.println(date);
	}
	
}
