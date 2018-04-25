package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_hightechnology_rate")
public class HightechnologyRate implements Serializable {
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
     * �߼�����Ʒ���ڶ�ռ�Ƴ�Ʒ���ڶ����
     */
    private Double researchers;

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
     * ��ȡ�߼�����Ʒ���ڶ�ռ�Ƴ�Ʒ���ڶ����
     *
     * @return researchers - �߼�����Ʒ���ڶ�ռ�Ƴ�Ʒ���ڶ����
     */
    public Double getResearchers() {
        return researchers;
    }

    /**
     * ���ø߼�����Ʒ���ڶ�ռ�Ƴ�Ʒ���ڶ����
     *
     * @param researchers �߼�����Ʒ���ڶ�ռ�Ƴ�Ʒ���ڶ����
     */
    public void setResearchers(Double researchers) {
        this.researchers = researchers;
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