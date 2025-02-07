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

package com.nbp.farm.application.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_farm_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermit
 * @generated
 */
public class FarmPermitTable extends BaseTable<FarmPermitTable> {

	public static final FarmPermitTable INSTANCE = new FarmPermitTable();

	public final Column<FarmPermitTable, Long> farmPermitId = createColumn(
		"farmPermitId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmPermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, String> pirPermtNumber = createColumn(
		"pirPermtNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, String> duration = createColumn(
		"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Date> dateofIssue = createColumn(
		"dateofIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Date> dateOfExpiration = createColumn(
		"dateOfExpiration", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmPermitTable, Long> pirCertificateNUmber =
		createColumn(
			"pirCertificateNUmber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmPermitTable() {
		super("nbp_farm_permit", FarmPermitTable::new);
	}

}