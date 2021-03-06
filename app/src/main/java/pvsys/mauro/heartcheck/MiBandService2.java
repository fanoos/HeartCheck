package pvsys.mauro.heartcheck;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class MiBandService2 {

    public static final String BTLE_BASE_UUID = "0000%s-0000-1000-8000-00805f9b34fb";

    public static final String MAC_ADDRESS_FILTER_1_1A = "88:0F:10";
    public static final String MAC_ADDRESS_FILTER_1S = "C8:0F:10";

    public static final String UUID_SERVICE_WEIGHT_SERVICE = "00001530-0000-3512-2118-0009af100700";

    public static final UUID UUID_CHARACTERISTIC_DEVICE_INFO = UUID.fromString(String.format(BTLE_BASE_UUID, "FF01"));

    public static final UUID UUID_CHARACTERISTIC_DEVICE_NAME = UUID.fromString(String.format(BTLE_BASE_UUID, "FF02"));

    public static final UUID UUID_CHARACTERISTIC_NOTIFICATION = UUID.fromString(String.format(BTLE_BASE_UUID, "FF03"));

    public static final UUID UUID_CHARACTERISTIC_USER_INFO = UUID.fromString(String.format(BTLE_BASE_UUID, "FF04"));

    public static final UUID UUID_CHARACTERISTIC_CONTROL_POINT = UUID.fromString(String.format(BTLE_BASE_UUID, "FF05"));

    public static final UUID UUID_CHARACTERISTIC_REALTIME_STEPS = UUID.fromString(String.format(BTLE_BASE_UUID, "FF06"));

    public static final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA = UUID.fromString(String.format(BTLE_BASE_UUID, "FF07"));

    public static final UUID UUID_CHARACTERISTIC_LE_PARAMS = UUID.fromString(String.format(BTLE_BASE_UUID, "FF09"));

    public static final UUID UUID_CHARACTERISTIC_DATE_TIME = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0A"));

    public static final UUID UUID_CHARACTERISTIC_STATISTICS = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0B"));

    public static final UUID UUID_CHARACTERISTIC_BATTERY = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0C"));

    public static final UUID UUID_CHARACTERISTIC_TEST = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0D"));

    public static final UUID UUID_CHARACTERISTIC_SENSOR_DATA = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0E"));

    public static final UUID UUID_CHARACTERISTIC_PAIR = UUID.fromString(String.format(BTLE_BASE_UUID, "FF0F"));


    public static final UUID UUID_CHARACTERISTIC_HEART_RATE_CONTROL_POINT = UUID.fromString((String.format(BTLE_BASE_UUID, "2A39")));
    public static final UUID UUID_CHARACTERISTIC_HEART_RATE_MEASUREMENT = UUID.fromString((String.format(BTLE_BASE_UUID, "2A37")));

    public static final UUID UUID_CHARACTERISTIC_GAP_DEVICE_NAME = UUID.fromString((String.format(BTLE_BASE_UUID, "2A00")));


    /* FURTHER UUIDS that were mixed with the other params below. The base UUID for these is unknown */

    public static final byte ALIAS_LEN = 0xa;

    /*NOTIFICATIONS: usually received on the UUID_CHARACTERISTIC_NOTIFICATION characteristic */

    public static final byte NOTIFY_NORMAL = 0x0;

    public static final byte NOTIFY_FIRMWARE_UPDATE_FAILED = 0x1;

    public static final byte NOTIFY_FIRMWARE_UPDATE_SUCCESS = 0x2;

    public static final byte NOTIFY_CONN_PARAM_UPDATE_FAILED = 0x3;

    public static final byte NOTIFY_CONN_PARAM_UPDATE_SUCCESS = 0x4;

    public static final byte NOTIFY_AUTHENTICATION_SUCCESS = 0x5;

    public static final byte NOTIFY_AUTHENTICATION_FAILED = 0x6;

    public static final byte NOTIFY_FITNESS_GOAL_ACHIEVED = 0x7;

    public static final byte NOTIFY_SET_LATENCY_SUCCESS = 0x8;

    public static final byte NOTIFY_RESET_AUTHENTICATION_FAILED = 0x9;

    public static final byte NOTIFY_RESET_AUTHENTICATION_SUCCESS = 0xa;

    public static final byte NOTIFY_FW_CHECK_FAILED = 0xb;

    public static final byte NOTIFY_FW_CHECK_SUCCESS = 0xc;

    public static final byte NOTIFY_STATUS_MOTOR_NOTIFY = 0xd;

    public static final byte NOTIFY_STATUS_MOTOR_CALL = 0xe;

    public static final byte NOTIFY_STATUS_MOTOR_DISCONNECT = 0xf;

    public static final byte NOTIFY_STATUS_MOTOR_SMART_ALARM = 0x10;

    public static final byte NOTIFY_STATUS_MOTOR_ALARM = 0x11;

    public static final byte NOTIFY_STATUS_MOTOR_GOAL = 0x12;

    public static final byte NOTIFY_STATUS_MOTOR_AUTH = 0x13;

    public static final byte NOTIFY_STATUS_MOTOR_SHUTDOWN = 0x14;

    public static final byte NOTIFY_STATUS_MOTOR_AUTH_SUCCESS = 0x15;

    public static final byte NOTIFY_STATUS_MOTOR_TEST = 0x16;

    // 0x18 is returned when we cancel data sync, perhaps is an ack for this message

    public static final byte NOTIFY_UNKNOWN = -0x1;

    public static final int NOTIFY_PAIR_CANCEL = 0xef;

    public static final int NOTIFY_DEVICE_MALFUNCTION = 0xff;


    /* MESSAGES: unknown */

    public static final byte MSG_CONNECTED = 0x0;

    public static final byte MSG_DISCONNECTED = 0x1;

    public static final byte MSG_CONNECTION_FAILED = 0x2;

    public static final byte MSG_INITIALIZATION_FAILED = 0x3;

    public static final byte MSG_INITIALIZATION_SUCCESS = 0x4;

    public static final byte MSG_STEPS_CHANGED = 0x5;

    public static final byte MSG_DEVICE_STATUS_CHANGED = 0x6;

    public static final byte MSG_BATTERY_STATUS_CHANGED = 0x7;

    /* COMMANDS: usually sent to UUID_CHARACTERISTIC_CONTROL_POINT characteristic */

    public static final byte COMMAND_SET_TIMER = 0x4;

    public static final byte COMMAND_SET_FITNESS_GOAL = 0x5;

    public static final byte COMMAND_FETCH_DATA = 0x6;

    public static final byte COMMAND_SEND_FIRMWARE_INFO = 0x7;

    public static final byte COMMAND_SEND_NOTIFICATION = 0x8;

    public static final byte COMMAND_CONFIRM_ACTIVITY_DATA_TRANSFER_COMPLETE = 0xa;

    public static final byte COMMAND_SYNC = 0xb;

    public static final byte COMMAND_REBOOT = 0xc;

    public static final byte COMMAND_SET_WEAR_LOCATION = 0xf;

    public static final byte COMMAND_STOP_SYNC_DATA = 0x11;

    public static final byte COMMAND_STOP_MOTOR_VIBRATE = 0x13;

    public static final byte COMMAND_SET_REALTIME_STEPS_NOTIFICATION = 0x3;

    public static final byte COMMAND_SET_REALTIME_STEP = 0x10;

    // Test HR
    public static final byte COMMAND_SET_HR_SLEEP = 0x0;
    public static final byte COMMAND_SET__HR_CONTINUOUS = 0x1;
    public static final byte COMMAND_SET_HR_MANUAL = 0x2;

    public static final byte COMMAND_GET_SENSOR_DATA = 0x12;

    /* FURTHER COMMANDS: unchecked therefore left commented


	public static final byte COMMAND_FACTORY_RESET = 0x9t;

	public static final int COMMAND_SET_COLOR_THEME = et;

	*/

    /* CONNECTION: unknown

   	public static final CONNECTION_LATENCY_LEVEL_LOW = 0x0t;

	public static final CONNECTION_LATENCY_LEVEL_MEDIUM = 0x1t;

	public static final CONNECTION_LATENCY_LEVEL_HIGH = 0x2t;

    */

    /* MODES: probably related to the sample data structure
    */

    public static final byte MODE_REGULAR_DATA_LEN_BYTE = 0x0;

    // was MODE_REGULAR_DATA_LEN_MINITE
    public static final byte MODE_REGULAR_DATA_LEN_MINUTE = 0x1;

    /* PROFILE: unknown

	public static final PROFILE_STATE_UNKNOWN:I = 0x0

	public static final PROFILE_STATE_INITIALIZATION_SUCCESS:I = 0x1

	public static final PROFILE_STATE_INITIALIZATION_FAILED:I = 0x2

	public static final PROFILE_STATE_AUTHENTICATION_SUCCESS:I = 0x3

	public static final PROFILE_STATE_AUTHENTICATION_FAILED:I = 0x4

	*/

    // TEST_*: sent to UUID_CHARACTERISTIC_TEST characteristic

    public static final byte TEST_DISCONNECTED_REMINDER = 0x5;

    public static final byte TEST_NOTIFICATION = 0x3;

    public static final byte TEST_REMOTE_DISCONNECT = 0x1;

    public static final byte TEST_SELFTEST = 0x2;

    private static final Map<UUID, String> MIBAND_DEBUG;

    static final byte[] reboot = new byte[]{MiBandService2.COMMAND_REBOOT};

    static final byte[] startHeartMeasurementManual = new byte[]{0x15, MiBandService2.COMMAND_SET_HR_MANUAL, 1};
    static final byte[] stopHeartMeasurementManual = new byte[]{0x15, MiBandService2.COMMAND_SET_HR_MANUAL, 0};
    static final byte[] startHeartMeasurementContinuous = new byte[]{0x15, MiBandService2.COMMAND_SET__HR_CONTINUOUS, 1};
    static final byte[] stopHeartMeasurementContinuous = new byte[]{0x15, MiBandService2.COMMAND_SET__HR_CONTINUOUS, 0};
    static final byte[] startHeartMeasurementSleep = new byte[]{0x15, MiBandService2.COMMAND_SET_HR_SLEEP, 1};
    static final byte[] stopHeartMeasurementSleep = new byte[]{0x15, MiBandService2.COMMAND_SET_HR_SLEEP, 0};

    public static final byte[] startRealTimeStepsNotifications = new byte[]{MiBandService2.COMMAND_SET_REALTIME_STEPS_NOTIFICATION, 1};
    public static final byte[] stopRealTimeStepsNotifications = new byte[]{MiBandService2.COMMAND_SET_REALTIME_STEPS_NOTIFICATION, 0};

    public static final byte[] startSensorRead = new byte[]{MiBandService2.COMMAND_GET_SENSOR_DATA, 1};
    public static final byte[] stopSensorRead = new byte[]{MiBandService2.COMMAND_GET_SENSOR_DATA, 0};




    static final byte[] startVibrate = new byte[]{MiBandService2.COMMAND_SEND_NOTIFICATION, 1};
    static final byte[] stopVibrate = new byte[]{MiBandService2.COMMAND_STOP_MOTOR_VIBRATE};
    public static byte[] getDefaultNotification() {
        final int vibrateTimes = 1;
        final long vibrateDuration = 250l;
        final int flashTimes = 1;
        final int flashColour = 0xFFFFFFFF;
        final int originalColour = 0xFFFFFFFF;
        final long flashDuration = 250l;

        return getNotification(vibrateDuration, vibrateTimes, flashTimes, flashColour, originalColour, flashDuration);
    }

    public static byte[] getNotification(long vibrateDuration, int vibrateTimes, int flashTimes, int flashColour, int originalColour, long flashDuration) {
        byte[] vibrate = startVibrate;
        byte r = 6;
        byte g = 0;
        byte b = 6;
        boolean display = true;
        //      byte[] flashColor = new byte[]{ 14, r, g, b, display ? (byte) 1 : (byte) 0 };
        return vibrate;
    }

    public static byte[] getHighLatency() {
        int minConnectionInterval = 460;
        int maxConnectionInterval = 500;
        int latency = 0;
        int timeout = 500;
        int advertisementInterval = 0;

        return getLatency(minConnectionInterval, maxConnectionInterval, latency, timeout, advertisementInterval);
    }

    public static byte[] getLatency(int minConnectionInterval, int maxConnectionInterval, int latency, int timeout, int advertisementInterval) {
        byte result[] = new byte[12];
        result[0] = (byte) (minConnectionInterval & 0xff);
        result[1] = (byte) (0xff & minConnectionInterval >> 8);
        result[2] = (byte) (maxConnectionInterval & 0xff);
        result[3] = (byte) (0xff & maxConnectionInterval >> 8);
        result[4] = (byte) (latency & 0xff);
        result[5] = (byte) (0xff & latency >> 8);
        result[6] = (byte) (timeout & 0xff);
        result[7] = (byte) (0xff & timeout >> 8);
        result[8] = 0;
        result[9] = 0;
        result[10] = (byte) (advertisementInterval & 0xff);
        result[11] = (byte) (0xff & advertisementInterval >> 8);

        return result;
    }

    public static byte[] getLowLatency() {
        int minConnectionInterval = 39;
        int maxConnectionInterval = 49;
        int latency = 0;
        int timeout = 500;
        int advertisementInterval = 0;

        return getLatency(minConnectionInterval, maxConnectionInterval, latency, timeout, advertisementInterval);
    }
    
    //Let's see--------------------------------------------------------------------------

    public static final UUID UUID_SERVICE_MIBAND_SERVICE = UUID.fromString(String.format(BTLE_BASE_UUID, "FEE0"));
    public static final UUID UUID_SERVICE_MIBAND2_SERVICE = UUID.fromString(String.format(BTLE_BASE_UUID, "FEE1"));
    public static final UUID UUID_SERVICE_HEART_RATE = UUID.fromString(String.format(BTLE_BASE_UUID, "180D"));
    public static final UUID UUID_SERVICE_FIRMWARE_SERVICE = UUID.fromString("00001530-0000-3512-2118-0009af100700");

    public static final UUID UUID_CHARACTERISTIC_FIRMWARE = UUID.fromString("00001531-0000-3512-2118-0009af100700");
    public static final UUID UUID_CHARACTERISTIC_FIRMWARE_DATA = UUID.fromString("00001532-0000-3512-2118-0009af100700");

    public static final UUID UUID_UNKNOWN_CHARACTERISTIC0 = UUID.fromString("00000000-0000-3512-2118-0009af100700");
    public static final UUID UUID_UNKNOWN_CHARACTERISTIC1 = UUID.fromString("00000001-0000-3512-2118-0009af100700");
    public static final UUID UUID_UNKNOWN_CHARACTERISTIC2 = UUID.fromString("00000002-0000-3512-2118-0009af100700");
    /**
     * Alarms, Display and other configuration.
     */
    public static final UUID UUID_CHARACTERISTIC_3_CONFIGURATION = UUID.fromString("00000003-0000-3512-2118-0009af100700");
    public static final UUID UUID_UNKNOWN_CHARACTERISTIC4 = UUID.fromString("00000004-0000-3512-2118-0009af100700");
    public static final UUID UUID_CHARACTERISTIC_5_ACTIVITY_DATA = UUID.fromString("00000005-0000-3512-2118-0009af100700");
    public static final UUID UUID_CHARACTERISTIC_6_BATTERY_INFO = UUID.fromString("00000006-0000-3512-2118-0009af100700");
    public static final UUID UUID_CHARACTERISTIC_7_REALTIME_STEPS = UUID.fromString("00000007-0000-3512-2118-0009af100700");
    public static final UUID UUID_UNKNOWN_CHARACTERISTIC8 = UUID.fromString("00000008-0000-3512-2118-0009af100700");
    // service uuid fee1
    public static final UUID UUID_CHARACTERISTIC_AUTH = UUID.fromString("00000009-0000-3512-2118-0009af100700");
    public static final UUID UUID_CHARACTERISTIC_10_BUTTON = UUID.fromString("00000010-0000-3512-2118-0009af100700");

    public static final int ALERT_LEVEL_NONE = 0;
    public static final int ALERT_LEVEL_MESSAGE = 1;
    public static final int ALERT_LEVEL_PHONE_CALL = 2;
    public static final int ALERT_LEVEL_VIBRATE_ONLY = 3;
    public static final int ALERT_LEVEL_CUSTOM = 0xfa; // followed by another uin8 to select the actual icon

    // set metric distance
    // set 12 hour time mode

    /**
     * Mi Band 2 authentication has three steps.
     * This is step 1: sending a "secret" key to the band.
     * This is byte 0, followed by {@link #AUTH_BYTE} and then the key.
     * In the response, it is byte 1 in the byte[] value.
     */
    public static final byte AUTH_SEND_KEY = 0x01;
    /**
     * Mi Band 2 authentication has three steps.
     * This is step 2: requesting a random authentication key from the band.
     * This is byte 0, followed by {@link #AUTH_BYTE}.
     * In the response, it is byte 1 in the byte[] value.
     */
    public static final byte AUTH_REQUEST_RANDOM_AUTH_NUMBER = 0x02;
    /**
     * Mi Band 2 authentication has three steps.
     * This is step 3: sending the encrypted random authentication key to the band.
     * This is byte 0, followed by {@link #AUTH_BYTE} and then the encrypted random authentication key.
     * In the response, it is byte 1 in the byte[] value.
     */
    public static final byte AUTH_SEND_ENCRYPTED_AUTH_NUMBER = 0x03;

    /**
     * Received in response to any authentication requests (byte 0 in the byte[] value.
     */
    public static final byte AUTH_RESPONSE = 0x10;
    /**
     * Received in response to any authentication requests (byte 2 in the byte[] value.
     * 0x01 means success.
     */
    public static final byte AUTH_SUCCESS = 0x01;
    /**
     * Received in response to any authentication requests (byte 2 in the byte[] value.
     * 0x04 means failure.
     */
    public static final byte AUTH_FAIL = 0x04;
    /**
     * In some logs it's 0x0...
     */
    public static final byte AUTH_BYTE = 0x8;

    // maybe not really activity data, but steps?
    public static final byte COMMAND_FETCH_ACTIVITY_DATA = 0x02;
    public static final byte COMMAND_XXXX_ACTIVITY_DATA = 0x03; // maybe delete/drop activity data?

    public static final byte[] COMMAND_SET_FITNESS_GOAL_START = new byte[] { 0x10, 0x0, 0x0 };
    public static final byte[] COMMAND_SET_FITNESS_GOAL_END = new byte[] { 0, 0 };

    public static final byte ICON_CHAT = 0x00;
    public static final byte ICON_PENGUIN = 0x01;
    public static final byte ICON_CHAT_MI = 0x02;
    public static final byte ICON_FB = 0x03;
    public static final byte ICON_TWITTER = 0x04;
    public static final byte ICON_MIBAND = 0x05;
    public static final byte ICON_SNAPCHAT = 0x06;
    public static final byte ICON_WHATSAPP = 0x07;
    public static final byte ICON_MANTA = 0x08;
    public static final byte ICON_XX0 = 0x09;
    public static final byte ICON_ALARM = 0x10;
    public static final byte ICON_SHATTERED_GLASS = 0x11;
    public static final byte ICON_INSTAGRAM = 0x12;
    public static final byte ICON_CHAT_GHOST = 0x13;
    public static final byte ICON_COW = 0x14;
    public static final byte ICON_XX2 = 0x15;
    public static final byte ICON_XX3 = 0x16;
    public static final byte ICON_XX4 = 0x17;
    public static final byte ICON_XX5 = 0x18;
    public static final byte ICON_XX6 = 0x19;
    public static final byte ICON_EGALE = 0x1a;
    public static final byte ICON_CALENDAR = 0x1b;
    public static final byte ICON_XX7 = 0x1c;
    public static final byte ICON_PHONE_CALL = 0x1d;
    public static final byte ICON_CHAT_LINE = 0x1e;
    public static final byte ICON_TELEGRAM = 0x1f;
    public static final byte ICON_CHAT_TALK = 0x20;
    public static final byte ICON_SKYPE = 0x21;
    public static final byte ICON_VK = 0x22;
    public static final byte ICON_CIRCLES = 0x23;
    public static final byte ICON_HANGOUTS = 0x24;
    public static final byte ICON_MI = 0x25;

    public static final byte ICON_HIGH_PRIORITY = 0x7;


    public static byte ENDPOINT_DISPLAY = 0x06;

    public static final byte[] DATEFORMAT_DATE_TIME = new byte[] {ENDPOINT_DISPLAY, 0x0a, 0x0, 0x03 };
    public static final byte[] DATEFORMAT_TIME = new byte[] {ENDPOINT_DISPLAY, 0x0a, 0x0, 0x0 };
    public static final byte[] DATEFORMAT_TIME_12_HOURS = new byte[] {ENDPOINT_DISPLAY, 0x02, 0x0, 0x0 };
    public static final byte[] DATEFORMAT_TIME_24_HOURS = new byte[] {ENDPOINT_DISPLAY, 0x02, 0x0, 0x1 };
    public static final byte[] COMMAND_ENABLE_DISPLAY_ON_LIFT_WRIST = new byte[]{ENDPOINT_DISPLAY, 0x05, 0x00, 0x01};
    public static final byte[] COMMAND_DISABLE_DISPLAY_ON_LIFT_WRIST = new byte[]{ENDPOINT_DISPLAY, 0x05, 0x00, 0x00};
    public static final byte[] DISPLAY_XXX = new byte[] {ENDPOINT_DISPLAY, 0x03, 0x0, 0x0 };
    public static final byte[] DISPLAY_YYY = new byte[] {ENDPOINT_DISPLAY, 0x10, 0x0, 0x1, 0x1 };

    public static final byte RESPONSE = 0x10;

    public static final byte SUCCESS = 0x01;
    public static final byte COMMAND_ACTIVITY_DATA_START_DATE = 0x01;
    public static final byte COMMAND_ACTIVITY_DATA_XXX_DATE = 0x02; // issued on first connect, followd by COMMAND_XXXX_ACTIVITY_DATA instead of COMMAND_FETCH_ACTIVITY_DATA

    public static final byte COMMAND_FIRMWARE_INIT = 0x01; // to UUID_CHARACTERISTIC_FIRMWARE, followed by fw file size in bytes
    public static final byte COMMAND_FIRMWARE_START_DATA = 0x03; // to UUID_CHARACTERISTIC_FIRMWARE
    public static final byte COMMAND_FIRMWARE_UPDATE_SYNC = 0x00; // to UUID_CHARACTERISTIC_FIRMWARE
    public static final byte COMMAND_FIRMWARE_CHECKSUM = 0x04; // to UUID_CHARACTERISTIC_FIRMWARE
    public static final byte COMMAND_FIRMWARE_REBOOT = 0x05; // to UUID_CHARACTERISTIC_FIRMWARE

    public static final byte[] RESPONSE_FINISH_SUCCESS = new byte[] {RESPONSE, 2, SUCCESS };
    public static final byte[] RESPONSE_FIRMWARE_DATA_SUCCESS = new byte[] {RESPONSE, COMMAND_FIRMWARE_START_DATA, SUCCESS };
    /**
     * Received in response to any dateformat configuration request (byte 0 in the byte[] value.
     */
    public static final byte[] RESPONSE_DATEFORMAT_SUCCESS = new byte[] { RESPONSE, ENDPOINT_DISPLAY, 0x0a, 0x0, 0x01 };
    public static final byte[] RESPONSE_ACTIVITY_DATA_START_DATE_SUCCESS = new byte[] { RESPONSE, COMMAND_ACTIVITY_DATA_START_DATE, SUCCESS};

    public static final byte[] WEAR_LOCATION_LEFT_WRIST = new byte[] { 0x20, 0x00, 0x00, 0x02 };
    public static final byte[] WEAR_LOCATION_RIGHT_WRIST = new byte[] { 0x20, 0x00, 0x00, (byte) 0x82};

    public static final byte[] COMMAND_ENABLE_HR_SLEEP_MEASUREMENT = new byte[]{0x15, 0x00, 0x01};
    public static final byte[] COMMAND_DISABLE_HR_SLEEP_MEASUREMENT = new byte[]{0x15, 0x00, 0x00};

    public static final byte[] COMMAND_TEXT_NOTIFICATION = new byte[] {0x05, 0x01};


    static {
        MIBAND_DEBUG = new HashMap<>();
        MIBAND_DEBUG.put(UUID_SERVICE_MIBAND_SERVICE, "MiBand Service");
        MIBAND_DEBUG.put(UUID_SERVICE_HEART_RATE, "MiBand HR Service");

        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_DEVICE_INFO, "Device Info");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_DEVICE_NAME, "Device Name");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_NOTIFICATION, "Notification");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_USER_INFO, "User Info");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_CONTROL_POINT, "Control Point");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_REALTIME_STEPS, "Realtime Steps");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_ACTIVITY_DATA, "Activity Data");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_FIRMWARE_DATA, "Firmware Data");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_LE_PARAMS, "LE Params");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_DATE_TIME, "Date/Time");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_STATISTICS, "Statistics");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_BATTERY, "Battery");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_TEST, "Test");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_SENSOR_DATA, "Sensor Data");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_PAIR, "Pair");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_HEART_RATE_CONTROL_POINT, "Heart Rate Control Point");
        MIBAND_DEBUG.put(UUID_CHARACTERISTIC_HEART_RATE_MEASUREMENT, "Heart Rate Measure");
    }
    
    public static String lookup(UUID uuid, String fallback) {
        String name = MIBAND_DEBUG.get(uuid);
        if (name == null) {
            name = fallback;
        }
        return name;
    }

}
