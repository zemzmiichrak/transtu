package transtu.pfe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import transtu.pfe.entity.District;


@Repository
public interface DistrictRepository  extends JpaRepository<District, Long>{

}
