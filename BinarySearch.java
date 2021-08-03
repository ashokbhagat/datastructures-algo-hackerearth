public class BinarySearch {
	
		public static void main(String args[]){

			//get sorted array

			int[] a = {1,5,9,22,85,159,568,999,1000,1548};
			int value=90;

			int start=0;
			int end = a.length;
			int mid=0;
			boolean found=false;

			while(start<=end){
				mid=(start+end)/2;
			if(a[mid]==value){
					found=true;
					break;
				}else if(value>a[mid]){
					start=mid+1;
				}else{
					end=mid-1;
				}
			}


			if(found){
				System.out.println("value found at position"+mid);
			}else{
				System.out.println("Not found");
			}



		}

}