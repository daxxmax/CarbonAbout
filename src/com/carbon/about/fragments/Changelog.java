/*
 * Copyright (C) 2012 Crossbones Software
 * This code has been modified.  Portions copyright (C) 2013, Carbon Development
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.carbon.about.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carbon.about.activities.AboutActivity;
import com.carbon.about.R;
import com.carbon.about.Utils;

public class AboutFragments extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.changelog, container, false);

        TextView aboutTitle = (TextView) aboutView.findViewById(R.id.about_title);
        String version =  Utils.getCarbonVersion();
        aboutTitle.append(" Carbon ");

        TextView cg = (TextView) aboutView.findViewById(R.id.changelog);
        cg.setText("Testing - 1 - 2 - 3");

        return rootView;
    }
}
