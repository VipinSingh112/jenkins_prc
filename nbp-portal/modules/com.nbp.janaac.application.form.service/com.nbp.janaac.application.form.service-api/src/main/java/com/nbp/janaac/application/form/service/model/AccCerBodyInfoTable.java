/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_cer_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyInfo
 * @generated
 */
public class AccCerBodyInfoTable extends BaseTable<AccCerBodyInfoTable> {

	public static final AccCerBodyInfoTable INSTANCE =
		new AccCerBodyInfoTable();

	public final Column<AccCerBodyInfoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Long> accCerBodyInfoId =
		createColumn(
			"accCerBodyInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AccCerBodyInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, String> describeMechanism =
		createColumn(
			"describeMechanism", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyInfoTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyInfoTable() {
		super("nbp_janaac_acc_cer_info", AccCerBodyInfoTable::new);
	}

}