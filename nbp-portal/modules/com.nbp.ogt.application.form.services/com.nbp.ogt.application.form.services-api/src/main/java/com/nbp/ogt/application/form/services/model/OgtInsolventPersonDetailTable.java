/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ogt_insolvent_person_det&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetail
 * @generated
 */
public class OgtInsolventPersonDetailTable
	extends BaseTable<OgtInsolventPersonDetailTable> {

	public static final OgtInsolventPersonDetailTable INSTANCE =
		new OgtInsolventPersonDetailTable();

	public final Column<OgtInsolventPersonDetailTable, Long>
		ogtInsolventPersonDetailId = createColumn(
			"ogtInsolventPersonDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OgtInsolventPersonDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String>
		natureOfInsolvent = createColumn(
			"natureOfInsolvent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String>
		insolventFirstName = createColumn(
			"insolventFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String>
		insolventLastName = createColumn(
			"insolventLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String>
		insolventCompanyName = createColumn(
			"insolventCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, String>
		insolventDebtStatute = createColumn(
			"insolventDebtStatute", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtInsolventPersonDetailTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtInsolventPersonDetailTable() {
		super(
			"nbp_ogt_insolvent_person_det", OgtInsolventPersonDetailTable::new);
	}

}