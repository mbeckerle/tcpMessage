## DFDL Schema: tcpMessage - simple length header for messages on byte streams

TCP streams have no notion of datagrams. 

This schema provides the minimal notion of a datagram, just a length field (32-bits) followed by data of that length.

The maximum message length is 65535, but can be adjusted upward. 