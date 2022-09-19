public class App {
    public static void main(String[] args) {
        int a, b;
        // float x;        
        double x;
        int c, d;
        // ---------- point 1
        a = 5;
        c = 9;
        d = 20;
        // x = 22.1f;
        x = 22.1;
        // ---------- point 1a
        b = fnb();
        System.out.println("b = " + b);
        // ---------- point 1b
        x = fnx(a);
        System.out.println("x = " + x);
        // ---------- point 1c
        a = fnb();
        System.out.println("a = " + a);
        // ---------- point 1d
    }
    public static float fnx(int xa) {
        int g, h;
        // ---------- point 4
        g = 7;
        h = 22;
        // ---------- point 4a
        return g + h + xa;
    }
    public static int fnb() {
        int u, v;
        // float y;        
        double y;
        int w;
        // ---------- point 2
        u = 51;
        v = 53;
        // y = 41.2f;
        y = 41.2;
        // ---------- point 2a
        w = fnw();
        // ---------- point 2b
        return u + v + (int)y + w;
    }
    public static int fnw() {
        int q, r;
        // float z;        
        double z;
        int p;
        // ---------- point 3
        q = 2;
        p = 3;
        r = 19;
        // z = 41.2f;
        z = 41.2;
        // ---------- point 3a
        return r + q + p + (int)z;
    }
}
