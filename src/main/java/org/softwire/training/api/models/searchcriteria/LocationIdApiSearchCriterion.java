package org.softwire.training.api.models.searchcriteria;

import org.softwire.training.db.daos.searchcriteria.LocationIdSearchCriterion;

public class LocationIdApiSearchCriterion extends ApiReportSearchCriterionBase {

    public LocationIdApiSearchCriterion(int locationId) {
        super(new LocationIdSearchCriterion(locationId));
    }
}
