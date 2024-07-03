// package com.coderconsole.journalApp.controllers;

// import com.coderconsole.journalApp.entity.JournalEntry;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.*;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PutMapping;

// @RestController
// @RequestMapping("/_journal")
// public class JournalEntryController {

// private Map<Long, JournalEntry> journalEntries = new HashMap<>();

// // getting all the journalentry details
// @GetMapping
// public List<JournalEntry> getAll() {
// return new ArrayList<>(journalEntries.values());
// }

// // posting sing journalentry
// @PostMapping
// public boolean createEntry(@RequestBody JournalEntry myEntry) {
// journalEntries.put(myEntry.getId(), myEntry);
// return true;
// }

// // getting a single journalentry using id
// @GetMapping("id/{myId}")
// public JournalEntry getJournalEntryBYId(@PathVariable Long myId) {
// return journalEntries.get(myId);
// }

// // delete the journalentry by id
// @DeleteMapping("id/{myId}")
// public JournalEntry deleteJournalEntryBYId(@PathVariable Long myId) {
// return journalEntries.remove(myId);
// }

// @PutMapping("id/{id}")
// public JournalEntry updateJournalEntryById(@PathVariable Long id,
// @RequestBody JournalEntry myEntry) {
// return journalEntries.put(id, myEntry);
// }
// }
