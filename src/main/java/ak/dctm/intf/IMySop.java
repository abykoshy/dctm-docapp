package ak.dctm.intf;

import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfId;
import com.documentum.fc.client.IDfBusinessObject;
/**
 * TBO interface intended to override checkout and save behaviors of
 * IDfDocument. IDfDocument is not extended because only a few of its
 * methods are required IDfBusinessObject is extended to permit calling
 * its methods without casting the TBO instance to IDfBusinessObject
 */
public interface IMySop extends IDfBusinessObject
{
    public boolean isCheckedOut() throws DfException;
    public void checkout() throws DfException;
    public IDfId checkin(boolean fRetainLock, String versionLabels)
            throws DfException;
    public void save() throws DfException;
}