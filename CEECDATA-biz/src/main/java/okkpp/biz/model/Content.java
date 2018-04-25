package okkpp.biz.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_content")
public class Content implements Serializable {
    @Id
    private Integer id;

    /**
     * �ϼ�Ŀ¼
     */
    private String parent;

    /**
     * Ŀ¼��
     */
    private String content;

    /**
     * ����
     */
    private String href;

    /**
     * ��Ӧ����
     */
    @Column(name = "ref_table")
    private String refTable;

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
     * ��ȡ�ϼ�Ŀ¼
     *
     * @return parent - �ϼ�Ŀ¼
     */
    public String getParent() {
        return parent;
    }

    /**
     * �����ϼ�Ŀ¼
     *
     * @param parent �ϼ�Ŀ¼
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * ��ȡĿ¼��
     *
     * @return content - Ŀ¼��
     */
    public String getContent() {
        return content;
    }

    /**
     * ����Ŀ¼��
     *
     * @param content Ŀ¼��
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ��ȡ����
     *
     * @return href - ����
     */
    public String getHref() {
        return href;
    }

    /**
     * ��������
     *
     * @param href ����
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * ��ȡ��Ӧ����
     *
     * @return ref_table - ��Ӧ����
     */
    public String getRefTable() {
        return refTable;
    }

    /**
     * ���ö�Ӧ����
     *
     * @param refTable ��Ӧ����
     */
    public void setRefTable(String refTable) {
        this.refTable = refTable;
    }

	@Override
	public String toString() {
		return "Content [id=" + id + ", parent=" + parent + ", content=" + content + ", href=" + href + ", refTable="
				+ refTable + "]";
	}
    
    
}