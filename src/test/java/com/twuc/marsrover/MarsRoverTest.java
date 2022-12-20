package com.twuc.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    @Test
    void shouldCreateMarsWhenInputIs55() {
        // given
        String input = "5,6";

        // when
        Mars mars = MarsBuilder.build(input);

        // then
        Assertions.assertNotNull(mars);
        Assertions.assertEquals(5, mars.getWidth());
        Assertions.assertEquals(6, mars.getHeight());
    }
}
