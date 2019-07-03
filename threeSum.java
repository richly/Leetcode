class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int length = nums.length;
        int[] tempArr = new int[3];
        Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List tempList;
        
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    if( (nums[i]+nums[j]+nums[k]) == 0){
                         
                         tempArr[0] = nums[i];
                         tempArr[1] = nums[j];
                         tempArr[2] = nums[k]; 
                         Arrays.sort(tempArr);
                         
                         for(int m=0;m<3;m++){
                             System.out.print(tempArr[m]+",");
                         }
                         System.out.println();
                         
                         tempList = Arrays.asList(tempArr);
                         
                         resultSet.add(tempList);
                         
                         tempList = new ArrayList();  
                    }
                }
            }
        }
        
        resultList = new ArrayList<>(resultSet);
        return resultList;
    }
}