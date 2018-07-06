package ak.dctm.impl;

import ak.dctm.intf.IMySop;
import com.documentum.fc.client.DfDocument;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfDynamicInheritance;

public class MySop extends DfDocument implements IMySop,
        IDfDynamicInheritance
{

    public void save() throws DfException {
        super.save();
    }

    public String getVersion() {
        return null;
    }

    public String getVendorString() {
        return null;
    }

    public boolean isCompatible(String s) {
        return false;
    }

    public boolean supportsFeature(String s) {
        return false;
    }
}