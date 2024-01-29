package com.devsu.certification.swaggerpetstore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.devsu.certification.swaggerpetstore.utils.Constans.GENERIC_STATUSCODE_OK;

public class ValidationGenericStatus implements Question<Integer> {
    public static ValidationGenericStatus code() {
        return new ValidationGenericStatus();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return actor.recall(GENERIC_STATUSCODE_OK);
    }

}
