package cz.msebera.android.httpclient.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

@Deprecated
public interface HostNameResolver {
   InetAddress resolve(String var1) throws IOException;
}
