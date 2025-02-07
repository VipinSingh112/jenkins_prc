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
 * The table class for the &quot;nbp_janaac_acc_cer_pro_scope&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyProdScope
 * @generated
 */
public class AccCerBodyProdScopeTable
	extends BaseTable<AccCerBodyProdScopeTable> {

	public static final AccCerBodyProdScopeTable INSTANCE =
		new AccCerBodyProdScopeTable();

	public final Column<AccCerBodyProdScopeTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Long> accCerBodyProdScopeId =
		createColumn(
			"accCerBodyProdScopeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyProdScopeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> cerIntrestedParties =
		createColumn(
			"cerIntrestedParties", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> otherServices =
		createColumn(
			"otherServices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String>
		otherServicesDescribe = createColumn(
			"otherServicesDescribe", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> establishedRelation =
		createColumn(
			"establishedRelation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> establishedRelDesc =
		createColumn(
			"establishedRelDesc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> clientService =
		createColumn(
			"clientService", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> orgAccredited =
		createColumn(
			"orgAccredited", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> responsibleBody =
		createColumn(
			"responsibleBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Date> accExpDate =
		createColumn(
			"accExpDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, String> certBodyScope =
		createColumn(
			"certBodyScope", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyProdScopeTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyProdScopeTable() {
		super("nbp_janaac_acc_cer_pro_scope", AccCerBodyProdScopeTable::new);
	}

}