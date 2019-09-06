package thecell.model;

public class ThreeCells {
    public Cell cells[];

    public ThreeCells() {
        int random = (int)(Math.random()*3);

        cells = new Cell[3];
        for(int i = 0; i < cells.length; i++) {
            cells[i] = new Cell(i,random);
        }
    }

    public int getOpenDoor(int selectedCellNumber) {
        cells[selectedCellNumber].initSelected = true;
        int random = (int)(Math.random()*2);
        int[] remainingCells = new int[2];
        int a = 0;
        int carMarker = -1;
        for(int i = 0; i < cells.length; i++) {
            if (i != selectedCellNumber) {
                remainingCells[a++] = i;
                if (cells[i].isContainACar()) {
                    carMarker = i;
                }
            }
        }

        if (carMarker != -1) {
            for (int i: remainingCells) {
                if (i != carMarker) {
                    cells[i].opened = true;
                }
            }
        }else {
            cells[remainingCells[random]].opened = true;
        }
        return remainingCells[random];
    }
}
