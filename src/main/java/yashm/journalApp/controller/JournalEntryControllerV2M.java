package yashm.journalApp.controller;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yashm.journalApp.entity.JournalEntry;
import yashm.journalApp.service.JournalEntryService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2M {


    @Autowired
    private JournalEntryService journalEntryService;



    @GetMapping("/allEntries") //("/journal/allEntries")
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }


    @GetMapping("/getid/{id}") //("/getid/{id}")
    public JournalEntry getEntry(@PathVariable ObjectId id) {
        return journalEntryService.findById(id).orElse(null);
    }

    @PostMapping("/createEntry") //("/journal/createEntry")
    public List<JournalEntry> createEntry(@RequestBody List<JournalEntry> myEntry){
        for (JournalEntry entry : myEntry) {
            entry.setDate(LocalDateTime.now());
            journalEntryService.saveJournalEntry(entry);
        }
        return myEntry;
    }


    @PutMapping("/updateEntry/{id}") //("/journal/updateEntry/{id}")
    public JournalEntry updateEntry(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry ){
        JournalEntry oldEntry = journalEntryService.findById(id).orElse(null);
        if (oldEntry!= null) {
            oldEntry.setTitle((newEntry.getTitle()!=null && !newEntry.getTitle().isEmpty()) ? newEntry.getTitle() : oldEntry.getTitle());
            oldEntry.setContent((newEntry.getContent()!=null && !newEntry.getContent().isEmpty()) ? newEntry.getContent() : oldEntry.getContent());
        }
        journalEntryService.saveJournalEntry(oldEntry);
        return oldEntry;
    }

    @DeleteMapping("/deleteEntry/{myid}")//("/journal/deleteEntry/{id}")
    public boolean deleteEntry(@PathVariable ObjectId myid) {
        journalEntryService.deleteJournalEntryById(myid);
        return true;
    }



}
