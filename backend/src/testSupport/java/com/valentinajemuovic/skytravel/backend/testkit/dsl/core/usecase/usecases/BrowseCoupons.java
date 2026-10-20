package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases;

import com.valentinajemuovic.skytravel.backend.core.dtos.BrowseCouponsResponse;
import com.valentinajemuovic.skytravel.backend.testkit.driver.port.SkyTravelDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.UseCaseContext;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.UseCaseResult;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases.base.BaseSkyTravelUseCase;
import java.util.Set;
import org.springframework.http.HttpStatus;

/** {@code GET /api/coupons} — always {@code 200 OK}; there is no rejection path to state. */
public class BrowseCoupons extends BaseSkyTravelUseCase<BrowseCouponsResponse, BrowseCouponsVerification> {

    public BrowseCoupons(SkyTravelDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public UseCaseResult<BrowseCouponsResponse, BrowseCouponsVerification> execute() {
        var response = driver.browseCoupons();

        return new UseCaseResult<>(
            response.getStatusCode(),
            HttpStatus.OK,
            Set.of(),
            response::getBody,
            null,
            BrowseCouponsVerification::new);
    }
}
