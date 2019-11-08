package thecell.model;

import thecell.event.Warning;
import thecell.status.CellStatus;

import java.util.ArrayList;

public class Cell {
    private String name;
    private ArrayList<Warning> warnings;
    private CellStatus status;
}