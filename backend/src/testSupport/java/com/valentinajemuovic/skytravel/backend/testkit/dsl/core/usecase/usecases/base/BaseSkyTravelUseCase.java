package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases.base;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.SkyTravelDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.BaseUseCase;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.ResponseVerification;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.UseCaseContext;

public abstract class BaseSkyTravelUseCase<R, V extends ResponseVerification<R>>
        extends BaseUseCase<SkyTravelDriver, R, V> {

    /**
     * Scenario-scoped scratch space, so a use case that produces an identifier can register it under
     * an alias and a later use case can resolve that alias. The external stub use cases have no
     * equivalent — they never produce a value another step refers to.
     */
    protected final UseCaseContext context;

    protected BaseSkyTravelUseCase(SkyTravelDriver driver, UseCaseContext context) {
        super(driver);
        this.context = context;
    }
}
