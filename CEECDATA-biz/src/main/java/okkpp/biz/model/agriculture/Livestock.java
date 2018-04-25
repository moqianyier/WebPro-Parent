package okkpp.biz.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_livestock")
public class Livestock implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    private String country;

    /**
     * ţ
     */
    private Integer cattle;

    /**
     * ��
     */
    private Integer horse;

    /**
     * ��
     */
    private Integer goats;

    /**
     * ����
     */
    private Integer sheep;

    /**
     * ��
     */
    private Integer pigs;

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
     * ��ȡţ
     *
     * @return cattle - ţ
     */
    public Integer getCattle() {
        return cattle;
    }

    /**
     * ����ţ
     *
     * @param cattle ţ
     */
    public void setCattle(Integer cattle) {
        this.cattle = cattle;
    }

    /**
     * ��ȡ��
     *
     * @return horse - ��
     */
    public Integer getHorse() {
        return horse;
    }

    /**
     * ������
     *
     * @param horse ��
     */
    public void setHorse(Integer horse) {
        this.horse = horse;
    }

    /**
     * ��ȡ��
     *
     * @return goats - ��
     */
    public Integer getGoats() {
        return goats;
    }

    /**
     * ������
     *
     * @param goats ��
     */
    public void setGoats(Integer goats) {
        this.goats = goats;
    }

    /**
     * ��ȡ����
     *
     * @return sheep - ����
     */
    public Integer getSheep() {
        return sheep;
    }

    /**
     * ��������
     *
     * @param sheep ����
     */
    public void setSheep(Integer sheep) {
        this.sheep = sheep;
    }

    /**
     * ��ȡ��
     *
     * @return pigs - ��
     */
    public Integer getPigs() {
        return pigs;
    }

    /**
     * ������
     *
     * @param pigs ��
     */
    public void setPigs(Integer pigs) {
        this.pigs = pigs;
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