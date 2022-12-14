package platform.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import platform.business.Codes;

import java.util.List;

@Repository
public interface CodeRepository extends JpaRepository<Codes,String> {
    Codes findCodesById (String id);


//    @Query(nativeQuery = true, value = "SELECT * FROM CODES order by date desc fetch first 10 rows only")
    @Query(nativeQuery = true, value = "SELECT * FROM CODES order by date desc")
    List<Codes> findLatest();

}
