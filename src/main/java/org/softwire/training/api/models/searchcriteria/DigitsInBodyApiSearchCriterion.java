package org.softwire.training.api.models.searchcriteria;

import org.softwire.training.models.LocationStatusReportWithTimeZone;

import java.util.function.Predicate;

public class DigitsInBodyApiSearchCriterion extends ApiReportSearchCriterionBase {

    public DigitsInBodyApiSearchCriterion(int digitsInBody) {
        super(getSearchPredictForNumberOfDigits(digitsInBody));
    }

    private static Predicate<LocationStatusReportWithTimeZone> getSearchPredictForNumberOfDigits(int digitsInBody) {
        return locationStatusReport -> locationStatusReport.getReportBody()
                .codePoints().filter(Character::isDigit).count() == digitsInBody;
    }
}
