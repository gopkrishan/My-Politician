/**
 *
 * @author Anders Bille Wiggers
 * @author Alex Krogh Smythe
 * for Introduction-to-Human-Computer-InteractionI course.
 * Copyright (c) 2018.
 *
 *
 */

package aacorp.mypolitician.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aacorp.mypolitician.R;

public class FullPolitician extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_full_politician, container, false);
    }
}
