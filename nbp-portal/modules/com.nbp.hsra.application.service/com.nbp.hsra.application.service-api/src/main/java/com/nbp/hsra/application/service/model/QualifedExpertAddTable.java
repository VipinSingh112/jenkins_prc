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
 * The table class for the &quot;nbp_hsra_qualified_expert_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAdd
 * @generated
 */
public class QualifedExpertAddTable extends BaseTable<QualifedExpertAddTable> {

	public static final QualifedExpertAddTable INSTANCE =
		new QualifedExpertAddTable();

	public final Column<QualifedExpertAddTable, Long> qualifedExpertAddId =
		createColumn(
			"qualifedExpertAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualifedExpertAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedName =
		createColumn(
			"qualifedName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedTitle =
		createColumn(
			"qualifedTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedTelephone =
		createColumn(
			"qualifedTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedExt =
		createColumn(
			"qualifedExt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedFax =
		createColumn(
			"qualifedFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedEmailAdd =
		createColumn(
			"qualifedEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> qualifedRegistrationNo =
		createColumn(
			"qualifedRegistrationNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Date> qualifedExpirationDate =
		createColumn(
			"qualifedExpirationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualifedExpertAddTable() {
		super("nbp_hsra_qualified_expert_add", QualifedExpertAddTable::new);
	}

}