package chapter16.org.bitstorm.gameoflife;

public interface CellGridDrawer {
    void setCellSize(int cellSize);
    void resized();
    void draw(int x, int y);
    void setShape (Shape shape) throws ShapeException;
}
