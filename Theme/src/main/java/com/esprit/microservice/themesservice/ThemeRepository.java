package com.esprit.microservice.themesservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme,Integer> {
	@Query("select c from Theme c where c.titre like :titre")
	public Page<Theme> themeByTitre(@Param("titre") String n, Pageable pageable);
	List<Theme> findByCategorie(Categorie categorie);
	List<Theme> findByCategorieNom(@Param("categorieName") String categorieName);
	   
}
