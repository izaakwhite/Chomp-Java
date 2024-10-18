// Implements a 2-D array of characters

public class CharMatrix
{
  // Fields:
    private char[][] board;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    board = new char[rows][cols];

		for (int row = 0; row < board.length; row++)
			{
			for (int col = 0; col < board[0].length; col++)
				{
				 board[row][col] = ' ';
				}
			}


  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
  	board = new char[rows][cols];

		for (int row = 0; row < board.length; row++)
			{
			for (int col = 0; col < board[0].length; col++)
				{
				 board[row][col] = fill;
				}
			}

  }

  // Returns the number of rows in grid
  public int numRows()
  {
	return board.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
	return board[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
	return board[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
	board[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    if(board[row][col] == ' ')
    	return true;
    else
    	return false;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
		for (int row = row0; row <= row1; row++)
			{
			for (int col = col0; col <= col1; col++)
				{
				 board[row][col] = fill;
				}
			}
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	for (int row = row0; row <= row1; row++)
			{
			for (int col = col0; col <= col1; col++)
				{
				 board[row][col] = ' ';
				}
			}


  }

  // Returns the count of all non-space characters in row
  public int countInRow(int row)
  {
  	int i = 0;
  	for (int col = 0; col < board[0].length; col++)
  		{
  			if(board[row][col] != ' ')
  				i++;
  		}
	return i;
  }

  // Returns the count of all non-space characters in col
  public int countInCol(int col)
  {
	int i = 0;
  	for (int row = 0; row < board.length; row++)
  		{
  			if(board[row][col] != ' ')
  				i++;
  		}
	return i;
  }
}
