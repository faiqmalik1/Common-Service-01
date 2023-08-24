package resources.constituency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConstituencyResponseDTO extends ResponseDTO {

  private long constituencyId;
  private String halkaName;
  private long voterCount;

}
