package uk.gov.hmcts.ecm.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JudgmentReconsiderationType {

    @JsonProperty("reconsideration")
    private String reconsideration;
    @JsonProperty("reconsiderationDate")
    private String reconsiderationDate;
    @JsonProperty("reconsiderationOwnInitiative")
    private String reconsiderationOwnInitiative;
    @JsonProperty("reconsiderationPartyInitiative")
    private String reconsiderationPartyInitiative;
    @JsonProperty("reconsiderationDirection")
    private String reconsiderationDirection;
    @JsonProperty("reconsiderationDecision")
    private String reconsiderationDecision;
}
