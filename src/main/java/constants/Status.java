package constants;

public enum Status {
  PENDING("Pending"),
  ACTIVE("Active"),
  DECLINED("DECLINED");

  private final String value;

  Status(String value) {
    this.value = value;
  }

  // Enum methods
  public String getValue() {
    return value;
  }
}
