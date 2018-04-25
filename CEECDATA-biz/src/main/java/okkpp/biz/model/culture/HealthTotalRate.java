package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_health_total_rate")
public class HealthTotalRate implements Serializable {
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
     * ҽ��֧��ռ����������ֵ����
     */
    @Column(name = "health_total")
    private Double healthTotal;

    /**
     * �˾�ҽ��֧��
     */
    @Column(name = "health_cost_per")
    private Double healthCostPer;

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
     * ��ȡҽ��֧��ռ����������ֵ����
     *
     * @return health_total - ҽ��֧��ռ����������ֵ����
     */
    public Double getHealthTotal() {
        return healthTotal;
    }

    /**
     * ����ҽ��֧��ռ����������ֵ����
     *
     * @param healthTotal ҽ��֧��ռ����������ֵ����
     */
    public void setHealthTotal(Double healthTotal) {
        this.healthTotal = healthTotal;
    }

    /**
     * ��ȡ�˾�ҽ��֧��
     *
     * @return health_cost_per - �˾�ҽ��֧��
     */
    public Double getHealthCostPer() {
        return healthCostPer;
    }

    /**
     * �����˾�ҽ��֧��
     *
     * @param healthCostPer �˾�ҽ��֧��
     */
    public void setHealthCostPer(Double healthCostPer) {
        this.healthCostPer = healthCostPer;
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