
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbTabsContainer {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean vertical = false;
    private PbTabsContainer.Type type = PbTabsContainer.Type.fromValue("tabs");

    /**
     * 
     * @return
     *     The cssClasses
     */
    public String getCssClasses() {
        return cssClasses;
    }

    /**
     * 
     * @param cssClasses
     *     The cssClasses
     */
    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The vertical
     */
    public Boolean getVertical() {
        return vertical;
    }

    /**
     * 
     * @param vertical
     *     The vertical
     */
    public void setVertical(Boolean vertical) {
        this.vertical = vertical;
    }

    /**
     * 
     * @return
     *     The type
     */
    public PbTabsContainer.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(PbTabsContainer.Type type) {
        this.type = type;
    }

    public enum Type {

        TABS("tabs"),
        PILLS("pills");
        private final String value;
        private final static Map<String, PbTabsContainer.Type> CONSTANTS = new HashMap<String, PbTabsContainer.Type>();

        static {
            for (PbTabsContainer.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbTabsContainer.Type fromValue(String value) {
            PbTabsContainer.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
