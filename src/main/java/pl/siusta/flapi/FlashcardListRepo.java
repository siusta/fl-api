package pl.siusta.flapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlashcardListRepo extends JpaRepository<FlashcardList,Long> {
    List<FlashcardList> findAllByName(String name);
    List<FlashcardList> findAllByAuthor(String author);
}
