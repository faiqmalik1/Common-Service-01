package resources.constituency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PoolingResponseDTO extends ResponseDTO {

  private long poolingId;
  private String startDate;
  private String endDate;

}