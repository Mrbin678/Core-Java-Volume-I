package object;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ObjectL  {
	
	//����һ�����Ա����������ٽ����Ŀ�������
	private Lock bankLock = new ReentrantLock();
	/*
	 * ����һ�����캯���ǿ��Դ���һ��boolean�Ĳ����ģ����ǹ���һ����ƽ���Ե�����һ����ƽ������ƫ���ȴ�ʱ������̡߳�
	 * 	���ǣ���һ����ƽ�ı�֤����󽵵����ܡ����ԣ���Ĭ�ϵ�����£���û�б�ǿ��Ϊ��ƽ�ġ�
	 * 	
	 */
	
	public void method(){
		bankLock.lock();
		try
		{
		System.out.println("method��������");	
		}
		finally
		{
			bankLock.unlock();
		}
	}
	/*
	 * ������Ҫע����ǣ�
	 * 	ÿһ��ObjectL�������Լ���ReentrantLock������������߳���ͼ����ͬһ��ObjectL������ô�����Դ��з�ʽ�ṩ����
	 * 		���ǣ���������̷߳��ʲ�ͬ��ObjectL����ÿһ���̵߳õ���������Ͳ�һ���ˣ������߳̾Ͳ��ᷢ��������
	 * 		���ǿ�������ģ�һ���������Ĵ�����Ե�������һ��ʹ�õ���ͬ���ķ�����
	 * 
	 */
	
}
