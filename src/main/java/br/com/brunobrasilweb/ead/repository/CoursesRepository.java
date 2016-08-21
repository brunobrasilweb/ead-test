package br.com.brunobrasilweb.ead.repository;

import br.com.brunobrasilweb.ead.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
