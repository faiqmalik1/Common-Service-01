package resources.user;

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
public class UserResponseDTO extends ResponseDTO {

  private long id;
  private String name;
  private String email;
  private String halka;
  private String CNIC;
  private byte[] img;
  private List<RoleResponseDTO> rolesResponses;
}
