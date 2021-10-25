// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="api_responses", indexes={@Index(name="apiResponsesApiResponsesApiIdCodeIdx", columnList="api_id,api_resp_code"), @Index(name="apiResponsesApiResponsesApiIdTextIdx", columnList="api_id,api_resp_text")})
public class ApiResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8004032466431133118L;

	/** Primary key. */
    protected static final String PK = "apiResponseId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="api_resp_id", unique=true, nullable=false, precision=10)
    private int apiResponseId;
    @Column(name="api_resp_code", nullable=false, precision=10)
    private int apiResponseCode;
    @Column(name="api_resp_text", length=255)
    private String apiResponseText;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_id", nullable=false)
    private Api apis;

    /** Default constructor. */
    public ApiResponse() {
        super();
    }

    /**
     * Access method for apiResponseId.
     *
     * @return the current value of apiResponseId
     */
    public int getApiResponseId() {
        return apiResponseId;
    }

    /**
     * Setter method for apiResponseId.
     *
     * @param aApiResponseId the new value for apiResponseId
     */
    public void setApiResponseId(int aApiResponseId) {
        apiResponseId = aApiResponseId;
    }

    /**
     * Access method for apiResponseCode.
     *
     * @return the current value of apiResponseCode
     */
    public int getApiResponseCode() {
        return apiResponseCode;
    }

    /**
     * Setter method for apiResponseCode.
     *
     * @param aApiResponseCode the new value for apiResponseCode
     */
    public void setApiResponseCode(int aApiResponseCode) {
        apiResponseCode = aApiResponseCode;
    }

    /**
     * Access method for apiResponseText.
     *
     * @return the current value of apiResponseText
     */
    public String getApiResponseText() {
        return apiResponseText;
    }

    /**
     * Setter method for apiResponseText.
     *
     * @param aApiResponseText the new value for apiResponseText
     */
    public void setApiResponseText(String aApiResponseText) {
        apiResponseText = aApiResponseText;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Api getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Api aApis) {
        apis = aApis;
    }

    /**
     * Gets the group fragment apiId for member apis.
     *
     * @return Current value of the group fragment
     * @see Api
     */
    public int getApisApiId() {
        return (getApis() == null ? null : getApis().getId());
    }

    /**
     * Sets the group fragment apiId from member apis.
     *
     * @param aApiId New value for the group fragment
     * @see Api
     */
    public void setApisApiId(int aApiId) {
        if (getApis() != null) {
            getApis().setId(aApiId);
        }
    }

    /**
     * Compares the key for this instance with another ApiResponses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiResponses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiResponse)) {
            return false;
        }
        ApiResponse that = (ApiResponse) other;
        if (this.getApiResponseId() != that.getApiResponseId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiResponses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiResponse)) return false;
        return this.equalKeys(other) && ((ApiResponse)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getApiResponseId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ApiResponses |");
        sb.append(" apiResponseId=").append(getApiResponseId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("apiResponseId", Integer.valueOf(getApiResponseId()));
        return ret;
    }

}
