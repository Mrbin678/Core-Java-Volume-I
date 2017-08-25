package test;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

import javax.swing.Timer;
import object.ObjectA;
import object.ObjectD;
import object.ObjectE;
import object.ObjectF;
import object.ObjectG;
import object.ObjectH;
import object.ObjectJ;
import object.ObjectK;
import object.ObjectL;

import org.junit.Test;

public class Test1 {
	
	@Test
	public void testB(){
		Integer a = 100;
		Integer b = 100;
		System.out.println("100����100?");
		if (a == b) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		Integer c = 1000;
		Integer d = 1000;
		System.out.println("1000����1000?");
		if (c == d) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		/*if (a.equals(b)) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}*/
		/*
		 * ���Ƕ�����-128��127֮���������װ���̶��Ķ�����
		 */
	}
	
	@Test
	public void testC(){
		ArrayList<Integer> list = new ArrayList<Integer>();//��java7�в���Ҫ���Ҷ�д�����ݵ�����
		list.add(3);
		/*
		 * ��ʱ����Ҫ��int�����Ļ�������ת��Ϊ�������еĻ������Ͷ���һ����֮��Ӧ���ࡣ
		 * 	����Integer���Ӧ�Ļ���������int��ͨ����Щ���Ϊ��װ��
		 * 
		 * 3��һ���������ͣ�Ҫ��3ת��ΪInteger������ܷŽ������У������ﲻ�ǲ��ã�����java�Զ��Ľ�list.add(3);
		 * 	���list.add(Integer.valueOf(3));�������ǽ�3ת������Integer����ֻ�ǲ���Ҫ����Ա�Լ�����ת����
		 * 	���ֱ任����Ϊ�Զ�װ�䡣
		 * 	
		 * 	�෴�أ�����Ҫ��Integer���󸳸�һ��intֵʱ�������Զ��ز��䡣
		 * 		Ҳ����˵����������������
		 * 			int n = list.get(1);
		 * 				����Ϊ
		 * 			int n = list.get(1).intValue();
		 */
		
		
		/*
		 * 	�������������ʽ��Ҳ���Զ�װ��Ͳ��䡣���磬���Խ�����������Ӧ����һ����װ������
		 * 		Integer n = 3;
		 * 		n++;
		 * 	���������Զ��ز��һ����������ָ��� n.intValue()(���ǽ�Integer������ת��Ϊint��������)
		 * 		Ȼ������������㣬
		 * 	����ٽ����װ��
		 * 		Integer.valueOf(n)
		 */
	}
	
	@Test
	public void testD(){
		double max = max(3.1,40.4,-5);//�������������
		System.out.println(max);
		/*
		 * java����һ�����鴫�ݸ��ɱ�������������һ������
		 */
	}
	
	public static double max(double... values){
		double largest = Double.MIN_VALUE;
		for (double v : values) {
			if (v > largest) {
				largest = v;
			}
		}
		return largest;
	}

	
	//ö����
	public enum Size{
		SMALL,MEDIUM,LARGE,EXTRA_LARGE
	};
	/*
	 * ʵ���ϣ�������������������һ���࣬���պ���4��ʵ���������ڴ˾�����Ҫ�����¶���
	 * 	
	 */
	
	public enum SizeA{
		SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("E");
		private String abbreviation;
		private SizeA(String abbreviation){
			this.abbreviation = abbreviation;
		}
		public String getAbbreviation(){
			return abbreviation;
		}
	}
	

	/*
	 * ��¡������ǳ��¡�����¡
	 * 	ǳ��¡����ֻ�ǿ�¡��ǰ�Ķ��󣬲����¡�ö������������õı������Ǿ��������������滹��������ͬһʵ����
	 * 		���¡���ǰ������ʵ����Ҳ��¡�������Ҫ�Լ�ʵ�֣�
	 * 	Ҫ��ʵ�ֿ�¡���ܵ��� ������ʵ����Cloneable�ӿڣ�������д��clone����(���η�Ϊpublic)
	 * 
	 */
	@Test
	public void testH() throws CloneNotSupportedException{
		ObjectD objectD = new ObjectD();
		objectD.setA(5);
		System.out.println(objectD);
		ObjectD obj =  objectD.clone();
		obj.setA(6);
		System.out.println(obj);
	}

	/*
	 * ���е��������Ͷ���һ��clone�������������������Ϊpublic��������protect��
	 * 	����������һ��������һ��������������Ԫ�ؿ�����һ�������顣
	 */
	@Test
	public void cloneArray(){
		int[] a = {2,3,4,5};
		int[] clone = a.clone();
	}
	
	
	/*
	 * ��ʱ��:
	 * 	ʹ�����ڸ�����ʱ��������֪ͨ
	 * 		
	 */
	@Test
	public void timer() throws InterruptedException{
		ObjectE objectE = new ObjectE();
		Timer timer = new Timer(1000,objectE);//�ڶ�������һ��Ҫ��ActionListener���͵�
		//������ʱ��
		timer.start();
		Thread.sleep(10000);
		/*
		 * ÿһ��ִ��ObjectE�е�actionPerformed����һ��
		 */
	}
	
	
	/*
	 * �ڲ���,�����ϸ�ڲο�����������
	 * 	���ڲ������ʹ��outer/OuterClass/�������ⲿ��
	 * 		���ⲿ�����ʹ��OuterClass.InnerClass�������ڲ���
	 */
	@Test
	public void inClass() throws InterruptedException{
		ObjectF objectF = new ObjectF(1000,true);
		objectF.start();
		Thread.sleep(10000);
	}
	
	
	
