package day01;

public class day01_과제 {

	public static void main(String[] args) {

		/*
		 국어, 영어, 수학의 점수 합계와 평균을 출력
		 평균 > 소수점을 살려서 출력
		 합계, 평균 꾸미기
		 조건선택 연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격으로 결과를 출력
		 */
		
		int kor = 76, eng = 84, mat = 93; 
		int sum = kor+eng+mat;
		double avg = sum / (double)3;
		
		System.out.println("국영수 점수 합 : "+ sum + "점");
		System.out.println("국영수 점수 평균 : "+ avg);
		
		String result = (avg>=80)?"합격 하였습니다.":"불합격 하였습니다.";
		System.out.println("이번 시험에 " + result);

		// 조건선택 연산자 > if 문으로 변경 
		if(avg>=80) {
			System.out.println("결과:합격");
		}else {
			System.out.println("결과:불합격");
		}
	}

}
