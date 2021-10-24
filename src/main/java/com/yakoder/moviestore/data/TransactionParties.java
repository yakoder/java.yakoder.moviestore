// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="txn_parties")
public class TransactionParties implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4098942186992623009L;

	/** Primary key. */
    protected static final String PK = "txnPartyId";

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
    @Column(name="txn_party_id", unique=true, nullable=false, precision=10)
    private int txnPartyId;
    @Column(name="txn_party_name", nullable=false, length=100)
    private String txnPartyName;
    @Column(name="txn_party_email", length=255)
    private String txnPartyEmail;
    @Column(name="txn_party_phone", length=20)
    private String txnPartyPhone;
    @Column(name="txn_party_addr_1", length=100)
    private String txnPartyAddr1;
    @Column(name="txn_party_addr_2", length=100)
    private String txnPartyAddr2;
    @Column(name="txn_party_city", length=100)
    private String txnPartyCity;
    @Column(name="txn_party_state", length=2)
    private String txnPartyState;
    @Column(name="txn_party_zip", length=10)
    private String txnPartyZip;
    @Column(name="txn_party_acct_num", length=100)
    private String txnPartyAcctNum;
    @OneToMany(mappedBy="txnParties2")
    private Set<ReimbChecks> reimbChecks2;
    @OneToMany(mappedBy="txnParties")
    private Set<ReimbChecks> reimbChecks;
    @OneToMany(mappedBy="txnParties2")
    private Set<ReimbOnline> reimbOnline2;
    @OneToMany(mappedBy="txnParties")
    private Set<ReimbOnline> reimbOnline;

    /** Default constructor. */
    public TransactionParties() {
        super();
    }

    /**
     * Access method for txnPartyId.
     *
     * @return the current value of txnPartyId
     */
    public int getTxnPartyId() {
        return txnPartyId;
    }

    /**
     * Setter method for txnPartyId.
     *
     * @param aTxnPartyId the new value for txnPartyId
     */
    public void setTxnPartyId(int aTxnPartyId) {
        txnPartyId = aTxnPartyId;
    }

    /**
     * Access method for txnPartyName.
     *
     * @return the current value of txnPartyName
     */
    public String getTxnPartyName() {
        return txnPartyName;
    }

    /**
     * Setter method for txnPartyName.
     *
     * @param aTxnPartyName the new value for txnPartyName
     */
    public void setTxnPartyName(String aTxnPartyName) {
        txnPartyName = aTxnPartyName;
    }

    /**
     * Access method for txnPartyEmail.
     *
     * @return the current value of txnPartyEmail
     */
    public String getTxnPartyEmail() {
        return txnPartyEmail;
    }

    /**
     * Setter method for txnPartyEmail.
     *
     * @param aTxnPartyEmail the new value for txnPartyEmail
     */
    public void setTxnPartyEmail(String aTxnPartyEmail) {
        txnPartyEmail = aTxnPartyEmail;
    }

    /**
     * Access method for txnPartyPhone.
     *
     * @return the current value of txnPartyPhone
     */
    public String getTxnPartyPhone() {
        return txnPartyPhone;
    }

    /**
     * Setter method for txnPartyPhone.
     *
     * @param aTxnPartyPhone the new value for txnPartyPhone
     */
    public void setTxnPartyPhone(String aTxnPartyPhone) {
        txnPartyPhone = aTxnPartyPhone;
    }

    /**
     * Access method for txnPartyAddr1.
     *
     * @return the current value of txnPartyAddr1
     */
    public String getTxnPartyAddr1() {
        return txnPartyAddr1;
    }

    /**
     * Setter method for txnPartyAddr1.
     *
     * @param aTxnPartyAddr1 the new value for txnPartyAddr1
     */
    public void setTxnPartyAddr1(String aTxnPartyAddr1) {
        txnPartyAddr1 = aTxnPartyAddr1;
    }

    /**
     * Access method for txnPartyAddr2.
     *
     * @return the current value of txnPartyAddr2
     */
    public String getTxnPartyAddr2() {
        return txnPartyAddr2;
    }

    /**
     * Setter method for txnPartyAddr2.
     *
     * @param aTxnPartyAddr2 the new value for txnPartyAddr2
     */
    public void setTxnPartyAddr2(String aTxnPartyAddr2) {
        txnPartyAddr2 = aTxnPartyAddr2;
    }

    /**
     * Access method for txnPartyCity.
     *
     * @return the current value of txnPartyCity
     */
    public String getTxnPartyCity() {
        return txnPartyCity;
    }

    /**
     * Setter method for txnPartyCity.
     *
     * @param aTxnPartyCity the new value for txnPartyCity
     */
    public void setTxnPartyCity(String aTxnPartyCity) {
        txnPartyCity = aTxnPartyCity;
    }

    /**
     * Access method for txnPartyState.
     *
     * @return the current value of txnPartyState
     */
    public String getTxnPartyState() {
        return txnPartyState;
    }

    /**
     * Setter method for txnPartyState.
     *
     * @param aTxnPartyState the new value for txnPartyState
     */
    public void setTxnPartyState(String aTxnPartyState) {
        txnPartyState = aTxnPartyState;
    }

    /**
     * Access method for txnPartyZip.
     *
     * @return the current value of txnPartyZip
     */
    public String getTxnPartyZip() {
        return txnPartyZip;
    }

    /**
     * Setter method for txnPartyZip.
     *
     * @param aTxnPartyZip the new value for txnPartyZip
     */
    public void setTxnPartyZip(String aTxnPartyZip) {
        txnPartyZip = aTxnPartyZip;
    }

    /**
     * Access method for txnPartyAcctNum.
     *
     * @return the current value of txnPartyAcctNum
     */
    public String getTxnPartyAcctNum() {
        return txnPartyAcctNum;
    }

    /**
     * Setter method for txnPartyAcctNum.
     *
     * @param aTxnPartyAcctNum the new value for txnPartyAcctNum
     */
    public void setTxnPartyAcctNum(String aTxnPartyAcctNum) {
        txnPartyAcctNum = aTxnPartyAcctNum;
    }

    /**
     * Access method for reimbChecks2.
     *
     * @return the current value of reimbChecks2
     */
    public Set<ReimbChecks> getReimbChecks2() {
        return reimbChecks2;
    }

    /**
     * Setter method for reimbChecks2.
     *
     * @param aReimbChecks2 the new value for reimbChecks2
     */
    public void setReimbChecks2(Set<ReimbChecks> aReimbChecks2) {
        reimbChecks2 = aReimbChecks2;
    }

    /**
     * Access method for reimbChecks.
     *
     * @return the current value of reimbChecks
     */
    public Set<ReimbChecks> getReimbChecks() {
        return reimbChecks;
    }

    /**
     * Setter method for reimbChecks.
     *
     * @param aReimbChecks the new value for reimbChecks
     */
    public void setReimbChecks(Set<ReimbChecks> aReimbChecks) {
        reimbChecks = aReimbChecks;
    }

    /**
     * Access method for reimbOnline2.
     *
     * @return the current value of reimbOnline2
     */
    public Set<ReimbOnline> getReimbOnline2() {
        return reimbOnline2;
    }

    /**
     * Setter method for reimbOnline2.
     *
     * @param aReimbOnline2 the new value for reimbOnline2
     */
    public void setReimbOnline2(Set<ReimbOnline> aReimbOnline2) {
        reimbOnline2 = aReimbOnline2;
    }

    /**
     * Access method for reimbOnline.
     *
     * @return the current value of reimbOnline
     */
    public Set<ReimbOnline> getReimbOnline() {
        return reimbOnline;
    }

    /**
     * Setter method for reimbOnline.
     *
     * @param aReimbOnline the new value for reimbOnline
     */
    public void setReimbOnline(Set<ReimbOnline> aReimbOnline) {
        reimbOnline = aReimbOnline;
    }

    /**
     * Compares the key for this instance with another TransactionParties.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TransactionParties and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TransactionParties)) {
            return false;
        }
        TransactionParties that = (TransactionParties) other;
        if (this.getTxnPartyId() != that.getTxnPartyId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TransactionParties.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TransactionParties)) return false;
        return this.equalKeys(other) && ((TransactionParties)other).equalKeys(this);
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
        i = getTxnPartyId();
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
        StringBuffer sb = new StringBuffer("[TransactionParties |");
        sb.append(" txnPartyId=").append(getTxnPartyId());
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
        ret.put("txnPartyId", Integer.valueOf(getTxnPartyId()));
        return ret;
    }

}
