class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }

        int maxarea=0;

        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                int currarea=sink(grid,r,c);
                maxarea=Math.max(maxarea,currarea);
                }
                
            }
        }
        return maxarea;
    }
    private int sink(int[][] grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        int area=1;
        area+=sink(grid,r-1,c);
        area+=sink(grid,r+1,c);
        area+=sink(grid,r,c-1);
        area+=sink(grid,r,c+1);

        return area;
    }
}
