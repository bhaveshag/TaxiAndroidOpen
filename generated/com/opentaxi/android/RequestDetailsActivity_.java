//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import java.io.Serializable;
import java.util.Map;
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
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.generated.mysql.tables.pojos.Feedback;
import com.opentaxi.models.NewCRequest;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class RequestDetailsActivity_
    extends RequestDetailsActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String NEW_C_REQUEST_EXTRA = "newCRequest";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.request_details);
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

    public static RequestDetailsActivity_.IntentBuilder_ intent(Context context) {
        return new RequestDetailsActivity_.IntentBuilder_(context);
    }

    public static RequestDetailsActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new RequestDetailsActivity_.IntentBuilder_(supportFragment);
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
        feedBackButton = ((Button) hasViews.findViewById(id.feedBackButton));
        datecreated = ((TextView) hasViews.findViewById(id.datecreated));
        car = ((TextView) hasViews.findViewById(id.car));
        requestNumber = ((TextView) hasViews.findViewById(id.requestNumber));
        editButton = ((Button) hasViews.findViewById(id.editButton));
        remaining_time = ((TextView) hasViews.findViewById(id.remaining_time));
        chosen_group = ((TextView) hasViews.findViewById(id.chosen_group));
        state = ((TextView) hasViews.findViewById(id.state));
        price_group = ((TextView) hasViews.findViewById(id.price_group));
        arrive_time = ((TextView) hasViews.findViewById(id.arrive_time));
        rejectButton = ((Button) hasViews.findViewById(id.rejectButton));
        address = ((TextView) hasViews.findViewById(id.address));
        {
            View view = hasViews.findViewById(id.editButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestDetailsActivity_.this.editButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.rejectButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestDetailsActivity_.this.rejectButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.feedBackButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestDetailsActivity_.this.feedBackButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.okButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestDetailsActivity_.this.okButton();
                    }

                }
                );
            }
        }
        afterRequestsActivity();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(NEW_C_REQUEST_EXTRA)) {
                newCRequest = ((NewCRequest) extras_.getSerializable(NEW_C_REQUEST_EXTRA));
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  9 :
                RequestDetailsActivity_.this.onResult();
                break;
        }
    }

    @Override
    public void showFeedBack(final Feedback[] feedbacks) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                RequestDetailsActivity_.super.showFeedBack(feedbacks);
            }

        }
        );
    }

    @Override
    public void showDetails() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                RequestDetailsActivity_.super.showDetails();
            }

        }
        );
    }

    @Override
    public void scheduleChangesSec() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 1000, "") {


            @Override
            public void execute() {
                try {
                    RequestDetailsActivity_.super.scheduleChangesSec();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setFeedBack() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    RequestDetailsActivity_.super.setFeedBack();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void scheduleChanges() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 10000, "") {


            @Override
            public void execute() {
                try {
                    RequestDetailsActivity_.super.scheduleChanges();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void sendFeedBack(final String comment, final Map<Integer, Float> vote) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    RequestDetailsActivity_.super.sendFeedBack(comment, vote);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void rejectRequest(final String reason) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    RequestDetailsActivity_.super.rejectRequest(reason);
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
            intent_ = new Intent(context, RequestDetailsActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, RequestDetailsActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public RequestDetailsActivity_.IntentBuilder_ flags(int flags) {
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

        public RequestDetailsActivity_.IntentBuilder_ newCRequest(NewCRequest newCRequest) {
            intent_.putExtra(NEW_C_REQUEST_EXTRA, ((Serializable) newCRequest));
            return this;
        }

    }

}
