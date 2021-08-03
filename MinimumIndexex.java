5 5
62 70 28 62 92
1
5
3
4
2
//read the input array
//Read i from Q
	//traverse from i till length
		//if Aj > Ai && sum of digit of Ai > sum of digit of Aj then return else continue till lenght array



public class MinimumIndexex{

	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[l];
		int result = -1;

		for(int i=0;i<l;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<q; i++){
			int ind=sc.nextInt();

			for(int j=ind+1;j<l;j++){
				if(arr[ind]<arr[j] && digitSum(arr[ind],arr[j])){
					result=j;
					break;
				}
			}

			System.out.println(result);
		}
	}

private static boolean digitSum(int v1, int v2){
	return ((v1%10 + v1/10) > (v2%10 + v2/10));
}


}