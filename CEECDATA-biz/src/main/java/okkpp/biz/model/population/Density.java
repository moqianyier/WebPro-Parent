package okkpp.biz.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_density")
public class Density implements Serializable {
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
     * �˿��ܶ�
     */
    private Double density;

    /**
     * �����˿�
     */
    @Column(name = "Urban")
    private Integer urban;

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
     * ��ȡ�˿��ܶ�
     *
     * @return density - �˿��ܶ�
     */
    public Double getDensity() {
        return density;
    }

    /**
     * �����˿��ܶ�
     *
     * @param density �˿��ܶ�
     */
    public void setDensity(Double density) {
        this.density = density;
    }

    /**
     * ��ȡ�����˿�
     *
     * @return Urban - �����˿�
     */
    public Integer getUrban() {
        return urban;
    }

    /**
     * ���ó����˿�
     *
     * @param urban �����˿�
     */
    public void setUrban(Integer urban) {
        this.urban = urban;
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