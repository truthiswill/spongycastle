package org.spongycastle.kmip.wire;

import java.io.IOException;

public interface KMIPEncoder
{
    void output(KMIPEncodable item) throws IOException;
}
