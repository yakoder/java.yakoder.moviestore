// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDataObject;

@Entity(name="inv_digitization")
public class InventoryDigitization extends SimpleDataObject implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3036022109857463373L;

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="inv_digit_id", unique=true, nullable=false, precision=10)
    private int id;
    @Column(length=1000)
    private String notes;
    @ManyToOne
    @JoinColumn(name="digit_fmt_id")
    private DigitizationFormat digitizationFormats;
    @ManyToOne
    @JoinColumn(name="digit_stat_id")
    private DigitizationStatus digitizationStatuses;
    @ManyToOne
    @JoinColumn(name="digit_sw_id")
    private DigitizationSoftware digitizationSoftware;
    @ManyToOne(optional=false)
    @JoinColumn(name="inv_id", nullable=false)
    private Inventory inventory;

    /** Default constructor. */
    public InventoryDigitization() {
        super();
    }

    /**
     * Access method for notes.
     *
     * @return the current value of notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for notes.
     *
     * @param aNotes the new value for notes
     */
    public void setNotes(String aNotes) {
        notes = aNotes;
    }

    /**
     * Access method for digitizationFormats.
     *
     * @return the current value of digitizationFormats
     */
    public DigitizationFormat getDigitizationFormats() {
        return digitizationFormats;
    }

    /**
     * Setter method for digitizationFormats.
     *
     * @param aDigitizationFormats the new value for digitizationFormats
     */
    public void setDigitizationFormats(DigitizationFormat aDigitizationFormats) {
        digitizationFormats = aDigitizationFormats;
    }

    /**
     * Access method for digitizationStatuses.
     *
     * @return the current value of digitizationStatuses
     */
    public DigitizationStatus getDigitizationStatuses() {
        return digitizationStatuses;
    }

    /**
     * Setter method for digitizationStatuses.
     *
     * @param aDigitizationStatuses the new value for digitizationStatuses
     */
    public void setDigitizationStatuses(DigitizationStatus aDigitizationStatuses) {
        digitizationStatuses = aDigitizationStatuses;
    }

    /**
     * Access method for digitizationSoftware.
     *
     * @return the current value of digitizationSoftware
     */
    public DigitizationSoftware getDigitizationSoftware() {
        return digitizationSoftware;
    }

    /**
     * Setter method for digitizationSoftware.
     *
     * @param aDigitizationSoftware the new value for digitizationSoftware
     */
    public void setDigitizationSoftware(DigitizationSoftware aDigitizationSoftware) {
        digitizationSoftware = aDigitizationSoftware;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Inventory aInventory) {
        inventory = aInventory;
    }

    /**
     * Compares the key for this instance with another InventoryDigitization.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InventoryDigitization and the key objects are equal
     */
	protected boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InventoryDigitization)) {
            return false;
        }
        InventoryDigitization that = (InventoryDigitization) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InventoryDigitization.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InventoryDigitization)) return false;
        return this.equalKeys(other) && ((InventoryDigitization)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[InventoryDigitization |");
        sb.append(" inventoryDigitizationId=").append(getId());
        sb.append("]");
        return sb.toString();
    }

}
