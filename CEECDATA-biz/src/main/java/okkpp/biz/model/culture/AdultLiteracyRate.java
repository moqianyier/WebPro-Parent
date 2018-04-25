package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_adult_literacy_rate")
public class AdultLiteracyRate implements Serializable {
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
     * �ܼ�
     */
    private Double total;

    /**
     * ����
     */
    private Double male;

    /**
     * Ů��
     */
    private Double female;

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
     * ��ȡ�ܼ�
     *
     * @return total - �ܼ�
     */
    public Double getTotal() {
        return total;
    }

    /**
     * �����ܼ�
     *
     * @param total �ܼ�
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * ��ȡ����
     *
     * @return male - ����
     */
    public Double getMale() {
        return male;
    }

    /**
     * ��������
     *
     * @param male ����
     */
    public void setMale(Double male) {
        this.male = male;
    }

    /**
     * ��ȡŮ��
     *
     * @return female - Ů��
     */
    public Double getFemale() {
        return female;
    }

    /**
     * ����Ů��
     *
     * @param female Ů��
     */
    public void setFemale(Double female) {
        this.female = female;
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