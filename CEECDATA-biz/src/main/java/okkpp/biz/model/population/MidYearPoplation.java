package okkpp.biz.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_mid_year_poplation")
public class MidYearPoplation implements Serializable {
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
     * �����˿�
     */
    private Double poplation;

    /**
     * ������
     */
    private Double rate;

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
     * ��ȡ�����˿�
     *
     * @return poplation - �����˿�
     */
    public Double getPoplation() {
        return poplation;
    }

    /**
     * ���������˿�
     *
     * @param poplation �����˿�
     */
    public void setPoplation(Double poplation) {
        this.poplation = poplation;
    }

    /**
     * ��ȡ������
     *
     * @return rate - ������
     */
    public Double getRate() {
        return rate;
    }

    /**
     * ����������
     *
     * @param rate ������
     */
    public void setRate(Double rate) {
        this.rate = rate;
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