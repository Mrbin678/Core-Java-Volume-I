package object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

import object.ObjectF.TimePrinter;

//����һ���ڲ��������
public class ObjectG  {
	
	private int time;
	private boolean beep;
	
	public ObjectG(int time,boolean beep) {
		this.time = time;
		this.beep = beep;
	}
	
	public void start( final boolean beep){//���ﱻ�޸�Ϊfinal���ֲ��������ڲ����ǿ��Է��ʵ��ģ�����Ҫ������Ϊfinal
		final String name = "ha";
		//����һ���ڲ���
		class TimePrinter implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				/*
				 * ������Ҫ��ʹ�þֲ������ͱ���ѱ�������Ϊfinal
				 */
				System.out.println(name);
				System.out.println(beep);
				/*
				 * 	����Ϊfinal�ı����ǲ��ܱ��޸ĵģ�ֻ���Ǹ�ֵһ�ξͲ����ڸı��ˡ��������д����ǻᱻ�����:beep = false;
				 * 		��Ϊʲô�ڲ�����ʵľֲ�����һ��Ҫ������Ϊfinal?
				 * 			ע���������start(),�������������֮��beep�����ͻ᲻���ڣ����Ƕ�ʱ����Ҫ�����İ�����ʱ�����滹��Ҫ�õ�beep������
				 * 			Ϊ������actionPerformed()�����������ڷ���start()����ֵ֮ǰ��
				 * 			�Ѿֲ�����beep�ͷ�֮ǰ���б��ݣ�Ϊ�˱���һ���ԣ�����Ҫ���ֲ���������Ϊfinal���������޸��ˡ�
				 * 
				 * 		�����￴һ�������ķ��������:
				 * 			class ObjectG&TimePrinter{
				 * 				ObjectG&TimePrinter(ObjectG,boolean);//�������Ĺ�����,���Ǳ������Զ������
				 * 				public void actionPerformed(java.awt.event.ActionEvent);
				 * 				final boolean val$beep;
				 * 				final ObjectG this$0;
				 * 			}
				 * 		��������������ʱ��beep�ͻᱻ���ݸ���������������val$beep���С�
				 * 		������������Ծֲ������ķ��ʣ�Ϊÿһ������������Ӧ�������򣬲����ֲ������������������У��Ա㽫��Щ�������ʼ��Ϊ�ֲ������ĸ�����
				 */
				Date date = new Date();
				System.out.println("now is" + date);
			}
		}
		
		ActionListener timePrinter = new TimePrinter();
		Timer timer = new Timer(1000,timePrinter);
		timer.start();
		
	}
	
	
}
