package test;

public class a_02 {
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static String solution(int n) {
        String answer = "";
        String s1 = "¼ö¹Ú";
        int len = s1.length();
        
        System.out.println(len);
        System.out.println(n);
        System.out.println(n/len);
        System.out.println(n%len);
        
        for(int i=0; i<(n/len); i++){
            answer = answer + s1;
        }
        if(n%len > 0){
            answer = answer + s1.substring(0,n%len);
        }
        
        return answer;
    }
}
