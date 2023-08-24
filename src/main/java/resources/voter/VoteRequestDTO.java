package resources.voter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VoteRequestDTO {

  @NotNull(message = "Voter ID must not be null")
  private long voterId;

  @NotNull(message = "Candidate ID must not be null")
  private long candidateId;

  @NotNull(message = "Pooling ID must not be null")
  private long poolingId;

}