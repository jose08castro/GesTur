package com.example.gestur.view.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class TrackableScrollView extends ScrollView {
    // true if we can scroll (not locked)
    // false if we cannot scroll (locked)
    private boolean mScrollable = true;

    public TrackableScrollView(Context context) {
        super(context);
    }

    public TrackableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TrackableScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setScrollingEnabled(boolean enabled) {
        mScrollable = enabled;
    }

    public boolean isScrollable() {
        return mScrollable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // if we can scroll pass the event to the superclass
                if (mScrollable) return super.onTouchEvent(ev);
                // only continue to handle the touch event if scrolling enabled
                return mScrollable; // mScrollable is always false at this point
            default:
                return super.onTouchEvent(ev);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // Don't do anything with intercepted touch events if
        // we are not scrollable
        if (!mScrollable) return false;
        else return super.onInterceptTouchEvent(ev);
    }

    @Override
    public void scrollTo(int x, int y){
        if (!mScrollable) return;
        super.scrollTo(x, y);
    }


    //Custom smooth scroll method since norm is final and cannot be overridden
    public final void smooothScrollToIfEnabled(int x, int y){
        if (!mScrollable) return;
        smoothScrollTo(x, y);
    }

    @Override
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect rect){
        if (!mScrollable) return 0;
        return super.computeScrollDeltaToGetChildRectOnScreen(rect);
    }
}
