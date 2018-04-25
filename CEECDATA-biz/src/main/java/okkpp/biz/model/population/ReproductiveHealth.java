package okkpp.biz.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_reproductive_health")
public class ReproductiveHealth implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * �ܺ�������
     */
    @Column(name = "total_rate")
    private Double totalRate;

    /**
     * 15-19����Ů������
     */
    @Column(name = "rate15_19")
    private Double rate1519;

    /**
     * 15-49�긾Ů�����ռ���
     */
    @Column(name = "rate15_49")
    private Double rate1549;

    /**
     * ����������
     */
    private Double ratio;

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
     * ��ȡ���Ҵ���
     *
     * @return country - ���Ҵ���
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù��Ҵ���
     *
     * @param country ���Ҵ���
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
     * ��ȡ�ܺ�������
     *
     * @return total_rate - �ܺ�������
     */
    public Double getTotalRate() {
        return totalRate;
    }

    /**
     * �����ܺ�������
     *
     * @param totalRate �ܺ�������
     */
    public void setTotalRate(Double totalRate) {
        this.totalRate = totalRate;
    }

    /**
     * ��ȡ15-19����Ů������
     *
     * @return rate15_19 - 15-19����Ů������
     */
    public Double getRate1519() {
        return rate1519;
    }

    /**
     * ����15-19����Ů������
     *
     * @param rate1519 15-19����Ů������
     */
    public void setRate1519(Double rate1519) {
        this.rate1519 = rate1519;
    }

    /**
     * ��ȡ15-49�긾Ů�����ռ���
     *
     * @return rate15_49 - 15-49�긾Ů�����ռ���
     */
    public Double getRate1549() {
        return rate1549;
    }

    /**
     * ����15-49�긾Ů�����ռ���
     *
     * @param rate1549 15-49�긾Ů�����ռ���
     */
    public void setRate1549(Double rate1549) {
        this.rate1549 = rate1549;
    }

    /**
     * ��ȡ����������
     *
     * @return ratio - ����������
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * ���ò���������
     *
     * @param ratio ����������
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
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