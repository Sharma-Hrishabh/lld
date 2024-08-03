package org.lld.tictactoe;

public class PieceO implements PlayingPiece{
    PieceType pieceType;
    public PieceO(){
        this.pieceType = PieceType.O;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }
}
