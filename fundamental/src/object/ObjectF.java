package object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

//����һ�����ӣ���Ҫ���˼�����һ�Σ�Ҫ��Ҫ����
public class ObjectF  {
	
	private int time;
	private boolean beep;
	
	public ObjectF(int time,boolean beep) {
		this.time = time;
		this.beep = beep;
	}
	
	/*	����һ���ڲ���
	 * 		�ڲ�������λ�ȡ��Χ������ݵ�
	 * 	
	 * 	������Χ��ͨ��������Եȵ�һ������
	 * 		public boolean access$0(ObjectF)
	 *	 		��������Ƿ���һ����Χ���е�ʵ��boolean beep�����˵Ĳ�������Χ�����
	 *
	 *		ͨ������access$0�����Ϳ��Զ�ȡ˽�б���.
	 *		
	 *		���ڲ�����Ҫ��Χ���boolean beepʱ���ڲ���ͻ�������������Ȼ��ͻ᷵�ظ�ֵ
	 */
	public class TimePrinter implements ActionListener{
		
		//��ʱ��ÿ��ʱ��Ҫִ�еķ���
		public void actionPerformed(ActionEvent e) {
			Date date = new Date();
			System.out.println(date);
			if(beep){//�ȼ���if(outer.beep)---����Χ���������ó�Ϊouter
				//��TimePrinterû��beep��ʵ�����ڲ�����Է�����Χ������������
				System.out.println("��ӡ��beep");
			}
		}
	}
	
	public void start(){
		TimePrinter timePrinter = new TimePrinter();
//		TimePrinter timePrinter1 = this.new TimePrinter();//Ҳ��������ʵ����һ���ڲ���this�ؼ���
		Timer timer = new Timer(time,timePrinter);//�ڶ���������Ҫ��һ��ʵ����ActionListener�ӿڵĶ��󴫽�ȥ
		timer.start();
	}
	
}
