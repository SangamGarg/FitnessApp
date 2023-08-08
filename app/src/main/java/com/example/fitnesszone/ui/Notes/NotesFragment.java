package com.example.fitnesszone.ui.Notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.fitnesszone.R;
import com.example.fitnesszone.databinding.FragmentNotesBinding;
import com.example.fitnesszone.databinding.FragmentNotesBinding;

public class NotesFragment extends Fragment {
    Activity context;
    private FragmentNotesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotesViewModel galleryViewModel =
                new ViewModelProvider(this).get(NotesViewModel.class);
        context = getActivity();
        binding = FragmentNotesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onStart() {
        super.onStart();
        Button button = context.findViewById(R.id.buttonnot);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "heloooooo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}