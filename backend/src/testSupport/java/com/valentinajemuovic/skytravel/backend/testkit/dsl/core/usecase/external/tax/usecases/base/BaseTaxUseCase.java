package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.tax.usecases.base;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.external.tax.TaxDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.BaseStubUseCase;

public abstract class BaseTaxUseCase extends BaseStubUseCase<TaxDriver> {

    protected BaseTaxUseCase(TaxDriver driver) {
        super(driver);
    }
}
