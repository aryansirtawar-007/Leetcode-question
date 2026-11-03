class Solution {
    public int totalNQueens(int n) {
         List<List<String>>result=new ArrayList<>();
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        } 

        solve(0,board,result,n);
        return result.size();  
        
    }

      public void solve(int row,char[][]board,List<List<String>>result,int n){

        //base case:all queens are placed
        if(row==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                //place queen
                board[row][col]='Q';
                
                //recurssive call for next row 

                solve(row+1,board,result,n);
                //Backtracking
                board[row][col]='.';
            }
        }
    }

    public boolean isSafe(int row,int col,char[][]board,int n){
        //check upper column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check upper-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //check upper-right diagonal
        for(int i=row-1,j=col+1;  i>=0 && j<n;  i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}