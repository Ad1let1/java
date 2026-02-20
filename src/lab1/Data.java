package lab1;

public class Data {
    private double sum, mx;
    private int cnt;
    public Data(){
        this.sum = 0;
        this.cnt = 0;
        this.mx = -1e9;
    }
    public void add(int x){
        sum += x;
        mx = Math.max(mx, x);
        cnt++;
    }
    public double avg(){
        if(this.cnt == 0) return 0;
        return this.sum / this.cnt;
    }
    public double max(){
        if(this.cnt == 0) return 0;
        return this.mx;
    }
}
