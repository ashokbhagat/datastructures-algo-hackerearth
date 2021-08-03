package ds.array;

//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/tournament-and-ranks-67cd4b7e/

public class Scoreboard {
    public static void main(String[] args) {

// 4 3
// 1 1 1 1
// 1 5
    


    	Scanner sc= new Scanner(System.in);
    	int len = sc.nextInt();
    	int[] scores = new int[len];
    	int noOfUpdates = sc.nextInt();
    	
    	for(int=0;i<len;i++)
    			scores[i] = sc.nextInt();

    	

    	while(noOfUpdates-- > 0){
    		scores[positionToUpdate]=valueToUpdate;
    		ranker(Arrays.copyOf(scores, scores.length))
			}

    private void ranker(int[] modifiedscores){
    		System.out.println(len);    		
    		for(int i=1;i<len;i++){

    			if(scores[i-1]==scores[i]){
    				rank++;
    				continue;
    			}

    			System.out.println(++rank);
    		}
    		System.out.println(1);

    	}
    }
}
