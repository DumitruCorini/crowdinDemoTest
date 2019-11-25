
package org.bonitasoft.web.designer.experimental.widgets;


public class PbContainer {

    private String cssClasses;
    private Boolean hidden = false;
    private String repeatedCollection;

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
     *     The repeatedCollection
     */
    public String getRepeatedCollection() {
        return repeatedCollection;
    }

    /**
     * 
     * @param repeatedCollection
     *     The repeatedCollection
     */
    public void setRepeatedCollection(String repeatedCollection) {
        this.repeatedCollection = repeatedCollection;
    }

}
