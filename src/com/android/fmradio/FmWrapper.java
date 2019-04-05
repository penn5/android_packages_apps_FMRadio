/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.fmradio;

import android.os.SystemProperties;

/**
 * This class define FM native interface, will description FM native interface
 */
public class FmNative {

    private int HARDWARE_TYPE_JNI = 0;
    private int HARDWARE_TYPE_HISI = 1;
    private int MODE = SystemProperties.getInt(HARDWARE_TYPE_PROP, HARDWARE_TYPE_JNI);

    /**
     * Open FM device, call before power up
     *
     * @return (true,success; false, failed)
     */
    static boolean openDev() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.openDev();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Close FM device, call after power down
     *
     * @return (true, success; false, failed)
     */
    static boolean closeDev() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.closeDev();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * power up FM with frequency use long antenna
     *
     * @param frequency frequency(50KHZ, 87.55; 100KHZ, 87.5)
     *
     * @return (true, success; false, failed)
     */
    static boolean powerUp(float frequency) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.powerUp(frequency);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Power down FM
     *
     * @param type (0, FMRadio; 1, FMTransimitter)
     *
     * @return (true, success; false, failed)
     */
    static boolean powerDown(int type) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.powerDown(type);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * tune to frequency
     *
     * @param frequency frequency(50KHZ, 87.55; 100KHZ, 87.5)
     *
     * @return (true, success; false, failed)
     */
    static boolean tune(float frequency) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.tune(frequency);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * seek with frequency in direction
     *
     * @param frequency frequency(50KHZ, 87.55; 100KHZ, 87.5)
     * @param isUp (true, next station; false previous station)
     *
     * @return frequency(float)
     */
    static float seek(float frequency, boolean isUp) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.seek(frequency, isUp);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Auto scan(from 87.50-108.00)
     *
     * @return The scan station array(short)
     */
    static short[] autoScan() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.autoScan();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Stop scan, also can stop seek, other native when scan should call stop
     * scan first, else will execute wait auto scan finish
     *
     * @return (true, can stop scan process; false, can't stop scan process)
     */
    static boolean stopScan() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.stopScan();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Open or close rds fuction
     *
     * @param rdson The rdson (true, open; false, close)
     *
     * @return rdsset
     */
    static int setRds(boolean rdsOn) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.setRds(rdsOn);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Read rds events
     *
     * @return rds event type
     */
    static short readRds() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.readRds();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Get program service(program name)
     *
     * @return The program name
     */
    static byte[] getPs() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.getPs();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Get radio text, RDS standard does not support Chinese character
     *
     * @return The LRT (Last Radio Text) bytes
     */
    static byte[] getLrText() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.getLrText();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Active alternative frequencies
     *
     * @return The frequency(float)
     */
    static short activeAf() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.activeAf();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Mute or unmute FM voice
     *
     * @param mute (true, mute; false, unmute)
     *
     * @return (true, success; false, failed)
     */
    static int setMute(boolean mute) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.setMute(mute);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Inquiry if RDS is support in driver
     *
     * @return (1, support; 0, NOT support; -1, error)
     */
    static int isRdsSupport() {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.isRdsSupport();
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }

    /**
     * Switch antenna
     *
     * @param antenna antenna (0, long antenna, 1 short antenna)
     *
     * @return (0, success; 1 failed; 2 not support)
     */
    static int switchAntenna(int antenna) {
        switch (MODE) {
        case HARDWARE_TYPE_JNI:
            FmNative.switchAntenna(antenna);
            break;
        case HARDWARE_TYPE_HISI:
            
            break;
        }
    }
}
