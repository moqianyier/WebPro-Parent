package okkpp.biz.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_social_indicators_of_poverty")
public class SocialIndicatorsOfPoverty implements Serializable {
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
     * 5�����ڶ�ͯ������
     */
    private Double national;

    /**
     * 12-23���¶�ͯ����
     */
    private Double rural;

    /**
     * ������ҽ����Ա����
     */
    private Double urban;

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
     * ��ȡ5�����ڶ�ͯ������
     *
     * @return national - 5�����ڶ�ͯ������
     */
    public Double getNational() {
        return national;
    }

    /**
     * ����5�����ڶ�ͯ������
     *
     * @param national 5�����ڶ�ͯ������
     */
    public void setNational(Double national) {
        this.national = national;
    }

    /**
     * ��ȡ12-23���¶�ͯ����
     *
     * @return rural - 12-23���¶�ͯ����
     */
    public Double getRural() {
        return rural;
    }

    /**
     * ����12-23���¶�ͯ����
     *
     * @param rural 12-23���¶�ͯ����
     */
    public void setRural(Double rural) {
        this.rural = rural;
    }

    /**
     * ��ȡ������ҽ����Ա����
     *
     * @return urban - ������ҽ����Ա����
     */
    public Double getUrban() {
        return urban;
    }

    /**
     * ����������ҽ����Ա����
     *
     * @param urban ������ҽ����Ա����
     */
    public void setUrban(Double urban) {
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