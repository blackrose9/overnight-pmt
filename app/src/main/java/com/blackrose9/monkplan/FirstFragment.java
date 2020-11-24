package com.blackrose9.monkplan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        initiateDisplayContent();
    }

    private void initiateDisplayContent() {
        ListView listProjects = requireActivity().findViewById(R.id.listview_projects);
        List<String> projects = new ArrayList<>();
        projects.add("Project A");
        projects.add("Project B");
        projects.add("Project Z");

        ArrayAdapter<String> projectAdapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_list_item_1, projects);
        listProjects.setAdapter(projectAdapter);
    }
}