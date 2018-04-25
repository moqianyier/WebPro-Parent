package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_hospital")
public class Hospital implements Serializable {
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
     * ÿǧ�˿�ҽ����
     */
    private Double persons;

    /**
     * ÿǧ�˿ڲ�����
     */
    private Double beds;

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
     * ��ȡÿǧ�˿�ҽ����
     *
     * @return persons - ÿǧ�˿�ҽ����
     */
    public Double getPersons() {
        return persons;
    }

    /**
     * ����ÿǧ�˿�ҽ����
     *
     * @param persons ÿǧ�˿�ҽ����
     */
    public void setPersons(Double persons) {
        this.persons = persons;
    }

    /**
     * ��ȡÿǧ�˿ڲ�����
     *
     * @return beds - ÿǧ�˿ڲ�����
     */
    public Double getBeds() {
        return beds;
    }

    /**
     * ����ÿǧ�˿ڲ�����
     *
     * @param beds ÿǧ�˿ڲ�����
     */
    public void setBeds(Double beds) {
        this.beds = beds;
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