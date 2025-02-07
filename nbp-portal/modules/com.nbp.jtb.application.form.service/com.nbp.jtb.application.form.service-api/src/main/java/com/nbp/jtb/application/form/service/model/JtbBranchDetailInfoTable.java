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

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_branch_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfo
 * @generated
 */
public class JtbBranchDetailInfoTable
	extends BaseTable<JtbBranchDetailInfoTable> {

	public static final JtbBranchDetailInfoTable INSTANCE =
		new JtbBranchDetailInfoTable();

	public final Column<JtbBranchDetailInfoTable, Long> jtbBranchDetailInfoId =
		createColumn(
			"jtbBranchDetailInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbBranchDetailInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, String> branchOfficeDetails =
		createColumn(
			"branchOfficeDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbBranchDetailInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbBranchDetailInfoTable() {
		super("nbp_jtb_branch_detail", JtbBranchDetailInfoTable::new);
	}

}