package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.tax.usecases;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.external.tax.TaxDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.tax.usecases.base.BaseTaxUseCase;

/**
 * The Tax liveness probe behind {@code assume().tax().shouldBeRunning()}. Sibling of {@code GoToErp}
 * — see that use case for why it returns no {@code Result}.
 */
public class GoToTax extends BaseTaxUseCase {

    public GoToTax(TaxDriver driver) {
        super(driver);
    }

    @Override
    public void execute() {
        driver.goToTax();
    }
}
