package org.lld.tictactoe;

public class Board {
    int size;
    PlayingPiece[][] playingPieces;
    public Board(int size) {
        this.size = size;
        playingPieces = new PlayingPiece[size][size];
    }

    public void move(int row, int col,Player p) {
        //check if valid
        if(playingPieces[row][col] != null || row>=size || col>=size || row<0 || col<0) { throw new RuntimeException("Invalid move");}
        this.playingPieces[row][col]=p.playingPiece;

    }

    public Boolean checkWin(int row,int column,Player p){

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<size;i++) {

            if(playingPieces[row][i] == null || playingPieces[row][i].getPieceType() != p.getPlayingPiece().getPieceType()) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<size;i++) {

            if(playingPieces[i][column] == null || playingPieces[i][column].getPieceType() != p.getPlayingPiece().getPieceType()) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<size;i++,j++) {
            if (playingPieces[i][j] == null || playingPieces[i][j].getPieceType() != p.getPlayingPiece().getPieceType()) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=size-1; i<size;i++,j--) {
            if (playingPieces[i][j] == null || playingPieces[i][j].getPieceType() != p.getPlayingPiece().getPieceType()) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
