package com.luhuiguo.archetype.model;

import com.luhuiguo.archetype.config.ApplicationConstants;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class PasswordChange {
  private String oldPassword;

//  @Size(min = ApplicationConstants.PASSWORD_MIN_LENGTH, max = ApplicationConstants.PASSWORD_MAX_LENGTH)
  private String newPassword;
}
