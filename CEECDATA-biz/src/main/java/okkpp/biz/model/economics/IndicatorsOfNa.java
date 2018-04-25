package okkpp.biz.model.economics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_economics_indicators_of_na")
public class IndicatorsOfNa implements Serializable {
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
     * ����������ֵ���ּ��ڹ���Ԫ��
     */
    private Double gdp;

    /**
     * �˾�����������ֵ(�ּ۹���Ԫ)
     */
    private Double gdppc;

    /**
     * ���������루�ּ��ڹ���Ԫ��
     */
    private Double gni;

    /**
     * �˾�����������(�ּ۹���Ԫ)
     */
    private Double gnipc;

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
     * ��ȡ����������ֵ���ּ��ڹ���Ԫ��
     *
     * @return gdp - ����������ֵ���ּ��ڹ���Ԫ��
     */
    public Double getGdp() {
        return gdp;
    }

    /**
     * ���ù���������ֵ���ּ��ڹ���Ԫ��
     *
     * @param gdp ����������ֵ���ּ��ڹ���Ԫ��
     */
    public void setGdp(Double gdp) {
        this.gdp = gdp;
    }

    /**
     * ��ȡ�˾�����������ֵ(�ּ۹���Ԫ)
     *
     * @return gdppc - �˾�����������ֵ(�ּ۹���Ԫ)
     */
    public Double getGdppc() {
        return gdppc;
    }

    /**
     * �����˾�����������ֵ(�ּ۹���Ԫ)
     *
     * @param gdppc �˾�����������ֵ(�ּ۹���Ԫ)
     */
    public void setGdppc(Double gdppc) {
        this.gdppc = gdppc;
    }

    /**
     * ��ȡ���������루�ּ��ڹ���Ԫ��
     *
     * @return gni - ���������루�ּ��ڹ���Ԫ��
     */
    public Double getGni() {
        return gni;
    }

    /**
     * ���ù��������루�ּ��ڹ���Ԫ��
     *
     * @param gni ���������루�ּ��ڹ���Ԫ��
     */
    public void setGni(Double gni) {
        this.gni = gni;
    }

    /**
     * ��ȡ�˾�����������(�ּ۹���Ԫ)
     *
     * @return gnipc - �˾�����������(�ּ۹���Ԫ)
     */
    public Double getGnipc() {
        return gnipc;
    }

    /**
     * �����˾�����������(�ּ۹���Ԫ)
     *
     * @param gnipc �˾�����������(�ּ۹���Ԫ)
     */
    public void setGnipc(Double gnipc) {
        this.gnipc = gnipc;
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