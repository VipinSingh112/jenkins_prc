/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_pre_conditions&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtions
 * @generated
 */
public class CannabisConditionalLicensePreCondtionsTable
	extends BaseTable<CannabisConditionalLicensePreCondtionsTable> {

	public static final CannabisConditionalLicensePreCondtionsTable INSTANCE =
		new CannabisConditionalLicensePreCondtionsTable();

	public final Column<CannabisConditionalLicensePreCondtionsTable, Long>
		cannabisPreconditionsId = createColumn(
			"cannabisPreconditionsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, String>
		caseId = createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, String>
		precondition = createColumn(
			"precondition", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, String>
		status = createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicensePreCondtionsTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisConditionalLicensePreCondtionsTable() {
		super(
			"nbp_cannabis_pre_conditions",
			CannabisConditionalLicensePreCondtionsTable::new);
	}

}