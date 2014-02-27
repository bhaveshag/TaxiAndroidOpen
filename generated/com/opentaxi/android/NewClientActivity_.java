//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import java.io.Serializable;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.models.NewUsers;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class NewClientActivity_
    extends NewClientActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String NEW_USERS_EXTRA = "newUsers";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.new_client);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
        requestWindowFeature(1);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static NewClientActivity_.IntentBuilder_ intent(Context context) {
        return new NewClientActivity_.IntentBuilder_(context);
    }

    public static NewClientActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new NewClientActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        iAgreeCheckBox = ((CheckBox) hasViews.findViewById(id.iAgreeCheckBox));
        cityName = ((AutoCompleteTextView) hasViews.findViewById(id.cityName));
        nameField = ((EditText) hasViews.findViewById(id.nameField));
        passwordHint = ((EditText) hasViews.findViewById(id.passwordHint));
        pass = ((EditText) hasViews.findViewById(id.passwordField));
        sendButton = ((Button) hasViews.findViewById(id.sendButton));
        userName = ((EditText) hasViews.findViewById(id.userNameField));
        middleName = ((EditText) hasViews.findViewById(id.middleName));
        lastName = ((EditText) hasViews.findViewById(id.lastName));
        email = ((EditText) hasViews.findViewById(id.emailField));
        pass2 = ((EditText) hasViews.findViewById(id.password2Field));
        phoneNumber = ((EditText) hasViews.findViewById(id.phoneNumber));
        {
            View view = hasViews.findViewById(id.userAgreement);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        NewClientActivity_.this.userAgreement();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.sendButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        NewClientActivity_.this.sendButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.emailField);
            if (view!= null) {
                view.setOnFocusChangeListener(new OnFocusChangeListener() {


                    @Override
                    public void onFocusChange(View view, boolean hasFocus) {
                        NewClientActivity_.this.focusChangedOnEmailField(view, hasFocus);
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.userNameField);
            if (view!= null) {
                view.setOnFocusChangeListener(new OnFocusChangeListener() {


                    @Override
                    public void onFocusChange(View view, boolean hasFocus) {
                        NewClientActivity_.this.focusChangedOnUserNameField(view, hasFocus);
                    }

                }
                );
            }
        }
        afterLoad();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(NEW_USERS_EXTRA)) {
                newUsers = ((NewUsers) extras_.getSerializable(NEW_USERS_EXTRA));
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void setUserError(final String error) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewClientActivity_.super.setUserError(error);
            }

        }
        );
    }

    @Override
    public void ActivationDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewClientActivity_.super.ActivationDialog();
            }

        }
        );
    }

    @Override
    public void setEmailError(final String error) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewClientActivity_.super.setEmailError(error);
            }

        }
        );
    }

    @Override
    public void finishThis() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewClientActivity_.super.finishThis();
            }

        }
        );
    }

    @Override
    public void checkUsername(final String username) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewClientActivity_.super.checkUsername(username);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void checkEmail(final String emailCheck) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewClientActivity_.super.checkEmail(emailCheck);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void createNewUser(final NewUsers users) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewClientActivity_.super.createNewUser(users);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, NewClientActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, NewClientActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public NewClientActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

        public NewClientActivity_.IntentBuilder_ newUsers(NewUsers newUsers) {
            intent_.putExtra(NEW_USERS_EXTRA, ((Serializable) newUsers));
            return this;
        }

    }

}
