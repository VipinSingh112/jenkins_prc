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
 * The table class for the &quot;nbp_cannabis_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisAppDeskVerification
 * @generated
 */
public class CannabisAppDeskVerificationTable
	extends BaseTable<CannabisAppDeskVerificationTable> {

	public static final CannabisAppDeskVerificationTable INSTANCE =
		new CannabisAppDeskVerificationTable();

	public final Column<CannabisAppDeskVerificationTable, Long>
		cannabisDeskVerificationId = createColumn(
			"cannabisDeskVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisAppDeskVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, String>
		documentStatus = createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisAppDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CannabisAppDeskVerificationTable() {
		super(
			"nbp_cannabis_desk_verifi", CannabisAppDeskVerificationTable::new);
	}

}