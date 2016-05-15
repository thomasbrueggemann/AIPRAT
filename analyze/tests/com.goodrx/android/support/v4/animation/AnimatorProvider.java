package android.support.v4.animation;

import android.support.v4.animation.ValueAnimatorCompat;
import android.view.View;

interface AnimatorProvider {
   void clearInterpolator(View var1);

   ValueAnimatorCompat emptyValueAnimator();
}
