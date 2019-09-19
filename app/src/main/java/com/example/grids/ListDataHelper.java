package com.example.grids;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_airplanemode_active_black_24dp, "avion", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.cuenta, "cuenta",android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.chat, "chat",android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.nube, "nube",android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.dado, "dado",android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.tintoreria, "tintoreria",android.R.color.holo_orange_dark));
        list.add(new ListViewItem(R.drawable.paw, "paw",android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.pizza, "pizza",android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.trabajo, "trabajo",android.R.color.holo_purple));

        return list;
    }

}