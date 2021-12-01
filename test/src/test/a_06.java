package test;

public class a_06 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer = {};
        
        int pre = -1;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(pre != arr[i]){
            	count++;
            	pre = arr[i];
            }
        }
        answer = new int[count];
        pre = -1;
        count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(pre != arr[i]){
                answer[count] = arr[i];
                count++;
                pre = arr[i];
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        System.out.println(arr[0]);


	}

}
