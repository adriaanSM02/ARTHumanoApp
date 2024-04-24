package com.example.arthumano_Consultores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class PrincipalFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        ViewPager2 viewPager = view.findViewById(R.id.viewPager);
        CarouselAdapter adapter = new CarouselAdapter(getContext());
        viewPager.setAdapter(adapter);

        return view;
    }
}
