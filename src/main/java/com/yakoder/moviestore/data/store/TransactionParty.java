// Generated with g9.

package com.yakoder.moviestore.data.store;

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
public class TransactionParty implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4098942186992623009L;

	/** Primary key. */
    protected static final String PK = "transactionPartyId";

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
    private int transactionPartyId;
    @Column(name="txn_party_name", nullable=false, length=100)
    private String transactionPartyName;
    @Column(name="txn_party_email", length=255)
    private String transactionPartyEmail;
    @Column(name="txn_party_phone", length=20)
    private String transactionPartyPhone;
    @Column(name="txn_party_addr_1", length=100)
    private String transactionPartyAddr1;
    @Column(name="txn_party_addr_2", length=100)
    private String transactionPartyAddr2;
    @Column(name="txn_party_city", length=100)
    private String transactionPartyCity;
    @Column(name="txn_party_state", length=2)
    private String transactionPartyState;
    @Column(name="txn_party_zip", length=10)
    private String transactionPartyZip;
    @Column(name="txn_party_acct_num", length=100)
    private String transactionPartyAccountNumber;
    @OneToMany(mappedBy="transactionPayee")
    private Set<ReimbursementCheck> reimbursementPayeeChecks;
    @OneToMany(mappedBy="transactionPayor")
    private Set<ReimbursementCheck> reimbursementPayorChecks;
    @OneToMany(mappedBy="transactionPayee")
    private Set<ReimbursementOnline> reimbursementPayeeOnline;
    @OneToMany(mappedBy="transactionPayor")
    private Set<ReimbursementOnline> reimbursementPayorOnline;

    /** Default constructor. */
    public TransactionParty() {
        super();
    }

    /**
     * Access method for transactionPartyId.
     *
     * @return the current value of transactionPartyId
     */
    public int getTransactionPartyId() {
        return transactionPartyId;
    }

    /**
     * Setter method for transactionPartyId.
     *
     * @param aTransactionPartyId the new value for transactionPartyId
     */
    public void setTransactionPartyId(int aTransactionPartyId) {
        transactionPartyId = aTransactionPartyId;
    }

    /**
     * Access method for transactionPartyName.
     *
     * @return the current value of transactionPartyName
     */
    public String getTransactionPartyName() {
        return transactionPartyName;
    }

    /**
     * Setter method for transactionPartyName.
     *
     * @param aTransactionPartyName the new value for transactionPartyName
     */
    public void setTransactionPartyName(String aTransactionPartyName) {
        transactionPartyName = aTransactionPartyName;
    }

    /**
     * Access method for transactionPartyEmail.
     *
     * @return the current value of transactionPartyEmail
     */
    public String getTransactionPartyEmail() {
        return transactionPartyEmail;
    }

    /**
     * Setter method for transactionPartyEmail.
     *
     * @param aTransactionPartyEmail the new value for transactionPartyEmail
     */
    public void setTransactionPartyEmail(String aTransactionPartyEmail) {
        transactionPartyEmail = aTransactionPartyEmail;
    }

    /**
     * Access method for transactionPartyPhone.
     *
     * @return the current value of transactionPartyPhone
     */
    public String getTransactionPartyPhone() {
        return transactionPartyPhone;
    }

    /**
     * Setter method for transactionPartyPhone.
     *
     * @param aTransactionPartyPhone the new value for transactionPartyPhone
     */
    public void setTransactionPartyPhone(String aTransactionPartyPhone) {
        transactionPartyPhone = aTransactionPartyPhone;
    }

    /**
     * Access method for transactionPartyAddr1.
     *
     * @return the current value of transactionPartyAddr1
     */
    public String getTransactionPartyAddr1() {
        return transactionPartyAddr1;
    }

    /**
     * Setter method for transactionPartyAddr1.
     *
     * @param aTransactionPartyAddr1 the new value for transactionPartyAddr1
     */
    public void setTransactionPartyAddr1(String aTransactionPartyAddr1) {
        transactionPartyAddr1 = aTransactionPartyAddr1;
    }

    /**
     * Access method for transactionPartyAddr2.
     *
     * @return the current value of transactionPartyAddr2
     */
    public String getTransactionPartyAddr2() {
        return transactionPartyAddr2;
    }

    /**
     * Setter method for transactionPartyAddr2.
     *
     * @param aTransactionPartyAddr2 the new value for transactionPartyAddr2
     */
    public void setTransactionPartyAddr2(String aTransactionPartyAddr2) {
        transactionPartyAddr2 = aTransactionPartyAddr2;
    }

    /**
     * Access method for transactionPartyCity.
     *
     * @return the current value of transactionPartyCity
     */
    public String getTransactionPartyCity() {
        return transactionPartyCity;
    }

    /**
     * Setter method for transactionPartyCity.
     *
     * @param aTransactionPartyCity the new value for transactionPartyCity
     */
    public void setTransactionPartyCity(String aTransactionPartyCity) {
        transactionPartyCity = aTransactionPartyCity;
    }

    /**
     * Access method for transactionPartyState.
     *
     * @return the current value of transactionPartyState
     */
    public String getTransactionPartyState() {
        return transactionPartyState;
    }

    /**
     * Setter method for transactionPartyState.
     *
     * @param aTransactionPartyState the new value for transactionPartyState
     */
    public void setTransactionPartyState(String aTransactionPartyState) {
        transactionPartyState = aTransactionPartyState;
    }

    /**
     * Access method for transactionPartyZip.
     *
     * @return the current value of transactionPartyZip
     */
    public String getTransactionPartyZip() {
        return transactionPartyZip;
    }

    /**
     * Setter method for transactionPartyZip.
     *
     * @param aTransactionPartyZip the new value for transactionPartyZip
     */
    public void setTransactionPartyZip(String aTransactionPartyZip) {
        transactionPartyZip = aTransactionPartyZip;
    }

    /**
     * Access method for transactionPartyAccountNumber.
     *
     * @return the current value of transactionPartyAccountNumber
     */
    public String getTransactionPartyAccountNumber() {
        return transactionPartyAccountNumber;
    }

    /**
     * Setter method for transactionPartyAccountNumber.
     *
     * @param aTransactionPartyAccountNumber the new value for transactionPartyAccountNumber
     */
    public void setTransactionPartyAccountNumber(String aTransactionPartyAccountNumber) {
        transactionPartyAccountNumber = aTransactionPartyAccountNumber;
    }

    /**
     * Access method for reimbursementPayeeChecks.
     *
     * @return the current value of reimbursementPayeeChecks
     */
    public Set<ReimbursementCheck> getReimbursementPayeeChecks() {
        return reimbursementPayeeChecks;
    }

    /**
     * Setter method for reimbursementPayeeChecks.
     *
     * @param aReimbursementPayeeChecks the new value for reimbursementPayeeChecks
     */
    public void setReimbursementPayeeChecks(Set<ReimbursementCheck> aReimbursementPayeeChecks) {
        reimbursementPayeeChecks = aReimbursementPayeeChecks;
    }

    /**
     * Access method for reimbursementPayorChecks.
     *
     * @return the current value of reimbursementPayorChecks
     */
    public Set<ReimbursementCheck> getReimbursementPayorChecks() {
        return reimbursementPayorChecks;
    }

    /**
     * Setter method for reimbursementPayorChecks.
     *
     * @param aReimbursementPayorChecks the new value for reimbursementPayorChecks
     */
    public void setReimbursementPayorChecks(Set<ReimbursementCheck> aReimbursementPayorChecks) {
        reimbursementPayorChecks = aReimbursementPayorChecks;
    }

    /**
     * Access method for reimbursementPayeeOnline.
     *
     * @return the current value of reimbursementPayeeOnline
     */
    public Set<ReimbursementOnline> getReimbursementPayeeOnline() {
        return reimbursementPayeeOnline;
    }

    /**
     * Setter method for reimbursementPayeeOnline.
     *
     * @param aReimbursementPayeeOnline the new value for reimbursementPayeeOnline
     */
    public void setReimbursementPayeeOnline(Set<ReimbursementOnline> aReimbursementPayeeOnline) {
        reimbursementPayeeOnline = aReimbursementPayeeOnline;
    }

    /**
     * Access method for reimbursementPayorOnline.
     *
     * @return the current value of reimbursementPayorOnline
     */
    public Set<ReimbursementOnline> getReimbursementPayorOnline() {
        return reimbursementPayorOnline;
    }

    /**
     * Setter method for reimbursementPayorOnline.
     *
     * @param aReimbursementPayorOnline the new value for reimbursementPayorOnline
     */
    public void setReimbursementPayorOnline(Set<ReimbursementOnline> aReimbursementPayorOnline) {
        reimbursementPayorOnline = aReimbursementPayorOnline;
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
        if (!(other instanceof TransactionParty)) {
            return false;
        }
        TransactionParty that = (TransactionParty) other;
        if (this.getTransactionPartyId() != that.getTransactionPartyId()) {
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
        if (!(other instanceof TransactionParty)) return false;
        return this.equalKeys(other) && ((TransactionParty)other).equalKeys(this);
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
        i = getTransactionPartyId();
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
        sb.append(" transactionPartyId=").append(getTransactionPartyId());
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
        ret.put("transactionPartyId", Integer.valueOf(getTransactionPartyId()));
        return ret;
    }

}
