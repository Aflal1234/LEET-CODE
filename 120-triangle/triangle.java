class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-1;i>0;i--){
            List<Integer> list=triangle.get(i);
            List<Integer> list1=triangle.get(i-1);
            for(int j=0;j<list.size()-1;j++){
                int a=list1.get(j)+Math.min(list.get(j),list.get(j+1));
                list1.set(j,a);
            }
        }
        return triangle.get(0).get(0);
    }
}