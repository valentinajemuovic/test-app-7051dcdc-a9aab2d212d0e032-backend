package com.valentinajemuovic.skytravel.backend.testkit.dsl.port.given.steps.base;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.given.GivenStage;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.then.ThenStage;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.WhenStage;

public interface GivenStep {
    GivenStage and();

    WhenStage when();

    ThenStage then();
}
