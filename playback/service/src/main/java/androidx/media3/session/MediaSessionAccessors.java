package androidx.media3.session;

import android.net.Uri;

public class MediaSessionAccessors {
    public static Uri getUri(MediaSession session) {
        return session.getUri();
    }
}
