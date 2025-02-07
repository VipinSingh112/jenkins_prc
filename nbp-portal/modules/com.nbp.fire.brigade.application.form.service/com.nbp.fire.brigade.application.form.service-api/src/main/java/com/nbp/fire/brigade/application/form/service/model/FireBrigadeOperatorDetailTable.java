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
 * The table class for the &quot;nbp_fire_operator_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetail
 * @generated
 */
public class FireBrigadeOperatorDetailTable
	extends BaseTable<FireBrigadeOperatorDetailTable> {

	public static final FireBrigadeOperatorDetailTable INSTANCE =
		new FireBrigadeOperatorDetailTable();

	public final Column<FireBrigadeOperatorDetailTable, Long>
		fireBrigadeOperatorDetailId = createColumn(
			"fireBrigadeOperatorDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeOperatorDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String> operatorName =
		createColumn(
			"operatorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String> businessName =
		createColumn(
			"businessName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String> premisesUses =
		createColumn(
			"premisesUses", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String>
		premisesOccupancy = createColumn(
			"premisesOccupancy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String>
		premisesBusiness = createColumn(
			"premisesBusiness", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String>
		maxWorkingPersons = createColumn(
			"maxWorkingPersons", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, String>
		maxNumPersonsAtAnyOneTime = createColumn(
			"maxNumPersonsAtAnyOneTime", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeOperatorDetailTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeOperatorDetailTable() {
		super("nbp_fire_operator_detail", FireBrigadeOperatorDetailTable::new);
	}

}