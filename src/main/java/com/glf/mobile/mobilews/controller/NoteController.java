//package com.glf.mobile.mobilews.controller;
//
//import com.glf.mobile.mobilews.model.Note;
//import com.glf.mobile.mobilews.repository.NoteRepository;
//import java.util.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping(value = "/api")
//public class NoteController {
//
//    @Autowired
//    private NoteRepository repository;
//
//    @GetMapping(value = {"","/"})
//    public String getRest(){
//        return "HELLO MOBILE WS";
//    }
//
//    @GetMapping(value = {"","/notes"})
//    public List<Note> getListOfNotes(){
//        return repository.findAll();
//    }
//
//    @PostMapping(value = "/create_note")
//    public Note createNote(@Valid @RequestBody Note note) {
//        return repository.save(note);
//    }
//
//    @GetMapping("/notes/{id}")
//    public ResponseEntity<Note> getNoteById(@PathVariable(value = "id") Long noteId) {
//        Note note = repository.findOne(noteId);
//        if(note == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok().body(note);
//    }
//
//    @PutMapping("/notes/{id}")
//    public ResponseEntity<Note> updateNote(@PathVariable(value = "id") Long noteId,
//                                           @Valid @RequestBody Note noteDetails) {
//        Note note = repository.findOne(noteId);
//        if(note == null) {
//            return ResponseEntity.notFound().build();
//        }
//        note.setTitle(noteDetails.getTitle());
//        note.setContent(noteDetails.getContent());
//
//        Note updatedNote = repository.save(note);
//        return ResponseEntity.ok(updatedNote);
//    }
//
//    @DeleteMapping("/notes/{id}")
//    public ResponseEntity<Note> deleteNote(@PathVariable(value = "id") Long noteId) {
//        Note note = repository.findOne(noteId);
//        if(note == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        repository.delete(note);
//        return ResponseEntity.ok().build();
//    }
//}
