package com.example.esercizio6;

public class Images {

    private final String title;
    private int resourceId;

    public static Images[] images = {
            new Images("title1", R.drawable.any),
            new Images("title2", R.drawable.any2),
            new Images("title3", R.drawable.any3),
    };

    public Images(String t, int r) {
        title = t;
        resourceId = r;
    }

    public String getTitle() {
        return title;
    }

    public int getResourceId() {
        return resourceId;
    }
}
