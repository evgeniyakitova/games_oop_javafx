package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionIsC8() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = Cell.C8;
        Cell result = bishopBlack.position();
        assertEquals(expected, result);
    }

    @Test
    public void whenCopyF8ToH6ThenH6() {
        Figure bishopBlack = new BishopBlack(Cell.F8);
        Figure copy = bishopBlack.copy(Cell.H6);
        Cell expected = Cell.H6;
        assertEquals(expected, copy.position());
    }

    @Test
    public void whenWayFromC1ToG5IsPossible() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] result = bishopBlack.way(Cell.G5);
        assertArrayEquals(expected, result);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayFromC1ToD5IsImpossible() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.D5);
    }
}