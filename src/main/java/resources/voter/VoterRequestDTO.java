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
public class VoterRequestDTO {

  @NotNull(message = "User ID must not be null")
  private long userId;

  @NotNull(message = "Constituency ID must not be null")
  private long constituencyId;

}