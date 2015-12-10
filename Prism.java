public class Prism extends Rectangle{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Prism" + getName()+ "That is " + length + " by "+ width + " by " + height  ;
    }
    public double getVolume(){
	return height * width * length;
    }
}


