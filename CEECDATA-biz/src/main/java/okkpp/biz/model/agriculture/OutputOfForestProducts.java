package okkpp.biz.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_output_of_forest_products")
public class OutputOfForestProducts implements Serializable {
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
     * ����
     */
    private Integer chestnuts;

    /**
     * ���
     */
    private Integer hazelnuts;

    /**
     * ����
     */
    private Integer walnuts;

    /**
     * ���
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
     * ��ȡ����
     *
     * @return chestnuts - ����
     */
    public Integer getChestnuts() {
        return chestnuts;
    }

    /**
     * ��������
     *
     * @param chestnuts ����
     */
    public void setChestnuts(Integer chestnuts) {
        this.chestnuts = chestnuts;
    }

    /**
     * ��ȡ���
     *
     * @return hazelnuts - ���
     */
    public Integer getHazelnuts() {
        return hazelnuts;
    }

    /**
     * �������
     *
     * @param hazelnuts ���
     */
    public void setHazelnuts(Integer hazelnuts) {
        this.hazelnuts = hazelnuts;
    }

    /**
     * ��ȡ����
     *
     * @return walnuts - ����
     */
    public Integer getWalnuts() {
        return walnuts;
    }

    /**
     * ���ú���
     *
     * @param walnuts ����
     */
    public void setWalnuts(Integer walnuts) {
        this.walnuts = walnuts;
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