public class Porsche implements Auto {
    private double sebesseg;
    Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }
    public void gyorsul(){
        sebesseg =+ 10;
    }
    public double getSebesseg() { 
        return sebesseg;
    }
}
