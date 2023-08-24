package resources.constituency;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Future;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PollingRequestDTO {

  @Temporal(TemporalType.TIMESTAMP)
  @Future(message = "Start date must be in the future")
  private Date startDate;

  @Temporal(TemporalType.TIMESTAMP)
  @Future(message = "End date must be in the future")
  private Date endDate;

}