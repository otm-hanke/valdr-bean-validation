package com.github.valdr.model.j;

import com.github.valdr.util.ValidationGroup;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class TestModelWithValidationGroups {
  @NotNull(groups = ValidationGroup.GroupOne.class)
  private String oneAndOnePointOne;

  @NotNull(groups = {ValidationGroup.GroupTwo.class, ValidationGroup.GroupOne.class})
  private String twoAndOneAndOnePointOne;

  @NotNull(groups = {ValidationGroup.GroupTwo.class})
  private String justTwo;

  @NotNull
  private String noGroupSpecifiedMeansDefault;
}
