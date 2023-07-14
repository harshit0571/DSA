import java.util.* ;
import java.io.*; 
public class Solution {
	static void Delete(Stack<Integer> St,int n,int size){
		if(n==size/2){
			St.pop();
			return ;
		}
		int a=St.peek();
		St.pop();
		Delete(St, n+1,size);
		St.push(a);
	}
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		Delete(inputStack, 0, (N%2==0 ? N-1 : N));
	}
}
