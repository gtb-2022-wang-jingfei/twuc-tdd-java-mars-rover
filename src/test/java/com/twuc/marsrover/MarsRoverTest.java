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
}
