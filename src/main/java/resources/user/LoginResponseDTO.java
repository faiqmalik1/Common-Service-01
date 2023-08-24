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
public class LoginResponseDTO extends ResponseDTO {

  private String token;

}