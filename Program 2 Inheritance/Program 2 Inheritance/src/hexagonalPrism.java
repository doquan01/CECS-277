public class hexagonalPrism extends Luggage{
    private int edge;
    private int height;
    public hexagonalPrism(int edge, int height){
        super((float)((((3 * Math.sqrt(3))/2) * (edge * edge) * height)),"hexagonal prism");
        this.edge = edge;
        this.height = height;
    }
    public String toString(){
        return "Hexagonal Prism, Volume: " + Math.round(getVolume() * 100.0)/100.0 + ", Edge: " + edge + ", Height: " + height;
    }
}
