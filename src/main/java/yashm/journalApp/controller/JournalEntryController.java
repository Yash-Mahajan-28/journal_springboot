//package yashm.journalApp.controller;
//
//
//import org.springframework.web.bind.annotation.*;
//import yashm.journalApp.entity.JournalEntry;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//    private final Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//
//    @GetMapping("/allEntries") //("/journal/allEntries")
//    public List<JournalEntry> getA() {
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @GetMapping("/getid/{id}") //("/getid/{id}")
//    public JournalEntry getEntry(@PathVariable long id) {
//        return journalEntries.get(id);
//    }
//
//    @PostMapping("/createEntry") //("/journal/createEntry")
//    public boolean createEntry(@RequestBody List<JournalEntry> myEntryList){
//        for (JournalEntry singleEntry : myEntryList){
//            journalEntries.put(singleEntry.getId(), singleEntry);
//        }
//        return true;
//    }
//
//
//    @PutMapping("/updateEntry/{id}") //("/journal/updateEntry/{id}")
//    public JournalEntry deleteEntry(@PathVariable Long id, @RequestBody JournalEntry myEntry ){
//        if (journalEntries.containsKey(id)){
//            JournalEntry existingEntry = journalEntries.get(id);
//            existingEntry.setTitle(myEntry.getTitle());
//            existingEntry.setContent(myEntry.getContent());
//            return existingEntry;
//        } else {
//            return null; // or throw an exception if preferred
//        }
//    }
//
//    @DeleteMapping("/deleteEntry/{id}")//("/journal/deleteEntry/{id}")
//    public boolean deleteEntry(@PathVariable long id) {
//        if (journalEntries.containsKey(id)) {
//            journalEntries.remove(id);
//            return true;
//        }
//        return false;
//    }
//
//
//
//}
