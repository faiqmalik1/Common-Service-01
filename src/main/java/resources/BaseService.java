package resources;

import constants.Constants;

public class BaseService {

  public static ResponseDTO generateSuccessResponse() {
    ResponseDTO responseDTO = new ResponseDTO();
    responseDTO.setResponseCode(Constants.SUCCESS_CODE);
    responseDTO.setErrorMessage("");
    return responseDTO;
  }

  public static ResponseDTO generateFailureResponse(String message) {
    ResponseDTO responseDTO = new ResponseDTO();
    responseDTO.setResponseCode(Constants.FAILURE_CODE);
    responseDTO.setErrorMessage(message);
    return responseDTO;
  }
}
