package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_school_enrollment_ratio")
public class SchoolEnrollmentRatio implements Serializable {
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
     * �ߵȽ�������ѧ��
     */
    @Column(name = "school_enrollment_tertiary")
    private Double schoolEnrollmentTertiary;

    /**
     * �еȽ�������ѧ��
     */
    @Column(name = "school_enrollment_secondary")
    private Double schoolEnrollmentSecondary;

    /**
     * ���Ƚ�������ѧ��
     */
    @Column(name = "school_enrollment_primary")
    private Double schoolEnrollmentPrimary;

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
     * ��ȡ�ߵȽ�������ѧ��
     *
     * @return school_enrollment_tertiary - �ߵȽ�������ѧ��
     */
    public Double getSchoolEnrollmentTertiary() {
        return schoolEnrollmentTertiary;
    }

    /**
     * ���øߵȽ�������ѧ��
     *
     * @param schoolEnrollmentTertiary �ߵȽ�������ѧ��
     */
    public void setSchoolEnrollmentTertiary(Double schoolEnrollmentTertiary) {
        this.schoolEnrollmentTertiary = schoolEnrollmentTertiary;
    }

    /**
     * ��ȡ�еȽ�������ѧ��
     *
     * @return school_enrollment_secondary - �еȽ�������ѧ��
     */
    public Double getSchoolEnrollmentSecondary() {
        return schoolEnrollmentSecondary;
    }

    /**
     * �����еȽ�������ѧ��
     *
     * @param schoolEnrollmentSecondary �еȽ�������ѧ��
     */
    public void setSchoolEnrollmentSecondary(Double schoolEnrollmentSecondary) {
        this.schoolEnrollmentSecondary = schoolEnrollmentSecondary;
    }

    /**
     * ��ȡ���Ƚ�������ѧ��
     *
     * @return school_enrollment_primary - ���Ƚ�������ѧ��
     */
    public Double getSchoolEnrollmentPrimary() {
        return schoolEnrollmentPrimary;
    }

    /**
     * ���ó��Ƚ�������ѧ��
     *
     * @param schoolEnrollmentPrimary ���Ƚ�������ѧ��
     */
    public void setSchoolEnrollmentPrimary(Double schoolEnrollmentPrimary) {
        this.schoolEnrollmentPrimary = schoolEnrollmentPrimary;
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