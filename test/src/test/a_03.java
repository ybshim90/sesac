package test;

public class a_03 {
	public static void main(String[] args) {
		String seoul[] = new String[2];
		seoul[0] = "Jane";
		seoul[1] = "Kim";
		String answer = "";
        
        int count = 0;
        
//        for(int i=0; i<seoul.length; i++){
//            if(seoul[i] == "Kim"){
//                count = i;
//                break;
//            }
//        }
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                count = i;
                break;
            }
        }
        
        answer = "김서방은 "+count+"에 있다";
        
        System.out.println(answer);
	}
	
	
	
	
	
}
