package com.example.gestur.view;

import android.widget.RelativeLayout;

public interface IFooterView {
    void addComponents(int screenX, int screenY,int currentY, RelativeLayout layout);
    int getHeight();
    void update();
}
