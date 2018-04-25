package okkpp.biz.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_broadband")
public class Broadband implements Serializable {
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
     * ����û�
     */
    private Integer broadband;

    /**
     * ÿ���˿���û�
     */
    @Column(name = "broadband_per")
    private Double broadbandPer;

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
     * ��ȡ����û�
     *
     * @return broadband - ����û�
     */
    public Integer getBroadband() {
        return broadband;
    }

    /**
     * ���ÿ���û�
     *
     * @param broadband ����û�
     */
    public void setBroadband(Integer broadband) {
        this.broadband = broadband;
    }

    /**
     * ��ȡÿ���˿���û�
     *
     * @return broadband_per - ÿ���˿���û�
     */
    public Double getBroadbandPer() {
        return broadbandPer;
    }

    /**
     * ����ÿ���˿���û�
     *
     * @param broadbandPer ÿ���˿���û�
     */
    public void setBroadbandPer(Double broadbandPer) {
        this.broadbandPer = broadbandPer;
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