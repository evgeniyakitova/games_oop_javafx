package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenMoveFromC1ToH6ThenFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveFromC1ToC6IsImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C6);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenMoveFromC1ToG5ThenWayIsNotFree()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.F4));
        logic.move(Cell.C1, Cell.G5);
    }

}