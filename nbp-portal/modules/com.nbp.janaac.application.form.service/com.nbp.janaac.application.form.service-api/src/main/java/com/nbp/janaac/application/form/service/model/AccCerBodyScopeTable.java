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
 * The table class for the &quot;nbp_janaac_acc_cer_scope&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScope
 * @generated
 */
public class AccCerBodyScopeTable extends BaseTable<AccCerBodyScopeTable> {

	public static final AccCerBodyScopeTable INSTANCE =
		new AccCerBodyScopeTable();

	public final Column<AccCerBodyScopeTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Long> accCerBodyScopeId =
		createColumn(
			"accCerBodyScopeId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AccCerBodyScopeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> certificationStandard =
		createColumn(
			"certificationStandard", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField1 =
		createColumn(
			"expertiseField1", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField2 =
		createColumn(
			"expertiseField2", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField3 =
		createColumn(
			"expertiseField3", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField4 =
		createColumn(
			"expertiseField4", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField5 =
		createColumn(
			"expertiseField5", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField6 =
		createColumn(
			"expertiseField6", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField7 =
		createColumn(
			"expertiseField7", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField8 =
		createColumn(
			"expertiseField8", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField9 =
		createColumn(
			"expertiseField9", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField10 =
		createColumn(
			"expertiseField10", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField11 =
		createColumn(
			"expertiseField11", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField12 =
		createColumn(
			"expertiseField12", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField13 =
		createColumn(
			"expertiseField13", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> expertiseField14 =
		createColumn(
			"expertiseField14", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> cerIntrestedParties =
		createColumn(
			"cerIntrestedParties", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> otherServices =
		createColumn(
			"otherServices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> otherServicesDescribe =
		createColumn(
			"otherServicesDescribe", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> establishedRelation =
		createColumn(
			"establishedRelation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> establishedRelDesc =
		createColumn(
			"establishedRelDesc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> clientService =
		createColumn(
			"clientService", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> certificationCerBody =
		createColumn(
			"certificationCerBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> orgAccredited =
		createColumn(
			"orgAccredited", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> responsibleBody =
		createColumn(
			"responsibleBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Date> accExpDate = createColumn(
		"accExpDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, String> certBodyScope =
		createColumn(
			"certBodyScope", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyScopeTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyScopeTable() {
		super("nbp_janaac_acc_cer_scope", AccCerBodyScopeTable::new);
	}

}