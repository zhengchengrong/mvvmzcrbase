package com.csair.ehomesaas.base.app

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.csair.ehomesaas.base.utils.ActivityStackManager

/**
 * Activity生命周期监听
 *
 */
class ActivityLifecycleCallbacksImpl : Application.ActivityLifecycleCallbacks {

    private val TAG = "ActivityLifecycle"

    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        ActivityStackManager.addActivityToStack(activity)
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityCreated")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStarted")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityResumed")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityPaused")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStopped")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivitySaveInstanceState")
    }

    override fun onActivityDestroyed(activity: Activity) {
        ActivityStackManager.popActivityToStack(activity)
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityDestroyed")
    }
}