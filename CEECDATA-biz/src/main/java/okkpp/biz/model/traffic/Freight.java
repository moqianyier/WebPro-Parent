package okkpp.biz.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_freight")
public class Freight implements Serializable {
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
     * ���ʺ���װ����
     */
    private Integer loaded;

    /**
     * ���ʺ���ж����
     */
    private Integer unloaded;

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
     * ��ȡ���ʺ���װ����
     *
     * @return loaded - ���ʺ���װ����
     */
    public Integer getLoaded() {
        return loaded;
    }

    /**
     * ���ù��ʺ���װ����
     *
     * @param loaded ���ʺ���װ����
     */
    public void setLoaded(Integer loaded) {
        this.loaded = loaded;
    }

    /**
     * ��ȡ���ʺ���ж����
     *
     * @return unloaded - ���ʺ���ж����
     */
    public Integer getUnloaded() {
        return unloaded;
    }

    /**
     * ���ù��ʺ���ж����
     *
     * @param unloaded ���ʺ���ж����
     */
    public void setUnloaded(Integer unloaded) {
        this.unloaded = unloaded;
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