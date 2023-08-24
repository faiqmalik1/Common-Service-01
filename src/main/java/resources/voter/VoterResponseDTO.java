package resources.voter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VoterResponseDTO extends ResponseDTO {

  private long voterId;
  private String voterName;
  private String cnic;
  private long constitutionId;

}
