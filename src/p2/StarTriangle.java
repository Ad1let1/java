package p2;

public class StarTriangle {
    private int width;
    private String s;
    private String triangle = "";
    public StarTriangle(int width) {
        this.width = width;
    }
    public StarTriangle(int width, String c){
        this(width);
        this.s = c;
    }

    public String toString(){
        for (int i = 0; i < width; i++) {
            triangle += "[*]".repeat(i+1);
            triangle += " ".repeat(width - (i+1));
            triangle += '\n';
        }
        return triangle;
    }


}
