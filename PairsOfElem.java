import java.util.Scanner;

public class PairsOfElem{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		long[] elem = new long[len];
		

		for(int i=0;i<len;i++){
			elem[i] = sc.nextLong();
		}

		int count=0;
		for (int i=0; i<len-1; i++) {
			for (int j=i+1; j<len; j++) {
				
				long subvalue = elem[j]-elem[i];
				long sqvalue = ((i+1)*(i+1))+ ((j+1)*(j+1));
				//System.out.println("Iindex:"+i+" value:"+elem[i]+ " Jindex:"+j+" value:"+elem[j]+ "subvalue:"+subvalue+" sqvalue:"+sqvalue);
				if(subvalue==sqvalue){
					count++;
				}
			
			y}
			
		}
		System.out.println(count);

	}
}