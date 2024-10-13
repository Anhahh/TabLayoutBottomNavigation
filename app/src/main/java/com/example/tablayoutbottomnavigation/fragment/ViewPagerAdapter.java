package com.example.tablayoutbottomnavigation.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 3; // Số lượng trang (Fragment) bạn có

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NewsFragment();    // Fragment cho tab tin tức
            case 1:
                return new OrderFragment();   // Fragment cho tab đơn hàng
            case 2:
                return new AccountFragment();   // Fragment cho tab tài khoản
            default:
                return new NewsFragment(); // Trả về mặc định nếu không hợp lệ
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES; // Trả về số lượng trang (Fragment)
    }
}
