package thecell.threedoor;

import thecell.model.Cell;
import thecell.model.ThreeCells;

public class Game {

    public void play(boolean selectAnotherDoor, ThreeCells threeCells) {
        int random = (int)(Math.random()*3);

        int opened = threeCells.getOpenDoor(random);

        if (selectAnotherDoor) {
            for (Cell cell: threeCells.cells) {
                if (!cell.isInitSelected() && !cell.isOpened()) {
                    cell.setSelected(true);
                }
            }
        } else {
            threeCells.cells[random].setSelected(true);
        }
    }
}
