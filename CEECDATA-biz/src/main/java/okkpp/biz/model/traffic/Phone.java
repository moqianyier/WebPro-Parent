package okkpp.biz.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_phone")
public class Phone implements Serializable {
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
     * �绰����
     */
    @Column(name = "telephone_mainlines")
    private Double telephoneMainlines;

    /**
     * �ƶ��绰
     */
    @Column(name = "mobile_phones")
    private Double mobilePhones;

    /**
     * ���
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
     * ��ȡ�绰����
     *
     * @return telephone_mainlines - �绰����
     */
    public Double getTelephoneMainlines() {
        return telephoneMainlines;
    }

    /**
     * ���õ绰����
     *
     * @param telephoneMainlines �绰����
     */
    public void setTelephoneMainlines(Double telephoneMainlines) {
        this.telephoneMainlines = telephoneMainlines;
    }

    /**
     * ��ȡ�ƶ��绰
     *
     * @return mobile_phones - �ƶ��绰
     */
    public Double getMobilePhones() {
        return mobilePhones;
    }

    /**
     * �����ƶ��绰
     *
     * @param mobilePhones �ƶ��绰
     */
    public void setMobilePhones(Double mobilePhones) {
        this.mobilePhones = mobilePhones;
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