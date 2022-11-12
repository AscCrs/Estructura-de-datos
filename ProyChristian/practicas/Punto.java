public class Punto {
    int coorx;
    int coory;

    Punto(int coorx, int coory) {
        this.coorx = coorx;
        this.coory = coory;
    }

    public int getCoorx() {
        return coorx;
    }

    public int getCoory() {
        return coory;
    }

    public void setCoorx(int x) {
        coorx = x;
    }

    public void setCoory(int y) {
        coory = y;
    }

    public String toString() {
        return "(" + coorx + ", " + coory + ")";
    }
}
