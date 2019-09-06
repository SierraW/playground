package thecell.model;

public class Cell {
    private boolean containACar;
    private int position;
    boolean initSelected;
    boolean selected;
    boolean opened;

    Cell(int position, int randomNumber) {
        this.position = position;
        this.initSelected = false;
        this.selected = false;
        this.opened = false;

        if (randomNumber == position) {
            containACar = true;
        } else {
            containACar = false;
        }
    }

    public boolean isContainACar() {
        return containACar;
    }

    public boolean isOpened() {
        return opened;
    }

    public boolean isInitSelected() {
        return initSelected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
