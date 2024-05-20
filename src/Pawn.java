public class Pawn extends ChessPiece {
    Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line || toColumn != column) {
            return false;
        }

        int difference = Math.abs(toLine - line);
        if ((color.equals("White") && line == 1 ) || (color.equals("Black") && line == 6)) {

            if (difference > 2 || difference < 1) {
                return false;
            }
        } else {
            if (difference != 1) {
                return false;
            }
        }
        return chessBoard.isPathClear(line, column, toLine, toColumn);
    }
}
