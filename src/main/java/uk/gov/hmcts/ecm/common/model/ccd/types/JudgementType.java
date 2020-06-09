package uk.gov.hmcts.ecm.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.ecm.common.model.ccd.Document;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JudgementType {

    @JsonProperty("non_hearing_judgment")
    private String nonHearingJudgment;
    @JsonProperty("judgmentHearingDate")
    private String judgmentHearingDate;
    @JsonProperty("judgement_type")
    private String judgementType;
    @JsonProperty("liability_optional")
    private String liabilityOptional;
    @JsonProperty("date_judgment_made")
    private String dateJudgmentMade;
    @JsonProperty("date_judgment_sent")
    private String dateJudgmentSent;
    @JsonProperty("judgment_notes")
    private String judgmentNotes;
    @JsonProperty("judgement_outcome_doc")
    private Document judgementOutcomeDoc;
    @JsonProperty("judgement_details")
    private JudgementDetailsType judgementDetails;
    @JsonProperty("reconsiderations")
    private JudgmentReconsiderationType judgementReconsiderations;
    @JsonProperty("Judgement_costs")
    private CostsType judgementCosts;
}
