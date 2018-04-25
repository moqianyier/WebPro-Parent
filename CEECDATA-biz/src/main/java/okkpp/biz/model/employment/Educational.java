package okkpp.biz.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_educational")
public class Educational implements Serializable {
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
     * ���Ƚ���
     */
    @Column(name = "primary_edu")
    private Double primaryEdu;

    /**
     * �еȽ���
     */
    @Column(name = "secondary_edu")
    private Double secondaryEdu;

    /**
     * �ߵȽ���
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
     * ��ȡ���Ƚ���
     *
     * @return primary_edu - ���Ƚ���
     */
    public Double getPrimaryEdu() {
        return primaryEdu;
    }

    /**
     * ���ó��Ƚ���
     *
     * @param primaryEdu ���Ƚ���
     */
    public void setPrimaryEdu(Double primaryEdu) {
        this.primaryEdu = primaryEdu;
    }

    /**
     * ��ȡ�еȽ���
     *
     * @return secondary_edu - �еȽ���
     */
    public Double getSecondaryEdu() {
        return secondaryEdu;
    }

    /**
     * �����еȽ���
     *
     * @param secondaryEdu �еȽ���
     */
    public void setSecondaryEdu(Double secondaryEdu) {
        this.secondaryEdu = secondaryEdu;
    }

    /**
     * ��ȡ�ߵȽ���
     *
     * @return tertiary_edu - �ߵȽ���
     */
    public Double getTertiaryEdu() {
        return tertiaryEdu;
    }

    /**
     * ���øߵȽ���
     *
     * @param tertiaryEdu �ߵȽ���
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