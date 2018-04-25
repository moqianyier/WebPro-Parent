package okkpp.biz.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_international_poverty_ratio")
public class InternationalPovertyRatio implements Serializable {
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
     * �վ����벻��1.9��ƶ���˿�ռ�˿ڱ���
     */
    @Column(name = "radio1_9")
    private Double radio19;

    /**
     * �վ����벻��3.1��Ԫ��ƶ���˿�ռ���˿ڱ���
     */
    @Column(name = "radio3_1")
    private Double radio31;

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
     * ��ȡ�վ����벻��1.9��ƶ���˿�ռ�˿ڱ���
     *
     * @return radio1_9 - �վ����벻��1.9��ƶ���˿�ռ�˿ڱ���
     */
    public Double getRadio19() {
        return radio19;
    }

    /**
     * �����վ����벻��1.9��ƶ���˿�ռ�˿ڱ���
     *
     * @param radio19 �վ����벻��1.9��ƶ���˿�ռ�˿ڱ���
     */
    public void setRadio19(Double radio19) {
        this.radio19 = radio19;
    }

    /**
     * ��ȡ�վ����벻��3.1��Ԫ��ƶ���˿�ռ���˿ڱ���
     *
     * @return radio3_1 - �վ����벻��3.1��Ԫ��ƶ���˿�ռ���˿ڱ���
     */
    public Double getRadio31() {
        return radio31;
    }

    /**
     * �����վ����벻��3.1��Ԫ��ƶ���˿�ռ���˿ڱ���
     *
     * @param radio31 �վ����벻��3.1��Ԫ��ƶ���˿�ռ���˿ڱ���
     */
    public void setRadio31(Double radio31) {
        this.radio31 = radio31;
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