package yashm.journalApp.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yashm.journalApp.entity.JournalEntry;
import yashm.journalApp.repository.JournalEntryRepo;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService{

    @Autowired
    private JournalEntryRepo journalEntryRepo; //dependency injection of the repository

    // Method to save a journal entry
    public void saveJournalEntry(JournalEntry entry) {
        journalEntryRepo.save(entry);
    }

    // Method to find a journal entry by ID
    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepo.findById(id);
    }

    // Method to delete a journal entry by ID
    public void deleteJournalEntryById(ObjectId id) {
        journalEntryRepo.deleteById(id);
    }

    // Method to get all journal entries
    public List<JournalEntry> getAll() {
        return journalEntryRepo.findAll();
    }

}






//controller --> service --> repository