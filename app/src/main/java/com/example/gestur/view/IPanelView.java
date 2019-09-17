package com.example.gestur.view;

import android.widget.RelativeLayout;

public interface IPanelView {
    void addComponents(int screenX, int screenY,int currentY, RelativeLayout layout);
    int getHeight();
    void update();
}
