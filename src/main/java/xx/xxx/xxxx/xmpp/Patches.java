package xx.xxx.xxxx.xmpp;


import java.util.Arrays;
import java.util.List;

public class Patches {
    public static final List<String> DISCO_EXCEPTIONS = Arrays.asList(
            "nimbuzz.com"
    );
    public static final List<XmppConnection.Identity> SUFFICIENT_PUSH = Arrays.asList(
            XmppConnection.Identity.EJABBERD
    );
    public static final List<XmppConnection.Identity> BAD_MUC_REFLECTION = Arrays.asList(
            XmppConnection.Identity.SLACK
    );
}
