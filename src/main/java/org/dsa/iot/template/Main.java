package org.dsa.iot.template;

import org.dsa.iot.dslink.DSLink;
import org.dsa.iot.dslink.DSLinkFactory;
import org.dsa.iot.dslink.DSLinkHandler;
import org.dsa.iot.dslink.node.Node;
import org.dsa.iot.dslink.node.value.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Logan Gorence
 */
public class Main extends DSLinkHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        DSLinkFactory.startResponder("Template", args, new Main());
    }

    @Override
    public void onResponderConnected(DSLink link) {
        LOGGER.info("Connected");

        Node superRoot = link.getNodeManager().getSuperRoot();
        Node example = superRoot.createChild("ExampleNode").build();
        Value exampleNodeValue = new Value("Hello World!");
        example.setValueType(exampleNodeValue.getType());
        example.setValue(exampleNodeValue);
    }
}
