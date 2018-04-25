package okkpp.biz.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_composition_dependency_ratio")
public class CompositionDependencyRatio implements Serializable {
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
     * ������
     */
    @Column(name = "dependency_ratio")
    private Double dependencyRatio;

    /**
     * 14������ռ��
     */
    @Column(name = "ages_14_rate")
    private Double ages14Rate;

    /**
     * 15-64��ռ��
     */
    @Column(name = "ages_15_to64")
    private Double ages15To64;

    /**
     * 65������ռ��
     */
    @Column(name = "ages_65_and_above")
    private Double ages65AndAbove;

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
     * ��ȡ������
     *
     * @return dependency_ratio - ������
     */
    public Double getDependencyRatio() {
        return dependencyRatio;
    }

    /**
     * ���ø�����
     *
     * @param dependencyRatio ������
     */
    public void setDependencyRatio(Double dependencyRatio) {
        this.dependencyRatio = dependencyRatio;
    }

    /**
     * ��ȡ14������ռ��
     *
     * @return ages_14_rate - 14������ռ��
     */
    public Double getAges14Rate() {
        return ages14Rate;
    }

    /**
     * ����14������ռ��
     *
     * @param ages14Rate 14������ռ��
     */
    public void setAges14Rate(Double ages14Rate) {
        this.ages14Rate = ages14Rate;
    }

    /**
     * ��ȡ15-64��ռ��
     *
     * @return ages_15_to64 - 15-64��ռ��
     */
    public Double getAges15To64() {
        return ages15To64;
    }

    /**
     * ����15-64��ռ��
     *
     * @param ages15To64 15-64��ռ��
     */
    public void setAges15To64(Double ages15To64) {
        this.ages15To64 = ages15To64;
    }

    /**
     * ��ȡ65������ռ��
     *
     * @return ages_65_and_above - 65������ռ��
     */
    public Double getAges65AndAbove() {
        return ages65AndAbove;
    }

    /**
     * ����65������ռ��
     *
     * @param ages65AndAbove 65������ռ��
     */
    public void setAges65AndAbove(Double ages65AndAbove) {
        this.ages65AndAbove = ages65AndAbove;
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