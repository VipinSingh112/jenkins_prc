/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_signature_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfo
 * @generated
 */
public class FireBrigadeSignatureInfoTable
	extends BaseTable<FireBrigadeSignatureInfoTable> {

	public static final FireBrigadeSignatureInfoTable INSTANCE =
		new FireBrigadeSignatureInfoTable();

	public final Column<FireBrigadeSignatureInfoTable, Long>
		fireBrigadeSignatureInfoId = createColumn(
			"fireBrigadeSignatureInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeSignatureInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> title =
		createColumn("title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> fax =
		createColumn("fax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Date> date =
		createColumn("date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, String> Address =
		createColumn(
			"Address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeSignatureInfoTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeSignatureInfoTable() {
		super("nbp_fire_signature_info", FireBrigadeSignatureInfoTable::new);
	}

}