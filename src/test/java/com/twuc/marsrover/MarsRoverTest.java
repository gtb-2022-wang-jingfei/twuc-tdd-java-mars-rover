package com.twuc.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsRoverTest {

    @Test
    void shouldCreateMarsWhenInputIs55() {
        // given
        String input = "5,6";

        // when
        Mars mars = MarsBuilder.build(input);

        // then
        assertNotNull(mars);
        assertEquals(5, mars.getWidth());
        assertEquals(6, mars.getHeight());
    }

    @Test
    void shouldCreateMarsRoverWhenInputIs12N() {
        // given
        String input = "1,2,N";

        // when
        MarsRover marsRover = MarsRoverBuilder.build(input);

        // then
        assertNotNull(marsRover);
        assertEquals(1, marsRover.getX());
        assertEquals(2, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void shouldTurnLeftWhenActionIsL() {
        // given
        MarsRover marsRover = MarsRoverBuilder.build("0,0,N");
        String action = "L";

        // when
        marsRover.execute(action);

        // then
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void shouldTurnRightWhenActionIsRAndInitDirectionIsN() {
        // given
        MarsRover marsRover = MarsRoverBuilder.build("0,0,N");
        String action = "R";

        // when
        marsRover.execute(action);

        // then
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void shouldTurnRightWhenActionIsRAndInitDirectionIsW() {
        // given
        MarsRover marsRover = MarsRoverBuilder.build("0,0,W");
        String action = "R";

        // when
        marsRover.execute(action);

        // then
        assertEquals("N", marsRover.getDirection());
    }
}
