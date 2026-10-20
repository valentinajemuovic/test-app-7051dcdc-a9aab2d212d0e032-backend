package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.when.steps;

import com.valentinajemuovic.skytravel.backend.core.dtos.BrowseOrderHistoryResponse;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.ScenarioDslImpl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.ExecutionResult;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.scenario.ExecutionResultBuilder;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.UseCaseDsl;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases.BrowseOrderHistoryVerification;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenBrowseOrderHistory;

public class WhenBrowseOrderHistoryImpl
        extends BaseWhenStep<BrowseOrderHistoryResponse, BrowseOrderHistoryVerification>
        implements WhenBrowseOrderHistory {

    public WhenBrowseOrderHistoryImpl(UseCaseDsl app, ScenarioDslImpl scenario) {
        super(app, scenario);
    }

    @Override
    protected ExecutionResult<BrowseOrderHistoryResponse, BrowseOrderHistoryVerification> execute(
            UseCaseDsl app) {
        var result = app.skyTravel().browseOrderHistory().execute();
        return new ExecutionResultBuilder<>(result).build();
    }
}
