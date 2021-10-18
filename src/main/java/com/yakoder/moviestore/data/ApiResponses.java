// Generated with g9.

package com.yakoder.moviestore.data;

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
public class ApiResponses implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8004032466431133118L;

	/** Primary key. */
    protected static final String PK = "apiRespId";

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
    private int apiRespId;
    @Column(name="api_resp_code", nullable=false, precision=10)
    private int apiRespCode;
    @Column(name="api_resp_text", length=255)
    private String apiRespText;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_id", nullable=false)
    private Apis apis;

    /** Default constructor. */
    public ApiResponses() {
        super();
    }

    /**
     * Access method for apiRespId.
     *
     * @return the current value of apiRespId
     */
    public int getApiRespId() {
        return apiRespId;
    }

    /**
     * Setter method for apiRespId.
     *
     * @param aApiRespId the new value for apiRespId
     */
    public void setApiRespId(int aApiRespId) {
        apiRespId = aApiRespId;
    }

    /**
     * Access method for apiRespCode.
     *
     * @return the current value of apiRespCode
     */
    public int getApiRespCode() {
        return apiRespCode;
    }

    /**
     * Setter method for apiRespCode.
     *
     * @param aApiRespCode the new value for apiRespCode
     */
    public void setApiRespCode(int aApiRespCode) {
        apiRespCode = aApiRespCode;
    }

    /**
     * Access method for apiRespText.
     *
     * @return the current value of apiRespText
     */
    public String getApiRespText() {
        return apiRespText;
    }

    /**
     * Setter method for apiRespText.
     *
     * @param aApiRespText the new value for apiRespText
     */
    public void setApiRespText(String aApiRespText) {
        apiRespText = aApiRespText;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Apis getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Apis aApis) {
        apis = aApis;
    }

    /**
     * Gets the group fragment apiId for member apis.
     *
     * @return Current value of the group fragment
     * @see Apis
     */
    public int getApisApiId() {
        return (getApis() == null ? null : getApis().getApiId());
    }

    /**
     * Sets the group fragment apiId from member apis.
     *
     * @param aApiId New value for the group fragment
     * @see Apis
     */
    public void setApisApiId(int aApiId) {
        if (getApis() != null) {
            getApis().setApiId(aApiId);
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
        if (!(other instanceof ApiResponses)) {
            return false;
        }
        ApiResponses that = (ApiResponses) other;
        if (this.getApiRespId() != that.getApiRespId()) {
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
        if (!(other instanceof ApiResponses)) return false;
        return this.equalKeys(other) && ((ApiResponses)other).equalKeys(this);
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
        i = getApiRespId();
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
        sb.append(" apiRespId=").append(getApiRespId());
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
        ret.put("apiRespId", Integer.valueOf(getApiRespId()));
        return ret;
    }

}
