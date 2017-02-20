package com.mds.binding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.mds.binding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MethodReferenceHandler, ____ListenerBindingEventHandler {

    private ObservableUser observableUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User kkr = new User();
        kkr.setAge("20");
        kkr.setName("Vinit Saxena");
        List<User> users = new ArrayList<User>();
        users.add(kkr);


        kkr.setMyUserDetails(new User.MyUserDetails("ok", 123 + ""));
        activityMainBinding.setUser(kkr);
        activityMainBinding.setEventHandler(this);
        activityMainBinding.setMethodreferencehandler(this);
        activityMainBinding.setMethodreferencehandler(this);
        activityMainBinding.setList(users);

        observableUser = new ObservableUser();
        observableUser.setName("Object");
        activityMainBinding.setOuser(observableUser);

    }

    @Override
    public void onClickViaMethodReferenceHandler(View v) {
        Log.i(getClass().getName(), "---->onClickViaMethodReferenceHandler");

        switch (v.getId()) {
            case R.id.c_b_name:
                Intent intent = new Intent(this, NewActivity.class);
                startActivity(intent);
                break;
            case R.id.notify_user_name:
                observableUser.setName("Updated Object");
                break;
        }
    }

    @Override
    public void eventHandlerViaListenerBinding() {
        Log.i(getClass().getName(), "---->eventHandlerViaListenerBinding");
    }

    @Override
    public void eventHandlerViaListenerBinding(boolean isThisTrue) {
        Log.i(getClass().getName(), "---->eventHandlerViaListenerBinding - isThisTrue : " + isThisTrue);
    }
}
