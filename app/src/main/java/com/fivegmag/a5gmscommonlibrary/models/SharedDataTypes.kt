/*
License: 5G-MAG Public License (v1.0)
Author: Daniel Silhavy
Copyright: (C) 2023 Fraunhofer FOKUS
For full license terms please see the LICENSE file distributed with this
program. If this file is missing then the license can be retrieved from
https://drive.google.com/file/d/1cinCiA778IErENZ3JN52VFW-1ffHpx7Z/view
*/

package com.fivegmag.a5gmscommonlibrary.models

data class TypedLocation(
    val locationIdentifierType: String,
    val location: String
)

data class EndpointAddress(
    val ipv4Addr: String? = null,
    val ipv6Addr: String? = null,
    val portNumber: UInt
)