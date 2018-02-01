package org.softwire.training.api.models.searchcriteria;

import org.softwire.training.db.daos.searchcriteria.AgentIdSearchCriterion;

public class AgentIdApiSearchCriterion extends ApiReportSearchCriterionBase {

    public AgentIdApiSearchCriterion(int agentId) {
        super(new AgentIdSearchCriterion(agentId));
    }
}
