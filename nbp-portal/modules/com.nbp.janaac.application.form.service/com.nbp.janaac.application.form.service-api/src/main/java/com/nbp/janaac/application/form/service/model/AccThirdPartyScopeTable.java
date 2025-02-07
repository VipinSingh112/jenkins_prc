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
 * The table class for the &quot;nbp_janaac_acc_third_scope&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScope
 * @generated
 */
public class AccThirdPartyScopeTable
	extends BaseTable<AccThirdPartyScopeTable> {

	public static final AccThirdPartyScopeTable INSTANCE =
		new AccThirdPartyScopeTable();

	public final Column<AccThirdPartyScopeTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Long> accThirdPartyScopeId =
		createColumn(
			"accThirdPartyScopeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccThirdPartyScopeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> accreditationCategory =
		createColumn(
			"accreditationCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct1 =
		createColumn(
			"foodProduct1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation1 =
		createColumn(
			"foodRegulation1", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct2 =
		createColumn(
			"foodProduct2", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation2 =
		createColumn(
			"foodRegulation2", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct3 =
		createColumn(
			"foodProduct3", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation3 =
		createColumn(
			"foodRegulation3", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct4 =
		createColumn(
			"foodProduct4", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation4 =
		createColumn(
			"foodRegulation4", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct5 =
		createColumn(
			"foodProduct5", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation5 =
		createColumn(
			"foodRegulation5", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct6 =
		createColumn(
			"foodProduct6", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation6 =
		createColumn(
			"foodRegulation6", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct7 =
		createColumn(
			"foodProduct7", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation7 =
		createColumn(
			"foodRegulation7", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct8 =
		createColumn(
			"foodProduct8", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation8 =
		createColumn(
			"foodRegulation8", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct9 =
		createColumn(
			"foodProduct9", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation9 =
		createColumn(
			"foodRegulation9", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct10 =
		createColumn(
			"foodProduct10", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation10 =
		createColumn(
			"foodRegulation10", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> accCategoryOther =
		createColumn(
			"accCategoryOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct11 =
		createColumn(
			"foodProduct11", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation11 =
		createColumn(
			"foodRegulation11", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> accCategoryOther12 =
		createColumn(
			"accCategoryOther12", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodProduct12 =
		createColumn(
			"foodProduct12", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> foodRegulation12 =
		createColumn(
			"foodRegulation12", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> cerIntrestedParties =
		createColumn(
			"cerIntrestedParties", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> otherServices =
		createColumn(
			"otherServices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> otherServicesDescribe =
		createColumn(
			"otherServicesDescribe", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> establishedRelation =
		createColumn(
			"establishedRelation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> establishedRelDesc =
		createColumn(
			"establishedRelDesc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> clientService =
		createColumn(
			"clientService", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> certificationCerBody =
		createColumn(
			"certificationCerBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> orgAccredited =
		createColumn(
			"orgAccredited", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> responsibleBody =
		createColumn(
			"responsibleBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Date> accExpDate =
		createColumn(
			"accExpDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, String> certBodyScope =
		createColumn(
			"certBodyScope", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyScopeTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccThirdPartyScopeTable() {
		super("nbp_janaac_acc_third_scope", AccThirdPartyScopeTable::new);
	}

}