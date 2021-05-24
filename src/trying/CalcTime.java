package trying;

public class CalcTime {

    private double start;

    public void start(){
        this.start = System.nanoTime() * Math.pow(10, -6);
    }

    public double finish(){

        double finish = System.nanoTime() * Math.pow(10, -6);
        return finish - this.start;

    }

}
