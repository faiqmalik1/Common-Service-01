package resources.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import resources.ResponseDTO;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ValidateResponseDTO extends ResponseDTO {

  private long userId;
  private String userName;
  private String userRole;
  private String candidateStatus;
  private byte[] profile;

}