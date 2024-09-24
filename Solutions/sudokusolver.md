Sudoku Solver

## Description
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
## Java Code
```python
class Solution(object):
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        self.solve(board)

    def solve(self, board):
        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    for num in map(str, range(1, 10)):
                        if self.is_valid_move(board, i, j, num):
                            board[i][j] = num
                            if self.solve(board):
                                return True
                            board[i][j] = "."
                    return False
        return True
    def is_valid_move(self, board, row, col, num):

        return (
            all(num != board[row][j] for j in range(9))
            and all(num != board[i][col] for i in range(9))
            and all(
                num != board[3 * (row // 3) + i][3 * (col // 3) + j]
                for i in range(3)
                for j in range(3)
            )
        )
