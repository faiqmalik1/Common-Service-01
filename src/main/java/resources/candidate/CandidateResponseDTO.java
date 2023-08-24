package resources.candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateResponseDTO extends ResponseDTO {

  private long candidateId;
  private String name;
  private String cnic;
  private String post;
  private long constituencyId;
  private String status;
  private String constituencyName;
  private String partyName;
  private byte[] image;
  private String base64Image;
  private int votes;
}