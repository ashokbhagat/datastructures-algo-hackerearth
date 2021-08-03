import java.util.*;

public class DiskTower{

	int top=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.netInt();
		int[] disks = new int[len];
		int[] sortedDisk = new int[len];
		int top=len-1;

		Set<Integer> ds =  new HashSet<Intger>();

		for (int i=0; i<len; i++) {
			disks[i] = sc.netInt();
			sortedDisk[i] = disks[i];
		}

		Arrays.sort(sortedDisk);

		for (int i=0; i<len ; i++) {
			
			if(disks[i]!==getTop()){
				System.out.println("-------------");
				ds.add(disks[i]);
				continue;
			}

			checkAndPrint();
		}

	}

	private static checkAndPrint(){
		System.out.print(pop()+", ");
		if (ds.contains(new Integer(sortedDisk[top]))) {
			System.out.print(pop()+", ");
		}
	}



	private static void push(int value){
		if(top==sortedDisk.length-1){
			System.out.println("sortedDisk is full!!!");
			return;
		}

		top=top+1;
		sortedDisk[top]=value;
		System.out.println("Pushed value:"+value+" and top:"+top);
	}

	private static int pop(){
		if(top==-1){
			System.out.println("sortedDisk is empty !!!");
			return -1;
		}

		int value=sortedDisk[top];
		top=top-1;
		System.out.println("Popped value:"+value+" and top:"+top);
		return value;

	}

	public static int getTop(){
		return sortedDisk[top];
	}

}