package jackalexmark.newsaggregator.repository;

import jackalexmark.newsaggregator.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
