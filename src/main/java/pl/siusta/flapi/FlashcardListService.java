package pl.siusta.flapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlashcardListService {
    List<FlashcardList> getAllFLists();
    Boolean addFList(FlashcardList flashcardList);
    void deleteFList(Long id);
}
