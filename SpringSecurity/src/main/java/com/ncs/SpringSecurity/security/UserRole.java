package com.ncs.SpringSecurity.security;

import java.util.Set;

import com.google.common.collect.Sets;

public enum UserRole {
	
	
	STUDENT(Sets.newHashSet()), ADMIN(Sets.newHashSet(UserPermission.COURSE_READ,UserPermission.COURSE_WRITE));

	private  final Set<UserPermission> permission;

	 UserRole(Set<UserPermission> permission) {
		this.permission = permission;
	}

}
