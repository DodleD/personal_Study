package obectArray240211;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	Student st = new Student();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		for(int i=0; i<ssm.getsArr().length; i++) {
			System.out.println(ssm.printStudent()[i].inform()); 
		}
		
		System.out.println();
	
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);
		
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i =0; i<ssm.getsArr().length; i++) {
			if(ssm.CUT_LINE>ssm.getsArr()[i].getScore()) {
				System.out.println(ssm.getsArr()[i].getName()+"학생은 " + "재시험 대상입니다.");
			}else {
				System.out.println(ssm.getsArr()[i].getName()+"학생은 " + "통과입니다.");
			}
		}

	}
}
