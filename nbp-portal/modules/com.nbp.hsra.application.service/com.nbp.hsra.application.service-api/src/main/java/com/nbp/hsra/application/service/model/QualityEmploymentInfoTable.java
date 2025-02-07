/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_quality_employee&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfo
 * @generated
 */
public class QualityEmploymentInfoTable
	extends BaseTable<QualityEmploymentInfoTable> {

	public static final QualityEmploymentInfoTable INSTANCE =
		new QualityEmploymentInfoTable();

	public final Column<QualityEmploymentInfoTable, Long>
		qualityEmploymentInfoId = createColumn(
			"qualityEmploymentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualityEmploymentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> teleNo =
		createColumn(
			"teleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> mobileNo =
		createColumn(
			"mobileNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityEmploymentInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualityEmploymentInfoTable() {
		super("nbp_hsra_quality_employee", QualityEmploymentInfoTable::new);
	}

}