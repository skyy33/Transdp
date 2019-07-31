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

        String  sdp ="v=0\n" +
                "o=- 9081217120069886624 2 IN IP4 127.0.0.1\n" +
                "s=-\n" +
                "t=0 0\n" +
                "a=group:BUNDLE audio video\n" +
                "a=msid-semantic: WMS ARDAMS\n" +
                "m=audio 9 UDP/TLS/RTP/SAVPF 111 103 104 9 102 0 8 106 105 13 110 112 113 126\n" +
                "a=candidate:1577908739 1 udp 2122260223 192.168.1.132 36009 typ host generation 0 ufrag L4bi network-id 3 network-cost 10\n" +
                "a=candidate:842163049 1 udp 1686052607 122.115.227.30 3448 typ srflx raddr 192.168.1.132 rport 36009 generation 0 network-id 3 network-cost 10\n" +
                "a=candidate:3723398083 1 udp 41885439 39.97.72.29 51284 typ relay raddr 43.224.212.104 rport 8360 generation 0 ufrag L4bi network-id 3 network-cost 10\n" +
                "a=candidate:842163049 1 udp 1686052607 43.224.212.104 8360 typ srflx raddr 192.168.1.132 rport 36009 generation 0 ufrag L4bi network-id 3 network-cost 10\n" +
                "c=IN IP4 0.0.0.0\n" +
                "a=rtcp:9 IN IP4 0.0.0.0\n" +
                "a=ice-ufrag:L4bi\n" +
                "a=ice-pwd:A66q+ZKxdHkYuXkUfMGdlRQc\n" +
                "a=ice-options:trickle renomination\n" +
                "a=fingerprint:sha-256 3A:5F:30:14:04:03:87:53:80:2F:87:D9:46:1E:0D:A7:D9:46:DD:E2:CE:DA:67:D7:78:0B:3B:8E:B1:B8:B3:90\n" +
                "a=setup:actpass\n" +
                "a=mid:audio\n" +
                "a=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level\n" +
                "a=sendrecv\n" +
                "a=rtcp-mux\n" +
                "a=rtpmap:111 opus/48000/2\n" +
                "a=rtcp-fb:111 transport-cc\n" +
                "a=rtcp-fb:111 nack\n" +
                "a=fmtp:111 minptime=10;useinbandfec=1\n" +
                "a=rtpmap:103 ISAC/16000\n" +
                "a=rtpmap:104 ISAC/32000\n" +
                "a=rtpmap:9 G722/8000\n" +
                "a=rtpmap:102 ILBC/8000\n" +
                "a=rtpmap:0 PCMU/8000\n" +
                "a=rtpmap:8 PCMA/8000\n" +
                "a=rtpmap:106 CN/32000\n" +
                "a=rtpmap:105 CN/16000\n" +
                "a=rtpmap:13 CN/8000\n" +
                "a=rtpmap:110 telephone-event/48000\n" +
                "a=rtpmap:112 telephone-event/32000\n" +
                "a=rtpmap:113 telephone-event/16000\n" +
                "a=rtpmap:126 telephone-event/8000\n" +
                "a=ssrc:210567843 cname:H2CDMKXYnzVSQHzH\n" +
                "a=ssrc:210567843 msid:ARDAMS ARDAMSa0\n" +
                "a=ssrc:210567843 mslabel:ARDAMS\n" +
                "a=ssrc:210567843 label:ARDAMSa0\n" +
                "m=video 9 UDP/TLS/RTP/SAVPF 96 97 98 99 100 101 127 124 125\n" +
                "c=IN IP4 0.0.0.0\n" +
                "a=rtcp:9 IN IP4 0.0.0.0\n" +
                "a=ice-ufrag:L4bi\n" +
                "a=ice-pwd:A66q+ZKxdHkYuXkUfMGdlRQc\n" +
                "a=ice-options:trickle renomination\n" +
                "a=fingerprint:sha-256 3A:5F:30:14:04:03:87:53:80:2F:87:D9:46:1E:0D:A7:D9:46:DD:E2:CE:DA:67:D7:78:0B:3B:8E:B1:B8:B3:90\n" +
                "a=setup:actpass\n" +
                "a=mid:video\n" +
                "a=extmap:2 urn:ietf:params:rtp-hdrext:toffset\n" +
                "a=extmap:3 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\n" +
                "a=extmap:4 urn:3gpp:video-orientation\n" +
                "a=extmap:5 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\n" +
                "a=extmap:6 http://www.webrtc.org/experiments/rtp-hdrext/playout-delay\n" +
                "a=extmap:7 http://www.webrtc.org/experiments/rtp-hdrext/video-content-type\n" +
                "a=extmap:8 http://www.webrtc.org/experiments/rtp-hdrext/video-timing\n" +
                "a=extmap:10 http://tools.ietf.org/html/draft-ietf-avtext-framemarking-07\n" +
                "a=extmap:12 http://www.webrtc.org/experiments/rtp-hdrext/color-space\n" +
                "a=sendrecv\n" +
                "a=rtcp-mux\n" +
                "a=rtcp-rsize\n" +
                "a=rtpmap:96 VP8/90000\n" +
                "a=rtcp-fb:96 goog-remb\n" +
                "a=rtcp-fb:96 transport-cc\n" +
                "a=rtcp-fb:96 ccm fir\n" +
                "a=rtcp-fb:96 nack\n" +
                "a=rtcp-fb:96 nack pli\n" +
                "a=rtpmap:97 rtx/90000\n" +
                "a=fmtp:97 apt=96\n" +
                "a=rtpmap:98 VP9/90000\n" +
                "a=rtcp-fb:98 goog-remb\n" +
                "a=rtcp-fb:98 transport-cc\n" +
                "a=rtcp-fb:98 ccm fir\n" +
                "a=rtcp-fb:98 nack\n" +
                "a=rtcp-fb:98 nack pli\n" +
                "a=rtpmap:99 rtx/90000\n" +
                "a=fmtp:99 apt=98\n" +
                "a=rtpmap:100 H264/90000\n" +
                "a=rtcp-fb:100 goog-remb\n" +
                "a=rtcp-fb:100 transport-cc\n" +
                "a=rtcp-fb:100 ccm fir\n" +
                "a=rtcp-fb:100 nack\n" +
                "a=rtcp-fb:100 nack pli\n" +
                "a=fmtp:100 level-asymmetry-allowed=1;packetization-mode=1;profile-level-id=42e01f\n" +
                "a=rtpmap:101 rtx/90000\n" +
                "a=fmtp:101 apt=100\n" +
                "a=rtpmap:127 red/90000\n" +
                "a=rtpmap:124 rtx/90000\n" +
                "a=fmtp:124 apt=127\n" +
                "a=rtpmap:125 ulpfec/90000\n" +
                "a=ssrc-group:FID 3411073572 1655587047\n" +
                "a=ssrc:3411073572 cname:H2CDMKXYnzVSQHzH\n" +
                "a=ssrc:3411073572 msid:ARDAMS ARDAMSv0\n" +
                "a=ssrc:3411073572 mslabel:ARDAMS\n" +
                "a=ssrc:3411073572 label:ARDAMSv0\n" +
                "a=ssrc:1655587047 cname:H2CDMKXYnzVSQHzH\n" +
                "a=ssrc:1655587047 msid:ARDAMS ARDAMSv0\n" +
                "a=ssrc:1655587047 mslabel:ARDAMS\n" +
                "a=ssrc:1655587047 label:ARDAMSv0\n";


       String  ss= SdpBridge.parse(sdp);

        String newSdp =SdpBridge.write(ss);

        tv.setText(newSdp);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();
}
