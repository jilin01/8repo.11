package feibonaqie;

public class Shulie {
	static long func(int n){
        if(n==1||n==2) {
            return 1;
        }
        return func(n-1)+func(n-2);   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("МЭСе"); 
		System.out.println(Shulie.func(5)); 
		System.out.println(Shulie.func(27));
	}
}
