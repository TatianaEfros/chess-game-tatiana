public class Queen extends ChessPiece {

    Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line && toColumn == column) {
            return false;
        }
        int lineDiff = Math.abs(toLine - line);
        int colDiff = Math.abs(toColumn - column);
        if (!(line == toLine || column == toColumn || lineDiff == colDiff)) {
            return false;
        }
        return chessBoard.isPathClear(line, column, toLine, toColumn);
    }
}
