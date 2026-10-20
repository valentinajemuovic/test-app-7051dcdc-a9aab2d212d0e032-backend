package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.given.steps;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.given.GivenImpl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.then.ThenImpl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.when.WhenImpl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.UseCaseDsl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.given.steps.base.GivenStep;

public abstract class BaseGivenStep implements GivenStep {

    private final GivenImpl given;

    protected BaseGivenStep(GivenImpl given) {
        this.given = given;
    }

    @Override
    public GivenImpl and() {
        return given;
    }

    @Override
    public WhenImpl when() {
        return given.when();
    }

    @Override
    public ThenImpl then() {
        return given.then();
    }

    /** Translates this step into use case calls. Run by {@link GivenImpl} on the hop into when/then. */
    public abstract void execute(UseCaseDsl app);
}
