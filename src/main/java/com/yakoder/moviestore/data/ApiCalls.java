// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table(name="api_calls", indexes={@Index(name="apiCallsApiCallsApiIdDtIdx", columnList="api_id,api_call_dt"), @Index(name="apiCallsApiCallsApiIdCntIdx", columnList="api_id,api_call_cnt")})
public class ApiCalls implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4511370680666215975L;

	/** Primary key. */
    protected static final String PK = "apiCallId";

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
    @Column(name="api_call_id", unique=true, nullable=false, precision=10)
    private int apiCallId;
    @Column(name="api_call_dt", nullable=false)
    private LocalDateTime apiCallDt;
    @Column(name="api_call_cnt", nullable=false, precision=10)
    private int apiCallCnt;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_id", nullable=false)
    private Apis apis;

    /** Default constructor. */
    public ApiCalls() {
        super();
    }

    /**
     * Access method for apiCallId.
     *
     * @return the current value of apiCallId
     */
    public int getApiCallId() {
        return apiCallId;
    }

    /**
     * Setter method for apiCallId.
     *
     * @param aApiCallId the new value for apiCallId
     */
    public void setApiCallId(int aApiCallId) {
        apiCallId = aApiCallId;
    }

    /**
     * Access method for apiCallDt.
     *
     * @return the current value of apiCallDt
     */
    public LocalDateTime getApiCallDt() {
        return apiCallDt;
    }

    /**
     * Setter method for apiCallDt.
     *
     * @param aApiCallDt the new value for apiCallDt
     */
    public void setApiCallDt(LocalDateTime aApiCallDt) {
        apiCallDt = aApiCallDt;
    }

    /**
     * Access method for apiCallCnt.
     *
     * @return the current value of apiCallCnt
     */
    public int getApiCallCnt() {
        return apiCallCnt;
    }

    /**
     * Setter method for apiCallCnt.
     *
     * @param aApiCallCnt the new value for apiCallCnt
     */
    public void setApiCallCnt(int aApiCallCnt) {
        apiCallCnt = aApiCallCnt;
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
     * Compares the key for this instance with another ApiCalls.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiCalls and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiCalls)) {
            return false;
        }
        ApiCalls that = (ApiCalls) other;
        if (this.getApiCallId() != that.getApiCallId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiCalls.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiCalls)) return false;
        return this.equalKeys(other) && ((ApiCalls)other).equalKeys(this);
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
        i = getApiCallId();
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
        StringBuffer sb = new StringBuffer("[ApiCalls |");
        sb.append(" apiCallId=").append(getApiCallId());
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
        ret.put("apiCallId", Integer.valueOf(getApiCallId()));
        return ret;
    }

}
