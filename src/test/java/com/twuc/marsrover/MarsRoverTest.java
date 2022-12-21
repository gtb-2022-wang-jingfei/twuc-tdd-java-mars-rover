package com.twuc.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    @Test
    void shouldBuildMarsWhenInputIs55() {
        // given
        String input = "5,6";

        // when
        Mars mars = MarsBuilder.build(input);

        // then
        Assertions.assertNotNull(mars);
        Assertions.assertEquals(5, mars.getX());
        Assertions.assertEquals(6, mars.getY());
    }

    @Test
    void shouldBuildMarsRoverWhenInputIs00N() {
        // given
        String input = "0,1,N";

        // when
        MarsRover marsRover = MarsRoverBuilder.build(input);

        // then
        Assertions.assertNotNull(marsRover);
        Assertions.assertEquals(0, marsRover.getX());
        Assertions.assertEquals(1, marsRover.getY());
        Assertions.assertEquals("N", marsRover.getDirection());
    }

}
