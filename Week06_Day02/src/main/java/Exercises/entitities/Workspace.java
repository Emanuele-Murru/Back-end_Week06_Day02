package Exercises.entitities;

import Exercises.utils.WorkspaceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Workspace {
	private int id;
	private String description;
	private WorkspaceType type;
	private int maxCapacity;
	private String citta;
}
