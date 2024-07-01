package com.idea.journal.controller;

import com.idea.journal.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }
    @GetMapping("id/{myid}")
    public JournalEntry getEntry(@PathVariable long myid) {
        return null;
    }
    @DeleteMapping("id/{myid}")
    public JournalEntry deleteEntry(@PathVariable long myid) {
        return null;
    }
    @PutMapping("id/{myid}")
    public JournalEntry updateEntry(@PathVariable long myid, @RequestBody JournalEntry myEntry) {
        return null]
        ;
    }

}
