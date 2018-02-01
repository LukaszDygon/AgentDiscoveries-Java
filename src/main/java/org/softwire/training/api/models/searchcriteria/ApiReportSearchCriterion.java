package org.softwire.training.api.models.searchcriteria;

import org.softwire.training.db.daos.searchcriteria.ReportSearchCriterion;
import org.softwire.training.models.LocationStatusReportWithTimeZone;

import java.util.Optional;
import java.util.function.Predicate;

public interface ApiReportSearchCriterion {

    Optional<ReportSearchCriterion> getDaoSearchCriterion();

    Predicate<LocationStatusReportWithTimeZone> getCriterionResultInclusionPredicate();
}
