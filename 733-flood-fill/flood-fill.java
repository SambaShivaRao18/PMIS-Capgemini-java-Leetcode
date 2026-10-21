class Solution {
    public static void helper(int[][] image,int r,int c,int orgColor,int newColor)
    {
        if(r<0 || r>=image.length || c<0 || c>=image[0].length || orgColor!=image[r][c] || image[r][c]==newColor)
            return;
        
        image[r][c]=newColor;

        //up
        helper(image,r-1,c,orgColor,newColor);
        //down
        helper(image,r+1,c,orgColor,newColor);
        //left
        helper(image,r,c-1,orgColor,newColor);
        //right
        helper(image,r,c+1,orgColor,newColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;

        helper(image,sr,sc,image[sr][sc],color);
        return image;
    }
}