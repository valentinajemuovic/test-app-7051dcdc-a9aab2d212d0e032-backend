package com.valentinajemuovic.skytravel.backend.testkit.dsl.port.given.steps;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.given.steps.base.GivenStep;

public interface GivenClock extends GivenStep {
    GivenClock withTime();

    GivenClock withTime(String time);
}
