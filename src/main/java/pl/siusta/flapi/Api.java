package pl.siusta.flapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class Api {
    FlashcardListService fService;

    @Autowired
    public Api(@Qualifier("flashcardListServiceImpl") FlashcardListService fService) {
        this.fService = fService;
    }

    @PostMapping("/add")
    public void addFList(@RequestBody FlashcardList flashcardList){
        fService.addFList(flashcardList);
    }

    @GetMapping("/all")
    public List<FlashcardList> getAll(){
        List<FlashcardList> fList = fService.getAllFLists();
        return fList;
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        fService.deleteFList(id);
    }

}
