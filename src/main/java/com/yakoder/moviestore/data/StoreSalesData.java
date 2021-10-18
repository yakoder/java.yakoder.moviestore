// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="store_sales_data")
public class StoreSalesData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1968780103285003636L;

	/** Primary key. */
    protected static final String PK = "saleDataId";

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
    @Column(name="sale_data_id", unique=true, nullable=false, precision=10)
    private int saleDataId;
    @Column(name="import_dt", nullable=false)
    private LocalDateTime importDt;
    @Column(name="order_date", nullable=false)
    private LocalDate orderDate;
    @Column(name="store_order_num", nullable=false, length=100)
    private String storeOrderNum;
    @Column(name="dvd_num", precision=10)
    private int dvdNum;
    @Column(name="ext_type_name", length=100)
    private String extTypeName;
    @Column(name="cust_email", nullable=false, length=255)
    private String custEmail;
    @Column(name="cust_name_first", length=100)
    private String custNameFirst;
    @Column(name="cust_name_last", length=100)
    private String custNameLast;
    @Column(name="cust_addr_1", length=100)
    private String custAddr1;
    @Column(name="cust_addr_2", length=100)
    private String custAddr2;
    @Column(name="cust_city", length=100)
    private String custCity;
    @Column(name="cust_state", length=2)
    private String custState;
    @Column(name="cust_zip", length=10)
    private String custZip;
    @Column(name="cust_country", length=2)
    private String custCountry;
    @Column(name="store_movie_num", precision=10)
    private int storeMovieNum;
    @Column(length=255)
    private String title;
    @Column(length=255)
    private String studio;
    @Column(name="cond_name", length=50)
    private String condName;
    @Column(precision=10)
    private int quantity;
    @Column(name="price_paid", precision=15, scale=2)
    private BigDecimal pricePaid;
    @Column(name="shipping_credit", precision=15, scale=2)
    private BigDecimal shippingCredit;
    @Column(name="store_fees", precision=15, scale=2)
    private BigDecimal storeFees;
    @Column(name="total_due", precision=15, scale=2)
    private BigDecimal totalDue;
    @Column(name="store_ship_code", length=1)
    private String storeShipCode;
    @Column(name="cust_verified", nullable=false, length=3)
    private boolean custVerified;
    @Column(name="movie_verified", nullable=false, length=3)
    private boolean movieVerified;
    @Column(name="price_verified", nullable=false, length=3)
    private boolean priceVerified;
    @Column(name="credit_verified", nullable=false, length=3)
    private boolean creditVerified;
    @Column(name="total_verified", nullable=false, length=3)
    private boolean totalVerified;
    @Column(name="order_verified", nullable=false, length=3)
    private boolean orderVerified;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_site_id", nullable=false)
    private StoreSites storeSites;

    /** Default constructor. */
    public StoreSalesData() {
        super();
    }

    /**
     * Access method for saleDataId.
     *
     * @return the current value of saleDataId
     */
    public int getSaleDataId() {
        return saleDataId;
    }

    /**
     * Setter method for saleDataId.
     *
     * @param aSaleDataId the new value for saleDataId
     */
    public void setSaleDataId(int aSaleDataId) {
        saleDataId = aSaleDataId;
    }

    /**
     * Access method for importDt.
     *
     * @return the current value of importDt
     */
    public LocalDateTime getImportDt() {
        return importDt;
    }

    /**
     * Setter method for importDt.
     *
     * @param aImportDt the new value for importDt
     */
    public void setImportDt(LocalDateTime aImportDt) {
        importDt = aImportDt;
    }

    /**
     * Access method for orderDate.
     *
     * @return the current value of orderDate
     */
    public LocalDate getOrderDate() {
        return orderDate;
    }

    /**
     * Setter method for orderDate.
     *
     * @param aOrderDate the new value for orderDate
     */
    public void setOrderDate(LocalDate aOrderDate) {
        orderDate = aOrderDate;
    }

    /**
     * Access method for storeOrderNum.
     *
     * @return the current value of storeOrderNum
     */
    public String getStoreOrderNum() {
        return storeOrderNum;
    }

    /**
     * Setter method for storeOrderNum.
     *
     * @param aStoreOrderNum the new value for storeOrderNum
     */
    public void setStoreOrderNum(String aStoreOrderNum) {
        storeOrderNum = aStoreOrderNum;
    }

    /**
     * Access method for dvdNum.
     *
     * @return the current value of dvdNum
     */
    public int getDvdNum() {
        return dvdNum;
    }

    /**
     * Setter method for dvdNum.
     *
     * @param aDvdNum the new value for dvdNum
     */
    public void setDvdNum(int aDvdNum) {
        dvdNum = aDvdNum;
    }

    /**
     * Access method for extTypeName.
     *
     * @return the current value of extTypeName
     */
    public String getExtTypeName() {
        return extTypeName;
    }

    /**
     * Setter method for extTypeName.
     *
     * @param aExtTypeName the new value for extTypeName
     */
    public void setExtTypeName(String aExtTypeName) {
        extTypeName = aExtTypeName;
    }

    /**
     * Access method for custEmail.
     *
     * @return the current value of custEmail
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * Setter method for custEmail.
     *
     * @param aCustEmail the new value for custEmail
     */
    public void setCustEmail(String aCustEmail) {
        custEmail = aCustEmail;
    }

    /**
     * Access method for custNameFirst.
     *
     * @return the current value of custNameFirst
     */
    public String getCustNameFirst() {
        return custNameFirst;
    }

    /**
     * Setter method for custNameFirst.
     *
     * @param aCustNameFirst the new value for custNameFirst
     */
    public void setCustNameFirst(String aCustNameFirst) {
        custNameFirst = aCustNameFirst;
    }

    /**
     * Access method for custNameLast.
     *
     * @return the current value of custNameLast
     */
    public String getCustNameLast() {
        return custNameLast;
    }

    /**
     * Setter method for custNameLast.
     *
     * @param aCustNameLast the new value for custNameLast
     */
    public void setCustNameLast(String aCustNameLast) {
        custNameLast = aCustNameLast;
    }

    /**
     * Access method for custAddr1.
     *
     * @return the current value of custAddr1
     */
    public String getCustAddr1() {
        return custAddr1;
    }

    /**
     * Setter method for custAddr1.
     *
     * @param aCustAddr1 the new value for custAddr1
     */
    public void setCustAddr1(String aCustAddr1) {
        custAddr1 = aCustAddr1;
    }

    /**
     * Access method for custAddr2.
     *
     * @return the current value of custAddr2
     */
    public String getCustAddr2() {
        return custAddr2;
    }

    /**
     * Setter method for custAddr2.
     *
     * @param aCustAddr2 the new value for custAddr2
     */
    public void setCustAddr2(String aCustAddr2) {
        custAddr2 = aCustAddr2;
    }

    /**
     * Access method for custCity.
     *
     * @return the current value of custCity
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * Setter method for custCity.
     *
     * @param aCustCity the new value for custCity
     */
    public void setCustCity(String aCustCity) {
        custCity = aCustCity;
    }

    /**
     * Access method for custState.
     *
     * @return the current value of custState
     */
    public String getCustState() {
        return custState;
    }

    /**
     * Setter method for custState.
     *
     * @param aCustState the new value for custState
     */
    public void setCustState(String aCustState) {
        custState = aCustState;
    }

    /**
     * Access method for custZip.
     *
     * @return the current value of custZip
     */
    public String getCustZip() {
        return custZip;
    }

    /**
     * Setter method for custZip.
     *
     * @param aCustZip the new value for custZip
     */
    public void setCustZip(String aCustZip) {
        custZip = aCustZip;
    }

    /**
     * Access method for custCountry.
     *
     * @return the current value of custCountry
     */
    public String getCustCountry() {
        return custCountry;
    }

    /**
     * Setter method for custCountry.
     *
     * @param aCustCountry the new value for custCountry
     */
    public void setCustCountry(String aCustCountry) {
        custCountry = aCustCountry;
    }

    /**
     * Access method for storeMovieNum.
     *
     * @return the current value of storeMovieNum
     */
    public int getStoreMovieNum() {
        return storeMovieNum;
    }

    /**
     * Setter method for storeMovieNum.
     *
     * @param aStoreMovieNum the new value for storeMovieNum
     */
    public void setStoreMovieNum(int aStoreMovieNum) {
        storeMovieNum = aStoreMovieNum;
    }

    /**
     * Access method for title.
     *
     * @return the current value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for title.
     *
     * @param aTitle the new value for title
     */
    public void setTitle(String aTitle) {
        title = aTitle;
    }

    /**
     * Access method for studio.
     *
     * @return the current value of studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Setter method for studio.
     *
     * @param aStudio the new value for studio
     */
    public void setStudio(String aStudio) {
        studio = aStudio;
    }

    /**
     * Access method for condName.
     *
     * @return the current value of condName
     */
    public String getCondName() {
        return condName;
    }

    /**
     * Setter method for condName.
     *
     * @param aCondName the new value for condName
     */
    public void setCondName(String aCondName) {
        condName = aCondName;
    }

    /**
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * Access method for pricePaid.
     *
     * @return the current value of pricePaid
     */
    public BigDecimal getPricePaid() {
        return pricePaid;
    }

    /**
     * Setter method for pricePaid.
     *
     * @param aPricePaid the new value for pricePaid
     */
    public void setPricePaid(BigDecimal aPricePaid) {
        pricePaid = aPricePaid;
    }

    /**
     * Access method for shippingCredit.
     *
     * @return the current value of shippingCredit
     */
    public BigDecimal getShippingCredit() {
        return shippingCredit;
    }

    /**
     * Setter method for shippingCredit.
     *
     * @param aShippingCredit the new value for shippingCredit
     */
    public void setShippingCredit(BigDecimal aShippingCredit) {
        shippingCredit = aShippingCredit;
    }

    /**
     * Access method for storeFees.
     *
     * @return the current value of storeFees
     */
    public BigDecimal getStoreFees() {
        return storeFees;
    }

    /**
     * Setter method for storeFees.
     *
     * @param aStoreFees the new value for storeFees
     */
    public void setStoreFees(BigDecimal aStoreFees) {
        storeFees = aStoreFees;
    }

    /**
     * Access method for totalDue.
     *
     * @return the current value of totalDue
     */
    public BigDecimal getTotalDue() {
        return totalDue;
    }

    /**
     * Setter method for totalDue.
     *
     * @param aTotalDue the new value for totalDue
     */
    public void setTotalDue(BigDecimal aTotalDue) {
        totalDue = aTotalDue;
    }

    /**
     * Access method for storeShipCode.
     *
     * @return the current value of storeShipCode
     */
    public String getStoreShipCode() {
        return storeShipCode;
    }

    /**
     * Setter method for storeShipCode.
     *
     * @param aStoreShipCode the new value for storeShipCode
     */
    public void setStoreShipCode(String aStoreShipCode) {
        storeShipCode = aStoreShipCode;
    }

    /**
     * Access method for custVerified.
     *
     * @return true if and only if custVerified is currently true
     */
    public boolean isCustVerified() {
        return custVerified;
    }

    /**
     * Setter method for custVerified.
     *
     * @param aCustVerified the new value for custVerified
     */
    public void setCustVerified(boolean aCustVerified) {
        custVerified = aCustVerified;
    }

    /**
     * Access method for movieVerified.
     *
     * @return true if and only if movieVerified is currently true
     */
    public boolean isMovieVerified() {
        return movieVerified;
    }

    /**
     * Setter method for movieVerified.
     *
     * @param aMovieVerified the new value for movieVerified
     */
    public void setMovieVerified(boolean aMovieVerified) {
        movieVerified = aMovieVerified;
    }

    /**
     * Access method for priceVerified.
     *
     * @return true if and only if priceVerified is currently true
     */
    public boolean isPriceVerified() {
        return priceVerified;
    }

    /**
     * Setter method for priceVerified.
     *
     * @param aPriceVerified the new value for priceVerified
     */
    public void setPriceVerified(boolean aPriceVerified) {
        priceVerified = aPriceVerified;
    }

    /**
     * Access method for creditVerified.
     *
     * @return true if and only if creditVerified is currently true
     */
    public boolean isCreditVerified() {
        return creditVerified;
    }

    /**
     * Setter method for creditVerified.
     *
     * @param aCreditVerified the new value for creditVerified
     */
    public void setCreditVerified(boolean aCreditVerified) {
        creditVerified = aCreditVerified;
    }

    /**
     * Access method for totalVerified.
     *
     * @return true if and only if totalVerified is currently true
     */
    public boolean isTotalVerified() {
        return totalVerified;
    }

    /**
     * Setter method for totalVerified.
     *
     * @param aTotalVerified the new value for totalVerified
     */
    public void setTotalVerified(boolean aTotalVerified) {
        totalVerified = aTotalVerified;
    }

    /**
     * Access method for orderVerified.
     *
     * @return true if and only if orderVerified is currently true
     */
    public boolean isOrderVerified() {
        return orderVerified;
    }

    /**
     * Setter method for orderVerified.
     *
     * @param aOrderVerified the new value for orderVerified
     */
    public void setOrderVerified(boolean aOrderVerified) {
        orderVerified = aOrderVerified;
    }

    /**
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public StoreSites getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(StoreSites aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Compares the key for this instance with another StoreSalesData.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreSalesData and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreSalesData)) {
            return false;
        }
        StoreSalesData that = (StoreSalesData) other;
        if (this.getSaleDataId() != that.getSaleDataId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreSalesData.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreSalesData)) return false;
        return this.equalKeys(other) && ((StoreSalesData)other).equalKeys(this);
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
        i = getSaleDataId();
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
        StringBuffer sb = new StringBuffer("[StoreSalesData |");
        sb.append(" saleDataId=").append(getSaleDataId());
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
        ret.put("saleDataId", Integer.valueOf(getSaleDataId()));
        return ret;
    }

}
