class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int n = img.length;
        int m = img[0].length;
        int image[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int cnt=1;
                int sum=img[i][j];
                if(j>0){
                    sum+=img[i][j-1];
                    cnt++;
                }
                if(j<m-1){
                    sum+=img[i][j+1];
                    cnt++;
                }
                if(i>0){
                    sum+=img[i-1][j];
                    cnt++;
                } 
                if(i<n-1){
                    sum+=img[i+1][j];
                    cnt++;
                }
                if(i>0 && j>0){
                    sum+=img[i-1][j-1];
                    cnt++;
                }
                if(i>0 && j<m-1){
                    sum+=img[i-1][j+1];
                    cnt++;
                }
                if(i<n-1 && j>0){
                    sum+=img[i+1][j-1];
                    cnt++;
                }
                if(i<n-1 && j<m-1){
                    sum+=img[i+1][j+1];
                    cnt++;
                }
                image[i][j] = sum/cnt;
            }
        }
        return image;
    }
}
