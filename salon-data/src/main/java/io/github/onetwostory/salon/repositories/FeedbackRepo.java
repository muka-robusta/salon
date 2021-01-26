package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
}
