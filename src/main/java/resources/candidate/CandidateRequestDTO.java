package resources.candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateRequestDTO {

  private long userId;
  private String post;
  private long constituencyId;
  private long partyId;
  private String party_name;

}
