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
 * The table class for the &quot;nbp_hsra_rad_declaration&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclaration
 * @generated
 */
public class RadiationDeclarationTable
	extends BaseTable<RadiationDeclarationTable> {

	public static final RadiationDeclarationTable INSTANCE =
		new RadiationDeclarationTable();

	public final Column<RadiationDeclarationTable, Long>
		radiationDeclarationId = createColumn(
			"radiationDeclarationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationDeclarationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, String> legalOperatorName =
		createColumn(
			"legalOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, String> operatorTitle =
		createColumn(
			"operatorTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Date> operatorDate =
		createColumn(
			"operatorDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDeclarationTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationDeclarationTable() {
		super("nbp_hsra_rad_declaration", RadiationDeclarationTable::new);
	}

}