package org.softwire.training.api.models.searchcriteria;

import org.softwire.training.db.daos.searchcriteria.ReportSearchCriterion;
import org.softwire.training.models.LocationStatusReport;
import org.softwire.training.models.LocationStatusReportWithTimeZone;

import java.util.Optional;
import java.util.function.Predicate;

class ApiReportSearchCriterionBase implements  ApiReportSearchCriterion {

    private final Optional<ReportSearchCriterion> reportSearchCriterion;
    private final Predicate<LocationStatusReportWithTimeZone> locationStatusReportPredicate;

    ApiReportSearchCriterionBase(ReportSearchCriterion criterion) {
        reportSearchCriterion = Optional.of(criterion);
        locationStatusReportPredicate = report -> true;
    }

    ApiReportSearchCriterionBase(Predicate<LocationStatusReportWithTimeZone> predicate) {
        reportSearchCriterion = Optional.empty();
        locationStatusReportPredicate = predicate;
    }

    ApiReportSearchCriterionBase(ReportSearchCriterion criterion, Predicate<LocationStatusReportWithTimeZone> predicate) {
        reportSearchCriterion = Optional.of(criterion);
        locationStatusReportPredicate = predicate;
    }

    @Override
    public Optional<ReportSearchCriterion> getDaoSearchCriterion() {
        return reportSearchCriterion;
    }

    @Override
    public Predicate<LocationStatusReportWithTimeZone> getCriterionResultInclusionPredicate() {
        return locationStatusReportPredicate;
    }
}
