package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx2 {

	public static void main(String[] args) {

		Banchan p = new Banchan();
		inputM(p);
		Banchan p1 = new Banchan();
		inputM(p1);
		Banchan p2 = new Banchan();
		inputM(p2);
		
		int last = p.lastMethod(p.make, p.sale);
		System.out.println("����  ���簹��  �ǸŰ���  ��������");
		System.out.println( p.kind + "  " + p.make + " " + p.sale + " " + last);
		
		last = p1.lastMethod(p1.make, p1.sale);
		System.out.println(p1.kind + "  " + p1.make + " " + p1.sale + " " + last);
		
		last = p2.lastMethod(p.make, p.sale);
		System.out.println( p2.kind + "  " + p2.make + " " + p2.sale + " " + last);
		
		int percent = p.salepercent(p.make, p.sale);
		int percent1 = p1.salepercent(p1.make, p1.sale);
		int percent2 = p2.salepercent(p2.make, p2.sale);
		
		// �� �ȸ��޴��� ���� �ȸ� �޴� ����ϴ� ��� 1
		String maxName = null;
		int maxpercent = (percent>=percent1)?((percent>=percent1)?percent:percent1):((percent1>=percent2)?percent1:percent2);
		if (maxpercent==percent) {
			maxName =p.kind; 
		} else if (maxpercent==percent1) {
			maxName =p1.kind; 
		} else {
			maxName =p2.kind; 
		}
		
		String minName = null;
		int minpercent = (percent<=percent1)?((percent<=percent1)?percent:percent1):((percent1<=percent2)?percent1:percent2);
		if (minpercent==percent) {
			minName =p.kind; 
		} else if (minpercent==percent1) { 
			minName =p1.kind; 
		} else {
			minName =p2.kind; 
		}
		System.out.println("���帹�� �ȸ� ������ "+ maxName + "�Դϴ�.");
		System.out.println("���帹�� ���� �ȸ� ������ "+ minName + "�Դϴ�.");		
			
		
				
		/* ��� 2 (�迭 ���)
		int [] percentarray = {percent, percent1,percent2};
	
		int best =0;
		int maxindex =0;
		int i =0;
		for(i=0; i<3; i++) {
			if(percentarray[i]>best) {
				best = percentarray[i];
				maxindex = i;
			}	
		}
		
		String [] namearray = {p.kind,p1.kind,p2.kind};
		String maxName = namearray[maxindex];
		System.out.println("���帹�� �ȸ� ������ "+ maxName + "�Դϴ�.");
			
		int worst =100;
		int minindex =0;
		int j =0;
		for(j=0; j<3; j++) {
			if(percentarray[j]<worst) {
				worst = percentarray[j];
				minindex = j;
			}
		}
		
		String minName = namearray[minindex];
		System.out.println("���帹�� ���� �ȸ� ������ "+ minName + "�Դϴ�.");
		*/
		
		

	}

	static void inputM(Banchan p) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("����:");
		p.kind = sc.next();
		System.out.print("���簹��:");
		p.make = sc.nextInt();
		System.out.print("�ǸŰ���:");
		p.sale = sc.nextInt();
		sc.nextLine();
		
	
		
	}
} // CLASS END

class Banchan {
	String kind; // ��ǰ����
	int make; // ���簳��, ��å: 10���� ����
	int sale; // �ǸŰ���
	int lastMethod (int make, int sale) {
		return make-sale;
	}
	int salepercent (int make, int sale) {
		return (int)sale*100/make;
	}
	

}
