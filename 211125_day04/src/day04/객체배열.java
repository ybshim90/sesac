package day04;

public class ��ü�迭 {

	public static void main(String[] args) {
//		Movie m1 = new Movie("����","����ȣ",300);
//		Movie m2 = new Movie("��¡��","Ȳ����",200);
		
		Movie[] movies = new Movie[100];
		int count = 0;
		movies[count++] = new Movie("����","����ȣ",300);
		
		movies[count++] = new Movie("��¡��","Ȳ����",200);
		
		movies[count++] = new Movie("��ü��Ż��","�����",100);
		
		for(int i=0;i<count;i++) {
			movies[i].printInfo();
		}
		
		for(int i=0;i<count;i++) {
			Movie m = movies[i];
			
			if(m.getTitle() == "��¡��") {
				System.out.println("��ȣ:"+i);
			}
		}
		String movieTitle = "��ü��Ż��";
		int findIndex = -1;
		for(int i=0;i<count;i++) {
			Movie m = movies[i];
			
			if(m.getTitle() == movieTitle) {
//				System.out.println("��ȣ:"+i);
//				m.setCost(150);
				findIndex = i;
				break;
			}
		}
		
		if(findIndex == -1) {
			System.out.println("�˻�����");
		}else {
			System.out.println(movieTitle + findIndex);
			movies[findIndex].setCost(150);
		}
		
		movieTitle = "��¡��";
		
		findIndex = -1;
		for(int i=0;i<count;i++) {
			Movie m = movies[i];
			
			if(m.getTitle() == movieTitle) {
				findIndex = i;
				break;
			}
		}
		
		if(findIndex == -1) {
			System.out.println("�˻�����");
		}else {
			System.out.println(movieTitle + findIndex);
			movies[findIndex] = movies[count-1];
			movies[count-1] = null;
			count--;
		}
		
		for(int i=0;i<count;i++) {
			movies[i].printInfo();
		}
		
	}

}
