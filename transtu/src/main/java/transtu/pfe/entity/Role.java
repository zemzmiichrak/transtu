package transtu.pfe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long RoleId;

	private String Label;
	
	private String Description;

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Role [RoleId=" + RoleId + ", Label=" + Label + ", Description=" + Description + "]";
	}

	
	
}
