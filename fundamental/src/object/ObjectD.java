package object;

import java.util.Date;

public class ObjectD implements Cloneable  {
	
	private Integer a;
	private Date date;

	public Integer getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	@Override
	public ObjectD clone() throws CloneNotSupportedException {
		ObjectD objectD = (ObjectD)super.clone();
		objectD.date = (Date)date.clone();
		/*��ΪDate�ǿɱ��ʵ���򣬽��������һ��Ҫ���п�����������������������ͬһ�ɱ��ʵ����
		 * DateҲʵ����Cloneable�ýӿڣ�ֻ��ʵ�ָýӿڵ���ſ���ʵ�ֿ�¡
		 */
		return objectD;
	}

	@Override
	public String toString() {
		return "ObjectD [a=" + a + "]";
	}
	
	
	
}
