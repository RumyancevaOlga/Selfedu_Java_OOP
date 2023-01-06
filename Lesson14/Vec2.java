public class Vec2 {
    private int a;
    private int b;
    private static final int MAX_VAL = 50;

    public Vec2() {
    }

    public Vec2(int a, int b) {
        this.a = a; this.b = b;
    }

    private boolean isCorrect (int value) {
        return (-MAX_VAL <= value && value <= MAX_VAL);
    }

    public void setA (int a) {
        if(isCorrect(a)) this.a = a;
    }

    public void setB (int b) {
        if(isCorrect(b)) this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public Vec2 sum (Vec2 v1) {
        return new Vec2((v1.getA() + this.a), (v1.getB() + this.b)); 
    }

    public Vec2 sub (Vec2 v1) {
        return new Vec2((this.a - v1.getA()), (this.b - v1.getB())); 
    }
}
