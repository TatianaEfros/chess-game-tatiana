public class King extends  ChessPiece{

    King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line && toColumn == column) {
            return false;
        }
        int lineDiff = Math.abs(toLine - line);
        int colDiff = Math.abs(toColumn - column);
        if (colDiff > 1 || lineDiff > 1) {
            return false;
        }

        if (chessBoard.isPathClear(line, column, toLine, toColumn)) check = false;
        return chessBoard.isPathClear(line, column, toLine, toColumn);
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < chessBoard.board.length; i++) {
            for (int j = 0; j < chessBoard.board[i].length; j++) {
                ChessPiece piece = chessBoard.getPiece(i, j);
                if (piece != null && !piece.getColor().equals(this.getColor())) {
                    if (piece.canMoveToPosition(chessBoard, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
