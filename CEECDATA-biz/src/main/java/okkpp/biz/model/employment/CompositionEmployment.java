package okkpp.biz.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_composition_employment")
public class CompositionEmployment implements Serializable {
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
     * ��һ��ҵ
     */
    @Column(name = "primary_edu")
    private Double primaryEdu;

    /**
     * �ڶ���ҵ
     */
    @Column(name = "secondary_edu")
    private Double secondaryEdu;

    /**
     * ������ҵ
     */
    @Column(name = "tertiary_edu")
    private Double tertiaryEdu;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ����ʱ��
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
     * ��ȡ��һ��ҵ
     *
     * @return primary_edu - ��һ��ҵ
     */
    public Double getPrimaryEdu() {
        return primaryEdu;
    }

    /**
     * ���õ�һ��ҵ
     *
     * @param primaryEdu ��һ��ҵ
     */
    public void setPrimaryEdu(Double primaryEdu) {
        this.primaryEdu = primaryEdu;
    }

    /**
     * ��ȡ�ڶ���ҵ
     *
     * @return secondary_edu - �ڶ���ҵ
     */
    public Double getSecondaryEdu() {
        return secondaryEdu;
    }

    /**
     * ���õڶ���ҵ
     *
     * @param secondaryEdu �ڶ���ҵ
     */
    public void setSecondaryEdu(Double secondaryEdu) {
        this.secondaryEdu = secondaryEdu;
    }

    /**
     * ��ȡ������ҵ
     *
     * @return tertiary_edu - ������ҵ
     */
    public Double getTertiaryEdu() {
        return tertiaryEdu;
    }

    /**
     * ���õ�����ҵ
     *
     * @param tertiaryEdu ������ҵ
     */
    public void setTertiaryEdu(Double tertiaryEdu) {
        this.tertiaryEdu = tertiaryEdu;
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
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}