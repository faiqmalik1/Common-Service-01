package resources.candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PartyResponseDTO extends ResponseDTO {

  private long partyId;
  private String partyName;
  private byte[] partySymbol;
  private String createdAt;


  public PartyResponseDTO(ResponseDTO responseDTO) {
    this.setErrorMessage(responseDTO.getErrorMessage());
    this.setResponseCode(responseDTO.getResponseCode());
  }
}