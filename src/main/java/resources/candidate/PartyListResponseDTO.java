package resources.candidate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PartyListResponseDTO extends ResponseDTO {

  private List<PartyResponseDTO> partyResponseDTOList;

}