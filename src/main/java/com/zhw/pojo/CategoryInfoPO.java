package com.zhw.pojo;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "category_info")
@DynamicInsert
@DynamicUpdate


public class CategoryInfoPO  implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="create_time")
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createTime;
	@Column(name="update_time")
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	private Date updateTime;
	@Column(name="name")
	private String name;
	/*逻辑删除标记*/
	@Column(name="is_deleted")
	private Boolean deleted;

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
