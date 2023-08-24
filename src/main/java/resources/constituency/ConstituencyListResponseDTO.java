package resources.constituency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ConstituencyListResponseDTO extends ResponseDTO {

  private List<ConstituencyResponseDTO> constituencyResponseDTOList;

}