package thecell.threedoor;

import thecell.model.Cell;
import thecell.model.ThreeCells;

import java.util.ArrayList;

public class ThreeDoor {
    public static void main(String[] args) {
        ArrayList<ThreeCells> threeCells = new ArrayList<>();
        int totalPlayTimes = 1000;

        for(int i = 0 ; i < totalPlayTimes; i++) {
            threeCells.add(new ThreeCells());
        }

        GameView gameView = new GameView();
        Game game = new Game();

        int winCount1 = 0;
        int winCount2 = 0;
        for (ThreeCells cells: threeCells) {
            game.play(true, cells);
            for (Cell cell: cells.cells) {
                if (cell.isInitSelected() && cell.isContainACar()) {
                    winCount1++;
                }
                if (cell.isSelected() && cell.isContainACar()) {
                    winCount2++;
                }
            }
        }

        gameView.printGame(threeCells);

        System.out.println("Win times without change selection: " + winCount1 + "/" + totalPlayTimes + " with changed selection: " + winCount2 + "/" + totalPlayTimes);

    }
}
