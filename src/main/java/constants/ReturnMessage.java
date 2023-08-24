package constants;

public enum ReturnMessage {
  INVALID_REQUEST("Invalid Request"),
  USER_NOT_EXISTS("User do not exists"),
  USER_CNIC_EXISTS("User with Same CNIC already exists"),
  USER_ADDED("User Added Successfully"),
  INVALID_ROLE("Invalid Role"),
  INVALID_HALKA_NAME("Invalid Halka Name"),
  IMAGE_UPLOAD_FAIL("Image upload fail"),
  NOT_FOUND("Not Found"),
  INVALID_USER_NAME_AND_PASSWORD("Invalid Username or Password"),
  PARTY_NAME_ALREADY_EXISTS("Party with same name already exists"),
  PARTY_SYMBOL_ERROR("Party symbol error"),
  USER_ALREADY_CANDIDATE("User is already a registered candidate"),
  CONSTITUENCY_NOT_EXISTS("Constituency not found"),
  CONSTITUENCY_ALREADY_EXISTS("Constituency with name already exists"),
  CANDIDATE_NOT_EXISTS("Candidate not found"),
  NO_CANDIDATE_FOUND("No pending requests"),
  VOTER_NOT_EXISTS("Voters not found"),
  CANDIDATE_STATUS_INVALID("Invalid candidate status"),
  INVALID_POLLING_ID("Invalid Polling Id"),
  POLLING_ALREADY_ENDED("Polling Already Ended"),
  POLLING_NOT_STARTED("Polling Not Started yet"),
  POLLING_END_DATE_IN_PAST("Polling end date is in past"),
  POLLING_START_DATE_OVERLAPS("Polling start date overlaps with other polling"),
  INVALID_CONSTITUENCY("Invalid constituency"),
  INVALID_HALKA("You can only cast vote in your HALKA"),
  VOTE_CASTED("You vote has casted"),
  VOTER_ALREADY_CASTED("You have already casted a vote"),
  PARTY_NOT_EXISTS("Party Not found");

  private final String value;

  ReturnMessage(String value) {
    this.value = value;
  }

  // Enum methods
  public String getValue() {
    return value;
  }
}
