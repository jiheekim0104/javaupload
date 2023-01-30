package Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberX,numberY;
		String input;
		
		System.out.print("보병의 위치: ");
		input = sc.nextLine();
		String[] number = input.split(",");
		numberX = Integer.parseInt(number[0]);
		numberY = Integer.parseInt(number[1]);
		
		Marine marine = new Marine();
		marine.move(numberX,numberY);
		System.out.print("보병");
		marine.stop();
		marine.stimPack();

		
		System.out.print("탱크의 위치: ");
		input = sc.nextLine();
		String[] number1 = input.split(",");
		numberX = Integer.parseInt(number1[0]);
		numberY = Integer.parseInt(number1[1]);
		
		Tank tank = new Tank();
		tank.move(numberX,numberY);
		System.out.print("탱크");
		tank.stop();
		tank.changeMode();
		
		
		System.out.print("수송선의 위치: ");
		input = sc.nextLine();
		String[] number2 = input.split(",");
		numberX = Integer.parseInt(number2[0]);
		numberY = Integer.parseInt(number2[1]);
		
		Dropship dropship = new Dropship();
		dropship.move(numberX,numberY);
		System.out.print("수송선");
		dropship.load(marine.x,marine.y);
		dropship.unload(tank.x,tank.y);
		
		sc.close();
	}
	
	

}
