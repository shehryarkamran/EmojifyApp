// Generated code from Butter Knife. Do not modify!
package com.example.android.emojify;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230784;

  private View view2131230860;

  private View view2131230839;

  private View view2131230765;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mImageView = Utils.findRequiredViewAsType(source, R.id.image_view, "field 'mImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.emojify_button, "field 'mEmojifyButton' and method 'emojifyMe'");
    target.mEmojifyButton = Utils.castView(view, R.id.emojify_button, "field 'mEmojifyButton'", Button.class);
    view2131230784 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.emojifyMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.share_button, "field 'mShareFab' and method 'shareMe'");
    target.mShareFab = Utils.castView(view, R.id.share_button, "field 'mShareFab'", FloatingActionButton.class);
    view2131230860 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shareMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.save_button, "field 'mSaveFab' and method 'saveMe'");
    target.mSaveFab = Utils.castView(view, R.id.save_button, "field 'mSaveFab'", FloatingActionButton.class);
    view2131230839 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.clear_button, "field 'mClearFab' and method 'clearImage'");
    target.mClearFab = Utils.castView(view, R.id.clear_button, "field 'mClearFab'", FloatingActionButton.class);
    view2131230765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearImage();
      }
    });
    target.mTitleTextView = Utils.findRequiredViewAsType(source, R.id.title_text_view, "field 'mTitleTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImageView = null;
    target.mEmojifyButton = null;
    target.mShareFab = null;
    target.mSaveFab = null;
    target.mClearFab = null;
    target.mTitleTextView = null;

    view2131230784.setOnClickListener(null);
    view2131230784 = null;
    view2131230860.setOnClickListener(null);
    view2131230860 = null;
    view2131230839.setOnClickListener(null);
    view2131230839 = null;
    view2131230765.setOnClickListener(null);
    view2131230765 = null;
  }
}
