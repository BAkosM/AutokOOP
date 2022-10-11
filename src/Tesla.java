public class Tesla implements Auto{
    private double sebesseg;
    Tesla(double sebesseg) {
        this.sebesseg = Math.floor(Math.random()*60);
    }
    public void gyorsul(){
        sebesseg =+ Math.floor(Math.random()*10+5);
    }
    public double getSebesseg() { 
        return sebesseg;
    }    
}
