public class Rook extends ChessPiece {
    Rook(String color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line && toColumn == column) {
            return false;
        }
        int lineDiff = Math.abs(toLine - line);
        int colDiff =  Math.abs(toColumn - column);
        if (lineDiff > 0 && colDiff > 0) {
            return false;
        }
        return chessBoard.isPathClear(line, column, toLine, toColumn);
    }
}