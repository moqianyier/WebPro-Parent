package okkpp.biz.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_poverty_rate")
public class PovertyRate implements Serializable {
    @Id
    private Integer id;

    /**
     * ����/����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ȫ��ƶ����
     */
    private Double national;

    /**
     * ũ��ƶ����
     */
    private Double rural;

    /**
     * ����ƶ����
     */
    private Double urban;

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
     * ��ȡ����/����
     *
     * @return country - ����/����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���/����
     *
     * @param country ����/����
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
     * ��ȡȫ��ƶ����
     *
     * @return national - ȫ��ƶ����
     */
    public Double getNational() {
        return national;
    }

    /**
     * ����ȫ��ƶ����
     *
     * @param national ȫ��ƶ����
     */
    public void setNational(Double national) {
        this.national = national;
    }

    /**
     * ��ȡũ��ƶ����
     *
     * @return rural - ũ��ƶ����
     */
    public Double getRural() {
        return rural;
    }

    /**
     * ����ũ��ƶ����
     *
     * @param rural ũ��ƶ����
     */
    public void setRural(Double rural) {
        this.rural = rural;
    }

    /**
     * ��ȡ����ƶ����
     *
     * @return urban - ����ƶ����
     */
    public Double getUrban() {
        return urban;
    }

    /**
     * ���ó���ƶ����
     *
     * @param urban ����ƶ����
     */
    public void setUrban(Double urban) {
        this.urban = urban;
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