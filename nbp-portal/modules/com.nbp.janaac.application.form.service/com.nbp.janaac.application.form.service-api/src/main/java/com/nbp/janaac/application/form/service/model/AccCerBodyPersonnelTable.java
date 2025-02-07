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
 * The table class for the &quot;nbp_janaac_acc_cer_personnel&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnel
 * @generated
 */
public class AccCerBodyPersonnelTable
	extends BaseTable<AccCerBodyPersonnelTable> {

	public static final AccCerBodyPersonnelTable INSTANCE =
		new AccCerBodyPersonnelTable();

	public final Column<AccCerBodyPersonnelTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Long> accCerBodyPersonnelId =
		createColumn(
			"accCerBodyPersonnelId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyPersonnelTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> internalStaffSize =
		createColumn(
			"internalStaffSize", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> auditorsNum =
		createColumn(
			"auditorsNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> contractedPerNum =
		createColumn(
			"contractedPerNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> bodyOutsource =
		createColumn(
			"bodyOutsource", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, String> descSecurity =
		createColumn(
			"descSecurity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyPersonnelTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyPersonnelTable() {
		super("nbp_janaac_acc_cer_personnel", AccCerBodyPersonnelTable::new);
	}

}