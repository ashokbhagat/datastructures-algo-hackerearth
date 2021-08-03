public class FindMin{
	public static void main(String args[]){
		int[] a = {6,6,7,8,6,5,4,3,9};

		int min=Integer.MAX_VALUE;	

		for(int i=0;i<a.length;i++){
			min = a[i]<min?a[i]:min;
		}

		System.out.println(min);


	}
}