package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_patent_applications")
public class PatentApplications implements Serializable {
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
     * ����ר����������
     */
    private Integer residents;

    /**
     * �Ǿ���ר����������
     */
    @Column(name = "non_residents")
    private Integer nonResidents;

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
     * ��ȡ����ר����������
     *
     * @return residents - ����ר����������
     */
    public Integer getResidents() {
        return residents;
    }

    /**
     * ���þ���ר����������
     *
     * @param residents ����ר����������
     */
    public void setResidents(Integer residents) {
        this.residents = residents;
    }

    /**
     * ��ȡ�Ǿ���ר����������
     *
     * @return non_residents - �Ǿ���ר����������
     */
    public Integer getNonResidents() {
        return nonResidents;
    }

    /**
     * ���÷Ǿ���ר����������
     *
     * @param nonResidents �Ǿ���ר����������
     */
    public void setNonResidents(Integer nonResidents) {
        this.nonResidents = nonResidents;
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