package Abstractions_First_Lection.TrafficLights;

public class TrafficLight {

    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeLight(){//red -> green -> yellow -> red
        switch (color){
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
            case  YELLOW:
                color = Color.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return color.toString() + " ";
    }
}
