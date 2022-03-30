package com.example.noteapp;

import androidx.cardview.widget.CardView;

import com.example.noteapp.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
