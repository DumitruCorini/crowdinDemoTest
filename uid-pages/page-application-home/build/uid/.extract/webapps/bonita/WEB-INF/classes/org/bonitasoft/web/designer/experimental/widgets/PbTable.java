
package org.bonitasoft.web.designer.experimental.widgets;


public class PbTable {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean allowHTML = true;
    private String headers = "";
    private String content;
    private String columnsKey;
    private String selectedRow;
    private Boolean striped = true;
    private Boolean condensed = false;
    private Boolean bordered = false;

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
     *     The allowHTML
     */
    public Boolean getAllowHTML() {
        return allowHTML;
    }

    /**
     * 
     * @param allowHTML
     *     The allowHTML
     */
    public void setAllowHTML(Boolean allowHTML) {
        this.allowHTML = allowHTML;
    }

    /**
     * 
     * @return
     *     The headers
     */
    public String getHeaders() {
        return headers;
    }

    /**
     * 
     * @param headers
     *     The headers
     */
    public void setHeaders(String headers) {
        this.headers = headers;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The columnsKey
     */
    public String getColumnsKey() {
        return columnsKey;
    }

    /**
     * 
     * @param columnsKey
     *     The columnsKey
     */
    public void setColumnsKey(String columnsKey) {
        this.columnsKey = columnsKey;
    }

    /**
     * 
     * @return
     *     The selectedRow
     */
    public String getSelectedRow() {
        return selectedRow;
    }

    /**
     * 
     * @param selectedRow
     *     The selectedRow
     */
    public void setSelectedRow(String selectedRow) {
        this.selectedRow = selectedRow;
    }

    /**
     * 
     * @return
     *     The striped
     */
    public Boolean getStriped() {
        return striped;
    }

    /**
     * 
     * @param striped
     *     The striped
     */
    public void setStriped(Boolean striped) {
        this.striped = striped;
    }

    /**
     * 
     * @return
     *     The condensed
     */
    public Boolean getCondensed() {
        return condensed;
    }

    /**
     * 
     * @param condensed
     *     The condensed
     */
    public void setCondensed(Boolean condensed) {
        this.condensed = condensed;
    }

    /**
     * 
     * @return
     *     The bordered
     */
    public Boolean getBordered() {
        return bordered;
    }

    /**
     * 
     * @param bordered
     *     The bordered
     */
    public void setBordered(Boolean bordered) {
        this.bordered = bordered;
    }

}
