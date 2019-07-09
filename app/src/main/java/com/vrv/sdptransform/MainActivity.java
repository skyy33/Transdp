package com.vrv.sdptransform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);

        String sdp ="v=0\n" +
                "o=libmediasoupclient 10000 2 IN IP4 0.0.0.0\n" +
                "s=-\n" +
                "t=0 0\n" +
                "a=ice-lite\n" +
                "a=fingerprint:sha-512 42:73:BE:66:81:5A:94:BC:47:F7:B9:74:39:48:1C:C2:B7:05:F8:70:90:27:D1:94:3D:F4:80:47:31:13:F1:F4:C0:13:AC:00:8E:A7:B6:21:5C:5D:D3:E4:22:F3:B6:4A:69:60:A9:B1:6A:9A:16:9C:7F:A2:C4:4E:1A:F8:B0:AC\n" +
                "a=msid-semantic: WMS *\n" +
                "a=group:BUNDLE 0 1\n" +
                "m=audio 7 RTP/SAVPF 111\n" +
                "c=IN IP4 127.0.0.1\n" +
                "a=rtpmap:111 opus/48000/2\n" +
                "a=fmtp:111 stereo=1;usedtx=1\n" +
                "a=extmap:9 urn:ietf:params:rtp-hdrext:sdes:mid\n" +
                "a=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level\n" +
                "a=setup:active\n" +
                "a=mid:0\n" +
                "a=recvonly\n" +
                "a=ice-ufrag:xflnm7gl4cwr9crd\n" +
                "a=ice-pwd:q4q8noteh11kuhwyvx7xcxmney2pby5z\n" +
                "a=candidate:udpcandidate 1 udp 1076558079 192.168.1.115 44531 typ host\n" +
                "a=candidate:tcpcandidate 1 tcp 1076302079 192.168.1.115 43125 typ host tcptype passive\n" +
                "a=end-of-candidates\n" +
                "a=ice-options:renomination\n" +
                "a=rtcp-mux\n" +
                "a=rtcp-rsize\n" +
                "m=video 7 RTP/SAVPF 96 97\n" +
                "c=IN IP4 127.0.0.1\n" +
                "a=rtpmap:96 H264/90000\n" +
                "a=rtpmap:97 rtx/90000\n" +
                "a=fmtp:96 level-asymmetry-allowed=1;packetization-mode=1;profile-level-id=4d0032;x-google-start-bitrate=1000\n" +
                "a=fmtp:97 apt=96\n" +
                "a=rtcp-fb:96 nack\n" +
                "a=rtcp-fb:96 nack\n" +
                "a=rtcp-fb:96 ccm fir\n" +
                "a=rtcp-fb:96 nack\n" +
                "a=rtcp-fb:96 nack pli\n" +
                "a=extmap:9 urn:ietf:params:rtp-hdrext:sdes:mid\n" +
                "a=extmap:13 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\n" +
                "a=extmap:14 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\n" +
                "a=extmap:3 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\n" +
                "a=extmap:10 http://tools.ietf.org/html/draft-ietf-avtext-framemarking-07\n" +
                "a=extmap:4 urn:3gpp:video-orientation\n" +
                "a=extmap:2 urn:ietf:params:rtp-hdrext:toffset\n" +
                "a=setup:active\n" +
                "a=mid:1\n" +
                "a=recvonly\n" +
                "a=ice-ufrag:xflnm7gl4cwr9crd\n" +
                "a=ice-pwd:q4q8noteh11kuhwyvx7xcxmney2pby5z\n" +
                "a=candidate:udpcandidate 1 udp 1076558079 192.168.1.115 44531 typ host\n" +
                "a=candidate:tcpcandidate 1 tcp 1076302079 192.168.1.115 43125 typ host tcptype passive\n" +
                "a=end-of-candidates\n" +
                "a=ice-options:renomination\n" +
                "a=rtcp-mux\n" +
                "a=rtcp-rsize\n";
        tv.setText(SdpBridge.parse(sdp));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();
}
