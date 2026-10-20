package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases;

import static org.assertj.core.api.Assertions.assertThat;

import com.valentinajemuovic.skytravel.backend.testkit.driver.port.SkyTravelDriver;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.UseCaseContext;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.UseCaseResult;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared.VoidVerification;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.core.usecase.usecases.base.BaseSkyTravelUseCase;
import java.util.Set;
import org.springframework.http.HttpStatus;

/**
 * The liveness probe behind {@code assume().skyTravel().shouldBeRunning()}: {@code GET /health} must
 * answer {@code 200 OK} with {@code status: UP}. Both halves of that contract are asserted by
 * {@code shouldSucceed()} — the status by {@link UseCaseResult}, the body here.
 */
public class GoToSkyTravel extends BaseSkyTravelUseCase<Void, VoidVerification> {

    public GoToSkyTravel(SkyTravelDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public UseCaseResult<Void, VoidVerification> execute() {
        var response = driver.checkHealth();

        return new UseCaseResult<>(
            response.getStatusCode(),
            HttpStatus.OK,
            Set.of(),
            () -> {
                assertThat(response.getBody()).as("health body").containsEntry("status", "UP");
                return null;
            },
            null,
            VoidVerification::new);
    }
}
