package io.quire.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class IconStampedEntity extends StampedEntity {
    @ApiModelProperty(example = "#a9cb77", position = 2)
    public String getIconColor() {
        return null;
    }

    @ApiModelProperty(example = "https://quire.s3.amazonaws.com/oid/image.jpg", position = 2)
    public String getImage() {
        return null;
    }
}