package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.tax.usecases;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.external.tax.TaxDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.tax.usecases.base.BaseTaxUseCase;

public class ReturnsNoTaxRate extends BaseTaxUseCase {

    private String country;

    public ReturnsNoTaxRate(TaxDriver driver) {
        super(driver);
    }

    public ReturnsNoTaxRate country(String country) {
        this.country = country;
        return this;
    }

    @Override
    public void execute() {
        driver.returnsNoTaxRate(country);
    }
}
