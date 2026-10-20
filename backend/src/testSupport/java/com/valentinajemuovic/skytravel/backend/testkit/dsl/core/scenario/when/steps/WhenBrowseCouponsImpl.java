package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.when.steps;

import com.valentinajemuovic.skytravel.backend.core.dtos.BrowseCouponsResponse;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.ScenarioDslImpl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.ExecutionResult;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.ExecutionResultBuilder;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.UseCaseDsl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases.BrowseCouponsVerification;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenBrowseCoupons;

public class WhenBrowseCouponsImpl
        extends BaseWhenStep<BrowseCouponsResponse, BrowseCouponsVerification>
        implements WhenBrowseCoupons {

    public WhenBrowseCouponsImpl(UseCaseDsl app, ScenarioDslImpl scenario) {
        super(app, scenario);
    }

    @Override
    protected ExecutionResult<BrowseCouponsResponse, BrowseCouponsVerification> execute(
            UseCaseDsl app) {
        var result = app.skyTravel().browseCoupons().execute();
        return new ExecutionResultBuilder<>(result).build();
    }
}
