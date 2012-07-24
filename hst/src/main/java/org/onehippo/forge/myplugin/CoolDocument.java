package org.onehippo.forge.myplugin;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="myplugin:cooldocument")
public class CoolDocument extends BaseDocument{
    
    public HippoHtml getCoolHtml(){
        return getHippoHtml("myplugin:body");
    }

    public String getCoolSummary() {
        return getProperty("myplugin:summary");
    }
 
    public String getCoolTitle() {
        return getProperty("myplugin:title");
    }
}
