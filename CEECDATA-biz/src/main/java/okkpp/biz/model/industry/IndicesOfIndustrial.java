package okkpp.biz.model.industry;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_industry_indices_of_industrial")
public class IndicesOfIndustrial implements Serializable {
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
     * ��ҵ����ָ��
     */
    private Double indices;

    /**
     * ����
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
     * ��ȡ��ҵ����ָ��
     *
     * @return indices - ��ҵ����ָ��
     */
    public Double getIndices() {
        return indices;
    }

    /**
     * ���ù�ҵ����ָ��
     *
     * @param indices ��ҵ����ָ��
     */
    public void setIndices(Double indices) {
        this.indices = indices;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
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