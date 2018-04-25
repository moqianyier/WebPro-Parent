package okkpp.biz.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_deposit_rate_and_lending_rate")
public class DepositRateAndLendingRate implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ��ƽ���������
     */
    @Column(name = "deposit_rate")
    private Double depositRate;

    /**
     * ��������
     */
    @Column(name = "lending_rate")
    private Double lendingRate;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ����ʱ��
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ����
     *
     * @return country - ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     *
     * @param country ����
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ���
     *
     * @return year - ���
     */
    public String getYear() {
        return year;
    }

    /**
     * �������
     *
     * @param year ���
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * ��ȡ��ƽ���������
     *
     * @return deposit_rate - ��ƽ���������
     */
    public Double getDepositRate() {
        return depositRate;
    }

    /**
     * ������ƽ���������
     *
     * @param depositRate ��ƽ���������
     */
    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    /**
     * ��ȡ��������
     *
     * @return lending_rate - ��������
     */
    public Double getLendingRate() {
        return lendingRate;
    }

    /**
     * ���ô�������
     *
     * @param lendingRate ��������
     */
    public void setLendingRate(Double lendingRate) {
        this.lendingRate = lendingRate;
    }

    /**
     * ��ȡ���
     *
     * @return sort - ���
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * �������
     *
     * @param sort ���
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}