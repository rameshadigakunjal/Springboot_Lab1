package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void shouldReturnCarDetails() {
        App app = new App();

        assertThat(app.getCarDetails()).isEqualTo("Car: Hyundai Creta");
    }
}
