//read intputs
//pop until k-1 and keep max with you
//push max
//if empty then push and pop max

import java.util.Scanner;

public class FindTopMax {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int l = sc.nextInt();
			int k = sc.nextInt();

			int[] stack = new int[l];
			int max=-1;
			int top = l-1;

			for (int i=l-1; i>=0; i--) {
				stack[i]=sc.nextInt();
			}


			int max=-1;
			for(int i=0;i<k-1;i++){
				int value=pop(stack);
				max = value>max?value:max;
			}

			push(max);

			System.out.println("Max value is :"+max);

	}


	private static void push(int[] stack, int value){
		if(top==stack.length-1){
			System.out.println("Stack is full!!!");
			return;
		}

		top=top+1;
		stack[top]=value;
		System.out.println("Pushed value:"+value+" and top:"+top);
	}

	private static int pop(int[] stack){
		if(top==-1){
			System.out.println("Stack is empty !!!");
			return -1;
		}

		int value=stack[top];
		top=top-1;
		System.out.println("Popped value:"+value+" and top:"+top);
		return value;

	}

}