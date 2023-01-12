package javaBasic1;

import java.util.Scanner;

public class Continue1 {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=50;i++) {
			if(i%10!=0) 
			System.out.print(i+" ");
		}
		
		for(int i=1;i<=50;i++) {
			if(i%10==0) continue; //아래 문장을 수행하지않고 반복문의 끝으로가서 다시 시작함!
			System.out.print(i+" ");
		}
		*/
		
		/* 방법 1 (그렇게 좋은 방법은 아니라고 생각함. 500넘을때까지 진행한뒤 sum을 0으로 초기화 -> 1000넘을때까지 진행한뒤 sum을 0으로 초기화 -> 이렇게 앞에 진행과 중복되는 방식이라..별로!) 
		int sum = 0;
		int i=0;
		int number =0;
		for (number=500;number<=5000;number+=500) {
			for(i=100;i>=1;i--) {
				sum = sum + i;
				if(sum>number) break;
			}
		System.out.println("합계:"+sum+" "+"항목:"+i);
		sum = 0;
		}
		*/
		
		/* 방법2 (이미 앞에서 나온값에서 결과를 누적한뒤 이어서 진행.)
		int sum = 0;
		int i=100;
		int number =0;
		for (number=500;number<=5000;number+=500) {
			for(;i>=1;i--) {
				sum = sum + i;
				if(sum>number) break;
			}
		System.out.println("합계:"+sum+" "+"항목:"+i);
		i--;
		}
		*/ 
		
	    /* 방법3 (500이 넘어가는 순간에만 출력이 되게끔하는 방식, 2번하고 유사하나 조금 다름!)
		int baesu = 500;
      	int event = baesu;
      	int sum=0;
      	for(int i=100;i>=0;i--) {
         	sum+=i;
         	if(event < sum) {
         		System.out.println("합계: "+sum+" 항목: "+i);
         		event+=baesu;
         	}
      	}
		*/
		 
		 
	
		System.out.println("-------------------------");
		int nun1;
		int nun2;
		while(true) {
			nun1 = (int)(Math.random()*6)+1;
			nun2 = (int)(Math.random()*6)+1;
			System.out.println("("+nun1+","+nun2+")");
			if(nun1+nun2==5)break;
		}
		
		
		for (int a=1;a<=6;a++) {
			nun1 = (int)(Math.random()*49)+1;
			System.out.print(nun1+" ");
		} //로또는 중복 안되자나..ㅠㅠ 중복 어떻게 빼지 ㅇㅅㅇ?
		
		
		System.out.println();
		System.out.println("-------------------------");
		for (int a=1;a<=5;a++) {
			for (int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		int menuNumber =0;
		int moneyin =0;
		int moneyout =0;
		int money = 0;
		program : while(true) {
		System.out.println("-------------------------");
		System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.이체 | 5. 종료");
		System.out.println("-------------------------");
		System.out.print("메뉴선택:");
		input = sc.next();
		menuNumber = Integer.parseInt(input);
			switch (menuNumber) {
			case 1 : 
				System.out.print("예금액:");
				input = sc.next();
				moneyin=Integer.parseInt(input);
				money = money + moneyin;
				break;
				
			case 2 : 
				System.out.print("출금액:");
				input = sc.next();
				moneyout=Integer.parseInt(input);
				money = money - moneyout;	
				if(money<0) {
					System.out.println("잔액부족");
				}
				break;
				
			case 3 : 
				System.out.println("잔고:"+money);
				break;
				
			case 4 : 
				System.out.print("이체할 계좌번호 입력:");
				input = sc.next();
				String bunho = input;
				System.out.print("이체할 금액 입력:");
				input = sc.next();
				moneyout=Integer.parseInt(input);
				money = money - moneyout;
				if(money<0) {
					System.out.println("잔액부족"); // 금액을 다시 입력하게 하고싶다..! 
					break;
				}
				System.out.println(bunho+"계좌로 "+moneyout+"원이 이체되었습니다.");
				System.out.println("잔액은 "+money+"원 입니다.");
				break;
			case 5 :
				break program;
			default :System.out.println("잘못입력하셨습니다.");
			} 
		} 
		System.out.print("프로그램이 종료되었습니다.");
		
		
		
		
		sc.close();
		
	}

}
