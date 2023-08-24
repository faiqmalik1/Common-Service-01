package resources.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInviteDTO {

  private String name;
  private String email;
  private String CNIC;
  private String halka;
  private String userType;
  private long partyId;
  private long halkaId;

}