package okkpp.biz.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_rural_and_urban_rate")
public class RuralAndUrbanRate implements Serializable {
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
     * ũ���˿ڱ���
     */
    private Double ruralrate;

    /**
     * �����˿ڱ���
     */
    private Double urbanrate;

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
     * ��ȡũ���˿ڱ���
     *
     * @return ruralrate - ũ���˿ڱ���
     */
    public Double getRuralrate() {
        return ruralrate;
    }

    /**
     * ����ũ���˿ڱ���
     *
     * @param ruralrate ũ���˿ڱ���
     */
    public void setRuralrate(Double ruralrate) {
        this.ruralrate = ruralrate;
    }

    /**
     * ��ȡ�����˿ڱ���
     *
     * @return urbanrate - �����˿ڱ���
     */
    public Double getUrbanrate() {
        return urbanrate;
    }

    /**
     * ���ó����˿ڱ���
     *
     * @param urbanrate �����˿ڱ���
     */
    public void setUrbanrate(Double urbanrate) {
        this.urbanrate = urbanrate;
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