package project01;

public class TestManager {

	public static void main(String[] args) {
		
		사람[] parr = new 사람[1000];
		int count = 0;
		parr[count++] = new 직원("홍길동","111-222","010-111","총무부");
		parr[count++] = new 직원("김길동","111-333","010-222","관리부");
		parr[count++] = new 강사("박길동","111-444","010-223","자바");
		parr[count++] = new 강사("이길동","111-555","010-332","파이썬");
		parr[count++] = new 수강생("최길동","111-666","010-443","자바기본");
		parr[count++] = new 수강생("강길동","111-777","010-553","파이썬중급");
		
		System.out.println("전체출력");
		for(int i=0; i<count; i++) {
			System.out.println(parr[i].getInfo());
		}
	}

}
