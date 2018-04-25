package okkpp.biz.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_country_area")
public class CountryArea implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * �������
     */
    private Double surface;

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
     * ��ȡ�������
     *
     * @return surface - �������
     */
    public Double getSurface() {
        return surface;
    }

    /**
     * ���ù������
     *
     * @param surface �������
     */
    public void setSurface(Double surface) {
        this.surface = surface;
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