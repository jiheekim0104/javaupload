package javaMid7.p409;

public class AnynousEx {
	public static void main(String[] args) {
		
		Button bntOk = new Button();
		
		class OkListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("OK����");
				
			}
		}
		
		
		bntOk.setClickListener(new OkListener());
		bntOk.click();
		
		
		Button bntCancle = new  Button();
		
		class CancleListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("��Ҵ���");
				
			}
		}
		
		bntCancle.setClickListener(new CancleListener() );
		bntCancle.click();
		
		
		Button bntSpace = new Button();
		class SpaceListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("�����̽� ����");
				
			}
		}
		bntSpace.setClickListener(new SpaceListener());
		bntSpace.click();
		
		Button bntMouse = new Button();
		class MouseListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("���콺 ����");
				
			}
		}
		bntMouse.setClickListener(new MouseListener());
		bntMouse.click();
		
	}
}
