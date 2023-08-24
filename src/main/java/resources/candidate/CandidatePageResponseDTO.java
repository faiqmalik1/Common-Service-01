package resources.candidate;

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
public class CandidatePageResponseDTO extends ResponseDTO {

  private Page<CandidateResponseDTO> candidateResponsePage;

}