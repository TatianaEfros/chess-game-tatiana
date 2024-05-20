public class Horse extends ChessPiece {
    Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line || toColumn == column) {
            return false;
        }
        int lineDiff = Math.abs(toLine - line);
        int colDiff = Math.abs(toColumn - column);
        if (!((colDiff == 1 && lineDiff == 2 ) || (lineDiff == 1 && colDiff == 2))) {
            return false;
        }
        if (chessBoard.isPathClear(line, column, toLine, toColumn)) check = false;
        return chessBoard.getPiece(toLine,toColumn) == null;
    }
}
