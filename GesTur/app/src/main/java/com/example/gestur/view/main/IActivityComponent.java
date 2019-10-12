package com.example.gestur.view.main;

import android.widget.RelativeLayout;

public interface IActivityComponent {
    void addComponents(int screenX, int screenY,int currentY, RelativeLayout layout);
    int getHeight();
}
