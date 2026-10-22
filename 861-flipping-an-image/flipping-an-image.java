class Solution {
    public static void reverseRow(int[][] image,int row)
    {
        int i=0;
        int j=image[row].length-1;
        while(i<image[row].length && j>=0 && i<=j)
        {
            int temp=image[row][i];
            image[row][i]=image[row][j];
            image[row][j]=temp;
            i++;
            j--;
        }

        for(int k=0;k<image[row].length;k++)
        {
            if(image[row][k]==0)
            {
                image[row][k]=1;
            }
            else
                image[row][k]=0;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            reverseRow(image,i);
        }
        return image;
    }
}