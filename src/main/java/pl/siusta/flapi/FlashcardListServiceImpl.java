package pl.siusta.flapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashcardListServiceImpl implements FlashcardListService {
    private FlashcardListRepo fListRepo;

    public FlashcardListServiceImpl(FlashcardListRepo fListRepo) {
        this.fListRepo = fListRepo;
    }

    @Override
    public List<FlashcardList> getAllFLists() {
        return fListRepo.findAll();
    }


    @Override
    public Boolean addFList(FlashcardList flashcardList) {
        fListRepo.save(flashcardList);
        return true;
    }

    @Override
    public void deleteFList(Long id) {
        fListRepo.deleteById(id);
    }


}

