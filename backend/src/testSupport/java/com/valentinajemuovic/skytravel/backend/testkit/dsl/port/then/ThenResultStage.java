package com.valentinajemuovic.skytravel.backend.testkit.dsl.port.then;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.then.steps.ThenFailure;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.then.steps.ThenSuccess;

/** The outcome of the scenario's action, plus everything {@link ThenStage} can already assert. */
public interface ThenResultStage extends ThenStage {
    ThenSuccess shouldSucceed();

    ThenFailure shouldFail();
}
