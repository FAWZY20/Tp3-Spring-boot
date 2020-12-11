package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GitStatistiqueDAO extends JpaRepository<GitStatistiqueEntity, String> {

    @Query(value = "select SUM (entry_type) as somme from statistic ", nativeQuery = true)
    List<GitStatistiqueEntity> findAllByEntry_typeOrderBy(String entry_type);
}
