package org.softwire.training.models;

public class RegionSummaryReport extends ReportBase {

    private int locationId;
    private int userId;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
