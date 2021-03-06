public class sphere extends Luggage {
    private int radius;
    public sphere(int radius){
        super((float)((4/3) * Math.PI * (radius * radius * radius)), "sphere");
        this.radius = radius;
    }
    public String toString(){
        return "Sphere, Volume: " + Math.round(getVolume() * 100.0)/100.0 + ", Radius: " + radius;
    }
}
