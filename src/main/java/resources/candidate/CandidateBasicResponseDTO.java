package resources.candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateBasicResponseDTO {

  private long candidateId;
  private String post;
  private long partyId;
  private long constituencyId;
  private String status;

}