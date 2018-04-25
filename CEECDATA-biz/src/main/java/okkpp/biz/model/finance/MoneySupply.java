package okkpp.biz.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_money_supply")
public class MoneySupply implements Serializable {
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
     * �������
     */
    private Double narrow;

    /**
     * �������
     */
    private Double quasi;

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
     * ��ȡ�������
     *
     * @return narrow - �������
     */
    public Double getNarrow() {
        return narrow;
    }

    /**
     * �����������
     *
     * @param narrow �������
     */
    public void setNarrow(Double narrow) {
        this.narrow = narrow;
    }

    /**
     * ��ȡ�������
     *
     * @return quasi - �������
     */
    public Double getQuasi() {
        return quasi;
    }

    /**
     * ���ù������
     *
     * @param quasi �������
     */
    public void setQuasi(Double quasi) {
        this.quasi = quasi;
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