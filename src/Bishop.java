public class Bishop extends ChessPiece {
    Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line || toColumn == column) {
            return false;
        }
        if (Math.abs(toLine - line) != Math.abs(toColumn - column)) {
            return false;
        }
        return chessBoard.isPathClear(line, column, toLine, toColumn);
    }
}
