class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //Arrays.sort(people); //nlogn
        //we can reduce complexity to On countsort
        
        int []count=new int[limit+1];
        for(int p:people){
            count[p]++;
        }
        int i=0;
        for(int j=0;j<limit+1;j++){
            while(count[j]>0){
                count[j]--;
                people[i]=j;
                i++;
            }
        }
        
		  int n=people.length;
		  int left=0,right=n-1;
            int boat=0; //initialisation
		  while(left<=right){
			  if(people[left]+people[right]<=limit){
				  left++;
				  right--;
                  //this is beacause only two people can enter
                  //other wis we can get more people
			  }else{
				  right--;
			  }
			  boat++;
		  }
		  return boat;
      }
}