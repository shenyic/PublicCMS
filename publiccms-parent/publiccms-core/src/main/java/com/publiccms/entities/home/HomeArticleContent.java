package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * HomeArticleContent generated by hbm2java
 */
@Entity
@Table(name = "home_article_content")
@DynamicUpdate
public class HomeArticleContent implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "文章ID")
    private long articleId;
    @GeneratorColumn(title = "内容")
    private String content;

    public HomeArticleContent() {
    }

    public HomeArticleContent(long articleId) {
        this.articleId = articleId;
    }

    public HomeArticleContent(long articleId, String content) {
        this.articleId = articleId;
        this.content = content;
    }

    @Id

    @Column(name = "article_id", unique = true, nullable = false)
    public long getArticleId() {
        return this.articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    @Column(name = "content")
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
