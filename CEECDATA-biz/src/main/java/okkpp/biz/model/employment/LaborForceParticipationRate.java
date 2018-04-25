package okkpp.biz.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_labor_force_participation_rate")
public class LaborForceParticipationRate implements Serializable {
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
     * �Ͷ����˿�
     */
    @Column(name = "total_labor_force")
    private Integer totalLaborForce;

    /**
     * �Ͷ�������
     */
    @Column(name = "participation_rate")
    private Double participationRate;

    /**
     * Ů���Ͷ�������
     */
    @Column(name = "female_participation_rate")
    private Double femaleParticipationRate;

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
     * ��ȡ�Ͷ����˿�
     *
     * @return total_labor_force - �Ͷ����˿�
     */
    public Integer getTotalLaborForce() {
        return totalLaborForce;
    }

    /**
     * �����Ͷ����˿�
     *
     * @param totalLaborForce �Ͷ����˿�
     */
    public void setTotalLaborForce(Integer totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    /**
     * ��ȡ�Ͷ�������
     *
     * @return participation_rate - �Ͷ�������
     */
    public Double getParticipationRate() {
        return participationRate;
    }

    /**
     * �����Ͷ�������
     *
     * @param participationRate �Ͷ�������
     */
    public void setParticipationRate(Double participationRate) {
        this.participationRate = participationRate;
    }

    /**
     * ��ȡŮ���Ͷ�������
     *
     * @return female_participation_rate - Ů���Ͷ�������
     */
    public Double getFemaleParticipationRate() {
        return femaleParticipationRate;
    }

    /**
     * ����Ů���Ͷ�������
     *
     * @param femaleParticipationRate Ů���Ͷ�������
     */
    public void setFemaleParticipationRate(Double femaleParticipationRate) {
        this.femaleParticipationRate = femaleParticipationRate;
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