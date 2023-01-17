package javaBasic2.ch05.day04;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*
		Banchan b0 = new Banchan(); ������ü�� �ϳ��� ���� ���� �迭�� �������ִ� ���
		Banchan b1 = new Banchan();
		Banchan b2 = new Banchan();
		Banchan[] banArr = {b0,b1,b2};
		*/
		
		Banchan[] banArr = {new Banchan(),new Banchan(),new Banchan()}; //������ü �������� �ٷ� �迭�� ����ǰ���
		
		banArr[0].setKind("������");
		banArr[0].setMakeFood(10);
		banArr[0].setSaleFood(5);
		System.out.println(banArr[0].getKind()+" "+banArr[0].getMakeFood()+" "+banArr[0].getSaleFood());
		
		banArr[1].setKind("����");
		banArr[1].setMakeFood(7);
		banArr[1].setSaleFood(3);
		System.out.println(banArr[1].getKind()+" "+banArr[1].getMakeFood()+" "+banArr[1].getSaleFood());
		
		banArr[2].setKind("�������");
		banArr[2].setMakeFood(15);
		banArr[2].setSaleFood(13);
		System.out.println(banArr[2].getKind()+" "+banArr[2].getMakeFood()+" "+banArr[2].getSaleFood());
		
		Hospital[] hosArr = {new Hospital(),new Hospital(),new Hospital(),new Hospital()};
		
		hosArr[0].setMedicalDepartment("ġ��");
		hosArr[0].setDoctorName("�����");
		hosArr[0].setTreatmentDay("20230117");
		
		hosArr[1].setMedicalDepartment("����");
		hosArr[1].setDoctorName("������");
		hosArr[1].setTreatmentDay("20230116");
		
		hosArr[2].setMedicalDepartment("�����ܰ�");
		hosArr[2].setDoctorName("�ڸ�ȣ");
		hosArr[2].setTreatmentDay("20230112");
		
		hosArr[3].setMedicalDepartment("�������а�");
		hosArr[3].setDoctorName("�����");
		hosArr[3].setTreatmentDay("20230110");
		
		System.out.println("�������   �ǻ��    ������");
		for(int c =0;c<hosArr.length;c++) {
			System.out.println(hosArr[c].getMedicalDepartment()+" "+hosArr[c].getDoctorName()+" "+hosArr[c].getTreatmentDay());
		}
		
		for(Hospital h:hosArr) {
			System.out.println(h.getMedicalDepartment()+" "+h.getDoctorName()+" "+h.getTreatmentDay());
		}
		
		
	}

} //class end

class Banchan{
	String kind;
	int makeFood;
	int saleFood;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMakeFood() {
		return makeFood;
	}
	public void setMakeFood(int makeFood) {
		this.makeFood = makeFood;
	}
	public int getSaleFood() {
		return saleFood;
	}
	public void setSaleFood(int saleFood) {
		this.saleFood = saleFood;
	}
}

class Hospital{
	String medicalDepartment;
	String doctorName;
	String treatmentDay;
	public String getMedicalDepartment() {
		return medicalDepartment;
	}
	public void setMedicalDepartment(String medicalDepartment) {
		this.medicalDepartment = medicalDepartment;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getTreatmentDay() {
		return treatmentDay;
	}
	public void setTreatmentDay(String treatmentDay) {
		this.treatmentDay = treatmentDay;
	}
	
}
