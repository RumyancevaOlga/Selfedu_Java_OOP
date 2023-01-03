public class Rect {
    int x1, x2, y1, y2;

    {
        x1 = 0; y1 = 10;
        x2 = 20; y2 = 0;
    }

    public Rect() {
    }

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Rect(int x1, int y1, float weight, float hight) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = (int)weight + x1;
        this.y2 = y1 - (int)hight;
    }

}
