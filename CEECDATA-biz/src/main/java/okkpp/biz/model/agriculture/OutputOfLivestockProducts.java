package okkpp.biz.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_output_of_livestock_products")
public class OutputOfLivestockProducts implements Serializable {
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
     * �����ܲ���
     */
    @Column(name = "meat_total")
    private Integer meatTotal;

    /**
     * ţ��
     */
    private Integer beef;

    /**
     * ����
     */
    private Integer sheep;

    /**
     * ����
     */
    private Integer pig;

    /**
     * ����
     */
    private Integer poultry;

    /**
     * �����ܲ���
     */
    @Column(name = "eggs_total")
    private Integer eggsTotal;

    /**
     * ����
     */
    @Column(name = "hen_eggs")
    private Integer henEggs;

    /**
     * ţ���ܲ���
     */
    @Column(name = "milk_total")
    private Integer milkTotal;

    /**
     * ţ��
     */
    @Column(name = "cow_milk")
    private Integer cowMilk;

    /**
     * ��ë
     */
    private Integer wool;

    /**
     * ����
     */
    private Integer honey;

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
     * ��ȡ�����ܲ���
     *
     * @return meat_total - �����ܲ���
     */
    public Integer getMeatTotal() {
        return meatTotal;
    }

    /**
     * ���������ܲ���
     *
     * @param meatTotal �����ܲ���
     */
    public void setMeatTotal(Integer meatTotal) {
        this.meatTotal = meatTotal;
    }

    /**
     * ��ȡţ��
     *
     * @return beef - ţ��
     */
    public Integer getBeef() {
        return beef;
    }

    /**
     * ����ţ��
     *
     * @param beef ţ��
     */
    public void setBeef(Integer beef) {
        this.beef = beef;
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
     * ��ȡ����
     *
     * @return pig - ����
     */
    public Integer getPig() {
        return pig;
    }

    /**
     * ��������
     *
     * @param pig ����
     */
    public void setPig(Integer pig) {
        this.pig = pig;
    }

    /**
     * ��ȡ����
     *
     * @return poultry - ����
     */
    public Integer getPoultry() {
        return poultry;
    }

    /**
     * ��������
     *
     * @param poultry ����
     */
    public void setPoultry(Integer poultry) {
        this.poultry = poultry;
    }

    /**
     * ��ȡ�����ܲ���
     *
     * @return eggs_total - �����ܲ���
     */
    public Integer getEggsTotal() {
        return eggsTotal;
    }

    /**
     * ���õ����ܲ���
     *
     * @param eggsTotal �����ܲ���
     */
    public void setEggsTotal(Integer eggsTotal) {
        this.eggsTotal = eggsTotal;
    }

    /**
     * ��ȡ����
     *
     * @return hen_eggs - ����
     */
    public Integer getHenEggs() {
        return henEggs;
    }

    /**
     * ���ü���
     *
     * @param henEggs ����
     */
    public void setHenEggs(Integer henEggs) {
        this.henEggs = henEggs;
    }

    /**
     * ��ȡţ���ܲ���
     *
     * @return milk_total - ţ���ܲ���
     */
    public Integer getMilkTotal() {
        return milkTotal;
    }

    /**
     * ����ţ���ܲ���
     *
     * @param milkTotal ţ���ܲ���
     */
    public void setMilkTotal(Integer milkTotal) {
        this.milkTotal = milkTotal;
    }

    /**
     * ��ȡţ��
     *
     * @return cow_milk - ţ��
     */
    public Integer getCowMilk() {
        return cowMilk;
    }

    /**
     * ����ţ��
     *
     * @param cowMilk ţ��
     */
    public void setCowMilk(Integer cowMilk) {
        this.cowMilk = cowMilk;
    }

    /**
     * ��ȡ��ë
     *
     * @return wool - ��ë
     */
    public Integer getWool() {
        return wool;
    }

    /**
     * ������ë
     *
     * @param wool ��ë
     */
    public void setWool(Integer wool) {
        this.wool = wool;
    }

    /**
     * ��ȡ����
     *
     * @return honey - ����
     */
    public Integer getHoney() {
        return honey;
    }

    /**
     * ���÷���
     *
     * @param honey ����
     */
    public void setHoney(Integer honey) {
        this.honey = honey;
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