package com.frana.taskme.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frana.taskme.enums.RolesEnum;

@Entity
@Table(name = "roles")
public class Role {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@Enumerated(EnumType.STRING)
		@Column(length = 20)
		private RolesEnum name;

		public Role() {
		}

		public Role(RolesEnum name) {
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public RolesEnum getName() {
			return name;
		}

		public void setName(RolesEnum name) {
			this.name = name;
		}
}
