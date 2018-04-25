package okkpp.biz.model.economics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_economics_growth_rate_gdppc")
public class GrowthRateGdppc implements Serializable {
    @Id
    private Integer id;

    /**
     * ���ұ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * �˾�����������ֵ������(%)
     */
    private Double rate;

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
     * ��ȡ���ұ���
     *
     * @return country - ���ұ���
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù��ұ���
     *
     * @param country ���ұ���
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
     * ��ȡ�˾�����������ֵ������(%)
     *
     * @return rate - �˾�����������ֵ������(%)
     */
    public Double getRate() {
        return rate;
    }

    /**
     * �����˾�����������ֵ������(%)
     *
     * @param rate �˾�����������ֵ������(%)
     */
    public void setRate(Double rate) {
        this.rate = rate;
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