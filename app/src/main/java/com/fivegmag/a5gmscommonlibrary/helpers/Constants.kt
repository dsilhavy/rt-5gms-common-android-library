/*
License: 5G-MAG Public License (v1.0)
Author: Daniel Silhavy
Copyright: (C) 2023 Fraunhofer FOKUS
For full license terms please see the LICENSE file distributed with this
program. If this file is missing then the license can be retrieved from
https://drive.google.com/file/d/1cinCiA778IErENZ3JN52VFW-1ffHpx7Z/view
*/

package com.fivegmag.a5gmscommonlibrary.helpers

object StatusInformation {
    const val AVERAGE_THROUGHPUT = "AverageThroughput"
    const val BUFFER_LENGTH = "BufferLength"
    const val LIVE_LATENCY = "liveLatency"
}

object PlayerStates {
    const val IDLE = "IDLE"
    const val BUFFERING = "BUFFERING"
    const val ENDED = "ENDED"
    const val READY = "READY"
    const val PLAYING = "PLAYING"
    const val PAUSED = "PAUSED"
    const val UNKNOWN = "UNKNOWN"
}

object SessionHandlerMessageTypes {
    const val STATUS_MESSAGE = 1
    const val START_PLAYBACK_BY_PROVISIONING_ID_MESSAGE = 2
    const val SERVICE_ACCESS_INFORMATION_MESSAGE = 3
    const val REGISTER_CLIENT = 4
    const val UNREGISTER_CLIENT = 5
    const val START_PLAYBACK_BY_MEDIA_PLAYER_ENTRY_MESSAGE = 6
    const val SESSION_HANDLER_TRIGGERS_PLAYBACK = 6
    const val METRIC_REPORTING_MESSAGE = 7
    const val UPDATE_LOOKUP_TABLE = 8
    const val SET_M5_ENDPOINT = 9
    const val START_PLAYBACK_BY_SERVICE_LIST_ENTRY_MESSAGE = 10
}

object SessionHandlerEvents {
    object Notification {
        const val SESSION_HANDLING_ACTIVATED = "SESSION_HANDLING_ACTIVATED"
        const val SESSION_HANDLING_STOPPED = "SESSION_HANDLING_STOPPED"
    }
}

object ContentTypes {
    const val DASH = "application/dash+xml"
    const val HLS = "application/vnd.apple.mpegurl"
}

object UserAgentTokens {
    const val FIVE_G_MS_REL_17_MEDIA_STREAM_HANDLER = "5GMSMediaStreamHandler/17"
    const val FIVE_G_MS_REL_17_MEDIA_SESSION_HANDLER = "5GMSMediaSessionHandler/17"
}