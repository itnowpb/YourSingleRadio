package com.app.yoursingleradio;

public class Config {

    //if admin panel disabled, put your radio stream url here
    public static final String RADIO_STREAM_URL = "http://198.58.98.83:8193/stream";

    //set true to enable admin panel or set false to disable
    public static final boolean ENABLE_ADMIN_PANEL = true;
    //if admin panel enabled, put your admin panel url here
    public static final String ADMIN_PANEL_URL = "http://10.0.2.2/your_single_radio";

    //ads configuration
    public static final boolean ENABLE_ADMOB_BANNER_ADS = true;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ADS_ON_DRAWER_SELECTION = true;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ON_PLAY = false;
    public static final int ADMOB_INTERSTITIAL_ON_PLAY_INTERVAL = 3;
    public static final boolean ENABLE_ADMOB_NATIVE_AD_ON_CLOSE_DIALOG = true;

    //auto play function
    public static final boolean ENABLE_AUTO_PLAY = false;

    //layout customization
    public static final boolean ENABLE_SOCIAL_MENU = true;

    //album art configuration
    public static final boolean ENABLE_ALBUM_ART = true;
    public static final boolean ENABLE_CIRCULAR_IMAGE_ALBUM_ART = true;
    public static final int ALBUM_ART_BORDER_WIDTH = 8;
    public static final int ALBUM_ART_CORNER_RADIUS = 30;

    //splash screen duration in millisecond
    public static final int SPLASH_SCREEN_DURATION = 2000;

}