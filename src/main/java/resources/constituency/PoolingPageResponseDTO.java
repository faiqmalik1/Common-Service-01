package resources.constituency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import resources.ResponseDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PoolingPageResponseDTO extends ResponseDTO {

  private Page<PoolingResponseDTO> poolingResponsePage;

}