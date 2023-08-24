package constants;

public enum Data {
  CANDIDATES("candidates"),
  ALL_CANDIDATES("allCandidates"),
  CANDIDATE("candidate"),
  CONSTITUENCIES("constituencies"),
  PARTIES("parties"),
  PARTY_LIST("partyList"),
  HALKA_LIST("halkaList"),
  VOTERS("voters"),
  PROFILE("profile"),
  MESSAGE("message"),
  WINNING_MESSAGE("winningMessage"),
  ERROR_MESSAGE("errorMessage"),
  TOKEN("token"),
  AUTHORIZATION("Authorization"),
  USER("user"),
  POLLING_ID("pollingId"),
  POLLING_START_TIME("pollingStartingTime"),
  POLLING_END_TIME("pollingEndingTime"),
  POLLING_STARTED("pollingStarted"),
  POLLING_ENDED("pollingEnded"),
  TIME_LEFT("timeLeft"),
  WINNING_CANDIDATE("winningCandidate"),
  USERROLE("userRole");

  private final String value;

  Data(String value) {
    this.value = value;
  }

  // Enum methods
  public String getValue() {
    return value;
  }
}
