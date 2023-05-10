package MiniExercises.models;

// display characteristics (size and number of colors).
public class Display {
    private int size;
    private int numberOfColors;

    public Display() {
    }

    public Display(int size, int numberOfColors) {
        this.size = size;
        this.numberOfColors = numberOfColors;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }

}
