package com.example.countitdown.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.countitdown.R;
import com.example.countitdown.databinding.FragmentIngameBinding;
import com.example.countitdown.viewmodels.IngameViewModels;

public class IngameFragment extends Fragment {

    public IngameViewModels mViewModels;

    public IngameFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentIngameBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_ingame, container, false);
        mViewModels = new ViewModelProvider(this).get(IngameViewModels.class);
        binding.setIngameViewModel(mViewModels);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}