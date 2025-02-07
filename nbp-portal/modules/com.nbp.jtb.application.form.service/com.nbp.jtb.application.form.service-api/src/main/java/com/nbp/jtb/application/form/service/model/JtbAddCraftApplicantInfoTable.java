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
 * The table class for the &quot;nbp_jtb_craft_applicant&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfo
 * @generated
 */
public class JtbAddCraftApplicantInfoTable
	extends BaseTable<JtbAddCraftApplicantInfoTable> {

	public static final JtbAddCraftApplicantInfoTable INSTANCE =
		new JtbAddCraftApplicantInfoTable();

	public final Column<JtbAddCraftApplicantInfoTable, Long>
		jtbAddCraftApplicantInfoId = createColumn(
			"jtbAddCraftApplicantInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAddCraftApplicantInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> ownerName =
		createColumn(
			"ownerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> ownerAddress =
		createColumn(
			"ownerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> ownerPhoneNo =
		createColumn(
			"ownerPhoneNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> sellingLocation =
		createColumn(
			"sellingLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, String> operatingEmail =
		createColumn(
			"operatingEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftApplicantInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbAddCraftApplicantInfoTable() {
		super("nbp_jtb_craft_applicant", JtbAddCraftApplicantInfoTable::new);
	}

}