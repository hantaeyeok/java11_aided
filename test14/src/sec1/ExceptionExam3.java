package sec1;
//ArrayIndexOutOfBoundsException : 베열의 범위를 초과하는 경우 발생하는 예외
public class ExceptionExam3 {

	public static void main(String[] args) {
		int[] nArr = {90,85,100};
		int i = 0;
		while(i <=3) {
			try {
			System.out.println(nArr[i]);
			i++;
			} catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				break;
			} catch(Exception e) {
				e.printStackTrace();
			} finally {	//예외가 발생하던 안하던 무조건 실행하는 구문
				System.out.println("작업종료");	//성공(try) 수행이든 실패(catch) 수행이든 작업 후 반드시 실행
			}
		}

	}

}
