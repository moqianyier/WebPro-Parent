package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_expenditure_student_gdp_rate")
public class ExpenditureStudentGDPRate implements Serializable {
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
     * ��ѧ������֧��ռ�˾�����������ֵ����
     */
    @Column(name = "tertiary_school_student")
    private Double tertiarySchoolStudent;

    /**
     * ��ѧ������֧��ռ�˾�����������ֵ����
     */
    @Column(name = "secondary_school_student")
    private Double secondarySchoolStudent;

    /**
     * Сѧ������֧��ռ�˾�����������ֵ����
     */
    @Column(name = "primary_school_student")
    private Double primarySchoolStudent;

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
     * ��ȡ��ѧ������֧��ռ�˾�����������ֵ����
     *
     * @return tertiary_school_student - ��ѧ������֧��ռ�˾�����������ֵ����
     */
    public Double getTertiarySchoolStudent() {
        return tertiarySchoolStudent;
    }

    /**
     * ���ô�ѧ������֧��ռ�˾�����������ֵ����
     *
     * @param tertiarySchoolStudent ��ѧ������֧��ռ�˾�����������ֵ����
     */
    public void setTertiarySchoolStudent(Double tertiarySchoolStudent) {
        this.tertiarySchoolStudent = tertiarySchoolStudent;
    }

    /**
     * ��ȡ��ѧ������֧��ռ�˾�����������ֵ����
     *
     * @return secondary_school_student - ��ѧ������֧��ռ�˾�����������ֵ����
     */
    public Double getSecondarySchoolStudent() {
        return secondarySchoolStudent;
    }

    /**
     * ������ѧ������֧��ռ�˾�����������ֵ����
     *
     * @param secondarySchoolStudent ��ѧ������֧��ռ�˾�����������ֵ����
     */
    public void setSecondarySchoolStudent(Double secondarySchoolStudent) {
        this.secondarySchoolStudent = secondarySchoolStudent;
    }

    /**
     * ��ȡСѧ������֧��ռ�˾�����������ֵ����
     *
     * @return primary_school_student - Сѧ������֧��ռ�˾�����������ֵ����
     */
    public Double getPrimarySchoolStudent() {
        return primarySchoolStudent;
    }

    /**
     * ����Сѧ������֧��ռ�˾�����������ֵ����
     *
     * @param primarySchoolStudent Сѧ������֧��ռ�˾�����������ֵ����
     */
    public void setPrimarySchoolStudent(Double primarySchoolStudent) {
        this.primarySchoolStudent = primarySchoolStudent;
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