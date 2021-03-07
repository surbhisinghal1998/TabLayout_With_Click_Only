package com.solution.tablayoutsliding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;
import com.solution.tablayoutsliding.fragments.CallFragments;
import com.solution.tablayoutsliding.fragments.ChatFragments;
import com.solution.tablayoutsliding.fragments.StatusFragments;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.Tab);
     TabLayout.Tab chatLAyout=tabLayout.newTab();
     chatLAyout.setText("Chat");
     tabLayout.addTab(chatLAyout);

        TabLayout.Tab statusLAyout=tabLayout.newTab();
        statusLAyout.setText("Status");
        tabLayout.addTab(statusLAyout,true);

        TabLayout.Tab callLAyout=tabLayout.newTab();
        callLAyout.setText("Call");
        tabLayout.addTab(callLAyout);

      tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
          @Override
          public void onTabSelected(TabLayout.Tab tab) {
              Fragment fragment =null;
              switch (tab.getPosition()){

                  case 0:
                      fragment=new ChatFragments();
                        break;
                  case 1:
                      fragment=new StatusFragments();
                      break;
                  case 2:
                    fragment=new CallFragments();
                    break;
              }
              FragmentManager fg=getSupportFragmentManager();
              FragmentTransaction transaction=fg.beginTransaction();
              transaction.replace(R.id.Linear1,fragment);
              transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
              transaction.commit();
          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab) {

          }

          @Override
          public void onTabReselected(TabLayout.Tab tab) {

          }
      });




    }
}