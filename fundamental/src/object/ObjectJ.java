package object;

import java.io.IOException;

/*
 * �Զ���һ���쳣��
 * 		��Ҫ�����Ƕ���һ��������Exception���࣬������������Exception�������(����IOException)
 * 		   ϰ���϶������Ӧ�ð���������������һ����Ĭ�ϵĹ�������һ���Ǵ�����ϸ��Ϣ�Ĺ�����(�����toString�������ӡ��Щ��ϸ����Ϣ�����ڵ������Ƿǳ����õ�)
 * 	
 */
public class ObjectJ extends IOException  {

	public ObjectJ(){}
	
	public ObjectJ(String gripe){
		super(gripe);
	}
	
	
}
