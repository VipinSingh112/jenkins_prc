/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
 * @see JtbAddBranchDetailInfo
 * @generated
 */
public class JtbAddBranchDetailInfoTable
	extends BaseTable<JtbAddBranchDetailInfoTable> {

	public static final JtbAddBranchDetailInfoTable INSTANCE =
		new JtbAddBranchDetailInfoTable();

	public final Column<JtbAddBranchDetailInfoTable, Long>
		jtbBranchDetailInfoId = createColumn(
			"jtbBranchDetailInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAddBranchDetailInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, String>
		branchOfficeDetails = createColumn(
			"branchOfficeDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, String>
		branchOfficeLocation = createColumn(
			"branchOfficeLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddBranchDetailInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbAddBranchDetailInfoTable() {
		super("nbp_jtb_branch_detail", JtbAddBranchDetailInfoTable::new);
	}

}