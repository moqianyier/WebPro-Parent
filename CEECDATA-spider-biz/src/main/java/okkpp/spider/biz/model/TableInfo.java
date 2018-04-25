package okkpp.spider.biz.model;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.*;

import com.google.gson.Gson;

@Table(name = "table_info")
public class TableInfo implements Serializable {
	public TableInfo() {}
	public TableInfo(String tableName,Map<String, Object> fields) {
		this.tableName = tableName;
		this.fields = new Gson().toJson(fields);
	}
    @Id
    private Integer id;

    /**
     * Ŀ¼����
     */
    @Column(name = "catalog_cn")
    private String catalogCn;

    /**
     * Ŀ¼Ӣ��
     */
    @Column(name = "catalog_en")
    private String catalogEn;

    /**
     * ��
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * ������Դ
     */
    private String source;

    /**
     * �ֶ��б�-json
     */
    private String fields;

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
     * ��ȡĿ¼����
     *
     * @return catalog_cn - Ŀ¼����
     */
    public String getCatalogCn() {
        return catalogCn;
    }

    /**
     * ����Ŀ¼����
     *
     * @param catalogCn Ŀ¼����
     */
    public void setCatalogCn(String catalogCn) {
        this.catalogCn = catalogCn;
    }

    /**
     * ��ȡĿ¼Ӣ��
     *
     * @return catalog_en - Ŀ¼Ӣ��
     */
    public String getCatalogEn() {
        return catalogEn;
    }

    /**
     * ����Ŀ¼Ӣ��
     *
     * @param catalogEn Ŀ¼Ӣ��
     */
    public void setCatalogEn(String catalogEn) {
        this.catalogEn = catalogEn;
    }

    /**
     * ��ȡ��
     *
     * @return table_name - ��
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * ���ñ�
     *
     * @param tableName ��
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * ��ȡ������Դ
     *
     * @return source - ������Դ
     */
    public String getSource() {
        return source;
    }

    /**
     * ����������Դ
     *
     * @param source ������Դ
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * ��ȡ�ֶ��б�-json
     *
     * @return fields - �ֶ��б�-json
     */
    public String getFields() {
        return fields;
    }

    /**
     * �����ֶ��б�-json
     *
     * @param fields �ֶ��б�-json
     */
    public void setFields(String fields) {
        this.fields = fields;
    }
}