package okkpp.biz.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_land_utilization")
public class LandUtilization implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ��������
     */
    @Column(name = "area_type")
    private String areaType;

    /**
     * ���
     */
    private Double measure;

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
     * ��ȡ��������
     *
     * @return area_type - ��������
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * ������������
     *
     * @param areaType ��������
     */
    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    /**
     * ��ȡ���
     *
     * @return measure - ���
     */
    public Double getMeasure() {
        return measure;
    }

    /**
     * �������
     *
     * @param measure ���
     */
    public void setMeasure(Double measure) {
        this.measure = measure;
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