package com.example.tablayoutbottomnavigation.order;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class OrderViewPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 3; // Số lượng trang (Fragment) bạn có

    public OrderViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();    // Fragment cho tab tin tức
            case 1:
                return new Tab2Fragment();   // Fragment cho tab đơn hàng
            case 2:
                return new Tab3Fragment();   // Fragment cho tab tài khoản
            default:
                return new Tab1Fragment(); // Trả về mặc định nếu không hợp lệ
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       switch (position){
           case 0:
               return "Tab 1";
           case 1:
               return "Tab 2";
           case 2:
               return "Tab 3";
           default:
               return  "Tab 1";
       }

    }

}

