package org.lld.tictactoe;

public class PieceX implements PlayingPiece{
    PieceType pieceType;
    PieceX() {
        this.pieceType = PieceType.X;
    }


    public PieceType getPieceType() {
        return pieceType;
    }
}