	/*
	 * 	�ֲ��ڲ���:�������Ƿ��ڷ�������
	 * 		�ֲ��ڲ��಻����public��private����˵�������������������������޶�����������ֲ���Ŀ��С�
	 * 			�ֲ��ڲ�����һ�����ƣ������ⲿ���������ȫ��������������ʹ����Χ���е���������Ҳ���ܷ��ʡ�
	 * 				(���������start)֮�⣬û���κη���֪���ڲ���TimePrinter�Ĵ��ڡ�
	 * 			�ֲ��ڲ��໹��һ���ŵ���ǣ��������ɷ��ʰ������ǵ��ⲿ�࣬�����Է��ʾֲ�������������Щ�ֲ�����Ҫ����Ϊfinal��
	 * 
	 * 	��ObjectG���о����˵��ΪʲôҪ�ڲ���Ϊʲôֻ�ܷ��ʱ�����Ϊfinal�ľֲ�������
	 * 
	 * 	ǰ��������final������Ϊ����ʹ�ã�����:	
	 * 		public static final double SPEED_LIMIT = 55;
	 * 			final�ؼ��ֿ���Ӧ���ھֲ�������ʵ����������̬������
	 * 			��������Щ����£����ǵĺ��嶼��:
	 * 				�ڴ����������֮��ֻ�ܹ�Ϊ֮��ֵһ�Ρ��˺���Ҳ�����޸�����ֵ�ˡ������final
	 */
	@Test
	public void inClassA() throws InterruptedException{
		ObjectG objectG = new ObjectG(1000,true);
		objectG.start(true);
		Thread.sleep(10000);
	}
	/*
	 * �������������Ҫͳ��һ��counter�Ĵ���(���벻׼ȷ)����counterһ����Ҫ�ı�ã����ܱ�����Ϊfinal
	 * 		���������ڲ���������Ҫ���ʾֲ�����������ֲ������ͱ���Ҫ������Ϊfinal����ʱ��ͺ����Ρ�
	 * 		
	 * 	����İ취����:
	 * 		ʹ��һ������Ϊ1�����飬����������Ա�����Ϊfinal����������Ǳ�ʾ������������������һ�����飬�����ܵ������ǿ������ɸ��ĵġ�
	 */
	@Test
	public void finalWord(){
//		int counter = 0;//���������
		final int[] counter = new int[1];//��ȷ�Ľ������
		Date[] date = new Date[100];
		for (int i = 0; i < date.length; i++) {
			date[i] = new Date(){
				public void compar(Date other){
					//counter++;
					counter[0]++;
				}
			};//����һ���ڲ��࣬������Ҫ;��β
		}
	}
	
	
	/*
	 * �����ڲ���:
	 * 		���ֲ��ڲ����ʹ��������һ����ֻ����������һ�����󣬶���������������Ϊ�����ڲ���
	 * 	
	 * 	ͨ�����﷨��ʽ��:
	 * 		new SuperType(construction parameters){
	 *			inner class method and data 			
	 * 		}
	 * 		SuperType������ActionListener�����Ľӿڣ�Ҳ������һ���࣬�����ڲ����ȥ��չ��
	 * 		���ڹ����������ֱ�����������ͬ����������û������������i�������಻���й�������ȡ����֮���ǣ����������������ݸ����๹������
	 * 		���������ڲ���ʵ�ֽӿڵ�ʱ�򣬲������κεĹ�����������
	 * 	
	 */
	@Test
	public void anonymousInner(){
		/*
		 * �������˼�Ǵ���һ��ʵ��ActionListener�ӿڵ��࣬��Ҫʵ�ֵķ���actionPerformed����������{}��
		 */
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dosomething");
			}
		};
	}
	
	/*
	 *	����ļ��ɳ�Ϊ"˫���ų�ʼ�� ":���� �����ڲ��� ����һ�������б�
	 */
	@Test
	public void doubleBraceInitialization(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		invite(list);//�����д���������Ĵ�����һ����
		invite(new ArrayList<String>(){
			{
				add("A");
				add("B");
			}
		});
		/*
		 * ע�������˫���š�������Ž�����ArrayList��һ���������ࡣ�ڲ�������һ�������
		 */
	}
	public void invite(ArrayList list){}
	
	
	/*
	 * ��̬�ڲ���:ʹ��һ���ڲ��࣬����Ҫ������Χ�࣬���ڲ�������Ϊstatic��
	 * 		������һ�����Ӽ��������е����ֵ����Сֵ
	 * 	���ڲ��಻��Ҫ������Χ������ʱ��Ӧ��ʹ�þ�̬�ڲ��ࡣ
	 * 		�����ڽӿ��е��ڲ����Զ���Ϊstatic��public��     
	 */
	@Test
	public void staticClass(){
		double[] array = new double[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		ObjectH.Pair p = ObjectH.Pair.minmax(array);
		System.out.println(p.getMint());
		System.out.println(p.getMax());
	}
	
	
	@Test
	public void proxy(){
		int[] a = new int[10];
		a[11] = 1;//����RuntimeException����Խ�磬����Ҫ�׳��쳣����Ҫ���������Ƴ���������ԣ��ڵ���֮ǰ���һ��
	}
	
	
	//�Զ���һ���쳣
	@Test
	public void createException() throws ObjectJ{
		//ObjectJ��һ���Զ���õ��쳣
		throw new ObjectJ();
	} 
	
	
	/*
	 * �����쳣
	 * 		�׳�һ���쳣�ܼ򵥣�ֻҪ�����׳��Ͳ�������ˣ�
	 * 			���ǣ���Щ���������в����쳣�����ĳ���쳣������ʱ��û�����κεط����в����ǳ���ͻ���ֹ�����ڿ���̨�ϴ�ӡ�쳣��Ϣ��
	 * 
	 * 		Ҫ�벶��һ���쳣���ͱ�������try/catch����
	 * 
	 * 			�����try�����е��κδ����׳���һ��catch�Ӿ���˵�����쳣�࣬��ô
	 * 				1.��������try����е�ʣ�����
	 * 				2.����ִ��catch�־��еĴ���
	 * 
	 * 			���try������û���׳��κεĴ��룬��ô��������catch�Ӿ�
	 * 
	 * 			��������е��κδ����׳�һ����catch�Ӿ���û���������쳣���ͣ���ô��������ͻ������˳���(ϣ��������Ϊ�������͵��쳣�����catch)
	 *			    
	 *		��ѡ���׳�ȥ����cacth?
	 *			ͨ��Ӧ�ò�����Щ֪����ô������쳣��������Щ��֪����ô������쳣�������д���()
	 *
	 *		ע��:
	 *			�����дһ�����ǳ���ķ������������е����������û���׳��쳣����ô�����е���������ͱ��벶�����е��Ѽ���쳣��
	 *				�����������throws˵�����г��ֳ������෽�����г����쳣�෶Χ��
	 */
	@Test
	public void catchException(){
		try {
			//�����׳�һ���쳣������ѡ���׳�ȥ��Ҳ����ѡ��catch
			throw new ObjectJ();
		} catch (ObjectJ e) {
			//��һ�д����У�ObjectJ���쳣������
			e.printStackTrace();
		}
	}
	
	//�����쳣����쳣
	@Test
	public void catchManyException(){
		try {
			throw new ObjectJ();
			//����������кܶ���룬�׳����ָ������쳣������ͽ������׳����쳣����ȫ��catch��Ϊÿһ���쳣���͵���ʹ�õ�catch�Ӿ�
		} catch (ObjectJ e) {
			e.getMessage();
			/*
			 * �쳣������ܰ������쳣�����йص���Ϣ��Ҫ���ȡ����������Ϣ����������ʹ��e.getMessage()�ȵ���ϸ�Ĵ�����Ϣ(����еĻ�)��
			 * 		����ʹ��e.getClass.getName()���Եȵ��쳣�������ϸ����
			 * 
			 * 	��java SE 7�У�ͬһ��catch�Ӿ��п��Բ������쳣�����͡����磬�����Ӧ��ȱ���ļ���δ֪�����쳣��һ���ģ��Ϳ��Ժϲ�catch�Ӿ�
			 * 		try{
			 * 			...;
			 * 		} catch(FileNotFoundException | UnKnownHostException e){	
			 * 			...;
			 * 		}
			 * 	ֻ�е�������쳣�˴�֮�䲻���������ϵʱ����Ҫ�������
			 * 	�������쳣ʱ ���쳣��������Ϊfinal���������磬���������µ��Ӿ���Ϊe����ͬ��ֵ
			 * 	�������쳣����������Ĵ��뿴�������򵥣��������Ч�����ɵ��ֽ���ֻ����һ����Ӧ����catch�־�Ĵ����
			 * 
			 */
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	
	/*
	 * 	�ٴ��׳��쳣���쳣��:
	 * 		��catch�Ӿ��п����׳�һ���쳣����������Ŀ���Ǹı��쳣�����͡����ڱ�ʾ��ϵͳ�쳣���Ϳ����ж��ֽ�����
	 * 			����ServletException��������һ���쳣���͵����ӣ�
	 * 				���ܲ���֪����������ľ���ϸ��ԭ�⣬��ϣ����ȷ��֪���ǲ��������⡣
	 */
	@Test
	public void againThrows() throws Exception {
		try {
			throw new ObjectJ();
		} catch (ObjectJ e) {
			//throw new Exception();//catch���������׳��쳣
			/*
			 * ���滹����һ�ָ��õķ�������ԭʼ�쳣����Ϊ���쳣��ԭ��
			 * 		�������쳣ʱ���Ϳ���ʹ������������䲶���쳣��,�ֿ������µõ�ԭʼ���쳣
			 * 			Throwable = se.getCause();
			 * 		ǿ�ҽ���ʹ�����ְ�װ�����������������û��׳���ϵͳ�еĸ߼��쳣�������ᶪʧԭʼ�쳣��ϸ�� 
			 * 
			 * 	�����һ�������з���һ���Ѽ���쳣�����������׳�������ô��װ������ʮ�������ˡ����ǿ��Բ�������Ѽ���쳣����������װ��һ������ʱ���쳣
			 * 		
			 */
			Exception se = new Exception();
			se.initCause(e);
			throw se;
		}
	}
	
	
	
	/*
	 * final�Ӿ�
	 * 		1.try�׳��쳣����ִ��catch����ִ��final
	 * 		2.tryû���׳��쳣��try����ִ���ִ꣬��final
	 * 		3.try�׳��쳣Ϊǰ�ᣬcatch�����׳��쳣��һ��ִ��final���쳣�����׻ظ������ĵ�����
	 * 	
	 * 	ע�⣺
	 * 		1.try����ֻ��final��䣬û��catch���
	 * 		2.���try����return��final��Ҳ��return����ôfinal�е�return���Ḳ��try�е�return
	 * 		3.try�׳��쳣��finalҲ�׳����쳣��try�е��쳣���ᶪʧ��ת���׳�final�е��쳣(һ����try�е��쳣������˼)��
	 * 			������close�����У��رղ��˾ͻ��׳��쳣��Ϣ������try�е��쳣��Ϣ��
	 * 			���˵��ǣ���se7�йر���Դ�Ĵ�������׵ö�(������һ��testҪ˵�Ĵ���Դ��try���)��
	 */
	
	/*
	 * ����Դ��try���
	 * 		�������µĴ���ģʽ
	 * 			open a resoure
	 * 			try{
	 * 			}final{
	 * 				close resoure
	 * 			}
	 * 		
	 * 		���������resoure��ʵ����AutoCloseable�ӿڵ��࣬SE7Ϊ���ִ���ģʽ�ṩ��һ�������õĿ�ݷ�ʽ��
	 * 			����ӿ���һ�������� void close() throws Exception
	 * 		(���⻹��һ��Closeable�ӿڣ�����AutoCloseable���ӽӿڣ�Ҳ����һ��close�������׳�����һ��IOException)
	 * 		
	 * 		�Ϳ���������ķ�ʽ��ʵ�ָ�����һ�����ܵĴ����ˣ����Ǵ���Դ��try���
	 * 			try(Resoure re = ...){
	 * 				work..
	 * 			}
	 * 		��try���˳���ʱ��(������ִ���껹���׳��쳣)���������re.close()���ͺ���ʹ����finalһ��������������Ҫ�����close()
	 * 
	 * 		����һ��test�п��Կ�������try��final�е�close���׳��쳣����ôfinal�е��쳣�ͻḲ��try�е�
	 * 			���ִ���Դ��try�ͺܺõĽ����������⣬ԭ�����쳣���׳�����close�������׳����쳣�ᱻ���ơ�
	 * 				����addSuppressed�������ӵ�ԭ�����쳣����������Щ�쳣����Ȥ�����Ե���getSuppressed��������õ�close�����׳����쳣
	 */		

	
	
	/*
	 *	��ջ����:
	 *		��һ���������ù��̵��б��������˳���ִ�й����з������õ��ض�λ�á�
	 *			�Դ�ӡ�����÷�������ϸ��Ϣ�������Ǹ��࣬�Ǹ������ĵڼ���
	 */
	@Test
	public void stackTrace(){
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		for (Thread t : map.keySet()) {
			StackTraceElement[] stackTraceElements = map.get(t);
			for (StackTraceElement stackTraceElement : stackTraceElements) {
				System.out.println(stackTraceElement.toString());
			}
		}
	}
	
	
	/*
	 * 	����:
	 * 		ʹ�÷��ͻ��Ʊ�д�Ĵ�����и��õİ�ȫ�ԺͿɶ���
	 */
	
	/*
	 * 	����򵥵ķ���
	 * 		Pair������һ�����ͱ���T����<>�����������������ĺ��档
	 * 			���Ϳ������������͵ı�����
	 * 				������Զ���Pair�࣬���е�һ����͵ڶ�����ʹ�ò�ͬ������
	 * 					public class Pair<T,U>{...}
	 * 		�ඨ������ͱ���(����<>���涨���)������Ϊ��ָ�������ķ��������Լ���(ָʵ������)�;ֲ�����������
	 */
	class Pair<T> {
		private T first;
		private T second;
		public Pair(){first=null;second=null;}
		public Pair(T first,T second){this.first = first;this.second = second;}
		public void setFirst(T newValue){first = newValue;}
		public void setSecond(T newValue){second = newValue;}
	}

	/*
	 * 	�þ���������滻���ͱ����Ϳ���ʵ������������
	 * 		�����ʵ����һ����������pair
	 * 			�����Ϳ�������ɰ������ T ȫ���滻��  String ������
	 */
	public void genericClass(){
		Pair<String> pair = new Pair<String>();
	}

	/*
	 * ���ͷ��� : <���ͱ���> + ����ֵ���� (������void)
	 * 	���ַ�����������ͨ���ж��壬Ҳ�����ڷ������ж��塣
	 * 		��������ͱ����� T �����ͱ����������η�(������public static)�ĺ��棬�������� (������ T ) ��ǰ��
	 * 			<T>����ȷ�����˲���Ҫ�� T ���͵�,�Լ����ص���������Ҳ�� T
	 */
	public static <T> T getMethodA(T... a){//���� T...��ʾһ������
		return a[a.length/2];
	}
	/*
	 * ������û�з���ֵ������<T>һ��Ҫд����Ϊֻ������д������������������Ƿ��ͷ��������Դ����������Ͳ���
	 * 		���д��˲��������� һ��Ҫ�ڷ��ͷ���ͷ�н�������
	 */
	public <T> void genericMethodB(T a){
	}
	/*
	 * ����һ�����ͷ������ڷ�����ǰ�ļ������зŽ����������
	 * 		��ʵ�������е�  <String>  ���Ͳ�������ʡ�Ե�
	 * 			��Ϊ���������㹻����Ϣ�����ƶϳ������õķ�����������ʲô����������Ĳ��������뷺�����ͽ���ƥ��
	 */
	@Test
	public void genericMethodC(){
		String name = Test1.<String>getMethodA("A","B","C","D");
		String name2 = Test1.getMethodA("A","B","C","D");
		/*
		 * ������д����һ���ģ�����һ���������������д��
		 * 		�����ڴ����������£����ڷ��ͷ�����������û������ġ�
		 */
		Test1.getMethodA(3.14,1729,0);//��������������һ��double���������Integer����
		/*
		 * 	������һ�д�����������:
		 * 		�����������Զ��������Ϊһ��double���������Integer����Ȼ��Ѱ����Щ��Ĺ�ͬ�����͡�
		 * 			��ʵ���ҵ����������ĳ�����:Number��Comparable�ӿڣ��䱾��Ҳ��һ���������͡�
		 * 		
		 * 		����������²�ȡ���Ⱦ��ǽ����еĲ���д��doubleֵ
		 * 			Test1.getMethodA(3.14,1729.00,0.00)
		 */
	}
	
	  
	/*
	 *	���ͱ����޶�:
	 *		�Է���������Ƿ��ͷ��� ����Լ����
	 *
	 *	�������������:
	 *		��Ҫ����compareTo���������ǵ��ø÷�����Ҫ���õĶ���ʵ��Comparable�ӿڣ����������Ĵ����Ǳ��벻�˵ģ�����Ҫ�����������ʵ�ֹ�����ô�졣
	 *			���Ծ�Ҫ�޶����˵Ĳ���Ҫ��Ҫʵ��Comparable�ӿ�
	 *		����һ�����Ӿ��������Ľ��������
	 */
	public static <T> T min(T... a){
		if(a == null || a.length == 0){
			return null;
		}
		T smallest = a[0];
		for (int i = 0; i < a.length; i++) {
//			if(smallest.compareTo(a[i])>0){
//				smallest = a[i];
//			}
		}
		return smallest;
	}
	
	/*
	 * ����Ҫ���˵Ĳ�������ʵ��Comparable�ӿڵ�
	 * 	�����extends�����Ǽ̳е���˼��
	 * 		extends��ʾTӦ�ð󶨵����͵������͡�T �� ������ ����������(������İ�������Comparable)��Ҳ�����ǽӿ�
	 * 			ѡ��extends��ԭ���Ǹ��ӽ�����ĸ������java�����Ҳ�������������������һ���µĹؼ���
	 * 
	 * 	һ�����ͱ��������ж���޶����� & ���зָ�
	 * 		<T extends Comparable & Serializable>
	 *	
	 *		����Ҫע�����:
	 *			��java�ļ̳��У�����ʵ�ֶ���ӿڣ���ֻ�ܼ̳�һ���ࡣ
	 *			�޶�Ҳ��һ���������޶�����ӿڣ���ֻ���޶�Ҫ���࣬���������һ����Ҫ���޶��б�ĵ�һ��(���������ObjectJ��һ���ֻ࣬���ڵ�һ��λ��)
	 * 		
 	 */
	public static <T extends  ObjectJ &  Comparable & Serializable> T minA(T... a){
		if(a == null || a.length == 0){
			return null;
		}
		T smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if(smallest.compareTo(a[i])>0){
				smallest = a[i];
			}
		}
		return smallest;		
	}
	
	/*
	 * ���ʹ���������
	 * 		�����û�з�������
	 * 
	 * 		����һ���������Ͷ��Զ��ṩһ����Ӧ��ԭʼ���͡�
	 * 		�������ͱ��������滻���޶�����(���޶��ı�����Object)
	 * 		
	 * 		ԭʼ������  ��һ���޶������ͱ���  ���滻(���� ���е� T �����޶��б�ĵ�һ���������滻)�����û�о���Object��
	 * 		
	 * 		���������Pair<T>�е�û���޶����ͱ���������ԭʼ������Object�滻��
	 * 	
	 * 		�����޶������͵Ļ�
	 */
	public void objectK(){
		new ObjectK();//����ο������
	}
	
	/*
	 *	 �й�java����ת������ʵ:
	 * 		1.�������û�з��ͣ�ֻ����ͨ����ͷ���
	 * 		2.���е����Ͳ����������ǵ��޶������滻
	 * 		3.�ŷ������ϳ������ֶ�̬
	 * 		4.Ϊ�������͵İ�ȫ�ԣ���Ҫʱ����ǿ��������ת��
	 */
	
	
	/*
	 * 	���͵�Լ���������
	 * 		1.�����û�������ʵ�������Ͳ���
	 * 			û��Pair<double>��ֻ��Pair<Double>	
	 * 		2.����ʱ���Ͳ�ѯֻ������ԭʼ����
	 * 			������еĶ����ǷǷ������͵ġ��������Ͳ�ѯֻ����ԭʼ���͡�
	 * 			����:
	 * 				if(a instanceof Pair<String>)//ERROR
	 * 				if(a instanceof Pair<T>)//ERROR
	 *					����������������������һ���ģ�����Ϊ�˲���a�ǲ���Pair������һ�����ͣ������ǵ����ǲ���Pair<String>���͵�
	 * 				������ǿ������ת����
	 * 					Pair<String> p = (Pair<String>)a;
	 * 				Ҫ��ס��һ�����գ����ۺ�ʱʹ��instanceof���漰�������͵�ǿ������ת�����ʽ���ῴ��һ���������ľ���
	 * 			ͬ���ĵ���:�������ĸ����͵����ͣ����صĶ���ԭʼ���͵�
	 * 				if(stringPair.getClass() == employeePair.getClass())
	 * 					���صĽ������true����Ϊ�������͵���getClass()�����صĽ������Pair.class
	 * 		3.���ܴ������������͵�����
	 * 			����ʵ�������������͵�����,����:
	 * 				Pair<String>[] table = new Pair<String>[10];//ERROR
	 * 				����֮��(���Ǳ���������û�з������)��table��������Pair[]�����԰���ת����Object[];
	 * 				Object[] objarray = table;
	 * 				������ס����Ԫ�����ͣ�������Դ��������͵�Ԫ�أ��ͻ��׳�һ��ArrayStoreException���쳣
	 * 				objarray[0] = "Hello";//ERROR--component type is Pair
	 * 				
	 * 				�������ڷ��ͣ�������ʹ���ֻ�����Ч��
	 * 				objarray[0] = new Pair<Employee>()
	 * 				�ܹ�ͨ������洢��飬������Ȼ�ᵼ��һ�����͵Ĵ��󡣳������ԭ�򣬲����������������͵����顣
	 * 
	 * 				��Ҫ˵��һ�£�ֻ�ǲ��ܴ�����Щ���飬������������ΪPair<Sting>[] �ı����ǿ��Եġ�
	 * 					����������new Pair<String>[10]��ʼ���������
	 * 
	 * 		4.����ʵ�����ͱ���
	 * 			����ʹ����new T(..),new T[..],��T.class�����ı��ʽ��
	 * 				����������Ĺ��������ǲ��Ϸ���
	 * 				public Pair(){ first = new T(); second = new T();}//ERROR
	 * 				���Ͳ�����(���Ǳ��������в���)����T��ΪObject��
	 * 
	 * 			���ǿ���ͨ���������Class.newInstance()���������췺�Ͷ���
	 * 				first = T.class.newInstance();//������д���ǲ���ȷ�ģ���ΪT.class�ǲ��Ϸ���
	 * 
	 *			�����������������API���Դ���һ���µĶ���
	 *				public static <T> Pair<T> void makePair(Class<T> c1){
	 *					return new Pair<>(c1.newInstance);//�����Ϳ��Դ���һ���µĶ�����
	 *				} 			
	 *			����������԰������µķ�ʽ���ã�
	 *				Pair<String> p = Pair.makePair(String.class);
	 *
	 *		5.������ľ�̬�����������ͱ�����Ч
	 *			�����پ�̬���̬�������������ͱ���
	 *				����,����ĸ��н�û��ʩչ
	 *					public class Siingleton<T>{
	 *						private static T singleInstance;//ERROR
	 *						public static T getSingleIntance(){...}//ERROR
	 *					}
	 *				���Ͳ�����ֻʣ��Singleton�࣬��ֻ����һ��singleInstance����ˣ���ֹʹ�ô������ͱ����ľ�̬��򷽷���
	 *
	 *		6.�����׳��򲶻������ʵ��
	 *			�Ȳ����׳�Ҳ���ܲ����������ʵ���Ͼ��Ƿ���������Throwable���ǲ��Ϸ���
	 *				һ�¶���Ͳ���ͨ����������
	 *					public class Problem<T> extends Exception {} //ERROR--can't extend Throwable
	 *			catch����в���ʹ�÷������͵ı���
	 *				try{}catch(T e){}//ERROR
	 *
	 *		7.ע�������ĳ�ͻ
	 *			���������ͱ�����ʱ��
	 *			���磺
	 *				public class Pair<T>{
	 *					public boolean equals(T value){return first.equals(value) && second.equals(value);}
	 *					//Pair����ֻ��������ʵ�����������Ƚ�������ʵ����������ˣ������������������ˡ�
	 *				}
	 *			����һ��Pair<String>���Ӹ����ϣ���������equals������
	 *				boolean equals(String)
	 *				boolean equals(Object)
	 *				�������������
	 *					boolean equals(T)
	 *					����
	 *					boolean equals(Object)	
	 *				��Object.equals(Object)������ͻ�����ȵİ취��������������������ķ�����
	 */	
	
	
	/*
	 * 	�������͵ļ̳й���
	 * 		��ʹ�÷�����ʱ����Ҫ�˽�һЩ�йؼ̳к������͵�׼��
	 * 			����:Employee �� Manager��(Manager�Ǽ̳���Employee)
	 * 				Pair<Manager>��Pair<Employee>��һ��������?����"����",ͨ��������֮��û��ʲô��ϵ��
	 * 					���ǲ�����Pair<Manager>ת����Pair<Employee>
	 * 			��һ���ƿ����������ϸ񣬵��������Ͱ�ȫ�Ƿǳ���Ҫ�ġ�
	 * 		
	 * 		ע��:���͸�java����֮�����Ҫ���𡣿��Խ�һ��Manager[]���鸳��һ������ΪEmployee[]�ı�����
	 * 			Manager[] managerArray = {ceo,cfo};
	 * 			Employee[] employeeArray = managerArray;//IS OK
	 * 			Ȼ������������ر�ı����������ͼ��һ���ͼ���Ĺ�Ա�洢��employeeArray[0]�У���������׳�һ���쳣�ġ�
	 * 				����˵��Ȼ����Employee���ã�������ȴ���ܽ�һ��Employeeʵ���Ž����У���Ϊ��ָ�����Manager�������顣
	 * 
	 * 		��Զ���Խ�һ������������ת��Ϊһ��ԭʼ���͡����磬Pair<Employee>��ԭʼ����Pair��һ�������͡�
	 * 			
	 * 		���У������������չ������ʵ�������ķ�����
	 * 			����:ArrayList<T>��ʵ��List<T>�ӿڡ������ζ�ţ�һ��ArrayList<Manager>���Ա�ת��Ϊһ��List<Manager>
	 * 				����ǰ��Ҳ˵�ˣ�һ��ArrayList<Manager>����һ��ArrayList<Employee>������List<Employee>,������û���κεĹ�ϵ��
	 */
	
	
	/*
	 * 	ͨ�������
	 * 		Pair<? extends Employee>
	 * 		��ʾ�κεķ���Pair���ͣ����Ĳ�����ָֻҪ��Employee������Ϳ��ԣ���Pair<Manager>��������Pair<String>,��ΪString����Employee������
	 * 			
	 * 		�������������:
	 * 			public static void printBuddies(Pair<Employee> p){
	 * 				Employee first = p.getFirst();
	 * 				Employee second = p.getSecond();
	 * 				...;				
	 * 			}
	 * 		����ǰ����˵�ģ����ܽ�Pair<Manager>���ݸ������������ΪPair<Manager>��Pair<Employee>û���κεĹ�ϵ��
	 * 			
	 * 		��һ��������ƣ�����ķ����ܼ�:ʹ��ͨ���
	 * 			public static void printBuddies(Pair<? extends Employee> p)
	 * 			�����Ļ���Pair<Manager>���;���Pair<Employee>����������
	 * 				���������ArrayList<Manager>���Ա�ת��Ϊһ��List<Manager>һ����ArrayList<Manager>��List<Manager>������
	 */

	/*
	 * 	ͨ����ĳ������޶�
	 * 		ͨ����޶������ͱ����޶�ʮ�����ơ����ǻ���һ�����ӵ�������������ָ��һ�������͡�
	 * 		? super Manager
	 * 			����ͨ�������ΪManager�����г����͡�(����ο���һ549ҳ)
	 */
	
	/*
	 * 	���޶�ͨ���
	 * 		Pair<?>,������ԭʼ��Pair����һ��������ʵ�����кܴ�Ĳ�ͬ��
	 * 		����
	 * 			? getFirst()
	 * 			void setFirst(?)
	 * 		getFirstֻ�ܸ�ֵ��һ��Object��setFirst�������ܱ����ã��������ܱ�Objct���á�
	 * 		
	 * 		Pair<?>��ԭʼ��Pair�������:����ʹ�������Object�������ԭʼ���setFirst()������
	 */
	
	
	/*
	 * 	����ͷ���
	 * 		����Class���Ƿ��͵ġ�����,String.classʵ������һ��Class<String>��Ķ���(��ʵ����Ψһ�Ķ���)
	 */
	@Test
	public void stringClass(){
		Class<String> s = String.class;
		Class<String> sa = String.class;
		System.out.println(s == sa);
	}
	
	
	/*
	 * 	����
	 * 		��java����У�������Ļ����ӿ���Collection�ӿڡ�����ӿ���������������
	 * 			public interface Colletion<E> {
	 * 				boolean add(E element);
	 * 				Iterator<E> iterator();
	 * 			}
	 * 			
	 * 			add���������򼯺������Ԫ�ء����Ԫ���Ǹı��˼��Ͼͷ���true�����򷵻�false��
	 * 				���������ͼ�򼯺������һ���󣬶���������ڼ������Ѿ������ˣ�����������ʧ�ܣ�����false����Ϊ�����в��������ظ���Ԫ�ء�
	 * 			iterator�������ڷ���һ��ʵ��Iterator�ӿڵĶ��󡣿���ʹ������������������η��ʼ����е�Ԫ�ء�
	 * 				Iterator�ӿ�����������
	 * 					public interface Iterator<E> {
	 * 						E next();
	 * 						boolean hasNext();
	 * 						void remove();
	 * 					}
	 * 					��������next��������������ʼ����е�Ԫ�ء����ǣ�������Ｏ�ϵ�ĩβ��next�ͻ��׳�һ���쳣NoSuchElementException.
	 * 					�����ڵ���next֮ǰӦ�õ���hasNext�����ж��Ƿ�����һ��Ԫ�ء��������Ԫ�ؾͷ���true
	 * 					�����Ҫ�������ϣ�������һ������������hasNext����true�Ƿ�������next����
	 * 						����:
	 * 							Collection<String> c = ...;
	 * 							Iterator iter = c.iterator();
	 * 							while(iter.hasNext()){-----��������ж��Ƿ�����һ��Ԫ�أ��еĻ�����true���͵���next��������һ��Ԫ��
	 *								String element = iter.next();							
	 * 							}
	 * 						
	 * 						��java SE 5.0�����ѭ�����Բ���һ�ָ������ŵ���д��ʽ����"for each"ѭ�����Ը��Ӽ����ر�ʾͬ����ѭ��������
	 * 							for(String element : c ){ ---������ Ԫ������ + ����Ԫ�ر����� + �������� 
	 *								do something with element 								
	 * 							}
	 * 						�������򵥵ؽ�"for each" ѭ������Ϊ���е�������ѭ����
	 * 
	 * 						"for each"ѭ���������κ�ʵ����Iterable�ӿڵĶ���һ����������ӿ�ֻ��һ��������
	 * 							public interface Interable<E>{
	 * 								Iterator<E> iterator();		
	 * 							}
	 * 
	 * 						Collection�ӿ���չ��Interable�ӿڡ���ˣ����ڱ�׼����е��κμ��϶�����ʹ��"for each"ѭ����
	 * 
	 * 			Ԫ�ر����ʵ�˳��ȡ���ڼ��ϵ����͡��������ArrayList���е�������������������0��ʼ��ÿ����һ�Σ�����ֵ��1.
	 * 				Ȼ�����������HashSet�е�Ԫ�أ�ÿ��Ԫ�ؽ��ᰴ��ĳ������Ĵ�����֣����Ա�ȫ�����������������޷�Ԥ֪Ԫ�ط��ʵĴ���
	 * 			
	 * 					remove����:(ʹ�õ������������������������Ԫ�ض�����ø÷���)
	 * 						iterator�ӿ���remove��������ɾ���ϴε���next����ʱ���ص�Ԫ�ء�
	 * 							һ������£���ɾ��Ԫ��֮ǰӦ�ÿ������Ԫ�ص��ڲ���
	 * 						�����Ҫɾ��ָ��λ���ϵ�Ԫ�أ���ȻҪԽ�����Ԫ�أ���Ϊ��ֻ��Խ�����Ԫ�أ��Ż᷵��һ��Ԫ�أ�
	 * 							���֪�����Ԫ���Ƿ����ɾ�������������õ������������remove����ɾ����Ԫ�ء�
	 * 						���о��ǣ�next������remove�����ĵ���ʱ�������Եġ��ڵ���remove֮ǰһ��Ҫ���ٵ���һ��next������ͻ��׳�IllegalStateException
	 * 							�����ɾ���������ڵ�Ԫ�أ���������ʱ���еġ�
	 * 								it.next();//����᷵��һ��Ԫ��
	 * 								it.remove();//�����Ѿ��������Ԫ�شӼ�����ɾ����
	 * 								it.remove();//�������Ѿ�û���˷��ض�Ԫ���ˣ�Ӧ���ڵ���һ��next���ٵ��ø÷���
	 * 								
	 */
	
	/*
	 *	������
	 *		:���������е�λ��(��������Ԫ�ص�λ�ã�����һ��ָ��ָ���������ڵ�Ԫ��֮���)
	 *		������������
	 *			public interface Iterator<E> {
	 *				E next();
	 *				boolean hasNext();
	 *				void remove();
	 *			}
	 *
	 *		java�ĵ����� ���Ҳ�����λ�ñ���ǽ��������ġ�����һ��Ԫ�ص�Ψһ�������ǵ���next������ִ�в��Ҳ�����ͬʱ����������λ����֮��ǰ�ƶ���
	 *			����Ӧ�ý�java�ĵ�������Ϊ��λ������Ԫ��֮�䡣������nextʱ����������Խ����һ��Ԫ�أ������ظո�Խ�����Ǹ�Ԫ�ص����á�
	 *			��������next�Ϳ��Զ�ȡ�����е�����Ԫ�ء� 
	 */
	
	
	
	/*
	 * 	���͵�ʹ�÷���
	 * 		����Collection��Iterator���Ƿ��͵Ľӿڣ����Ա�д�����κ����͵�ʹ�÷�����
	 * 			���磬������һ��������⼯���Ƿ����ָ��Ԫ�صķ��ͷ�����
	 * 		
	 */
	public static <E> boolean contains(Collection<E> c,Object obj){//������Դ���һ������ļ��ϣ���һ��Ҫ�ȽϵĶ���
		for (E e : c) {
			if(e.equals(obj)) return true;
		}
		return false;
 	}
	
	
	/*
	 * 	����	
	 * 		��ʹ������������б���һ���ش��ȱ�ݡ�����Ǵ��м�ɾ��һ��Ԫ��Ҫ�����ܴ�Ĵ��ۣ���ԭ����������д��ڱ�ɾԪ��֮�������Ԫ�ض�Ҫ�������ǰ���ƶ���
	 * 		
	 * 		����ͽ����������⣬����ÿ���������ڶ����Ľ���С�ÿ����㻹�������������һ���������á�
	 * 			��java�����У���������ʵ���϶���˫��ģ��Ǿ���ÿһ���������ر���������ã�һ����ָ���ǰһ��������˭����һ����ָ��ĺ�һ��������˭��
	 * 				
	 * 		������һ������ļ���(set�������е�Ԫ����ȫ�������)��ÿ�������λ�÷ǳ���Ҫ��
	 * 		  	LinkedList.add()�����ǽ�һ��������ӵ������β����(���Ǽ��ϵķ���)
	 * 			����һ��add�����ǵ������ṩ�ģ������Խ�Ԫ����ӵ����ϵ�����λ�á�(���ǵ������ṩ�ķ���)
	 * 				
	 * 			����ֻ�ж�����ļ���ʹ�õ��������Ԫ�ز���ʵ�ʵ����塣(���绹��һЩ���ϲ�������ģ�����set������ȫ�����)
	 * 			����Ϊ�˽ӿڵ�ͨ���ԣ������Ǹ߶ȵĳ���Iterator�ӿ��о�û���ṩadd����(����ṩ�Ļ�setʵ������ӿھ�Ҫ��ʵ�����������
	 * 				�������������set����û������)������ListIterator(Iterator���ӽӿ�)�ṩ�˸÷���,ListIterator�����ṩ��add������
	 * 				���ṩ��������������������������ϵġ�ListIterator���listIterator��������һ��ʵ����ListIterator�ӿڵĶ���
	 * 
	 * 		����֧�ֿ��ٵ�������ʣ����Ҫ�鿴�����еĵ�n��Ԫ�ص�ʱ�򣬾ͱ����ͷ��ʼ��Խ��n+1��Ԫ�أ�û�нݾ����ߡ�
	 * 			�������ԭ���ڳ���Ա��Ҫ����������������Ԫ��ʱ��ͨ����ѡ������
	 * 			������������LinkedList�����ṩ��get()������������Ǻ����ԣ����������Ч�ʲ��ߡ�
	 */
	@Test
	public void linkedList() {
		//�½�һ������
		List<String> staff = new LinkedList<String>();
		//�������������Ԫ��
		staff.add("A");
		staff.add("B");
		staff.add("C");
		/*
		 *  ����һ��������ListIterator��Iterator���ӽӿڣ�ListIterator���listIterator��������һ��ʵ����ListIterator�ӿڵĶ���
		 *  	���ListIterator�ӿڵĹ��ܱȽ϶�
		 *  	��add������previous��hasprevious�����ܸ�next��hasNext��ࡣ
		 *  	add��������ֻ�������ڵ�������λ�ã���remove���������ڵ�������״̬
		 *  	set��������һ����Ԫ�ظ��ǵ���next��previous�������ص���һ��Ԫ�ء�
		 */
		Iterator<String> iter = staff.iterator();
		//���ص�һ��Ԫ��
		String one = iter.next();
		System.out.println("��һ��Ԫ����" + one);
		//���صڶ���Ԫ��
		String two = iter.next();
		System.out.println("�ڶ���Ԫ����" + two);
		System.out.println("���ϻ�ʣ��Ԫ����" + staff.size());
		//ɾ��һ��Ԫ�أ�������һ��next���ص�Ԫ�أ�Ԫ��B��ɾ��
		iter.remove();
		System.out.println("���ϻ�ʣ��Ԫ����" + staff.size());
		//���б�����ʹ�á�foreach"ѭ�������ļ���Ҫʵ��Iterable�ӿڣ�Collectionʵ���˸ýӿ�
		System.out.println("----foreach������-----");
	 	for (String s : staff) {
			System.out.print(s);
		}
		System.out.println();
		System.out.println("----hasNext+next������-----");
		/*
		 * 	�������õ��������б�����û��û������ȫ���ģ���Ϊ�����������ָ���Ѿ��ǵ�һ���͵ڶ���֮���ˡ�(��Ϊ��һ����ɾ��)
		 * 		����������ֻ���Ǳ���һ������ʣ�µ�һ��
		 * 		
		 * 		����Ҳ������һ��ListIterator����ӿڣ�����ӿ�������������ǰ�����ģ����Խ�Ԫ��ȫ�����������ġ�
		 */
		while(iter.hasNext()){
			System.out.print(iter.next());
		}
		System.out.println("---��forѭ�����±����������飬���Բ�Ӧ��ʹ�����ַ�ʽ��Ч�ʼ���-----");
		// ÿ�ε���get()����һ��Ԫ�ض�Ҫ���б��ͷ�����¿�ʼ������LinkedList�������û�в����κεĻ��档
		for (int i = 0; i < staff.size(); i++) {
			System.out.print(staff.get(i));
		}
	}
	
	
	
	/*
	 * 	���һ���������г��ֶ����������������Щ�������ö����ж�д��
	 * 		���п��ܻ����쳣:���磬һ��������ָ����һ���������ո�ɾ��Ԫ�ص�ǰ�档 ���������������Ч�ģ����Ҳ��ܱ��ٴ�ʹ�á�
	 * 			���һ���������������ļ��ϱ���һ���������޸��ˣ������Ǳ���������ķ����޸��ˣ��ͻ��׳�һ��ConcurrentModificationException
	 * 
	 * 	Ϊ�˱��ⷢ�������޸ĵ��쳣�����������Ĺ���:
	 * 		���Ը�����Ҫ�������������ĵ�������������Щ������ֻ���Ƕ�ȡ�б����⣬�ڵ�������һ�����ܶ�����д�ĵ������� 
	 */
	@Test
	public void onlyOneWrite(){
		List<String> staff = new LinkedList<String>();
		staff.add("A");
		staff.add("B");
		staff.add("C");
		ListIterator<String> iter = staff.listIterator();
		ListIterator<String> iter2 = staff.listIterator();
		iter.next();//������һ���ж�����
		iter.remove();//������һ����д����(���ϱ��޸ģ������������������ˣ����˾ͻᱨ��)
		iter2.next();//�����������ж�����
	}
	
	
	
	/*
	 *	ɢ�м�
	 *		�����������԰������ǵ���Ը����Ԫ�صĴ��򡣵��ǣ������Ҫ�鿴ĳ��ָ����Ԫ�ص�ʱ��ȴ������������λ�á���ô����Ҫ��������Ԫ�أ�֪���ҵ�Ϊֹ��
	 *			��������е�Ԫ�ظ����ܶ࣬�ǾͻỨ�Ѻܶ��ʱ�䡣�����������Ԫ�ص�˳�򣬿����м��ֿ��ٲ���Ԫ�ص����ݽṹ����ȱ������޷�����Ԫ�س��ֵĴ���
	 *
	 *		��һ�����ݽṹ���Կ��ٵز�������Ҫ�Ķ��������ɢ�б�
	 *			ɢ�б�Ϊÿһ�����������������Ϊɢ���롣ɢ�������ɶ����ʵ���������һ��������
	 *			��׼ȷ��˵�����в�ͬ������Ķ��󽫲������õ�ɢ���롣
	 *
	 *		��java�У�ɢ�б�����������ʵ�ֵġ�ÿ���б���Ϊһ��Ͱ��Ҫ����ұ��ж����λ�ã���Ҫ�ȼ�������ɢ���롣
	 *			Ȼ����Ͱ������ȡ�࣬������Ǳ������Ԫ�ص�Ͱ��������
	 *			����:ĳ������ ��ɢ����Ϊ76268����128��Ͱ����ô����ͱ����ڵ�108��Ͱ��(76268/128=108).
	 *				�أ���ֱ�Ӳ��Ͱ�о�����(һ��Ͱ��һ���б�)��������Ԫ�صľ�Ҫ���ö�����Ͱ�е�Ԫ�ؽ��бȽϡ�
	 *		
	 *		ɢ�б����ʵ�ּ�����Ҫ�����ݽṹ��������򵥵ľ���set���ͣ�set��û���ظ�Ԫ�ص�Ԫ�ؼ��ϡ�
	 *			set��add���������ڼ����в��Ҹö����Ƿ��Ѿ����ڣ���������ڣ��ͽ����������ӵ������С�
	 *
	 *		java��������ṩ��һ��HashSet�࣬��ʵ���˻���ɢ�б�ļ���������add�������Ԫ�ء�
	 *			contains�����Ѿ������¶����ˣ��������ٲ鿴ĳ��Ԫ���Ƿ�����ڼ����С�����ĳ��Ͱ�в���Ԫ�أ������ò鿴�����е�����Ԫ�ء�
	 *
	 *		ɢ�м������������η������е�Ͱ������ɢ�н�Ԫ�ط�ɢ�ڱ��еĸ���λ�ã����Է������ǵ�˳�򼸺�������ġ�
	 *			ֻ�в����ļ���Ԫ�ص�˳���ǲ�ʹ��HashSet
	 */
	@Test
	public void hashSet(){
		//�½�һ��HashSet
		HashSet<String> hashSet = new HashSet<String>();
		//����add�������Ԫ�أ���ӽ����ϵ�Ԫ�����������µġ�
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		for (String s : hashSet) {
			System.out.println(s);
		}
		//contains�����Ѿ������¶����ˣ��������ٲ鿴ĳ��Ԫ���Ƿ�����ڼ����С�����ĳ��Ͱ�в���Ԫ�أ������ò鿴�����е�����Ԫ�ء�
		boolean contains = hashSet.contains("A");
		System.out.println(contains);
	}
	
	
	
	
	/*
	 * 	����
	 * 		TreeSet����ɢ�м�ʮ�����ƣ�����������ɢ�м������Ľ���
	 * 		������һ�����򼯺ϡ������������˳����뼯���С��Լ��ϱ���ʱ��ÿ��ֵ�������Զ����к��˳����ֳ���(TreeSet�ڲ��Զ�����,����Ա�޷�����)
	 * 			����ʹ�����ṹ����ɵģ�ÿ�ν�һ��Ԫ����ӵ�����ʱ��������������ȷ������λ���ϡ����У����������������кõ�˳�����ÿһ��Ԫ�ء�
	 * 
	 * 		����(TreeSet)��ɢ�м�(HashSet)������������б�(ArrayList)������:
	 * 			�����������Ԫ�ر���ɢ�м������Ԫ��Ҫ��������Ҫ������������б�����
	 * 			
	 * 			��ͷһ��������ܻ�������:�Ƿ�Ӧ��������ȡ��ɢ�м����Ͼ������һ��Ԫ�������ѵ�ʱ�䲢���Ǻܳ�������Ԫ�����Զ����еġ�
	 * 				ѡ��ʹ����һ����������ȡ���� ��Ҫ�ռ�ʲô�������ݣ��������Ҫ�����ݽ������򣬾�û���븶������Ŀ�����
	 * 				����Ҫ���ǣ�������һЩ���ݶ���������������ѣ���������ɢ��ȴ�Ǻ����׵ġ�
	 * 					ɢ�к���ֻ�ǽ������ʵ��ش��Ҵ�ţ����Ƚ�ȴҪ��ȷ���ж�ÿ������
	 */
	@Test
	public void treeSet(){
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		for (String s : treeSet) {
			System.out.println(s);
		}
	}
	
	
	
	
	/*
	 * 	���ȼ�����
	 * 		Ԫ�ؿ��԰��������˳������ȴ���ǰ��������˳����м�����
	 * 			Ҳ����˵�����ۺ�ʱ����remove�������ܻ��ȡ����С��Ԫ�ء�
	 * 		
	 * 		Ȼ�������ȼ����У���û�ж����е�Ԫ�ؽ������У�����ʹ����һ�������Ҹ�Ч�����ݽṹ����Ϊ"��"��
	 * 			"��"��һ���������ҵ����Ķ�����������������Ӻ�ɾ����������������С��Ԫ���ƶ������������ػ���ʱ���Ԫ�ؽ�������
	 * 
	 * 		��TreeSetһ����һ�����ȼ����мȿ��Ա���ʵ����Comparable�ӿڵ������Ҳ���Ա����ڹ��������ṩ�Ƚ����Ķ���
	 * 
	 *		ʹ�����ȼ����еĵ��;���������ȡ�ÿһ��������һ�����ȼ������������˳����Ӷ����С�
	 *			ÿ������һ���µ������ǣ��������ȼ���ߵ�����Ӷ�����ɾ��(ϰ��1Ϊ��ߣ����ԻὫ��С��Ԫ��ɾ��) 	
	 */
	@Test
	public void priorityQueue(){
		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<GregorianCalendar>();
		pq.add(new GregorianCalendar(1906,Calendar.DST_OFFSET,9));
		pq.add(new GregorianCalendar(1815,Calendar.DST_OFFSET,10));
		pq.add(new GregorianCalendar(1903,Calendar.DST_OFFSET,3));
		pq.add(new GregorianCalendar(1910,Calendar.DST_OFFSET,22));
		System.out.println("������е��������ǵ����������");
		for (GregorianCalendar date : pq) {
			System.out.println(date.get(Calendar.YEAR));
		}
		System.out.println("�����ǵ���remove����,���ص�������С����һ�����ȵ��Ľ��Ҳ����˳���");
		while(!pq.isEmpty()){
			System.out.println(pq.remove().get(Calendar.YEAR));
		}
	}
	
	
	
	/*
	 * 	ӳ���
	 * 		ӳ�����������ż�ֵ��������ݽṹ�ġ�
	 * 
	 * 		java���Ϊӳ����ṩ������ͨ�õķ���:HashMap��TreeMap���������඼ʵ����Map�ӿڡ�
	 * 		
	 * 		ɢ��ӳ���(HashMap)�Լ�����ɢ�У���ӳ����ü�������˳���Ԫ�ؽ������򣬲�������֯����������
	 * 			ɢ�л�ȽϺ���ֻ�������ڼ������������ֵ���ܽ���ɢ��Ƚϡ�
	 * 		
	 * 		��Ӧ��ʹ��ɢ�б�����ӳ���?�뼯һ����ɢ�п�㣬�������Ҫ��������˳����ʼ��������ѡ��ɢ�С�
	 * 
	 * 		
	 * 
	 */
	@Test
	public void hashMap(){
		//�½�һ��ɢ��ӳ���
		Map<String,String> staff = new HashMap<String,String>();
		/*
		 * ���һ��Ԫ��
		 * 		ÿ����ӳ��������(ʹ��put()����)һ�� ֵ ʱ������ͬʱ�ṩһ���������������ֵ����һ���ַ���
		 * 		��������Ψһ�ģ����ͬһ������������put����ڶ���ֵ��ȡ��ԭ����ֵ��put�������ص��Ǳ����ǵ�ֵ��
		 */
		staff.put("A", "A��ֵ");
		staff.put("B", "B��ֵ");
		staff.put("C", "C��ֵ");
		/*
		 * Ҫ�����һ��ֵ�������ṩһ����
		 * 	�����ӳ�����û�������Ӧ��ֵ��������һ��null
		 */
		String key = "A";
		String value = staff.get(key);
		//remove����ɾ����������Ӧ��Ԫ��
		staff.remove(key);
		//size()��������ӳ����е�Ԫ�ظ���
		int size = staff.size();
		/*
		 * 	ӳ������ͼ������
		 * 		������ ֵ����(���Ǽ�)�� ��/ֵ�Լ���
		 * 		�������������������������ͼ
		 * 		Set<K> keySet()
		 * 		Collection<K> values()
		 * 		Set<Map.Entry<K,V>> entrySet()
		 */
		//����
		System.out.println("-----��ӡ����-----");
		Set<String> keySet = staff.keySet();
		for (String k : keySet) {
			System.out.println(k);
		}
		//ֵ����(���Ǽ�)
		System.out.println("-----��ӡֵ����-----");
		Collection<String> values = staff.values();
		for (String v : values) {
			System.out.println(v);
		}
		//��/ֵ�Լ�
		System.out.println("-----��ӡֵ��/ֵ�Լ�-----");
		Set<Entry<String,String>> entrySet = staff.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() +  entry.getValue());
		}
	}
	
	
	
	/*
	 * 	���Ͽ��
	 * 		���������������Ľӿ�:Collection��Map
	 * 		Collection���ӽӿ�List��Set
	 * 			List��һ�����򼯺ϡ�Ԫ�ؿ�����ӵ��ض���λ�á���������õ�ĳ��λ���������ַ�ʽ:
	 * 					ʹ��������������ʹ���б�ĵ�����(ʹ�õ���ListIterator������ӿڲ���add��������Iterator��һ���ӽӿ�)
	 * 
	 * 			List�ӿڶ����˼��������������(�����������һ���±꣬Ȼ��Ҫ���м���)�ķ���:
	 * 				void add(int index,E element)
	 *				void get(int index)	 						
	 *				void remove(int index)
	 *			List�ӿ����ṩ��Щ������ʱ�򣬲�û�п���Ч�ʣ�Ϊ�˱���ִ�нϸ߳ɱ���������ʣ����Բο�RandomAccess����ӿڡ�
	 *
	 *			Set�ӿ���Collection�ӿ���һ���ģ�ֻ���䷽������Ϊ���Ÿ������ܵĶ��塣
	 *				����add���������������ͬ��Ԫ��(��ΪSet�����������)��
	 *			
	 *		���ϵĽӿ��д����ķ�������Щ��������ͨ�������������з���������ʵ�֡�Ҳ�кܶ�������ṩ���������������ʵ�֡�
	 *			AbstractCollection
	 *			AbstractList
	 *			.....
	 *			��ArrayList��Щ�඼�Ǵ���Щ��������ʵ�ֵģ��Լ�Ҳ���Լ̳���Щ�࣬ʵ���Լ�������
	 */
	
	 /*
	  *	��ͼ���װ����
	  *		ͨ��ʹ����ͼ�����Ի��������ʵ���˼��Ͻӿں�ӳ���ӿڵĶ���
	  *			����:
	  *				ӳ������keySet��������һ��������ʾ�������������������������������һ���¼�������ӳ����е����м������ȥ��Ȼ�󷵻��������
	  *				����ʵ�ϲ��������ģ�keySet�Ź�����һ��ʵ��Set�ӿڵ�����������ķ�����ԭӳ�����в��������ּ��ϳ�Ϊ ��ͼ��
	  * 	1.����������װ��
	  * 		Arrays��ľ�̬����asList������һ����װ����ͨjava�����List��װ����
	  * 			����������Խ�һ������ת��Ϊһ��List���ϡ�
	  */
	@Test
	public void arrayAsList(){
		String[] a = new String[50];
		List<String> asList = Arrays.asList(a);
		/*
		 * ���صĶ�����ArrayList������һ����ͼ���󣬴��з��ʵײ������get��set������
		 * 		����ʹ�øı������С�����з���(�����������ص�add��remove����)(�����Ըı��������ݣ�ʹ�������get��set����)
		 * 			�����׳�һ���쳣UnsupportedOperationException
		 */
		asList.add("A");//����ı�������Ĵ�С�����л��׳�һ���쳣
		asList.set(0, "D");//����ı�����������ǿ��Եģ�ֻҪ���ı�����Ĵ�С�Ϳ�����
		/*
		 * ��SE 5.0 ��ʼ��asList������֧�ֽ�����Ԫ�ش��ݸ���
		 */
		List<String> asList2 = Arrays.asList("A","S","D");
	}
	/*
	 * Collections.nCopies()����������ã�������һ�������޸ĵĶ��󣬲���һ��nԪ�ش���ȥ
	 * 		Collections�ӿںܶ�ʹ�õķ�������Щ�����Ĳ����ͷ���ֵ���Ǽ��ϡ���Ҫ��Collection����ˡ���
	 */
	@Test
	public void oCopies(){
		List<String> nCopies = Collections.nCopies(10, "A");
		// ����ÿ���ַ�������ֻ�洢һ�Σ����Ը����Ĵ��ۺ�С��������ͼ������һ�������Ӧ�á�
		for (String s : nCopies) {
			System.out.println(s);
		}
		/*
		 * singleton��������һ����ͼ�����������ʵ����Set�ӿ�
		 * 	���صĶ���ʵ����һ�������޸ĵĵ�Ԫ�ؼ���������Ҫ�����������ݽṹ�Ŀ�����
		 */
		Set<String> singleton = Collections.singleton("A");
		
	}
		


	/*
	 * ������
	 * 	��һ������±���ʹ�õ������Ϳ��Խ���������
	 * 		����ϣ���ҳ�������������������������ͬ��Ԫ��
	 */
	@Test
	public void retainnAll(){
		//�ҳ�a������b���ϵĽ���
		HashSet<String> a = new HashSet<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		HashSet<String> b = new HashSet<String>();
		b.add("A");
		b.add("B");
		b.add("E");
		
		//�½�һ�����ϣ�����a������b����ȥ
		HashSet<String> result = new HashSet<String>(a);
		result.retainAll(b);
		//��ʱ��result�����о��ǰ�����a��b�Ľ����ˣ�����û��ʹ�õ�ѭ��
		for (String s : result) {
			System.out.println(s);
		}
	}
	/*
	 * ����˼���һ���ƽ���Ӧ������ͼ��
	 * 	������һ��ӳ�����Ա����IDӳ�䵽Ա���Ķԣ�����һ����Ҫ����Ƹ�õ�ID����Ȼ����ֹ��ЩID(���ܵ�Ա������ɾ��)��
	 */
	@Test
	public void removeAll(){
		//�����������Ԫ�ص�ӳ���
		Map<Integer,String> a = new HashMap<Integer,String>();
		//��������Ԫ��
		a.put(1, "A");
		a.put(2, "B");
		a.put(3, "C");
		a.put(4, "D");
		
		//����һ�����������˼���Ҫɾ��Ա����ID
		Set<Integer> b = new HashSet<Integer>();
		b.add(1);
		b.add(2);
		
		/*
		 * ����ɾ����ϵ���Ѽ����г��ֵ�ID����ӳ����ж�Ӧ��Ԫ��ɾ��
		 * 	�����Ѿ���map����a�м�Ϊ1��2��Ԫ�شӼ������Ƴ���
		 */
		a.keySet().removeAll(b);
		
		//����Map����a
		for (Entry<Integer, String> entry : a.entrySet()) {
			System.out.println(entry.getKey() +  entry.getValue());
		}
	}
	
	
	/*
	 * �����뼯��֮���ת��
	 * 	Arrays.asList�İ�װ������ʵ���������
	 */
	@Test
	public void arrayChangeToCollection(){
		//�½�һ������
		String[] array = {"A","B","C"};
		//��һ������ת��Ϊһ������
		List<String> list = Arrays.asList(array);
		//������ָ����ת��Ϊʲô���͵�����
		HashSet<String> hashset = new HashSet<String>(Arrays.asList(array));
		//��������
		for (String s : list) {
			System.out.println(s);
		}

		/*
		 * ��������һ������ת��Ϊһ��������е�����
		 * 	��������һ���������顣����֪�������а���һ���ض����͵Ķ���Ҳ����ʹ��ǿ��ת����
		 */
		
		Object[] array2 = hashset.toArray();
		
		/*
		 * ��toArray�������ص�������һ��Object[]���飬���޷��ı��������ͣ�
		 * 	�෴��ʹ������һ��toArray�������������Ϊ��ϣ����Ԫ�������ҳ���Ϊ0�����飬�������Ļ������ص���������������������һ����
		 */
		String[] array3 = hashset.toArray(new String[0]);
		//���Ը��Ļ��������Թ���һ��ָ����С������
		hashset.toArray(new String[hashset.size()]);
		//�����������û�д����κ��µ�����
	}
	

	/*
	 * �㷨
	 */
	//�ҳ�����������Ԫ��
	@Test
	public void arrayMax(){
		int[] a = {9,7,6,1,3,13};
		Integer max = a[0];
		for (int i = 1; i < a.length; i++) {
			/*
			 * a.compareTo(b),���a��b�󷵻�������a��bС���ظ�����a��b��ȷ���0
			 */
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
	//����Ӧ����ô��?���������޷�ʵʩ��Ч���������(������ʾ���ͨ�����������±����ֶ���)�����ǿ���ͨ��������
	@Test
	public void collectionMax(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(5);
		
		
		Iterator<Integer> iterator = list.iterator();
		//�ȰѼ����еĵ�һ������Ϊ����
		Integer max = iterator.next();
		//�жϼ����Ƿ������һ��
		while(iterator.hasNext()){
			//����һ���Ļ������ó���
			Integer next = iterator.next();
			//���ó�������һ��������Ԫ�����
			if (max.compareTo(next) < 0) {
				max = next;
			}
		}
		System.out.println(max);
	}

	/*
	 * ������Щÿ��ʵ�ֶ��Ƿǳ��鷳��ÿ�ζ�Ҫ��д���룬�ֺ����׳���
	 * 	���Խ�max����ʵ��Ϊ�ܹ������κ�ʵ����Collection�ӿڵĶ���
	 * 		�����������max�������Լ������������б�����������Ԫ�ء�
	 */
	public static <T extends Comparable> T max(Collection<T> c) {
		if(c.isEmpty()){
			throw new NoSuchElementException();
		}
		Iterator<T> iterator = c.iterator();
		T max = iterator.next();
		while (iterator.hasNext()) {
			T next = iterator.next();
			if (max.compareTo(next) < 0) {
				max = next;
			}
		}
		return max;
	}
	
	
	
	/*
	 * ���������
	 */
	@Test
	public void sort(){
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(54);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(10);

		Collections.sort(arrayList);//�����Ļ�arrayList���Ѿ����մ�С�����ź����ˣ����������Ϳ�����
		for (Integer i : arrayList) {
			System.out.println(i);
		}
	}
	
	/*
	 * �����ļ���
	 * 	java�������������ʹ��ڵļ�����:Hashtable���Ǻͷǳ����õ�����PropertiesؼVector������Stack�Լ�BitSet
	 * 	
	 * 		Hashtable����HashMap�������һ����ʵ���ϣ�����ӵ����ͬ�Ľӿڡ�
	 * 			��Vector��ķ���һ����HashtableҲ��ͬ���ġ������ͬ���Ի���������ļ�����û���κ�Ҫ�󡣾�Ӧ��ʹ��HashMap
	 * 			
	 * 			����ӳ���
	 *				����ӳ�����һ�����ͷǳ������ӳ���ṹ������������������
	 *					������ֵ�����ַ���
	 *					������Ա��浽һ���ļ��У�Ҳ���Դ��ļ��м��س���
	 *					��ʹ��һ��Ĭ�ϵĸ�����
	 *				ʵ��ӳ���ͨ�����ڳ������������ѡ� 				
	 * 		
	 */
	
	
	/*
	 * ������
	 *		synchronized�ؼ����Զ��ṩһ�����Լ���ص����������ڴ��������Ҫ��ʽ�������Ǻܱ����ġ�
	 *		������SE 5.0������ReentrantLock�࣬java.util.concurrent���Ϊ��Щ���������ṩ�˶������ࡣ
	 */
	public void syObject(){
		new ObjectL();//����ֻҪ���������ReentrantLock
	}
	
	
	
	
	
	
	
	
	
	
	
}

