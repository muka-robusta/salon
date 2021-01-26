package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.Feedback;
import io.github.onetwostory.salon.repositories.FeedbackRepo;
import io.github.onetwostory.salon.services.FeedbackService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepo feedbackRepo;

    public FeedbackServiceImpl(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }

    @Override
    public Set<Feedback> findAll() {
        Set<Feedback> feedbacks = new HashSet<>();
        feedbackRepo.findAll().forEach(feedbacks::add);
        return feedbacks;
    }

    @Override
    public Feedback findById(Long aLong) {
        return feedbackRepo.findById(aLong).orElse(null);
    }

    @Override
    public Feedback save(Feedback object) {
        return feedbackRepo.save(object);
    }

    @Override
    public void delete(Feedback object) {
        feedbackRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        feedbackRepo.deleteById(aLong);
    }
}
