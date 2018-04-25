package okkpp.biz.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_reserves")
public class Reserves implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ��㴢��
     */
    private Double foreign;

    /**
     * �ƽ𴢱�
     */
    private Double gold;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ��������
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
     * ��ȡ���Ҵ���
     *
     * @return country - ���Ҵ���
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù��Ҵ���
     *
     * @param country ���Ҵ���
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
     * ��ȡ��㴢��
     *
     * @return foreign - ��㴢��
     */
    public Double getForeign() {
        return foreign;
    }

    /**
     * ������㴢��
     *
     * @param foreign ��㴢��
     */
    public void setForeign(Double foreign) {
        this.foreign = foreign;
    }

    /**
     * ��ȡ�ƽ𴢱�
     *
     * @return gold - �ƽ𴢱�
     */
    public Double getGold() {
        return gold;
    }

    /**
     * ���ûƽ𴢱�
     *
     * @param gold �ƽ𴢱�
     */
    public void setGold(Double gold) {
        this.gold = gold;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ��������
     *
     * @return updated - ��������
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø�������
     *
     * @param updated ��������
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}