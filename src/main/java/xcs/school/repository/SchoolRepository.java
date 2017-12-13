package xcs.school.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import xcs.school.model.School;

import java.util.UUID;

public interface SchoolRepository extends ReactiveCrudRepository<School, UUID> {

}
