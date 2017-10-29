package com.msr.eventbusdemo.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.msr.eventbusdemo.R;
import com.msr.eventbusdemo.events.SettingsEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    private SettingsEvent settingsEvent;

    public TopFragment() {
        // Required empty public constructor
        settingsEvent = new SettingsEvent();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        CheckBox bottomLeftCheckBox = (CheckBox) view.findViewById(R.id.bottomLeftCheckBox);
        CheckBox bottomRightCheckBox = (CheckBox) view.findViewById(R.id.bottomRightCheckBox);
        bottomLeftCheckBox.setOnCheckedChangeListener(this);
        bottomRightCheckBox.setOnCheckedChangeListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        EventBus.getDefault().post(settingsEvent);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.bottomLeftCheckBox:
                settingsEvent.setBottomLeftStatus(isChecked);
                EventBus.getDefault().post(settingsEvent);
                break;
            case R.id.bottomRightCheckBox:
                settingsEvent.setBottomRightStatus(isChecked);
                EventBus.getDefault().post(settingsEvent);
                break;
        }
    }
}
