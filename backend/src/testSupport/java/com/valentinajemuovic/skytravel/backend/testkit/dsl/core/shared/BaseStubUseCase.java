package com.valentinajemuovic.skytravel.backend.testkit.dsl.core.shared;

public abstract class BaseStubUseCase<D> implements StubUseCase {

    protected final D driver;

    protected BaseStubUseCase(D driver) {
        this.driver = driver;
    }
}
