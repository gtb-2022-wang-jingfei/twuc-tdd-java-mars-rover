package com.twuc.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    @Test
    void shouldBuildMarsWhenInputIs55() {
        // given
        String input = "5,5";

        // when
        Mars mars = MarsBuilder.build(input);

        // then
        Assertions.assertNotNull(mars);
        Assertions.assertEquals(5, mars.getX());
        Assertions.assertEquals(5, mars.getY());
    }
}
