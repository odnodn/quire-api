package io.quire.api.model.board;

import io.quire.api.model.Identity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class UpdateBoardBody {
	@ApiModelProperty(example = "Board101",
		value = "(Optional) ID of the board. "
		+ "If omitted, Quire will generate one automatically. "
		+ "It must be unquie in the whole project if specified")
	public String getId() { return null; }

	@ApiModelProperty(example = "Board 101",
		value = "(Optional) The name of the board.", required = true)
	public String getName() { return null; }

	@ApiModelProperty(example = "**Great** board to start with.",
		value = "(Optional) An optional description about this task.")
	public String getDescription() { return null; }

	@ApiModelProperty(value = "(Optional) When this board was aimed to complete. ",
		example = "2020-01-22T02:06:58.158Z")
	public String getDue() { return null; }

	@ApiModelProperty(value = "(Optional) The new column defintion to be added to this board.")
	public CreateColumnBody getAddColumn() { return null; }

	@ApiModelProperty(value = "(Optional) ID of the column that needs to be deleted.")
	public String getRemoveColumn() { return null; }

	@ApiModelProperty(example = "true",
		value = "(Optional) Specify true to archive this board. "
		+ "Or, specify false to undo the previous archiving if any.")
	public boolean getArchive() { return false; }
}