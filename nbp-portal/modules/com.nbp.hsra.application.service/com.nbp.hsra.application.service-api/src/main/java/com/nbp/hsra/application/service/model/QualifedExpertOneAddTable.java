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
 * The table class for the &quot;nbp_hsra_quali_expert_one_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAdd
 * @generated
 */
public class QualifedExpertOneAddTable
	extends BaseTable<QualifedExpertOneAddTable> {

	public static final QualifedExpertOneAddTable INSTANCE =
		new QualifedExpertOneAddTable();

	public final Column<QualifedExpertOneAddTable, Long>
		qualifedExpertOneAddId = createColumn(
			"qualifedExpertOneAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualifedExpertOneAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> qualifedOneName =
		createColumn(
			"qualifedOneName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> qualifedOneTitle =
		createColumn(
			"qualifedOneTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String>
		qualifedOneTelephone = createColumn(
			"qualifedOneTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> qualifedOneExt =
		createColumn(
			"qualifedOneExt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> qualifedOneFax =
		createColumn(
			"qualifedOneFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> qualifedOneEmailAdd =
		createColumn(
			"qualifedOneEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String>
		qualifedOneRegistrationNo = createColumn(
			"qualifedOneRegistrationNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Date>
		qualifedOneExpirationDate = createColumn(
			"qualifedOneExpirationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualifedExpertOneAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualifedExpertOneAddTable() {
		super("nbp_hsra_quali_expert_one_add", QualifedExpertOneAddTable::new);
	}

}