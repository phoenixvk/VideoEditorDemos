// 
// Decompiled by Procyon v0.5.36
// 

package com.yasoka.screenrecord.sdk.core.lasque.tusdk.modules.components;

//import org.lasque.tusdk.core.secret.StatisticsManger;
import android.support.v7.app.AppCompatActivity;

import com.yasoka.screenrecord.sdk.core.lasque.tusdk.core.secret.StatisticsManger;

public abstract class TuAlbumMultipleComponentBase extends TuSdkComponent
{
    public TuAlbumMultipleComponentBase(final AppCompatActivity activity) {
        super(activity);
        StatisticsManger.appendComponent(ComponentActType.albumMultipleComponent);
    }
}
