package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.external.erp.usecases.base;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.external.erp.ErpDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.BaseStubUseCase;

public abstract class BaseErpUseCase extends BaseStubUseCase<ErpDriver> {

    protected BaseErpUseCase(ErpDriver driver) {
        super(driver);
    }
}
