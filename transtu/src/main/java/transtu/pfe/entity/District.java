package transtu.pfe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long DistrictId;

	private String Label;

	private String Adress;

	private String Plan;

	public Long getDistrictId() {
		return DistrictId;
	}

	public void setDistrictId(Long districtId) {
		DistrictId = districtId;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getPlan() {
		return Plan;
	}

	public void setPlan(String plan) {
		Plan = plan;
	}

	@Override
	public String toString() {
		return "District [DistrictId=" + DistrictId + ", Label=" + Label + ", Adress=" + Adress + ", Plan=" + Plan
				+ "]";
	}

	
	
}
