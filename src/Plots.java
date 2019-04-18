public class Plots {
private boolean plotFilled;
public double cropTime;


public void setPlotStatus(boolean  b){
    plotFilled = b;
}

public void setTime(double t){
    cropTime =t;
}

public double getCropTime(){
    return cropTime;
}

public boolean isPlotFilled(){
    return plotFilled;
}

public void displayPlot(){
    System.out.println( "_________________________" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
    System.out.println("|_________________________|" );
}

}
