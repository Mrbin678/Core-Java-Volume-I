package object;

import java.io.Serializable;

//���ʹ���������
public class ObjectK<T extends Comparable & Serializable>  implements Serializable {
	
	private T lower;
	private T upper;
	
	/*
	 * ԭʼ��������:
	 * 		���ͱ��� T �ᱻ�滻���޶��б�ĵ�һ�����͡�
	 * 		����
	 * 		
	 * 		public class ObjectK implements Serializable{
	 * 			private Comparable lower;
	 * 			private Comparable upper;
	 * 		}
	 * 		
	 * 		����������������T�ĵط������滻�ˣ��������Ҳ�����ˡ���Ϊ�������������û�з������͵ġ�
	 */
}
