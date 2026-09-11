class Solution {
    public int distributeCandies(int[] candyType) {

        int candyCount=candyType.length/2;

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<candyType.length;i++){


            set.add(candyType[i]);
        }

        int candySize=set.size();

        int size=Math.min(candySize,candyCount);


        return size;

        
    }
}