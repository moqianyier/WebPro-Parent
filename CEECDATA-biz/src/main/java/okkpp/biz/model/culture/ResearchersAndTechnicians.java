package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_researchers_and_technicians")
public class ResearchersAndTechnicians implements Serializable {
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
     * ÿ���������о���Ա��
     */
    private Double researchers;

    /**
     * ÿ�������м�����Ա��
     */
    private Double technicians;

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
     * ��ȡÿ���������о���Ա��
     *
     * @return researchers - ÿ���������о���Ա��
     */
    public Double getResearchers() {
        return researchers;
    }

    /**
     * ����ÿ���������о���Ա��
     *
     * @param researchers ÿ���������о���Ա��
     */
    public void setResearchers(Double researchers) {
        this.researchers = researchers;
    }

    /**
     * ��ȡÿ�������м�����Ա��
     *
     * @return technicians - ÿ�������м�����Ա��
     */
    public Double getTechnicians() {
        return technicians;
    }

    /**
     * ����ÿ�������м�����Ա��
     *
     * @param technicians ÿ�������м�����Ա��
     */
    public void setTechnicians(Double technicians) {
        this.technicians = technicians;
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