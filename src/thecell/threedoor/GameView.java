package thecell.threedoor;

import thecell.model.Cell;
import thecell.model.ThreeCells;

import java.util.ArrayList;

public class GameView {
    public void printGame(ArrayList<ThreeCells> threeCells) {
        for(ThreeCells cells: threeCells) {
            for (Cell cell: cells.cells) {
                var cellStatus = "";
                if (cell.isContainACar()) {
                    cellStatus += "🚗";
                } else {
                    cellStatus += "  ";
                }

                if (cell.isOpened()) {
                    cellStatus += "  ";
                } else {
                    cellStatus += "🔒";
                }

                if (cell.isInitSelected()) {
                    cellStatus += "\uD83D\uDCCD";
                } else {
                    cellStatus += "  ";
                }

//                if (cell.isSelected()) {
//                    cellStatus += "🤔";
//                } else {
//                    cellStatus += "  ";
//                }

                System.out.print("[" + cellStatus + "]");
            }
            System.out.println();
        }
    }
}
