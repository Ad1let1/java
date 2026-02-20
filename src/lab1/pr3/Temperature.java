package lab1.pr3;

public class Temperature {
    private double temp;
    private char scale;

    public Temperature(){
        this.temp = 0;
        this.scale = 'C';
    }
    public Temperature(double d){
        this.temp = d;
        this.scale = 'C';
    }
    public Temperature(char c){
        this.temp = 0;
        this.scale = c;
    }
    public Temperature(double d, char c){
        this.temp = d;
        this.scale = c;
    }

    public double getC(){
        if(scale == 'C') return temp;
        else return (temp - 32) * 5 / 9;
    }
    public double getF(){
        if(scale == 'F') return temp;
        else return temp * 9 / 5 + 32;
    }

    public char getScale(){
        return scale;
    }
    public String getAll(){
        return temp + " " + scale;
    }

    public void setScale(char scale){
        this.scale = scale;
    }
    public void setTemp(double temp){
        this.temp = temp;
    }
    public void setAll(double temp, char scale){
        this.temp = temp;
        this.scale = scale;
    }

    @Override
    public String toString(){
        return this.temp  + " " + this.scale;
    }

}
