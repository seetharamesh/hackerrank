package hackkerrank;

public class BattleBoardLeetCode {
	
	public static void insertBattleships(char[][] board) {
		board[0][0] = '.';
		board[0][1] = '.';
		board[0][2] = '.';
		board[0][3] = 'X';
		
		board[1][0] = '.';
		board[1][1] = '.';
		board[1][2] = '.';
		board[1][3] = 'X';
		
		board[2][0] = '.';
		board[2][1] = '.';
		board[2][2] = '.';
		board[2][3] = '.';
		
	}
	
	public static void printBoard(char[][] board) {
		for(int i = 0; i < board.length; i ++) {
			System.out.println("\n");
			for(int j = 0 ; j < board[0].length; j++)
				System.out.print(board[i][j] + " ");
		}
	}
	
	
	
	public static int countBattleships(char[][] board) {
   int count=0;
   System.out.println("\n\nboard length (number of rows):" + board.length);//number of rows
   System.out.println("board[0].length (number of columns): " + board[0].length); //number of columns
   //Basically X's cannot be adjacent either rows or columns.If it satisfies that condition count the battleships.
   //Note in the zeroth row, previous column exist but not previous row. So X at the very end is counted if previous column doesn't contain X.
   //Starting from first row, X is checked against previous row and column and will be skipped if they are adjacent.
   for(int i = 0; i < board.length; i++) {
  	 for(int j=0; j<board[0].length; j++) {
  		 if(board[i][j] == '.') continue;
  		 if(i > 0 && board[i-1][j] == 'X')continue; //if row > 0 check if board[previous row, current col] is x. If so skip;
  		 if(j > 0 && board[i][j-1] == 'X')continue; //if col > 0 check if board[current row, previous col] is x. if so skip;			  
  			 count++;
  	 }
   }
   return count;
}
	public static void main(String[] args) {
		char[][] c = new char[3][4];
		insertBattleships(c);
		printBoard(c);
		System.out.println("Number of battleships: " + countBattleships(c));
	}
}
